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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0d + "'", obj4.equals(0.0d));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        try {
            int i11 = fixedOrderComparator7.compare((java.lang.Object) ' ', (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) str3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap13.clear();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) 0.0d);
        try {
            boolean b17 = fixedOrderComparator7.addAsEqual((java.lang.Object) 10, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0.0d + "'", obj16.equals(0.0d));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) defaultedMap11);
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 0.0f);
        boolean b34 = defaultedMap27.containsValue((java.lang.Object) (byte) 0);
        collections.Factory factory35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, factory35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b21 = fixedOrderComparator19.add((java.lang.Object) (byte) 10);
        boolean b22 = fixedOrderComparator19.isLocked();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap24.clear();
        boolean b26 = defaultedMap24.isEmpty();
        boolean b27 = fixedOrderComparator19.add((java.lang.Object) defaultedMap24);
        try {
            int i28 = fixedOrderComparator7.compare((java.lang.Object) 1.0d, (java.lang.Object) fixedOrderComparator19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 0.0f);
        java.lang.String str33 = defaultedMap27.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        java.lang.String str13 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) str13);
        java.util.Set set15 = defaultedMap14.keySet();
        try {
            boolean b17 = fixedOrderComparator7.addAsEqual((java.lang.Object) set15, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap7.clear();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) collection9);
        java.util.Map map11 = null;
        try {
            defaultedMap1.putAll(map11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 0.0f);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate(map32, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        boolean b8 = defaultedMap4.containsValue((java.lang.Object) 100L);
        int i9 = defaultedMap4.size();
        java.util.Set set10 = defaultedMap4.entrySet();
        try {
            int i12 = fixedOrderComparator2.compare((java.lang.Object) defaultedMap4, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap11.remove(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap17.remove(obj20);
        defaultedMap11.putAll((java.util.Map) defaultedMap17);
        boolean b24 = defaultedMap17.containsKey((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap17.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array33 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b35 = fixedOrderComparator34.isLocked();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap37.clear();
        java.util.Collection collection39 = defaultedMap37.values();
        java.lang.Object obj40 = defaultedMap17.put((java.lang.Object) fixedOrderComparator34, (java.lang.Object) defaultedMap37);
        java.lang.Object obj41 = null;
        try {
            int i42 = fixedOrderComparator7.compare((java.lang.Object) fixedOrderComparator34, obj41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.remove(obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap15.remove(obj18);
        defaultedMap9.putAll((java.util.Map) defaultedMap15);
        boolean b22 = defaultedMap15.containsKey((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap15.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap26.clear();
        java.lang.String str28 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) str28);
        java.util.Set set30 = defaultedMap29.keySet();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) set30);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap43.clear();
        boolean b45 = fixedOrderComparator39.add((java.lang.Object) defaultedMap43);
        try {
            boolean b46 = fixedOrderComparator7.addAsEqual((java.lang.Object) map31, (java.lang.Object) fixedOrderComparator39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b45 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        java.lang.Object obj32 = defaultedMap27.get((java.lang.Object) (short) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b35 = fixedOrderComparator33.add((java.lang.Object) (short) -1);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) b35);
        collections.Transformer transformer37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, transformer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        int i10 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.util.Set set16 = defaultedMap13.entrySet();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b36 = fixedOrderComparator34.add((java.lang.Object) (byte) 10);
        boolean b37 = fixedOrderComparator34.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        boolean b41 = defaultedMap39.isEmpty();
        boolean b42 = fixedOrderComparator34.add((java.lang.Object) defaultedMap39);
        boolean b43 = fixedOrderComparator24.add((java.lang.Object) fixedOrderComparator34);
        java.lang.Object obj44 = defaultedMap13.get((java.lang.Object) fixedOrderComparator24);
        try {
            boolean b45 = fixedOrderComparator7.addAsEqual((java.lang.Object) 100, (java.lang.Object) fixedOrderComparator24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0.0d + "'", obj44.equals(0.0d));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap4.remove(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap21.clear();
        java.lang.String str23 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) set25);
        java.util.Set set27 = defaultedMap10.entrySet();
        boolean b28 = fixedOrderComparator2.add((java.lang.Object) defaultedMap10);
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b38 = fixedOrderComparator36.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap40.clear();
        boolean b42 = fixedOrderComparator36.add((java.lang.Object) defaultedMap40);
        try {
            boolean b44 = fixedOrderComparator2.addAsEqual((java.lang.Object) b42, (java.lang.Object) "{}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b42 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.isEmpty();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (-1));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0.0d + "'", obj5.equals(0.0d));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap4.remove(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap21.clear();
        java.lang.String str23 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) set25);
        java.util.Set set27 = defaultedMap10.entrySet();
        boolean b28 = fixedOrderComparator2.add((java.lang.Object) defaultedMap10);
        java.util.Set set29 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        boolean b39 = defaultedMap35.containsValue((java.lang.Object) 100L);
        boolean b40 = defaultedMap31.equals((java.lang.Object) 100L);
        boolean b41 = defaultedMap31.isEmpty();
        java.lang.Object obj42 = defaultedMap10.remove((java.lang.Object) b41);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) defaultedMap11);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap4.remove(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap21.clear();
        java.lang.String str23 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) set25);
        java.util.Set set27 = defaultedMap10.entrySet();
        boolean b28 = fixedOrderComparator2.add((java.lang.Object) defaultedMap10);
        collections.Transformer transformer29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap18.clear();
        java.lang.String str20 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) str20);
        java.util.Set set22 = defaultedMap21.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) set22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap25.remove(obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap31.remove(obj34);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        boolean b38 = defaultedMap31.containsKey((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap31.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array47 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        boolean b49 = fixedOrderComparator48.isLocked();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap51.clear();
        java.util.Collection collection53 = defaultedMap51.values();
        java.lang.Object obj54 = defaultedMap31.put((java.lang.Object) fixedOrderComparator48, (java.lang.Object) defaultedMap51);
        boolean b55 = defaultedMap7.containsKey(obj54);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        int i10 = fixedOrderComparator7.getUnknownObjectBehavior();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        java.lang.Object obj64 = defaultedMap7.remove((java.lang.Object) "");
        collections.Factory factory65 = null;
        try {
            java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) (byte) 10);
        boolean b25 = fixedOrderComparator22.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        boolean b29 = defaultedMap27.isEmpty();
        boolean b30 = fixedOrderComparator22.add((java.lang.Object) defaultedMap27);
        boolean b31 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap45.remove(obj48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj54 = null;
        java.lang.Object obj55 = defaultedMap51.remove(obj54);
        defaultedMap45.putAll((java.util.Map) defaultedMap51);
        boolean b58 = defaultedMap51.containsKey((java.lang.Object) (short) 10);
        boolean b60 = defaultedMap51.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array67 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        boolean b69 = fixedOrderComparator68.isLocked();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap71.clear();
        java.util.Collection collection73 = defaultedMap71.values();
        java.lang.Object obj74 = defaultedMap51.put((java.lang.Object) fixedOrderComparator68, (java.lang.Object) defaultedMap71);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate75, predicate76);
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate76, predicate78);
        defaultedMap27.putAll(map79);
        boolean b81 = defaultedMap27.isEmpty();
        collections.Factory factory82 = null;
        try {
            java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, factory82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b81 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) (-1.0d));
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set11 = defaultedMap5.entrySet();
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        boolean b63 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        int i65 = defaultedMap64.size();
        java.util.Set set66 = defaultedMap64.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(set66);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        boolean b63 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        collections.Transformer transformer65 = null;
        try {
            java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, transformer65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        try {
            fixedOrderComparator11.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        boolean b10 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        java.lang.Object obj44 = defaultedMap39.get((java.lang.Object) (short) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator();
        boolean b47 = fixedOrderComparator45.add((java.lang.Object) (short) -1);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) b47);
        int i49 = fixedOrderComparator7.compare((java.lang.Object) 100L, (java.lang.Object) map48);
        java.lang.Object[] obj_array57 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        int i60 = fixedOrderComparator7.compare((java.lang.Object) "hi!", (java.lang.Object) obj_array57);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0.0d + "'", obj44.equals(0.0d));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(i60 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap1.keySet();
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap5.remove(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap11.remove(obj14);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b18 = defaultedMap11.containsKey((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap11.containsValue((java.lang.Object) '#');
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) b20);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0.0d + "'", obj21.equals(0.0d));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap7.clear();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) collection9);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) fixedOrderComparator19);
        int i21 = fixedOrderComparator19.getUnknownObjectBehavior();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        int i32 = fixedOrderComparator29.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        java.util.Set set37 = defaultedMap34.entrySet();
        java.util.Set set38 = defaultedMap34.keySet();
        try {
            int i39 = fixedOrderComparator19.compare((java.lang.Object) fixedOrderComparator29, (java.lang.Object) set38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) (-1L));
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) 100L);
        int i25 = defaultedMap20.size();
        boolean b26 = defaultedMap16.equals((java.lang.Object) i25);
        boolean b27 = defaultedMap7.equals((java.lang.Object) b26);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) str3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 1.0d);
        defaultedMap4.clear();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 0);
        boolean b14 = defaultedMap11.isEmpty();
        boolean b15 = fixedOrderComparator7.add((java.lang.Object) b14);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        int i31 = defaultedMap27.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) (-1.0d));
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap22.clear();
        boolean b24 = fixedOrderComparator18.add((java.lang.Object) defaultedMap22);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap22.get((java.lang.Object) 0.0d);
        boolean b30 = defaultedMap5.containsKey(obj29);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0.0d + "'", obj29.equals(0.0d));
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = defaultedMap63.remove(obj66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap69.clear();
        java.util.Collection collection71 = defaultedMap69.values();
        java.lang.Object obj72 = defaultedMap63.get((java.lang.Object) collection71);
        boolean b73 = defaultedMap38.equals(obj72);
        boolean b74 = fixedOrderComparator24.add((java.lang.Object) defaultedMap38);
        int i75 = defaultedMap38.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 0.0d + "'", obj72.equals(0.0d));
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(i75 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap13.clear();
        java.lang.String str15 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) (-1.0d));
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        boolean b23 = fixedOrderComparator7.add((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) defaultedMap11);
        boolean b15 = defaultedMap11.equals((java.lang.Object) true);
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap18.remove(obj21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap24.remove(obj27);
        defaultedMap18.putAll((java.util.Map) defaultedMap24);
        boolean b31 = defaultedMap24.containsKey((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap24.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array40 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        boolean b42 = fixedOrderComparator41.isLocked();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap44.clear();
        java.util.Collection collection46 = defaultedMap44.values();
        java.lang.Object obj47 = defaultedMap24.put((java.lang.Object) fixedOrderComparator41, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap49.remove(obj52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap55.remove(obj58);
        defaultedMap49.putAll((java.util.Map) defaultedMap55);
        boolean b62 = defaultedMap55.containsKey((java.lang.Object) (short) 10);
        boolean b64 = defaultedMap55.containsValue((java.lang.Object) '#');
        java.lang.Object obj66 = defaultedMap55.get((java.lang.Object) 'a');
        java.lang.Object obj67 = defaultedMap44.remove((java.lang.Object) 'a');
        int i68 = defaultedMap44.size();
        defaultedMap11.putAll((java.util.Map) defaultedMap44);
        java.util.Set set70 = defaultedMap44.entrySet();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0.0d + "'", obj66.equals(0.0d));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertNotNull(set70);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap7.clear();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) collection9);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) fixedOrderComparator19);
        java.util.Set set21 = defaultedMap1.keySet();
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap7.clear();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) collection9);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap22.clear();
        boolean b24 = fixedOrderComparator18.add((java.lang.Object) defaultedMap22);
        boolean b26 = defaultedMap22.equals((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap28.remove(obj31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap34.remove(obj37);
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        boolean b41 = defaultedMap34.containsKey((java.lang.Object) (short) 10);
        boolean b43 = defaultedMap34.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array50 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        boolean b52 = fixedOrderComparator51.isLocked();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap54.clear();
        java.util.Collection collection56 = defaultedMap54.values();
        java.lang.Object obj57 = defaultedMap34.put((java.lang.Object) fixedOrderComparator51, (java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj62 = null;
        java.lang.Object obj63 = defaultedMap59.remove(obj62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap65.remove(obj68);
        defaultedMap59.putAll((java.util.Map) defaultedMap65);
        boolean b72 = defaultedMap65.containsKey((java.lang.Object) (short) 10);
        boolean b74 = defaultedMap65.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array81 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array81);
        boolean b83 = fixedOrderComparator82.isLocked();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap85.clear();
        java.util.Collection collection87 = defaultedMap85.values();
        java.lang.Object obj88 = defaultedMap65.put((java.lang.Object) fixedOrderComparator82, (java.lang.Object) defaultedMap85);
        defaultedMap34.putAll((java.util.Map) defaultedMap65);
        boolean b90 = defaultedMap22.equals((java.lang.Object) defaultedMap65);
        boolean b91 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(obj_array81);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) (-1.0d));
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap5.get(obj11);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0.0d + "'", obj12.equals(0.0d));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b12 = fixedOrderComparator7.isLocked();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap7.clear();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) collection9);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) fixedOrderComparator19);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b29 = fixedOrderComparator28.isLocked();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap31.clear();
        java.lang.String str33 = defaultedMap31.toString();
        try {
            int i34 = fixedOrderComparator19.compare((java.lang.Object) b29, (java.lang.Object) defaultedMap31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) (byte) 10);
        boolean b20 = fixedOrderComparator17.isLocked();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap22.clear();
        boolean b24 = defaultedMap22.isEmpty();
        boolean b25 = fixedOrderComparator17.add((java.lang.Object) defaultedMap22);
        boolean b26 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator17);
        boolean b27 = fixedOrderComparator7.isLocked();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        boolean b15 = fixedOrderComparator7.add((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap17.remove(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap23.remove(obj26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap23.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap34.clear();
        java.lang.String str36 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) str36);
        java.util.Set set38 = defaultedMap37.keySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) set38);
        java.util.Set set40 = defaultedMap23.entrySet();
        java.lang.Object obj42 = defaultedMap23.get((java.lang.Object) 10.0d);
        java.util.Set set43 = defaultedMap23.entrySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap23);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        boolean b54 = fixedOrderComparator52.add((java.lang.Object) (byte) 10);
        boolean b55 = fixedOrderComparator52.isLocked();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap57.clear();
        boolean b59 = defaultedMap57.isEmpty();
        boolean b60 = fixedOrderComparator52.add((java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap62.remove(obj65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b70 = defaultedMap68.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap68.remove(obj71);
        defaultedMap62.putAll((java.util.Map) defaultedMap68);
        boolean b75 = defaultedMap68.containsKey((java.lang.Object) (short) 10);
        boolean b77 = defaultedMap68.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap79.clear();
        java.lang.String str81 = defaultedMap79.toString();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) str81);
        java.util.Set set83 = defaultedMap82.keySet();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) set83);
        java.util.Set set85 = defaultedMap68.entrySet();
        java.lang.Object obj87 = defaultedMap68.get((java.lang.Object) 10.0d);
        java.util.Set set88 = defaultedMap68.entrySet();
        defaultedMap57.putAll((java.util.Map) defaultedMap68);
        defaultedMap23.putAll((java.util.Map) defaultedMap57);
        collections.Factory factory91 = null;
        try {
            java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, factory91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0.0d + "'", obj42.equals(0.0d));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "{}" + "'", str81.equals("{}"));
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + 0.0d + "'", obj87.equals(0.0d));
        org.junit.Assert.assertNotNull(set88);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) str3);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "{}" + "'", obj6.equals("{}"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) (byte) 10);
        boolean b20 = fixedOrderComparator17.isLocked();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap22.clear();
        boolean b24 = defaultedMap22.isEmpty();
        boolean b25 = fixedOrderComparator17.add((java.lang.Object) defaultedMap22);
        boolean b26 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator17);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        boolean b36 = fixedOrderComparator7.add((java.lang.Object) i35);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap11.remove(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap17.remove(obj20);
        defaultedMap11.putAll((java.util.Map) defaultedMap17);
        boolean b24 = defaultedMap17.containsKey((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap17.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array33 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b35 = fixedOrderComparator34.isLocked();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap37.clear();
        java.util.Collection collection39 = defaultedMap37.values();
        java.lang.Object obj40 = defaultedMap17.put((java.lang.Object) fixedOrderComparator34, (java.lang.Object) defaultedMap37);
        defaultedMap37.clear();
        boolean b42 = fixedOrderComparator8.add((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0.0d + "'", obj5.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap5.remove(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap11.remove(obj14);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b18 = defaultedMap11.containsKey((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap11.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array27 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b29 = fixedOrderComparator28.isLocked();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap31.clear();
        java.util.Collection collection33 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap11.put((java.lang.Object) fixedOrderComparator28, (java.lang.Object) defaultedMap31);
        java.lang.Object obj36 = defaultedMap31.get((java.lang.Object) (short) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj38 = null;
        boolean b39 = defaultedMap1.containsValue(obj38);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0.0d + "'", obj36.equals(0.0d));
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b12 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap15.remove(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap21.remove(obj24);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        boolean b28 = defaultedMap21.containsKey((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap21.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array37 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        boolean b39 = fixedOrderComparator38.isLocked();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap41.clear();
        java.util.Collection collection43 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap21.put((java.lang.Object) fixedOrderComparator38, (java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap46.remove(obj49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap52.remove(obj55);
        defaultedMap46.putAll((java.util.Map) defaultedMap52);
        boolean b59 = defaultedMap52.containsKey((java.lang.Object) (short) 10);
        boolean b61 = defaultedMap52.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array68 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        boolean b70 = fixedOrderComparator69.isLocked();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap72.clear();
        java.util.Collection collection74 = defaultedMap72.values();
        java.lang.Object obj75 = defaultedMap52.put((java.lang.Object) fixedOrderComparator69, (java.lang.Object) defaultedMap72);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b79 = defaultedMap77.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj80 = null;
        java.lang.Object obj81 = defaultedMap77.remove(obj80);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap83.clear();
        java.util.Collection collection85 = defaultedMap83.values();
        java.lang.Object obj86 = defaultedMap77.get((java.lang.Object) collection85);
        boolean b87 = defaultedMap52.equals(obj86);
        boolean b88 = fixedOrderComparator38.add((java.lang.Object) defaultedMap52);
        try {
            int i89 = fixedOrderComparator7.compare((java.lang.Object) (byte) 10, (java.lang.Object) fixedOrderComparator38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + 0.0d + "'", obj86.equals(0.0d));
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap12.remove(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap18.remove(obj21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object obj25 = null;
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj25);
        java.util.Set set27 = defaultedMap12.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object obj18 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object[] obj_array25 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b28 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap30.remove(obj33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap36.remove(obj39);
        defaultedMap30.putAll((java.util.Map) defaultedMap36);
        boolean b43 = defaultedMap36.containsKey((java.lang.Object) (short) 10);
        boolean b45 = defaultedMap36.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array52 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        boolean b54 = fixedOrderComparator53.isLocked();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap56.clear();
        java.util.Collection collection58 = defaultedMap56.values();
        java.lang.Object obj59 = defaultedMap36.put((java.lang.Object) fixedOrderComparator53, (java.lang.Object) defaultedMap56);
        java.lang.Object obj61 = defaultedMap56.get((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array68 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        try {
            int i70 = fixedOrderComparator27.compare((java.lang.Object) (short) 0, (java.lang.Object) obj_array68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0.0d + "'", obj61.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array68);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap4.clear();
        java.util.Collection collection6 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.remove(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap14.remove(obj17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap14.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array30 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        boolean b32 = fixedOrderComparator31.isLocked();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap34.clear();
        java.util.Collection collection36 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap14.put((java.lang.Object) fixedOrderComparator31, (java.lang.Object) defaultedMap34);
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) (short) 0);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate41, predicate74);
        boolean b78 = fixedOrderComparator0.add((java.lang.Object) predicate41);
        boolean b79 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) 100L);
        boolean b14 = defaultedMap5.equals((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap16.remove(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap22.remove(obj25);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        boolean b28 = defaultedMap5.containsValue((java.lang.Object) defaultedMap16);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0.0d + "'", obj29.equals(0.0d));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj79 = defaultedMap77.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b83 = defaultedMap81.containsKey((java.lang.Object) (-1L));
        boolean b85 = defaultedMap81.containsValue((java.lang.Object) 100L);
        int i86 = defaultedMap81.size();
        boolean b87 = defaultedMap77.equals((java.lang.Object) i86);
        boolean b88 = defaultedMap1.containsValue((java.lang.Object) defaultedMap77);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap90.clear();
        int i92 = defaultedMap90.size();
        java.util.Set set93 = defaultedMap90.entrySet();
        boolean b94 = defaultedMap77.containsKey((java.lang.Object) defaultedMap90);
        java.lang.Object obj95 = null;
        java.lang.Object obj96 = defaultedMap77.remove(obj95);
        int i97 = defaultedMap77.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 0.0d + "'", obj79.equals(0.0d));
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(i92 == 0);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertTrue(i97 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Collection collection4 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap4.clear();
        int i6 = defaultedMap4.size();
        java.util.Set set7 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        boolean b17 = defaultedMap13.containsValue((java.lang.Object) 100L);
        int i18 = defaultedMap13.size();
        boolean b19 = defaultedMap9.equals((java.lang.Object) i18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap21.remove(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap27.remove(obj30);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        boolean b34 = defaultedMap27.containsKey((java.lang.Object) (short) 10);
        boolean b36 = defaultedMap27.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array43 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator44.isLocked();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap47.clear();
        java.util.Collection collection49 = defaultedMap47.values();
        java.lang.Object obj50 = defaultedMap27.put((java.lang.Object) fixedOrderComparator44, (java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap52.remove(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = defaultedMap58.remove(obj61);
        defaultedMap52.putAll((java.util.Map) defaultedMap58);
        boolean b65 = defaultedMap58.containsKey((java.lang.Object) (short) 10);
        boolean b67 = defaultedMap58.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array74 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        boolean b76 = fixedOrderComparator75.isLocked();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap78.clear();
        java.util.Collection collection80 = defaultedMap78.values();
        java.lang.Object obj81 = defaultedMap58.put((java.lang.Object) fixedOrderComparator75, (java.lang.Object) defaultedMap78);
        defaultedMap27.putAll((java.util.Map) defaultedMap58);
        defaultedMap9.putAll((java.util.Map) defaultedMap27);
        try {
            int i84 = fixedOrderComparator0.compare((java.lang.Object) set7, (java.lang.Object) defaultedMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0.0d + "'", obj11.equals(0.0d));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) 100L);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) b18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap21.remove(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap27.remove(obj30);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        boolean b34 = defaultedMap27.containsKey((java.lang.Object) (short) 10);
        boolean b36 = defaultedMap27.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array43 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator44.isLocked();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap47.clear();
        java.util.Collection collection49 = defaultedMap47.values();
        java.lang.Object obj50 = defaultedMap27.put((java.lang.Object) fixedOrderComparator44, (java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap52.remove(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = defaultedMap58.remove(obj61);
        defaultedMap52.putAll((java.util.Map) defaultedMap58);
        boolean b65 = defaultedMap58.containsKey((java.lang.Object) (short) 10);
        boolean b67 = defaultedMap58.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap69.clear();
        java.lang.String str71 = defaultedMap69.toString();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) str71);
        java.util.Set set73 = defaultedMap72.keySet();
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) set73);
        java.util.Set set75 = defaultedMap58.entrySet();
        defaultedMap27.putAll((java.util.Map) defaultedMap58);
        boolean b77 = defaultedMap1.containsKey((java.lang.Object) defaultedMap58);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        boolean b63 = defaultedMap38.isEmpty();
        java.util.Set set64 = defaultedMap38.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        java.util.Collection collection63 = defaultedMap38.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap45.remove(obj48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj54 = null;
        java.lang.Object obj55 = defaultedMap51.remove(obj54);
        defaultedMap45.putAll((java.util.Map) defaultedMap51);
        boolean b58 = defaultedMap51.containsKey((java.lang.Object) (short) 10);
        boolean b60 = defaultedMap51.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array67 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        boolean b69 = fixedOrderComparator68.isLocked();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap71.clear();
        java.util.Collection collection73 = defaultedMap71.values();
        java.lang.Object obj74 = defaultedMap51.put((java.lang.Object) fixedOrderComparator68, (java.lang.Object) defaultedMap71);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate75, predicate76);
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate76, predicate78);
        defaultedMap27.putAll(map79);
        boolean b81 = defaultedMap27.isEmpty();
        java.util.Set set82 = defaultedMap27.entrySet();
        java.util.Set set83 = defaultedMap27.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(set83);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap4.remove(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap21.clear();
        java.lang.String str23 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) set25);
        java.util.Set set27 = defaultedMap10.entrySet();
        boolean b28 = fixedOrderComparator2.add((java.lang.Object) defaultedMap10);
        int i29 = fixedOrderComparator2.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        boolean b63 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        int i65 = defaultedMap64.size();
        java.lang.String str66 = defaultedMap64.toString();
        collections.Factory factory67 = null;
        try {
            java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, factory67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Predicate predicate7 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.remove(obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap15.remove(obj18);
        defaultedMap9.putAll((java.util.Map) defaultedMap15);
        boolean b22 = defaultedMap15.containsKey((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap15.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array31 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b33 = fixedOrderComparator32.isLocked();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap35.clear();
        java.util.Collection collection37 = defaultedMap35.values();
        java.lang.Object obj38 = defaultedMap15.put((java.lang.Object) fixedOrderComparator32, (java.lang.Object) defaultedMap35);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate40);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) (byte) 10);
        boolean b25 = fixedOrderComparator22.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        boolean b29 = defaultedMap27.isEmpty();
        boolean b30 = fixedOrderComparator22.add((java.lang.Object) defaultedMap27);
        boolean b31 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b42 = fixedOrderComparator40.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap44.clear();
        boolean b46 = fixedOrderComparator40.add((java.lang.Object) defaultedMap44);
        boolean b48 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap50.clear();
        java.lang.String str52 = defaultedMap50.toString();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) str52);
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) 1.0d);
        boolean b56 = defaultedMap44.containsValue((java.lang.Object) 1.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator();
        boolean b59 = fixedOrderComparator57.add((java.lang.Object) (short) -1);
        int i60 = fixedOrderComparator57.getUnknownObjectBehavior();
        int i61 = fixedOrderComparator12.compare((java.lang.Object) b56, (java.lang.Object) fixedOrderComparator57);
        try {
            fixedOrderComparator12.setUnknownObjectBehavior((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(i60 == 2);
        org.junit.Assert.assertTrue(i61 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) (-1.0d));
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj79 = defaultedMap77.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b83 = defaultedMap81.containsKey((java.lang.Object) (-1L));
        boolean b85 = defaultedMap81.containsValue((java.lang.Object) 100L);
        int i86 = defaultedMap81.size();
        boolean b87 = defaultedMap77.equals((java.lang.Object) i86);
        boolean b88 = defaultedMap1.containsValue((java.lang.Object) defaultedMap77);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap90.clear();
        int i92 = defaultedMap90.size();
        java.util.Set set93 = defaultedMap90.entrySet();
        boolean b94 = defaultedMap77.containsKey((java.lang.Object) defaultedMap90);
        collections.Factory factory95 = null;
        try {
            java.util.Map map96 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, factory95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 0.0d + "'", obj79.equals(0.0d));
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(i92 == 0);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertTrue(b94 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) (byte) 10);
        boolean b25 = fixedOrderComparator22.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        boolean b29 = defaultedMap27.isEmpty();
        boolean b30 = fixedOrderComparator22.add((java.lang.Object) defaultedMap27);
        boolean b31 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b42 = fixedOrderComparator40.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap44.clear();
        boolean b46 = fixedOrderComparator40.add((java.lang.Object) defaultedMap44);
        boolean b48 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap50.clear();
        java.lang.String str52 = defaultedMap50.toString();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) str52);
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) 1.0d);
        boolean b56 = defaultedMap44.containsValue((java.lang.Object) 1.0d);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator();
        boolean b59 = fixedOrderComparator57.add((java.lang.Object) (short) -1);
        int i60 = fixedOrderComparator57.getUnknownObjectBehavior();
        int i61 = fixedOrderComparator12.compare((java.lang.Object) b56, (java.lang.Object) fixedOrderComparator57);
        boolean b62 = fixedOrderComparator12.isLocked();
        try {
            fixedOrderComparator12.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(i60 == 2);
        org.junit.Assert.assertTrue(i61 == 1);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        boolean b63 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        int i65 = defaultedMap64.size();
        java.lang.String str66 = defaultedMap64.toString();
        java.util.Collection collection67 = defaultedMap64.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(collection67);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        java.util.Set set76 = defaultedMap19.keySet();
        java.lang.String str77 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b81 = defaultedMap79.containsKey((java.lang.Object) (-1L));
        java.util.Set set82 = defaultedMap79.entrySet();
        java.util.Set set83 = defaultedMap79.keySet();
        java.lang.Object obj84 = defaultedMap19.get((java.lang.Object) set83);
        java.util.Set set85 = defaultedMap19.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 0.0d + "'", obj84.equals(0.0d));
        org.junit.Assert.assertNotNull(set85);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap35.clear();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap35);
        java.lang.String str38 = defaultedMap35.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        java.lang.String str62 = defaultedMap58.toString();
        java.lang.Object obj63 = defaultedMap7.get((java.lang.Object) defaultedMap58);
        java.lang.Object[] obj_array70 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        boolean b73 = fixedOrderComparator71.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap75.clear();
        boolean b77 = fixedOrderComparator71.add((java.lang.Object) defaultedMap75);
        boolean b79 = defaultedMap75.equals((java.lang.Object) true);
        defaultedMap75.clear();
        boolean b81 = defaultedMap58.containsKey((java.lang.Object) defaultedMap75);
        defaultedMap58.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0.0d + "'", obj63.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) defaultedMap11);
        boolean b15 = defaultedMap11.equals((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap17.remove(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap23.remove(obj26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap23.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array39 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap43.clear();
        java.util.Collection collection45 = defaultedMap43.values();
        java.lang.Object obj46 = defaultedMap23.put((java.lang.Object) fixedOrderComparator40, (java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap48.remove(obj51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap54.remove(obj57);
        defaultedMap48.putAll((java.util.Map) defaultedMap54);
        boolean b61 = defaultedMap54.containsKey((java.lang.Object) (short) 10);
        boolean b63 = defaultedMap54.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array70 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        boolean b72 = fixedOrderComparator71.isLocked();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap74.clear();
        java.util.Collection collection76 = defaultedMap74.values();
        java.lang.Object obj77 = defaultedMap54.put((java.lang.Object) fixedOrderComparator71, (java.lang.Object) defaultedMap74);
        defaultedMap23.putAll((java.util.Map) defaultedMap54);
        boolean b79 = defaultedMap11.equals((java.lang.Object) defaultedMap54);
        boolean b80 = defaultedMap11.isEmpty();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b80 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object obj18 = defaultedMap7.get((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap21.remove(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap21.get((java.lang.Object) collection29);
        java.lang.String str31 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap37.remove(obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = defaultedMap43.remove(obj46);
        defaultedMap37.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        boolean b54 = defaultedMap50.containsValue((java.lang.Object) 100L);
        java.lang.Object obj55 = defaultedMap37.get((java.lang.Object) b54);
        java.util.Set set56 = defaultedMap37.entrySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) (-1L));
        boolean b62 = defaultedMap58.containsValue((java.lang.Object) 100L);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) defaultedMap58);
        java.util.Set set64 = defaultedMap37.keySet();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap66.clear();
        boolean b68 = defaultedMap66.isEmpty();
        java.util.Set set69 = defaultedMap66.entrySet();
        java.lang.Object obj70 = defaultedMap33.put((java.lang.Object) set64, (java.lang.Object) defaultedMap66);
        boolean b71 = defaultedMap21.containsKey((java.lang.Object) set64);
        boolean b72 = defaultedMap7.equals((java.lang.Object) set64);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0.0d + "'", obj30.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 0.0d + "'", obj55.equals(0.0d));
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap12.remove(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap18.remove(obj21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object obj25 = null;
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj25);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) (byte) 10);
        boolean b20 = fixedOrderComparator17.isLocked();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap22.clear();
        boolean b24 = defaultedMap22.isEmpty();
        boolean b25 = fixedOrderComparator17.add((java.lang.Object) defaultedMap22);
        boolean b26 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator17);
        boolean b27 = fixedOrderComparator7.isLocked();
        boolean b29 = fixedOrderComparator7.add((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) (-1L));
        boolean b35 = defaultedMap31.containsValue((java.lang.Object) 100L);
        int i36 = defaultedMap31.size();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        boolean b52 = defaultedMap48.containsValue((java.lang.Object) 100L);
        boolean b53 = defaultedMap44.equals((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap55.remove(obj58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj64 = null;
        java.lang.Object obj65 = defaultedMap61.remove(obj64);
        defaultedMap55.putAll((java.util.Map) defaultedMap61);
        boolean b67 = defaultedMap44.containsValue((java.lang.Object) defaultedMap55);
        java.lang.Object obj68 = null;
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, obj68);
        try {
            boolean b70 = fixedOrderComparator7.addAsEqual((java.lang.Object) obj_array38, obj68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(map69);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap5.remove(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap11.remove(obj14);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b18 = defaultedMap11.containsKey((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap11.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array27 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b29 = fixedOrderComparator28.isLocked();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap31.clear();
        java.util.Collection collection33 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap11.put((java.lang.Object) fixedOrderComparator28, (java.lang.Object) defaultedMap31);
        java.lang.Object obj36 = defaultedMap31.get((java.lang.Object) (short) 0);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap41.remove(obj44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = defaultedMap47.remove(obj50);
        defaultedMap41.putAll((java.util.Map) defaultedMap47);
        boolean b54 = defaultedMap47.containsKey((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap47.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array63 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator64.isLocked();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap67.clear();
        java.util.Collection collection69 = defaultedMap67.values();
        java.lang.Object obj70 = defaultedMap47.put((java.lang.Object) fixedOrderComparator64, (java.lang.Object) defaultedMap67);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate38, predicate71);
        boolean b75 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0.0d + "'", obj36.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        java.lang.String str62 = defaultedMap58.toString();
        java.lang.Object obj63 = defaultedMap7.get((java.lang.Object) defaultedMap58);
        java.lang.Object[] obj_array70 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        boolean b73 = fixedOrderComparator71.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap75.clear();
        boolean b77 = fixedOrderComparator71.add((java.lang.Object) defaultedMap75);
        boolean b79 = defaultedMap75.equals((java.lang.Object) true);
        defaultedMap75.clear();
        boolean b81 = defaultedMap58.containsKey((java.lang.Object) defaultedMap75);
        java.lang.Object[] obj_array88 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array88);
        boolean b91 = fixedOrderComparator89.add((java.lang.Object) (byte) 10);
        boolean b92 = fixedOrderComparator89.isLocked();
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap94.clear();
        boolean b96 = defaultedMap94.isEmpty();
        boolean b97 = fixedOrderComparator89.add((java.lang.Object) defaultedMap94);
        boolean b98 = defaultedMap58.containsKey((java.lang.Object) fixedOrderComparator89);
        defaultedMap58.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0.0d + "'", obj63.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(obj_array88);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b96 == true);
        org.junit.Assert.assertTrue(b97 == true);
        org.junit.Assert.assertTrue(b98 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap14.remove(obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap20.remove(obj23);
        defaultedMap14.putAll((java.util.Map) defaultedMap20);
        boolean b27 = defaultedMap20.containsKey((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap20.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array36 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = fixedOrderComparator37.isLocked();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap40.clear();
        java.util.Collection collection42 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap20.put((java.lang.Object) fixedOrderComparator37, (java.lang.Object) defaultedMap40);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate45, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) 0);
        java.lang.Object obj54 = defaultedMap50.remove((java.lang.Object) (-1.0d));
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b59 = defaultedMap57.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj60 = null;
        java.lang.Object obj61 = defaultedMap57.remove(obj60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = defaultedMap63.remove(obj66);
        defaultedMap57.putAll((java.util.Map) defaultedMap63);
        boolean b70 = defaultedMap63.containsKey((java.lang.Object) (short) 10);
        boolean b72 = defaultedMap63.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array79 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array79);
        boolean b81 = fixedOrderComparator80.isLocked();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap83.clear();
        java.util.Collection collection85 = defaultedMap83.values();
        java.lang.Object obj86 = defaultedMap63.put((java.lang.Object) fixedOrderComparator80, (java.lang.Object) defaultedMap83);
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate87, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate55, predicate87);
        java.lang.Object obj91 = defaultedMap1.get((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0.0d + "'", obj52.equals(0.0d));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(obj_array79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 0.0d + "'", obj91.equals(0.0d));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj79 = defaultedMap77.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b83 = defaultedMap81.containsKey((java.lang.Object) (-1L));
        boolean b85 = defaultedMap81.containsValue((java.lang.Object) 100L);
        int i86 = defaultedMap81.size();
        boolean b87 = defaultedMap77.equals((java.lang.Object) i86);
        boolean b88 = defaultedMap1.containsValue((java.lang.Object) defaultedMap77);
        java.util.Collection collection89 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 0.0d + "'", obj79.equals(0.0d));
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertNotNull(collection89);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        boolean b8 = defaultedMap4.containsValue((java.lang.Object) 100L);
        int i9 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap11.remove(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap17.remove(obj20);
        defaultedMap11.putAll((java.util.Map) defaultedMap17);
        boolean b24 = defaultedMap17.containsKey((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap17.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array33 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b35 = fixedOrderComparator34.isLocked();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap37.clear();
        java.util.Collection collection39 = defaultedMap37.values();
        java.lang.Object obj40 = defaultedMap17.put((java.lang.Object) fixedOrderComparator34, (java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap42.remove(obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap48.remove(obj51);
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        boolean b55 = defaultedMap48.containsKey((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap48.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array64 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        boolean b66 = fixedOrderComparator65.isLocked();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap68.clear();
        java.util.Collection collection70 = defaultedMap68.values();
        java.lang.Object obj71 = defaultedMap48.put((java.lang.Object) fixedOrderComparator65, (java.lang.Object) defaultedMap68);
        defaultedMap17.putAll((java.util.Map) defaultedMap48);
        java.util.Set set73 = defaultedMap48.keySet();
        try {
            boolean b74 = fixedOrderComparator0.addAsEqual((java.lang.Object) i9, (java.lang.Object) defaultedMap48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(set73);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        java.util.Set set18 = defaultedMap15.entrySet();
        java.util.Collection collection19 = defaultedMap15.values();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) (-1L));
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) 100L);
        int i27 = defaultedMap22.size();
        java.util.Set set28 = defaultedMap22.entrySet();
        java.util.Set set29 = defaultedMap22.entrySet();
        int i30 = defaultedMap22.size();
        boolean b32 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj33 = defaultedMap15.remove((java.lang.Object) b32);
        boolean b34 = fixedOrderComparator7.add((java.lang.Object) b32);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior(1);
        boolean b23 = fixedOrderComparator20.isLocked();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap25.remove(obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap31.remove(obj34);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        boolean b38 = defaultedMap31.containsKey((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap31.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array47 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        boolean b49 = fixedOrderComparator48.isLocked();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap51.clear();
        java.util.Collection collection53 = defaultedMap51.values();
        java.lang.Object obj54 = defaultedMap31.put((java.lang.Object) fixedOrderComparator48, (java.lang.Object) defaultedMap51);
        java.lang.String str55 = defaultedMap51.toString();
        boolean b56 = fixedOrderComparator20.add((java.lang.Object) defaultedMap51);
        try {
            int i58 = fixedOrderComparator12.compare((java.lang.Object) defaultedMap51, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        java.util.Set set76 = defaultedMap19.keySet();
        java.lang.String str77 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b81 = defaultedMap79.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj82 = null;
        java.lang.Object obj83 = defaultedMap79.remove(obj82);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b87 = defaultedMap85.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj88 = null;
        java.lang.Object obj89 = defaultedMap85.remove(obj88);
        defaultedMap79.putAll((java.util.Map) defaultedMap85);
        boolean b92 = defaultedMap85.containsKey((java.lang.Object) (short) 10);
        boolean b94 = defaultedMap85.containsValue((java.lang.Object) '#');
        java.lang.Object obj96 = defaultedMap85.get((java.lang.Object) 'a');
        java.util.Set set97 = defaultedMap85.keySet();
        boolean b98 = defaultedMap19.equals((java.lang.Object) set97);
        int i99 = defaultedMap19.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + 0.0d + "'", obj96.equals(0.0d));
        org.junit.Assert.assertNotNull(set97);
        org.junit.Assert.assertTrue(b98 == false);
        org.junit.Assert.assertTrue(i99 == 2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        try {
            int i11 = fixedOrderComparator7.compare((java.lang.Object) predicate9, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertNotNull(predicate9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap16.remove(obj19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        boolean b23 = defaultedMap16.containsKey((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap16.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array32 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b34 = fixedOrderComparator33.isLocked();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap36.clear();
        java.util.Collection collection38 = defaultedMap36.values();
        java.lang.Object obj39 = defaultedMap16.put((java.lang.Object) fixedOrderComparator33, (java.lang.Object) defaultedMap36);
        defaultedMap36.clear();
        try {
            boolean b42 = fixedOrderComparator8.addAsEqual((java.lang.Object) defaultedMap36, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap4.remove(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap21.clear();
        java.lang.String str23 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) set25);
        java.util.Set set27 = defaultedMap10.entrySet();
        boolean b28 = fixedOrderComparator2.add((java.lang.Object) defaultedMap10);
        java.util.Set set29 = defaultedMap10.keySet();
        boolean b31 = defaultedMap10.equals((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) defaultedMap11);
        boolean b15 = defaultedMap11.equals((java.lang.Object) true);
        int i16 = defaultedMap11.size();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap18.clear();
        java.lang.String str20 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) str20);
        java.util.Set set22 = defaultedMap21.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) set22);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate(map23, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        boolean b15 = fixedOrderComparator7.add((java.lang.Object) defaultedMap12);
        int i16 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i17 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue(i17 == 2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap7.clear();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) collection9);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) fixedOrderComparator19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap22.remove(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap28.remove(obj31);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        boolean b35 = defaultedMap28.containsKey((java.lang.Object) (short) 10);
        boolean b37 = defaultedMap28.containsValue((java.lang.Object) '#');
        java.lang.Object obj39 = defaultedMap28.get((java.lang.Object) 'a');
        boolean b40 = defaultedMap28.isEmpty();
        java.lang.String str41 = defaultedMap28.toString();
        boolean b42 = fixedOrderComparator19.add((java.lang.Object) defaultedMap28);
        java.util.Set set43 = defaultedMap28.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        int i10 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i11 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        boolean b10 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap12.remove(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap18.remove(obj21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        boolean b25 = defaultedMap18.containsKey((java.lang.Object) (short) 10);
        boolean b27 = defaultedMap18.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array34 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap38.clear();
        java.util.Collection collection40 = defaultedMap38.values();
        java.lang.Object obj41 = defaultedMap18.put((java.lang.Object) fixedOrderComparator35, (java.lang.Object) defaultedMap38);
        java.lang.String str42 = defaultedMap38.toString();
        boolean b43 = fixedOrderComparator7.add((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap45.remove(obj48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap51.clear();
        java.util.Collection collection53 = defaultedMap51.values();
        java.lang.Object obj54 = defaultedMap45.get((java.lang.Object) collection53);
        java.lang.Object[] obj_array61 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array61);
        java.lang.Object obj64 = defaultedMap45.get((java.lang.Object) fixedOrderComparator63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b68 = defaultedMap66.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj69 = null;
        java.lang.Object obj70 = defaultedMap66.remove(obj69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b74 = defaultedMap72.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj75 = null;
        java.lang.Object obj76 = defaultedMap72.remove(obj75);
        defaultedMap66.putAll((java.util.Map) defaultedMap72);
        boolean b79 = defaultedMap72.containsKey((java.lang.Object) (short) 10);
        boolean b81 = defaultedMap72.containsValue((java.lang.Object) '#');
        java.lang.Object obj83 = defaultedMap72.get((java.lang.Object) 'a');
        boolean b84 = defaultedMap72.isEmpty();
        java.lang.String str85 = defaultedMap72.toString();
        boolean b86 = fixedOrderComparator63.add((java.lang.Object) defaultedMap72);
        boolean b87 = defaultedMap38.containsKey((java.lang.Object) fixedOrderComparator63);
        try {
            fixedOrderComparator63.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0.0d + "'", obj54.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0.0d + "'", obj64.equals(0.0d));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 0.0d + "'", obj83.equals(0.0d));
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{}" + "'", str85.equals("{}"));
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object obj18 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object[] obj_array25 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b28 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator27);
        java.util.Set set29 = defaultedMap7.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        defaultedMap27.clear();
        java.util.Set set32 = defaultedMap27.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object obj49 = defaultedMap38.get((java.lang.Object) 'a');
        java.lang.Object obj50 = defaultedMap27.remove((java.lang.Object) 'a');
        int i51 = defaultedMap27.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) (-1L));
        boolean b57 = defaultedMap53.containsValue((java.lang.Object) 100L);
        int i58 = defaultedMap53.size();
        boolean b59 = defaultedMap27.containsValue((java.lang.Object) defaultedMap53);
        java.util.Set set60 = defaultedMap27.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0.0d + "'", obj49.equals(0.0d));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        int i10 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        java.util.Set set15 = defaultedMap12.entrySet();
        boolean b16 = fixedOrderComparator7.add((java.lang.Object) set15);
        int i17 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i18 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i19 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        java.lang.String str62 = defaultedMap58.toString();
        java.lang.Object obj63 = defaultedMap7.get((java.lang.Object) defaultedMap58);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator();
        boolean b66 = fixedOrderComparator64.add((java.lang.Object) (short) -1);
        java.lang.Object obj67 = defaultedMap58.get((java.lang.Object) (short) -1);
        java.util.Collection collection68 = defaultedMap58.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0.0d + "'", obj63.equals(0.0d));
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0.0d + "'", obj67.equals(0.0d));
        org.junit.Assert.assertNotNull(collection68);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap35.clear();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap35);
        java.util.Set set38 = defaultedMap35.entrySet();
        defaultedMap35.clear();
        collections.Factory factory40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, factory40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        boolean b10 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap12.remove(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap18.remove(obj21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        boolean b25 = defaultedMap18.containsKey((java.lang.Object) (short) 10);
        boolean b27 = defaultedMap18.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array34 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap38.clear();
        java.util.Collection collection40 = defaultedMap38.values();
        java.lang.Object obj41 = defaultedMap18.put((java.lang.Object) fixedOrderComparator35, (java.lang.Object) defaultedMap38);
        java.lang.String str42 = defaultedMap38.toString();
        boolean b43 = fixedOrderComparator7.add((java.lang.Object) defaultedMap38);
        collections.Factory factory44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, factory44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b43 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) str3);
        java.util.Set set5 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap14.remove(obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap20.remove(obj23);
        defaultedMap14.putAll((java.util.Map) defaultedMap20);
        boolean b27 = defaultedMap20.containsKey((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap20.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array36 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = fixedOrderComparator37.isLocked();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap40.clear();
        java.util.Collection collection42 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap20.put((java.lang.Object) fixedOrderComparator37, (java.lang.Object) defaultedMap40);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate44);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap49.remove(obj52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap55.remove(obj58);
        defaultedMap49.putAll((java.util.Map) defaultedMap55);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap62.remove(obj65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b70 = defaultedMap68.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap68.remove(obj71);
        defaultedMap62.putAll((java.util.Map) defaultedMap68);
        boolean b75 = defaultedMap68.containsKey((java.lang.Object) (short) 10);
        boolean b77 = defaultedMap68.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array84 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array84);
        boolean b86 = fixedOrderComparator85.isLocked();
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap88.clear();
        java.util.Collection collection90 = defaultedMap88.values();
        java.lang.Object obj91 = defaultedMap68.put((java.lang.Object) fixedOrderComparator85, (java.lang.Object) defaultedMap88);
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate93 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate92, predicate93);
        collections.Predicate predicate95 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate93, predicate95);
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate12, predicate93);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0.0d + "'", obj9.equals(0.0d));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(obj_array84);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        int i76 = defaultedMap19.size();
        java.lang.Object obj78 = defaultedMap19.remove((java.lang.Object) "hi!");
        java.lang.Object obj79 = null;
        java.lang.Object obj80 = defaultedMap19.remove(obj79);
        boolean b81 = defaultedMap19.isEmpty();
        java.lang.Object[] obj_array88 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array88);
        boolean b91 = fixedOrderComparator89.add((java.lang.Object) (byte) 10);
        boolean b92 = fixedOrderComparator89.isLocked();
        int i93 = fixedOrderComparator89.getUnknownObjectBehavior();
        boolean b94 = fixedOrderComparator89.isLocked();
        java.lang.Object obj95 = defaultedMap19.get((java.lang.Object) b94);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(i76 == 2);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(obj_array88);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(i93 == 2);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue("'" + obj95 + "' != '" + 0.0d + "'", obj95.equals(0.0d));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        java.lang.String str31 = defaultedMap27.toString();
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap35.clear();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap35);
        java.util.Set set38 = defaultedMap35.entrySet();
        defaultedMap35.clear();
        java.util.Set set40 = defaultedMap35.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.get(obj13);
        int i15 = defaultedMap1.size();
        java.lang.Object obj16 = null;
        java.lang.Object obj18 = defaultedMap1.put(obj16, (java.lang.Object) true);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) (short) 10);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) 100L);
        int i14 = defaultedMap9.size();
        boolean b15 = defaultedMap5.equals((java.lang.Object) i14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap17.remove(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap23.remove(obj26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap23.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array39 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap43.clear();
        java.util.Collection collection45 = defaultedMap43.values();
        java.lang.Object obj46 = defaultedMap23.put((java.lang.Object) fixedOrderComparator40, (java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap48.remove(obj51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap54.remove(obj57);
        defaultedMap48.putAll((java.util.Map) defaultedMap54);
        boolean b61 = defaultedMap54.containsKey((java.lang.Object) (short) 10);
        boolean b63 = defaultedMap54.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array70 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        boolean b72 = fixedOrderComparator71.isLocked();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap74.clear();
        java.util.Collection collection76 = defaultedMap74.values();
        java.lang.Object obj77 = defaultedMap54.put((java.lang.Object) fixedOrderComparator71, (java.lang.Object) defaultedMap74);
        defaultedMap23.putAll((java.util.Map) defaultedMap54);
        defaultedMap5.putAll((java.util.Map) defaultedMap23);
        java.util.Set set80 = defaultedMap23.keySet();
        boolean b81 = defaultedMap1.containsValue((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.Factory factory76 = null;
        try {
            java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, factory76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap4.remove(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap21.clear();
        java.lang.String str23 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) set25);
        java.util.Set set27 = defaultedMap10.entrySet();
        boolean b28 = fixedOrderComparator2.add((java.lang.Object) defaultedMap10);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        boolean b17 = defaultedMap13.containsValue((java.lang.Object) 100L);
        int i18 = defaultedMap13.size();
        java.util.Set set19 = defaultedMap13.entrySet();
        java.util.Set set20 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap22.remove(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap28.remove(obj31);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        boolean b35 = defaultedMap28.containsKey((java.lang.Object) (short) 10);
        boolean b37 = defaultedMap28.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array44 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b46 = fixedOrderComparator45.isLocked();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap48.clear();
        java.util.Collection collection50 = defaultedMap48.values();
        java.lang.Object obj51 = defaultedMap28.put((java.lang.Object) fixedOrderComparator45, (java.lang.Object) defaultedMap48);
        java.lang.Object obj52 = defaultedMap13.remove(obj51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap54.remove(obj57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj63 = null;
        java.lang.Object obj64 = defaultedMap60.remove(obj63);
        defaultedMap54.putAll((java.util.Map) defaultedMap60);
        boolean b67 = defaultedMap60.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) (-1L));
        boolean b77 = defaultedMap73.containsValue((java.lang.Object) 100L);
        int i78 = defaultedMap73.size();
        boolean b79 = defaultedMap69.equals((java.lang.Object) i78);
        boolean b80 = defaultedMap60.equals((java.lang.Object) b79);
        java.lang.Object obj82 = defaultedMap60.get((java.lang.Object) 1.0d);
        java.lang.Object obj83 = null;
        java.lang.Object obj84 = defaultedMap13.put((java.lang.Object) defaultedMap60, obj83);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b88 = defaultedMap86.containsKey((java.lang.Object) (-1L));
        java.util.Set set89 = defaultedMap86.entrySet();
        java.util.Set set90 = defaultedMap86.keySet();
        try {
            boolean b91 = fixedOrderComparator11.addAsEqual(obj83, (java.lang.Object) defaultedMap86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0.0d + "'", obj71.equals(0.0d));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 0.0d + "'", obj82.equals(0.0d));
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNotNull(set90);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj79 = defaultedMap77.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b83 = defaultedMap81.containsKey((java.lang.Object) (-1L));
        boolean b85 = defaultedMap81.containsValue((java.lang.Object) 100L);
        int i86 = defaultedMap81.size();
        boolean b87 = defaultedMap77.equals((java.lang.Object) i86);
        boolean b88 = defaultedMap1.containsValue((java.lang.Object) defaultedMap77);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap90.clear();
        int i92 = defaultedMap90.size();
        java.util.Set set93 = defaultedMap90.entrySet();
        boolean b94 = defaultedMap77.containsKey((java.lang.Object) defaultedMap90);
        java.lang.Object obj95 = null;
        java.lang.Object obj96 = defaultedMap77.remove(obj95);
        java.lang.String str97 = defaultedMap77.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 0.0d + "'", obj79.equals(0.0d));
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(i92 == 0);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertTrue("'" + str97 + "' != '" + "{}" + "'", str97.equals("{}"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap14.clear();
        java.lang.String str16 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) (-1.0d));
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection24 = defaultedMap14.values();
        java.lang.Object obj25 = defaultedMap7.get((java.lang.Object) collection24);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0d + "'", obj25.equals(0.0d));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object[] obj_array10 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap15.clear();
        boolean b17 = fixedOrderComparator11.add((java.lang.Object) defaultedMap15);
        boolean b19 = defaultedMap15.equals((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap21.remove(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap27.remove(obj30);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        boolean b34 = defaultedMap27.containsKey((java.lang.Object) (short) 10);
        boolean b36 = defaultedMap27.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array43 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator44.isLocked();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap47.clear();
        java.util.Collection collection49 = defaultedMap47.values();
        java.lang.Object obj50 = defaultedMap27.put((java.lang.Object) fixedOrderComparator44, (java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap52.remove(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = defaultedMap58.remove(obj61);
        defaultedMap52.putAll((java.util.Map) defaultedMap58);
        boolean b65 = defaultedMap58.containsKey((java.lang.Object) (short) 10);
        boolean b67 = defaultedMap58.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array74 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        boolean b76 = fixedOrderComparator75.isLocked();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap78.clear();
        java.util.Collection collection80 = defaultedMap78.values();
        java.lang.Object obj81 = defaultedMap58.put((java.lang.Object) fixedOrderComparator75, (java.lang.Object) defaultedMap78);
        defaultedMap27.putAll((java.util.Map) defaultedMap58);
        boolean b83 = defaultedMap15.equals((java.lang.Object) defaultedMap58);
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b83);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(map84);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object obj18 = defaultedMap7.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) (-1L));
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) 100L);
        int i25 = defaultedMap20.size();
        java.util.Set set26 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap28.remove(obj31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap34.remove(obj37);
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        boolean b41 = defaultedMap34.containsKey((java.lang.Object) (short) 10);
        boolean b43 = defaultedMap34.containsValue((java.lang.Object) '#');
        java.lang.Object obj45 = defaultedMap34.get((java.lang.Object) 'a');
        boolean b46 = defaultedMap34.isEmpty();
        java.lang.String str47 = defaultedMap34.toString();
        java.lang.Object obj48 = defaultedMap20.remove((java.lang.Object) str47);
        java.util.Collection collection49 = defaultedMap20.values();
        defaultedMap7.putAll((java.util.Map) defaultedMap20);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0.0d + "'", obj45.equals(0.0d));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) (byte) 10);
        boolean b25 = fixedOrderComparator22.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        boolean b29 = defaultedMap27.isEmpty();
        boolean b30 = fixedOrderComparator22.add((java.lang.Object) defaultedMap27);
        boolean b31 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object obj18 = defaultedMap7.get((java.lang.Object) 'a');
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) 100L);
        int i26 = defaultedMap21.size();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj30 = defaultedMap21.get((java.lang.Object) obj_array28);
        java.lang.Object obj31 = defaultedMap7.get((java.lang.Object) defaultedMap21);
        java.lang.String str32 = defaultedMap21.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0.0d + "'", obj30.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0.0d + "'", obj31.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap5.remove(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        java.util.Collection collection13 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) collection13);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) fixedOrderComparator23);
        java.util.Set set25 = defaultedMap5.keySet();
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        defaultedMap5.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0d + "'", obj24.equals(0.0d));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap32.get(obj44);
        boolean b46 = defaultedMap27.containsValue(obj44);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0.0d + "'", obj45.equals(0.0d));
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        java.util.Set set63 = defaultedMap38.keySet();
        java.lang.Object obj64 = null;
        boolean b65 = defaultedMap38.containsValue(obj64);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap13.clear();
        java.lang.String str15 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) str15);
        boolean b17 = defaultedMap1.equals((java.lang.Object) str15);
        int i18 = defaultedMap1.size();
        java.lang.String str19 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) defaultedMap11);
        boolean b15 = defaultedMap11.equals((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap17.remove(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap23.remove(obj26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap23.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array39 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap43.clear();
        java.util.Collection collection45 = defaultedMap43.values();
        java.lang.Object obj46 = defaultedMap23.put((java.lang.Object) fixedOrderComparator40, (java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap48.remove(obj51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap54.remove(obj57);
        defaultedMap48.putAll((java.util.Map) defaultedMap54);
        boolean b61 = defaultedMap54.containsKey((java.lang.Object) (short) 10);
        boolean b63 = defaultedMap54.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array70 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        boolean b72 = fixedOrderComparator71.isLocked();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap74.clear();
        java.util.Collection collection76 = defaultedMap74.values();
        java.lang.Object obj77 = defaultedMap54.put((java.lang.Object) fixedOrderComparator71, (java.lang.Object) defaultedMap74);
        defaultedMap23.putAll((java.util.Map) defaultedMap54);
        boolean b79 = defaultedMap11.equals((java.lang.Object) defaultedMap54);
        boolean b80 = defaultedMap54.isEmpty();
        java.lang.String str81 = defaultedMap54.toString();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        boolean b63 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b68 = defaultedMap66.containsKey((java.lang.Object) (-1L));
        boolean b70 = defaultedMap66.containsValue((java.lang.Object) 100L);
        int i71 = defaultedMap66.size();
        java.util.Set set72 = defaultedMap66.entrySet();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b76 = defaultedMap74.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj77 = null;
        java.lang.Object obj78 = defaultedMap74.remove(obj77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b82 = defaultedMap80.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj83 = null;
        java.lang.Object obj84 = defaultedMap80.remove(obj83);
        defaultedMap74.putAll((java.util.Map) defaultedMap80);
        boolean b87 = defaultedMap80.containsKey((java.lang.Object) (short) 10);
        boolean b89 = defaultedMap80.containsValue((java.lang.Object) '#');
        java.lang.Object obj91 = defaultedMap80.get((java.lang.Object) 'a');
        boolean b92 = defaultedMap80.isEmpty();
        java.lang.String str93 = defaultedMap80.toString();
        java.lang.Object obj94 = defaultedMap66.remove((java.lang.Object) str93);
        defaultedMap38.putAll((java.util.Map) defaultedMap66);
        java.util.Set set96 = defaultedMap38.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 0.0d + "'", obj91.equals(0.0d));
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "{}" + "'", str93.equals("{}"));
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(set96);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) str3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 1.0d);
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.remove(obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap15.remove(obj18);
        defaultedMap9.putAll((java.util.Map) defaultedMap15);
        boolean b22 = defaultedMap15.containsKey((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap15.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array31 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b33 = fixedOrderComparator32.isLocked();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap35.clear();
        java.util.Collection collection37 = defaultedMap35.values();
        java.lang.Object obj38 = defaultedMap15.put((java.lang.Object) fixedOrderComparator32, (java.lang.Object) defaultedMap35);
        java.lang.Object obj40 = defaultedMap35.get((java.lang.Object) (short) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator41.add((java.lang.Object) (short) -1);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) b43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap46.clear();
        java.lang.String str48 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) str48);
        defaultedMap35.putAll((java.util.Map) defaultedMap49);
        boolean b51 = defaultedMap4.equals((java.lang.Object) defaultedMap35);
        java.lang.Object obj53 = defaultedMap35.get((java.lang.Object) (short) 100);
        collections.Transformer transformer54 = null;
        try {
            java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, transformer54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0.0d + "'", obj53.equals(0.0d));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object obj18 = defaultedMap7.get((java.lang.Object) 'a');
        boolean b19 = defaultedMap7.isEmpty();
        java.lang.String str20 = defaultedMap7.toString();
        defaultedMap7.clear();
        java.lang.String str22 = defaultedMap7.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        boolean b16 = fixedOrderComparator14.add((java.lang.Object) (byte) 10);
        boolean b17 = fixedOrderComparator14.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap19.clear();
        boolean b21 = defaultedMap19.isEmpty();
        boolean b22 = fixedOrderComparator14.add((java.lang.Object) defaultedMap19);
        int i23 = fixedOrderComparator14.getUnknownObjectBehavior();
        boolean b24 = fixedOrderComparator14.isLocked();
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) b24);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0.0d + "'", obj5.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0d + "'", obj25.equals(0.0d));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.PredicateUtils predicateUtils76 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap78.clear();
        java.lang.String str80 = defaultedMap78.toString();
        java.lang.Object obj82 = defaultedMap78.get((java.lang.Object) 1.0f);
        defaultedMap78.clear();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b87 = defaultedMap85.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj88 = null;
        java.lang.Object obj89 = defaultedMap85.remove(obj88);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b93 = defaultedMap91.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj94 = null;
        java.lang.Object obj95 = defaultedMap91.remove(obj94);
        defaultedMap85.putAll((java.util.Map) defaultedMap91);
        java.lang.Object obj97 = defaultedMap78.get((java.lang.Object) defaultedMap91);
        java.lang.Object obj98 = defaultedMap19.put((java.lang.Object) predicateUtils76, (java.lang.Object) defaultedMap78);
        java.util.Collection collection99 = defaultedMap19.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 0.0d + "'", obj82.equals(0.0d));
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertTrue("'" + obj97 + "' != '" + 0.0d + "'", obj97.equals(0.0d));
        org.junit.Assert.assertNull(obj98);
        org.junit.Assert.assertNotNull(collection99);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap12.remove(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap18.remove(obj21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b34 = fixedOrderComparator32.add((java.lang.Object) (byte) 10);
        boolean b35 = fixedOrderComparator32.isLocked();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) fixedOrderComparator32);
        java.util.Set set37 = defaultedMap12.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap7.clear();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) collection9);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) fixedOrderComparator19);
        java.lang.String str21 = defaultedMap1.toString();
        java.util.Set set22 = defaultedMap1.keySet();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) "{}");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0d + "'", obj24.equals(0.0d));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        java.lang.Object obj32 = defaultedMap27.get((java.lang.Object) (short) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b35 = fixedOrderComparator33.add((java.lang.Object) (short) -1);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) b35);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap27.remove(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0);
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) (-1.0d));
        boolean b45 = defaultedMap27.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object[] obj_array52 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        fixedOrderComparator53.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array62 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        boolean b65 = fixedOrderComparator63.add((java.lang.Object) (byte) 10);
        boolean b66 = fixedOrderComparator63.isLocked();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap68.clear();
        boolean b70 = defaultedMap68.isEmpty();
        boolean b71 = fixedOrderComparator63.add((java.lang.Object) defaultedMap68);
        boolean b72 = fixedOrderComparator53.add((java.lang.Object) fixedOrderComparator63);
        boolean b73 = fixedOrderComparator53.isLocked();
        boolean b74 = defaultedMap27.containsKey((java.lang.Object) b73);
        java.util.Set set75 = defaultedMap27.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0.0d + "'", obj42.equals(0.0d));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(set75);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap35.clear();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap35);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap40.remove(obj43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap46.remove(obj49);
        defaultedMap40.putAll((java.util.Map) defaultedMap46);
        boolean b53 = defaultedMap46.containsKey((java.lang.Object) (short) 10);
        boolean b55 = defaultedMap46.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array62 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        boolean b64 = fixedOrderComparator63.isLocked();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap66.clear();
        java.util.Collection collection68 = defaultedMap66.values();
        java.lang.Object obj69 = defaultedMap46.put((java.lang.Object) fixedOrderComparator63, (java.lang.Object) defaultedMap66);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b73 = defaultedMap71.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj74 = null;
        java.lang.Object obj75 = defaultedMap71.remove(obj74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b79 = defaultedMap77.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj80 = null;
        java.lang.Object obj81 = defaultedMap77.remove(obj80);
        defaultedMap71.putAll((java.util.Map) defaultedMap77);
        boolean b84 = defaultedMap77.containsKey((java.lang.Object) (short) 10);
        boolean b86 = defaultedMap77.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap88.clear();
        java.lang.String str90 = defaultedMap88.toString();
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) str90);
        java.util.Set set92 = defaultedMap91.keySet();
        java.util.Map map93 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, (java.lang.Object) set92);
        java.util.Set set94 = defaultedMap77.entrySet();
        defaultedMap46.putAll((java.util.Map) defaultedMap77);
        boolean b96 = defaultedMap46.isEmpty();
        boolean b97 = defaultedMap7.containsValue((java.lang.Object) b96);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "{}" + "'", str90.equals("{}"));
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap12.remove(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap18.remove(obj21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b34 = fixedOrderComparator32.add((java.lang.Object) (byte) 10);
        boolean b35 = fixedOrderComparator32.isLocked();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) fixedOrderComparator32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) (-1L));
        boolean b46 = defaultedMap42.containsValue((java.lang.Object) 100L);
        boolean b47 = defaultedMap38.equals((java.lang.Object) 100L);
        java.util.Set set48 = defaultedMap38.keySet();
        boolean b49 = fixedOrderComparator32.add((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) (-1L));
        java.util.Set set54 = defaultedMap51.entrySet();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap56.clear();
        java.lang.String str58 = defaultedMap56.toString();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj62 = defaultedMap60.get((java.lang.Object) 0);
        java.lang.Object obj64 = defaultedMap60.remove((java.lang.Object) (-1.0d));
        defaultedMap56.putAll((java.util.Map) defaultedMap60);
        try {
            int i66 = fixedOrderComparator32.compare((java.lang.Object) set54, (java.lang.Object) defaultedMap56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0.0d + "'", obj62.equals(0.0d));
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap49.clear();
        java.lang.String str51 = defaultedMap49.toString();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) str51);
        java.util.Set set53 = defaultedMap52.keySet();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) set53);
        java.util.Set set55 = defaultedMap38.entrySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        boolean b57 = defaultedMap7.isEmpty();
        defaultedMap7.clear();
        boolean b59 = defaultedMap7.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        java.lang.Object obj64 = defaultedMap7.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b68 = defaultedMap66.containsKey((java.lang.Object) (-1L));
        boolean b70 = defaultedMap66.containsValue((java.lang.Object) 100L);
        int i71 = defaultedMap66.size();
        java.lang.Object[] obj_array73 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array73);
        java.lang.Object obj75 = defaultedMap66.get((java.lang.Object) obj_array73);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array73);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array73);
        java.lang.Object obj78 = defaultedMap7.get((java.lang.Object) obj_array73);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(obj_array73);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 0.0d + "'", obj75.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 0.0d + "'", obj78.equals(0.0d));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap7.clear();
        java.lang.String str9 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) str9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 1.0d);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap15.remove(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap21.remove(obj24);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        boolean b28 = defaultedMap21.containsKey((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap21.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array37 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        boolean b39 = fixedOrderComparator38.isLocked();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap41.clear();
        java.util.Collection collection43 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap21.put((java.lang.Object) fixedOrderComparator38, (java.lang.Object) defaultedMap41);
        java.lang.Object obj46 = defaultedMap41.get((java.lang.Object) (short) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        boolean b49 = fixedOrderComparator47.add((java.lang.Object) (short) -1);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) b49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap52.clear();
        java.lang.String str54 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) str54);
        defaultedMap41.putAll((java.util.Map) defaultedMap55);
        boolean b57 = defaultedMap10.equals((java.lang.Object) defaultedMap41);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        int i59 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0.0d + "'", obj5.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0.0d + "'", obj46.equals(0.0d));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(i59 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap35.clear();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap35);
        java.util.Set set38 = defaultedMap35.entrySet();
        java.util.Set set39 = defaultedMap35.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) defaultedMap11);
        boolean b15 = defaultedMap11.equals((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap17.remove(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap23.remove(obj26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap23.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array39 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap43.clear();
        java.util.Collection collection45 = defaultedMap43.values();
        java.lang.Object obj46 = defaultedMap23.put((java.lang.Object) fixedOrderComparator40, (java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap48.remove(obj51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap54.remove(obj57);
        defaultedMap48.putAll((java.util.Map) defaultedMap54);
        boolean b61 = defaultedMap54.containsKey((java.lang.Object) (short) 10);
        boolean b63 = defaultedMap54.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array70 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        boolean b72 = fixedOrderComparator71.isLocked();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap74.clear();
        java.util.Collection collection76 = defaultedMap74.values();
        java.lang.Object obj77 = defaultedMap54.put((java.lang.Object) fixedOrderComparator71, (java.lang.Object) defaultedMap74);
        defaultedMap23.putAll((java.util.Map) defaultedMap54);
        boolean b79 = defaultedMap11.equals((java.lang.Object) defaultedMap54);
        java.util.Set set80 = defaultedMap11.keySet();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(set80);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator12.isLocked();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) 100L);
        int i26 = defaultedMap21.size();
        boolean b27 = defaultedMap17.equals((java.lang.Object) i26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap29.remove(obj32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap35.remove(obj38);
        defaultedMap29.putAll((java.util.Map) defaultedMap35);
        boolean b42 = defaultedMap35.containsKey((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap35.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array51 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        boolean b53 = fixedOrderComparator52.isLocked();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap55.clear();
        java.util.Collection collection57 = defaultedMap55.values();
        java.lang.Object obj58 = defaultedMap35.put((java.lang.Object) fixedOrderComparator52, (java.lang.Object) defaultedMap55);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj63 = null;
        java.lang.Object obj64 = defaultedMap60.remove(obj63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b68 = defaultedMap66.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj69 = null;
        java.lang.Object obj70 = defaultedMap66.remove(obj69);
        defaultedMap60.putAll((java.util.Map) defaultedMap66);
        boolean b73 = defaultedMap66.containsKey((java.lang.Object) (short) 10);
        boolean b75 = defaultedMap66.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array82 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array82);
        boolean b84 = fixedOrderComparator83.isLocked();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap86.clear();
        java.util.Collection collection88 = defaultedMap86.values();
        java.lang.Object obj89 = defaultedMap66.put((java.lang.Object) fixedOrderComparator83, (java.lang.Object) defaultedMap86);
        defaultedMap35.putAll((java.util.Map) defaultedMap66);
        defaultedMap17.putAll((java.util.Map) defaultedMap35);
        int i92 = defaultedMap35.size();
        java.lang.Object obj94 = defaultedMap35.remove((java.lang.Object) "hi!");
        java.lang.Object obj95 = null;
        java.lang.Object obj96 = defaultedMap35.remove(obj95);
        try {
            int i97 = fixedOrderComparator12.compare((java.lang.Object) (byte) 0, obj95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(obj_array82);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue(i92 == 2);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap7.clear();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) collection9);
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap17.remove(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap23.remove(obj26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) (-1L));
        boolean b34 = defaultedMap30.containsValue((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap17.get((java.lang.Object) b34);
        java.util.Set set36 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        boolean b42 = defaultedMap38.containsValue((java.lang.Object) 100L);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) defaultedMap38);
        java.util.Set set44 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap46.clear();
        boolean b48 = defaultedMap46.isEmpty();
        java.util.Set set49 = defaultedMap46.entrySet();
        java.lang.Object obj50 = defaultedMap13.put((java.lang.Object) set44, (java.lang.Object) defaultedMap46);
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) set44);
        collections.Transformer transformer52 = null;
        try {
            java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0.0d + "'", obj35.equals(0.0d));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        java.lang.Object obj32 = defaultedMap27.get((java.lang.Object) (short) 0);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate34);
        collections.Factory factory36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, factory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b10 = fixedOrderComparator8.add((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap12.clear();
        java.lang.Object obj15 = defaultedMap12.get((java.lang.Object) 0.0d);
        java.lang.Object obj17 = defaultedMap12.remove((java.lang.Object) 1.0d);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        int i28 = fixedOrderComparator25.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) (-1L));
        java.util.Set set33 = defaultedMap30.entrySet();
        boolean b34 = fixedOrderComparator25.add((java.lang.Object) set33);
        int i35 = fixedOrderComparator25.getUnknownObjectBehavior();
        int i36 = fixedOrderComparator25.getUnknownObjectBehavior();
        try {
            boolean b37 = fixedOrderComparator8.addAsEqual(obj17, (java.lang.Object) i36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap8.clear();
        java.lang.String str10 = defaultedMap8.toString();
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 1.0f);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) fixedOrderComparator15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = null;
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate17, predicate18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator20.add((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap24.clear();
        java.util.Collection collection26 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap28.remove(obj31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap34.remove(obj37);
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        boolean b41 = defaultedMap34.containsKey((java.lang.Object) (short) 10);
        boolean b43 = defaultedMap34.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array50 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        boolean b52 = fixedOrderComparator51.isLocked();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap54.clear();
        java.util.Collection collection56 = defaultedMap54.values();
        java.lang.Object obj57 = defaultedMap34.put((java.lang.Object) fixedOrderComparator51, (java.lang.Object) defaultedMap54);
        java.lang.Object obj59 = defaultedMap54.get((java.lang.Object) (short) 0);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate60, predicate61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b66 = defaultedMap64.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj67 = null;
        java.lang.Object obj68 = defaultedMap64.remove(obj67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b72 = defaultedMap70.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj73 = null;
        java.lang.Object obj74 = defaultedMap70.remove(obj73);
        defaultedMap64.putAll((java.util.Map) defaultedMap70);
        boolean b77 = defaultedMap70.containsKey((java.lang.Object) (short) 10);
        boolean b79 = defaultedMap70.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array86 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array86);
        boolean b88 = fixedOrderComparator87.isLocked();
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap90.clear();
        java.util.Collection collection92 = defaultedMap90.values();
        java.lang.Object obj93 = defaultedMap70.put((java.lang.Object) fixedOrderComparator87, (java.lang.Object) defaultedMap90);
        collections.Predicate predicate94 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate95 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate94, predicate95);
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate61, predicate94);
        boolean b98 = fixedOrderComparator20.add((java.lang.Object) predicate61);
        java.util.Map map99 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate61);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0.0d + "'", obj12.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0.0d + "'", obj59.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(obj_array86);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertTrue(b98 == true);
        org.junit.Assert.assertNotNull(map99);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap35.clear();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap35);
        defaultedMap7.clear();
        java.util.Set set39 = defaultedMap7.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap4.remove(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap21.clear();
        java.lang.String str23 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) set25);
        java.util.Set set27 = defaultedMap10.entrySet();
        boolean b28 = fixedOrderComparator2.add((java.lang.Object) defaultedMap10);
        java.util.Set set29 = defaultedMap10.keySet();
        defaultedMap10.clear();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b8 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap16.clear();
        java.util.Collection collection18 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) collection18);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj29 = defaultedMap10.get((java.lang.Object) fixedOrderComparator28);
        java.util.Set set30 = defaultedMap10.keySet();
        try {
            boolean b32 = fixedOrderComparator7.addAsEqual((java.lang.Object) set30, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0.0d + "'", obj29.equals(0.0d));
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator7);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object obj18 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object[] obj_array25 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b28 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        boolean b38 = defaultedMap34.containsValue((java.lang.Object) 100L);
        boolean b39 = defaultedMap30.equals((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap41.remove(obj44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = defaultedMap47.remove(obj50);
        defaultedMap41.putAll((java.util.Map) defaultedMap47);
        boolean b53 = defaultedMap30.containsValue((java.lang.Object) defaultedMap41);
        java.lang.Object obj54 = null;
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, obj54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap57.clear();
        java.lang.String str59 = defaultedMap57.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj64 = null;
        java.lang.Object obj65 = defaultedMap61.remove(obj64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b69 = defaultedMap67.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj70 = null;
        java.lang.Object obj71 = defaultedMap67.remove(obj70);
        defaultedMap61.putAll((java.util.Map) defaultedMap67);
        boolean b74 = defaultedMap67.containsKey((java.lang.Object) (short) 10);
        boolean b76 = defaultedMap67.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array83 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array83);
        boolean b85 = fixedOrderComparator84.isLocked();
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap87.clear();
        java.util.Collection collection89 = defaultedMap87.values();
        java.lang.Object obj90 = defaultedMap67.put((java.lang.Object) fixedOrderComparator84, (java.lang.Object) defaultedMap87);
        java.lang.Object obj92 = defaultedMap87.get((java.lang.Object) (short) 0);
        defaultedMap57.putAll((java.util.Map) defaultedMap87);
        defaultedMap41.putAll((java.util.Map) defaultedMap87);
        boolean b95 = defaultedMap7.containsKey((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(obj_array83);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + 0.0d + "'", obj92.equals(0.0d));
        org.junit.Assert.assertTrue(b95 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b8 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator7);
        int i9 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 2);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) str3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 1.0d);
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.remove(obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap15.remove(obj18);
        defaultedMap9.putAll((java.util.Map) defaultedMap15);
        boolean b22 = defaultedMap15.containsKey((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap15.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array31 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b33 = fixedOrderComparator32.isLocked();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap35.clear();
        java.util.Collection collection37 = defaultedMap35.values();
        java.lang.Object obj38 = defaultedMap15.put((java.lang.Object) fixedOrderComparator32, (java.lang.Object) defaultedMap35);
        java.lang.Object obj40 = defaultedMap35.get((java.lang.Object) (short) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator41.add((java.lang.Object) (short) -1);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) b43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap46.clear();
        java.lang.String str48 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) str48);
        defaultedMap35.putAll((java.util.Map) defaultedMap49);
        boolean b51 = defaultedMap4.equals((java.lang.Object) defaultedMap35);
        java.lang.Object obj53 = defaultedMap35.get((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap55.remove(obj58);
        java.util.Collection collection60 = defaultedMap55.values();
        boolean b61 = defaultedMap35.containsKey((java.lang.Object) defaultedMap55);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0.0d + "'", obj53.equals(0.0d));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap4.clear();
        java.util.Collection collection6 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.remove(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap14.remove(obj17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap14.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array30 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        boolean b32 = fixedOrderComparator31.isLocked();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap34.clear();
        java.util.Collection collection36 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap14.put((java.lang.Object) fixedOrderComparator31, (java.lang.Object) defaultedMap34);
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) (short) 0);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate41, predicate74);
        boolean b78 = fixedOrderComparator0.add((java.lang.Object) predicate41);
        fixedOrderComparator0.setUnknownObjectBehavior(2);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        boolean b15 = fixedOrderComparator7.add((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap17.remove(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap23.remove(obj26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap23.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap34.clear();
        java.lang.String str36 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) str36);
        java.util.Set set38 = defaultedMap37.keySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) set38);
        java.util.Set set40 = defaultedMap23.entrySet();
        java.lang.Object obj42 = defaultedMap23.get((java.lang.Object) 10.0d);
        java.util.Set set43 = defaultedMap23.entrySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap23);
        defaultedMap12.clear();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0.0d + "'", obj42.equals(0.0d));
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap4.remove(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap21.clear();
        java.lang.String str23 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) set25);
        java.util.Set set27 = defaultedMap10.entrySet();
        boolean b28 = fixedOrderComparator2.add((java.lang.Object) defaultedMap10);
        java.util.Set set29 = defaultedMap10.keySet();
        boolean b30 = defaultedMap10.isEmpty();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap13.clear();
        java.lang.String str15 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) str15);
        boolean b17 = defaultedMap1.equals((java.lang.Object) str15);
        int i18 = defaultedMap1.size();
        java.lang.String str19 = defaultedMap1.toString();
        int i20 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) 100L);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) b18);
        java.util.Set set20 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) set20);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.get(obj13);
        int i15 = defaultedMap1.size();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        boolean b29 = fixedOrderComparator23.add((java.lang.Object) defaultedMap27);
        boolean b31 = defaultedMap27.equals((java.lang.Object) true);
        defaultedMap27.clear();
        boolean b33 = defaultedMap1.containsValue((java.lang.Object) defaultedMap27);
        java.util.Set set34 = defaultedMap27.entrySet();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b45 = fixedOrderComparator43.add((java.lang.Object) (byte) 100);
        int i46 = fixedOrderComparator43.getUnknownObjectBehavior();
        java.lang.Object obj47 = defaultedMap27.get((java.lang.Object) fixedOrderComparator43);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b57 = fixedOrderComparator55.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap59.clear();
        boolean b61 = fixedOrderComparator55.add((java.lang.Object) defaultedMap59);
        java.lang.Object obj62 = defaultedMap27.get((java.lang.Object) defaultedMap59);
        java.util.Collection collection63 = defaultedMap59.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0.0d + "'", obj47.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0.0d + "'", obj62.equals(0.0d));
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        boolean b10 = fixedOrderComparator7.isLocked();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap16.remove(obj19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        boolean b23 = defaultedMap16.containsKey((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap16.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array32 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b34 = fixedOrderComparator33.isLocked();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap36.clear();
        java.util.Collection collection38 = defaultedMap36.values();
        java.lang.Object obj39 = defaultedMap16.put((java.lang.Object) fixedOrderComparator33, (java.lang.Object) defaultedMap36);
        java.lang.Object obj40 = defaultedMap1.remove(obj39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap42.remove(obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap48.remove(obj51);
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        boolean b55 = defaultedMap48.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj59 = defaultedMap57.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) (-1L));
        boolean b65 = defaultedMap61.containsValue((java.lang.Object) 100L);
        int i66 = defaultedMap61.size();
        boolean b67 = defaultedMap57.equals((java.lang.Object) i66);
        boolean b68 = defaultedMap48.equals((java.lang.Object) b67);
        java.lang.Object obj70 = defaultedMap48.get((java.lang.Object) 1.0d);
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap1.put((java.lang.Object) defaultedMap48, obj71);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj77 = defaultedMap75.get((java.lang.Object) 0);
        java.lang.Object obj79 = defaultedMap75.remove((java.lang.Object) (-1.0d));
        java.util.Set set80 = defaultedMap75.entrySet();
        boolean b81 = defaultedMap75.isEmpty();
        int i82 = defaultedMap75.size();
        java.lang.Object obj83 = null;
        boolean b84 = defaultedMap75.equals(obj83);
        java.lang.Object obj85 = defaultedMap73.get((java.lang.Object) defaultedMap75);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0.0d + "'", obj59.equals(0.0d));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 0.0d + "'", obj70.equals(0.0d));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 0.0d + "'", obj77.equals(0.0d));
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap7.clear();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) collection9);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) fixedOrderComparator19);
        java.lang.String str21 = defaultedMap1.toString();
        defaultedMap1.clear();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap16.remove(obj19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        boolean b23 = defaultedMap16.containsKey((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap16.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array32 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b34 = fixedOrderComparator33.isLocked();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap36.clear();
        java.util.Collection collection38 = defaultedMap36.values();
        java.lang.Object obj39 = defaultedMap16.put((java.lang.Object) fixedOrderComparator33, (java.lang.Object) defaultedMap36);
        java.lang.Object obj40 = defaultedMap1.remove(obj39);
        java.util.Set set41 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) str3);
        java.util.Set set5 = defaultedMap4.keySet();
        int i6 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.remove(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap14.remove(obj17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap14.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array30 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        boolean b32 = fixedOrderComparator31.isLocked();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap34.clear();
        java.util.Collection collection36 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap14.put((java.lang.Object) fixedOrderComparator31, (java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = defaultedMap39.remove(obj42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap45.remove(obj48);
        defaultedMap39.putAll((java.util.Map) defaultedMap45);
        boolean b52 = defaultedMap45.containsKey((java.lang.Object) (short) 10);
        boolean b54 = defaultedMap45.containsValue((java.lang.Object) '#');
        java.lang.Object obj56 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.Object obj57 = defaultedMap34.remove((java.lang.Object) 'a');
        int i58 = defaultedMap34.size();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        boolean b64 = defaultedMap60.containsValue((java.lang.Object) 100L);
        int i65 = defaultedMap60.size();
        boolean b66 = defaultedMap34.containsValue((java.lang.Object) defaultedMap60);
        java.lang.Object obj67 = defaultedMap4.remove((java.lang.Object) defaultedMap60);
        java.util.Set set68 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0.0d + "'", obj56.equals(0.0d));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap7.clear();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) collection9);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) fixedOrderComparator19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap22.remove(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap28.remove(obj31);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        boolean b35 = defaultedMap28.containsKey((java.lang.Object) (short) 10);
        boolean b37 = defaultedMap28.containsValue((java.lang.Object) '#');
        java.lang.Object obj39 = defaultedMap28.get((java.lang.Object) 'a');
        boolean b40 = defaultedMap28.isEmpty();
        java.lang.String str41 = defaultedMap28.toString();
        boolean b42 = fixedOrderComparator19.add((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        boolean b52 = defaultedMap48.containsValue((java.lang.Object) 100L);
        boolean b53 = defaultedMap44.equals((java.lang.Object) 100L);
        boolean b54 = defaultedMap44.isEmpty();
        java.lang.Object[] obj_array61 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        boolean b63 = fixedOrderComparator62.isLocked();
        boolean b65 = fixedOrderComparator62.add((java.lang.Object) (short) 10);
        try {
            boolean b66 = fixedOrderComparator19.addAsEqual((java.lang.Object) b54, (java.lang.Object) b65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0.0d + "'", obj39.equals(0.0d));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap12.remove(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap18.remove(obj21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) (-1L));
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) 100L);
        int i31 = defaultedMap26.size();
        java.util.Set set32 = defaultedMap26.entrySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) set32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap35.remove(obj38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap41.remove(obj44);
        defaultedMap35.putAll((java.util.Map) defaultedMap41);
        boolean b48 = defaultedMap41.containsKey((java.lang.Object) (short) 10);
        boolean b50 = defaultedMap41.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array57 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        boolean b59 = fixedOrderComparator58.isLocked();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap61.clear();
        java.util.Collection collection63 = defaultedMap61.values();
        java.lang.Object obj64 = defaultedMap41.put((java.lang.Object) fixedOrderComparator58, (java.lang.Object) defaultedMap61);
        boolean b65 = defaultedMap12.equals((java.lang.Object) fixedOrderComparator58);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap15.clear();
        java.lang.String str17 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) str17);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 1.0d);
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) b20);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0.0d + "'", obj21.equals(0.0d));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) obj_array8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) 100L);
        int i17 = defaultedMap12.size();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b23 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator22);
        int i24 = fixedOrderComparator22.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0.0d + "'", obj21.equals(0.0d));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        boolean b63 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b68 = defaultedMap66.containsKey((java.lang.Object) (-1L));
        boolean b70 = defaultedMap66.containsValue((java.lang.Object) 100L);
        int i71 = defaultedMap66.size();
        java.util.Set set72 = defaultedMap66.entrySet();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b76 = defaultedMap74.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj77 = null;
        java.lang.Object obj78 = defaultedMap74.remove(obj77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b82 = defaultedMap80.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj83 = null;
        java.lang.Object obj84 = defaultedMap80.remove(obj83);
        defaultedMap74.putAll((java.util.Map) defaultedMap80);
        boolean b87 = defaultedMap80.containsKey((java.lang.Object) (short) 10);
        boolean b89 = defaultedMap80.containsValue((java.lang.Object) '#');
        java.lang.Object obj91 = defaultedMap80.get((java.lang.Object) 'a');
        boolean b92 = defaultedMap80.isEmpty();
        java.lang.String str93 = defaultedMap80.toString();
        java.lang.Object obj94 = defaultedMap66.remove((java.lang.Object) str93);
        defaultedMap38.putAll((java.util.Map) defaultedMap66);
        int i96 = defaultedMap38.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 0.0d + "'", obj91.equals(0.0d));
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "{}" + "'", str93.equals("{}"));
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertTrue(i96 == 1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj77 = defaultedMap1.get((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 0.0d + "'", obj77.equals(0.0d));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Collection collection5 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) 100L);
        int i13 = defaultedMap8.size();
        java.util.Set set14 = defaultedMap8.entrySet();
        java.util.Set set15 = defaultedMap8.entrySet();
        int i16 = defaultedMap8.size();
        boolean b18 = defaultedMap8.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) b18);
        java.util.Collection collection20 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 1);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj79 = defaultedMap77.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b83 = defaultedMap81.containsKey((java.lang.Object) (-1L));
        boolean b85 = defaultedMap81.containsValue((java.lang.Object) 100L);
        int i86 = defaultedMap81.size();
        boolean b87 = defaultedMap77.equals((java.lang.Object) i86);
        boolean b88 = defaultedMap1.containsValue((java.lang.Object) defaultedMap77);
        boolean b89 = defaultedMap77.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 0.0d + "'", obj79.equals(0.0d));
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b89 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.Object[] obj_array0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        boolean b10 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        boolean b15 = fixedOrderComparator7.add((java.lang.Object) defaultedMap12);
        boolean b16 = fixedOrderComparator7.isLocked();
        int i17 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i18 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertTrue(i18 == 2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) str3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 1.0d);
        defaultedMap4.clear();
        int i8 = defaultedMap4.size();
        java.util.Collection collection9 = defaultedMap4.values();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) defaultedMap11);
        boolean b15 = defaultedMap11.equals((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap17.remove(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap23.remove(obj26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap23.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array39 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap43.clear();
        java.util.Collection collection45 = defaultedMap43.values();
        java.lang.Object obj46 = defaultedMap23.put((java.lang.Object) fixedOrderComparator40, (java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap48.remove(obj51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap54.remove(obj57);
        defaultedMap48.putAll((java.util.Map) defaultedMap54);
        boolean b61 = defaultedMap54.containsKey((java.lang.Object) (short) 10);
        boolean b63 = defaultedMap54.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array70 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        boolean b72 = fixedOrderComparator71.isLocked();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap74.clear();
        java.util.Collection collection76 = defaultedMap74.values();
        java.lang.Object obj77 = defaultedMap54.put((java.lang.Object) fixedOrderComparator71, (java.lang.Object) defaultedMap74);
        defaultedMap23.putAll((java.util.Map) defaultedMap54);
        boolean b79 = defaultedMap11.equals((java.lang.Object) defaultedMap54);
        java.lang.String str80 = defaultedMap54.toString();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) obj_array8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) 100L);
        int i17 = defaultedMap12.size();
        java.util.Set set18 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap20.remove(obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap26.remove(obj29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) (short) 10);
        boolean b35 = defaultedMap26.containsValue((java.lang.Object) '#');
        java.lang.Object obj37 = defaultedMap26.get((java.lang.Object) 'a');
        boolean b38 = defaultedMap26.isEmpty();
        java.lang.String str39 = defaultedMap26.toString();
        java.lang.Object obj40 = defaultedMap12.remove((java.lang.Object) str39);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) str39);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0.0d + "'", obj37.equals(0.0d));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0.0d + "'", obj41.equals(0.0d));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate11);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate(map12, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0.0d + "'", obj5.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        defaultedMap27.clear();
        int i32 = defaultedMap27.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) (-1.0d));
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set11 = defaultedMap5.entrySet();
        boolean b12 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Collection collection4 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) (byte) 10);
        boolean b25 = fixedOrderComparator22.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        boolean b29 = defaultedMap27.isEmpty();
        boolean b30 = fixedOrderComparator22.add((java.lang.Object) defaultedMap27);
        boolean b31 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap34.remove(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap40.remove(obj43);
        defaultedMap34.putAll((java.util.Map) defaultedMap40);
        boolean b47 = defaultedMap40.containsKey((java.lang.Object) (short) 10);
        boolean b49 = defaultedMap40.containsValue((java.lang.Object) '#');
        java.lang.Object obj51 = defaultedMap40.get((java.lang.Object) 'a');
        boolean b52 = defaultedMap40.isEmpty();
        boolean b53 = defaultedMap1.containsKey((java.lang.Object) defaultedMap40);
        java.util.Collection collection54 = defaultedMap40.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0.0d + "'", obj51.equals(0.0d));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(collection54);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) 100L);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) b18);
        java.util.Set set20 = defaultedMap1.entrySet();
        java.util.Set set21 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0.0d + "'", obj19.equals(0.0d));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) -1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (byte) 10);
        boolean b13 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap15.clear();
        boolean b17 = defaultedMap15.isEmpty();
        boolean b18 = fixedOrderComparator10.add((java.lang.Object) defaultedMap15);
        boolean b19 = fixedOrderComparator0.add((java.lang.Object) defaultedMap15);
        java.util.Set set20 = defaultedMap15.entrySet();
        java.lang.Object[] obj_array27 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b31 = fixedOrderComparator29.add((java.lang.Object) (byte) 100);
        int i32 = fixedOrderComparator29.getUnknownObjectBehavior();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) fixedOrderComparator29);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 2);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.get(obj13);
        int i15 = defaultedMap1.size();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        boolean b29 = fixedOrderComparator23.add((java.lang.Object) defaultedMap27);
        boolean b31 = defaultedMap27.equals((java.lang.Object) true);
        defaultedMap27.clear();
        boolean b33 = defaultedMap1.containsValue((java.lang.Object) defaultedMap27);
        java.util.Set set34 = defaultedMap27.entrySet();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b45 = fixedOrderComparator43.add((java.lang.Object) (byte) 100);
        int i46 = fixedOrderComparator43.getUnknownObjectBehavior();
        java.lang.Object obj47 = defaultedMap27.get((java.lang.Object) fixedOrderComparator43);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b57 = fixedOrderComparator55.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap59.clear();
        boolean b61 = fixedOrderComparator55.add((java.lang.Object) defaultedMap59);
        java.lang.Object obj62 = defaultedMap27.get((java.lang.Object) defaultedMap59);
        java.util.Set set63 = defaultedMap59.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0.0d + "'", obj47.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0.0d + "'", obj62.equals(0.0d));
        org.junit.Assert.assertNotNull(set63);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        java.lang.String str62 = defaultedMap58.toString();
        java.lang.Object obj63 = defaultedMap7.get((java.lang.Object) defaultedMap58);
        java.lang.Object obj65 = defaultedMap58.remove((java.lang.Object) (byte) 0);
        java.lang.String str66 = defaultedMap58.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0.0d + "'", obj63.equals(0.0d));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        java.lang.String str62 = defaultedMap58.toString();
        java.lang.Object obj63 = defaultedMap7.get((java.lang.Object) defaultedMap58);
        java.lang.Object[] obj_array70 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        boolean b73 = fixedOrderComparator71.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap75.clear();
        boolean b77 = fixedOrderComparator71.add((java.lang.Object) defaultedMap75);
        boolean b79 = defaultedMap75.equals((java.lang.Object) true);
        defaultedMap75.clear();
        boolean b81 = defaultedMap58.containsKey((java.lang.Object) defaultedMap75);
        java.lang.Object obj83 = defaultedMap75.remove((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0.0d + "'", obj63.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        java.util.Set set76 = defaultedMap19.keySet();
        java.lang.String str77 = defaultedMap19.toString();
        boolean b79 = defaultedMap19.containsKey((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        java.util.Set set76 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap78.clear();
        java.lang.String str80 = defaultedMap78.toString();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) str80);
        java.util.Set set82 = defaultedMap81.keySet();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) set82);
        int i84 = defaultedMap19.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue(i84 == 2);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator();
        boolean b77 = fixedOrderComparator76.isLocked();
        boolean b78 = defaultedMap19.containsKey((java.lang.Object) b77);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        try {
            fixedOrderComparator11.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap35.clear();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap35);
        java.util.Set set38 = defaultedMap35.entrySet();
        defaultedMap35.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        boolean b45 = defaultedMap41.containsValue((java.lang.Object) 100L);
        int i46 = defaultedMap41.size();
        java.lang.Object[] obj_array48 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        java.lang.Object obj50 = defaultedMap41.get((java.lang.Object) obj_array48);
        java.lang.Object obj51 = defaultedMap35.get((java.lang.Object) obj_array48);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0.0d + "'", obj50.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0.0d + "'", obj51.equals(0.0d));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        boolean b63 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b68 = defaultedMap66.containsKey((java.lang.Object) (-1L));
        boolean b70 = defaultedMap66.containsValue((java.lang.Object) 100L);
        int i71 = defaultedMap66.size();
        java.util.Set set72 = defaultedMap66.entrySet();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b76 = defaultedMap74.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj77 = null;
        java.lang.Object obj78 = defaultedMap74.remove(obj77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b82 = defaultedMap80.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj83 = null;
        java.lang.Object obj84 = defaultedMap80.remove(obj83);
        defaultedMap74.putAll((java.util.Map) defaultedMap80);
        boolean b87 = defaultedMap80.containsKey((java.lang.Object) (short) 10);
        boolean b89 = defaultedMap80.containsValue((java.lang.Object) '#');
        java.lang.Object obj91 = defaultedMap80.get((java.lang.Object) 'a');
        boolean b92 = defaultedMap80.isEmpty();
        java.lang.String str93 = defaultedMap80.toString();
        java.lang.Object obj94 = defaultedMap66.remove((java.lang.Object) str93);
        defaultedMap38.putAll((java.util.Map) defaultedMap66);
        java.lang.String str96 = defaultedMap38.toString();
        int i97 = defaultedMap38.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 0.0d + "'", obj91.equals(0.0d));
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "{}" + "'", str93.equals("{}"));
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertTrue(i97 == 1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj79 = defaultedMap77.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b83 = defaultedMap81.containsKey((java.lang.Object) (-1L));
        boolean b85 = defaultedMap81.containsValue((java.lang.Object) 100L);
        int i86 = defaultedMap81.size();
        boolean b87 = defaultedMap77.equals((java.lang.Object) i86);
        boolean b88 = defaultedMap1.containsValue((java.lang.Object) defaultedMap77);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap90.clear();
        int i92 = defaultedMap90.size();
        java.util.Set set93 = defaultedMap90.entrySet();
        boolean b94 = defaultedMap77.containsKey((java.lang.Object) defaultedMap90);
        collections.map.DefaultedMap defaultedMap95 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap77);
        java.lang.Object obj96 = null;
        boolean b97 = defaultedMap77.containsValue(obj96);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 0.0d + "'", obj79.equals(0.0d));
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(i92 == 0);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) obj_array8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap12.remove(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap18.remove(obj21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        boolean b25 = defaultedMap18.containsKey((java.lang.Object) (short) 10);
        boolean b27 = defaultedMap18.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array34 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap38.clear();
        java.util.Collection collection40 = defaultedMap38.values();
        java.lang.Object obj41 = defaultedMap18.put((java.lang.Object) fixedOrderComparator35, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = defaultedMap43.remove(obj46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap49.remove(obj52);
        defaultedMap43.putAll((java.util.Map) defaultedMap49);
        boolean b56 = defaultedMap49.containsKey((java.lang.Object) (short) 10);
        boolean b58 = defaultedMap49.containsValue((java.lang.Object) '#');
        java.lang.Object obj60 = defaultedMap49.get((java.lang.Object) 'a');
        java.lang.Object obj61 = defaultedMap38.remove((java.lang.Object) 'a');
        boolean b63 = defaultedMap38.containsKey((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap38);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0.0d + "'", obj60.equals(0.0d));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap7.clear();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) collection9);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) fixedOrderComparator19);
        fixedOrderComparator19.setUnknownObjectBehavior((int) (short) 1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) defaultedMap11);
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        defaultedMap11.clear();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator12.isLocked();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        int i25 = fixedOrderComparator22.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (-1L));
        java.util.Set set30 = defaultedMap27.entrySet();
        boolean b31 = fixedOrderComparator22.add((java.lang.Object) set30);
        int i32 = fixedOrderComparator22.getUnknownObjectBehavior();
        int i33 = fixedOrderComparator22.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        java.util.Set set38 = defaultedMap35.entrySet();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        fixedOrderComparator46.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        boolean b58 = fixedOrderComparator56.add((java.lang.Object) (byte) 10);
        boolean b59 = fixedOrderComparator56.isLocked();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap61.clear();
        boolean b63 = defaultedMap61.isEmpty();
        boolean b64 = fixedOrderComparator56.add((java.lang.Object) defaultedMap61);
        boolean b65 = fixedOrderComparator46.add((java.lang.Object) fixedOrderComparator56);
        java.lang.Object obj66 = defaultedMap35.get((java.lang.Object) fixedOrderComparator46);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b70 = defaultedMap68.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap68.remove(obj71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b76 = defaultedMap74.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj77 = null;
        java.lang.Object obj78 = defaultedMap74.remove(obj77);
        defaultedMap68.putAll((java.util.Map) defaultedMap74);
        boolean b81 = defaultedMap74.containsKey((java.lang.Object) (short) 10);
        boolean b83 = defaultedMap74.containsValue((java.lang.Object) '#');
        java.lang.Object obj85 = defaultedMap74.get((java.lang.Object) 'a');
        boolean b86 = defaultedMap74.isEmpty();
        boolean b87 = defaultedMap35.containsKey((java.lang.Object) defaultedMap74);
        try {
            boolean b88 = fixedOrderComparator12.addAsEqual((java.lang.Object) i33, (java.lang.Object) b87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0.0d + "'", obj66.equals(0.0d));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + 0.0d + "'", obj85.equals(0.0d));
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0.0d + "'", obj5.equals(0.0d));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.remove(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap14.remove(obj17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        java.lang.String str21 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (-1L));
        java.util.Set set26 = defaultedMap23.entrySet();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b46 = fixedOrderComparator44.add((java.lang.Object) (byte) 10);
        boolean b47 = fixedOrderComparator44.isLocked();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap49.clear();
        boolean b51 = defaultedMap49.isEmpty();
        boolean b52 = fixedOrderComparator44.add((java.lang.Object) defaultedMap49);
        boolean b53 = fixedOrderComparator34.add((java.lang.Object) fixedOrderComparator44);
        java.lang.Object obj54 = defaultedMap23.get((java.lang.Object) fixedOrderComparator34);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj59 = null;
        java.lang.Object obj60 = defaultedMap56.remove(obj59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap62.remove(obj65);
        defaultedMap56.putAll((java.util.Map) defaultedMap62);
        boolean b69 = defaultedMap62.containsKey((java.lang.Object) (short) 10);
        boolean b71 = defaultedMap62.containsValue((java.lang.Object) '#');
        java.lang.Object obj73 = defaultedMap62.get((java.lang.Object) 'a');
        boolean b74 = defaultedMap62.isEmpty();
        boolean b75 = defaultedMap23.containsKey((java.lang.Object) defaultedMap62);
        java.lang.Object obj76 = defaultedMap14.get((java.lang.Object) defaultedMap23);
        java.lang.String str77 = defaultedMap23.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0.0d + "'", obj5.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0.0d + "'", obj54.equals(0.0d));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0.0d + "'", obj73.equals(0.0d));
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0.0d + "'", obj76.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        boolean b10 = fixedOrderComparator7.add((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) (byte) 10);
        boolean b25 = fixedOrderComparator22.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        boolean b29 = defaultedMap27.isEmpty();
        boolean b30 = fixedOrderComparator22.add((java.lang.Object) defaultedMap27);
        boolean b31 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap34.remove(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap40.remove(obj43);
        defaultedMap34.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = defaultedMap34.get(obj46);
        int i48 = defaultedMap34.size();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        boolean b58 = fixedOrderComparator56.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap60.clear();
        boolean b62 = fixedOrderComparator56.add((java.lang.Object) defaultedMap60);
        boolean b64 = defaultedMap60.equals((java.lang.Object) true);
        defaultedMap60.clear();
        boolean b66 = defaultedMap34.containsValue((java.lang.Object) defaultedMap60);
        java.util.Set set67 = defaultedMap34.keySet();
        int i68 = defaultedMap34.size();
        try {
            boolean b70 = fixedOrderComparator12.addAsEqual((java.lang.Object) defaultedMap34, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0.0d + "'", obj47.equals(0.0d));
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(i68 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap4.remove(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap21.clear();
        java.lang.String str23 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) set25);
        java.util.Set set27 = defaultedMap10.entrySet();
        boolean b28 = fixedOrderComparator2.add((java.lang.Object) defaultedMap10);
        java.lang.Object obj30 = defaultedMap10.get((java.lang.Object) (byte) 100);
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0.0d + "'", obj30.equals(0.0d));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) (byte) 10);
        boolean b25 = fixedOrderComparator22.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        boolean b29 = defaultedMap27.isEmpty();
        boolean b30 = fixedOrderComparator22.add((java.lang.Object) defaultedMap27);
        boolean b31 = fixedOrderComparator12.add((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        boolean b33 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertTrue(b33 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) (-1L));
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) 100L);
        int i25 = defaultedMap20.size();
        boolean b26 = defaultedMap16.equals((java.lang.Object) i25);
        boolean b27 = defaultedMap7.equals((java.lang.Object) b26);
        collections.Transformer transformer28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object obj18 = defaultedMap7.get((java.lang.Object) 'a');
        boolean b19 = defaultedMap7.isEmpty();
        java.lang.String str20 = defaultedMap7.toString();
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (-1L));
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) 100L);
        int i32 = defaultedMap27.size();
        boolean b33 = defaultedMap23.equals((java.lang.Object) i32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap35.clear();
        java.lang.String str37 = defaultedMap35.toString();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) str37);
        boolean b39 = defaultedMap23.equals((java.lang.Object) str37);
        boolean b40 = defaultedMap7.equals((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0d + "'", obj25.equals(0.0d));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap4.remove(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap21.clear();
        java.lang.String str23 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) set25);
        java.util.Set set27 = defaultedMap10.entrySet();
        boolean b28 = fixedOrderComparator2.add((java.lang.Object) defaultedMap10);
        java.util.Set set29 = defaultedMap10.keySet();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array36);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap5.remove(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap11.remove(obj14);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b18 = defaultedMap11.containsKey((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap11.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array27 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b29 = fixedOrderComparator28.isLocked();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap31.clear();
        java.util.Collection collection33 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap11.put((java.lang.Object) fixedOrderComparator28, (java.lang.Object) defaultedMap31);
        java.lang.Object obj36 = defaultedMap31.get((java.lang.Object) (short) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b39 = fixedOrderComparator37.add((java.lang.Object) (short) -1);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) b39);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap31.remove(obj41);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap31);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0.0d + "'", obj36.equals(0.0d));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap5.remove(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap11.remove(obj14);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap5.get((java.lang.Object) b22);
        java.util.Set set24 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) (-1L));
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) 100L);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap26);
        java.util.Set set32 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap34.clear();
        boolean b36 = defaultedMap34.isEmpty();
        java.util.Set set37 = defaultedMap34.entrySet();
        java.lang.Object obj38 = defaultedMap1.put((java.lang.Object) set32, (java.lang.Object) defaultedMap34);
        collections.Factory factory39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, factory39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0.0d + "'", obj23.equals(0.0d));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object obj18 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object[] obj_array25 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b28 = defaultedMap7.equals((java.lang.Object) fixedOrderComparator27);
        java.util.Set set29 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        java.util.Set set31 = defaultedMap30.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        int i31 = fixedOrderComparator24.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 2);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        boolean b10 = fixedOrderComparator7.isLocked();
        boolean b11 = fixedOrderComparator7.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap1.keySet();
        int i12 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        boolean b10 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap12.remove(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap18.remove(obj21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        boolean b25 = defaultedMap18.containsKey((java.lang.Object) (short) 10);
        boolean b27 = defaultedMap18.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array34 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap38.clear();
        java.util.Collection collection40 = defaultedMap38.values();
        java.lang.Object obj41 = defaultedMap18.put((java.lang.Object) fixedOrderComparator35, (java.lang.Object) defaultedMap38);
        java.lang.String str42 = defaultedMap38.toString();
        boolean b43 = fixedOrderComparator7.add((java.lang.Object) defaultedMap38);
        boolean b44 = fixedOrderComparator7.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        int i9 = defaultedMap1.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array13 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap16.remove(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap22.remove(obj25);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        boolean b29 = defaultedMap22.containsKey((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap22.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap33.clear();
        java.lang.String str35 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) str35);
        java.util.Set set37 = defaultedMap36.keySet();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) set37);
        java.util.Set set39 = defaultedMap22.entrySet();
        boolean b40 = fixedOrderComparator14.add((java.lang.Object) defaultedMap22);
        boolean b41 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator14);
        int i42 = fixedOrderComparator14.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap18.clear();
        java.lang.String str20 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) str20);
        java.util.Set set22 = defaultedMap21.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) set22);
        java.lang.String str24 = defaultedMap7.toString();
        defaultedMap7.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b10 = fixedOrderComparator8.add((java.lang.Object) (byte) 100);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        int i12 = fixedOrderComparator8.getUnknownObjectBehavior();
        int i13 = fixedOrderComparator8.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 100L);
        int i10 = defaultedMap5.size();
        boolean b11 = defaultedMap1.equals((java.lang.Object) i10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap19.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap39.clear();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap19.put((java.lang.Object) fixedOrderComparator36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.remove(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap50.remove(obj53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap50.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array66 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b68 = fixedOrderComparator67.isLocked();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap50.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) defaultedMap70);
        defaultedMap19.putAll((java.util.Map) defaultedMap50);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj79 = defaultedMap77.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b83 = defaultedMap81.containsKey((java.lang.Object) (-1L));
        boolean b85 = defaultedMap81.containsValue((java.lang.Object) 100L);
        int i86 = defaultedMap81.size();
        boolean b87 = defaultedMap77.equals((java.lang.Object) i86);
        boolean b88 = defaultedMap1.containsValue((java.lang.Object) defaultedMap77);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap90.clear();
        boolean b92 = defaultedMap90.isEmpty();
        boolean b93 = defaultedMap90.isEmpty();
        boolean b94 = defaultedMap77.equals((java.lang.Object) defaultedMap90);
        java.util.Set set95 = defaultedMap77.keySet();
        collections.Factory factory96 = null;
        try {
            java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, factory96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 0.0d + "'", obj79.equals(0.0d));
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(b93 == true);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertNotNull(set95);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) (byte) 10);
        boolean b20 = fixedOrderComparator17.isLocked();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap22.clear();
        boolean b24 = defaultedMap22.isEmpty();
        boolean b25 = fixedOrderComparator17.add((java.lang.Object) defaultedMap22);
        boolean b26 = fixedOrderComparator7.add((java.lang.Object) fixedOrderComparator17);
        int i27 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        int i9 = defaultedMap1.size();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap7.clear();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) collection9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap12.remove(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap18.remove(obj21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        boolean b25 = defaultedMap18.containsKey((java.lang.Object) (short) 10);
        boolean b27 = defaultedMap18.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array34 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b36 = fixedOrderComparator35.isLocked();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap38.clear();
        java.util.Collection collection40 = defaultedMap38.values();
        java.lang.Object obj41 = defaultedMap18.put((java.lang.Object) fixedOrderComparator35, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = defaultedMap43.remove(obj46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap49.remove(obj52);
        defaultedMap43.putAll((java.util.Map) defaultedMap49);
        boolean b56 = defaultedMap49.containsKey((java.lang.Object) (short) 10);
        boolean b58 = defaultedMap49.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array65 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        boolean b67 = fixedOrderComparator66.isLocked();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap69.clear();
        java.util.Collection collection71 = defaultedMap69.values();
        java.lang.Object obj72 = defaultedMap49.put((java.lang.Object) fixedOrderComparator66, (java.lang.Object) defaultedMap69);
        defaultedMap18.putAll((java.util.Map) defaultedMap49);
        boolean b74 = defaultedMap49.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap49);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0.0d + "'", obj10.equals(0.0d));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) -1);
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 0.0f);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        fixedOrderComparator40.setUnknownObjectBehavior(0);
        java.lang.Object[] obj_array49 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        boolean b52 = fixedOrderComparator50.add((java.lang.Object) (byte) 10);
        boolean b53 = fixedOrderComparator50.isLocked();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap55.clear();
        boolean b57 = defaultedMap55.isEmpty();
        boolean b58 = fixedOrderComparator50.add((java.lang.Object) defaultedMap55);
        boolean b59 = fixedOrderComparator40.add((java.lang.Object) fixedOrderComparator50);
        boolean b60 = fixedOrderComparator40.isLocked();
        boolean b62 = fixedOrderComparator40.add((java.lang.Object) (-1.0f));
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) fixedOrderComparator40);
        boolean b64 = fixedOrderComparator40.isLocked();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator12.isLocked();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) fixedOrderComparator12);
        int i15 = fixedOrderComparator12.getUnknownObjectBehavior();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap21.remove(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap27.remove(obj30);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap21.get(obj33);
        int i35 = defaultedMap21.size();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b45 = fixedOrderComparator43.add((java.lang.Object) (byte) 10);
        boolean b46 = fixedOrderComparator43.isLocked();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap48.clear();
        boolean b50 = defaultedMap48.isEmpty();
        boolean b51 = fixedOrderComparator43.add((java.lang.Object) defaultedMap48);
        defaultedMap21.putAll((java.util.Map) defaultedMap48);
        try {
            boolean b53 = fixedOrderComparator12.addAsEqual((java.lang.Object) obj_array17, (java.lang.Object) defaultedMap48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0.0d + "'", obj34.equals(0.0d));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.remove(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap14.remove(obj17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        boolean b21 = defaultedMap14.isEmpty();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0.0d + "'", obj5.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) (-1.0d));
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        int i10 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        java.util.Set set15 = defaultedMap12.entrySet();
        boolean b16 = fixedOrderComparator7.add((java.lang.Object) set15);
        int i17 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i18 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b19 = fixedOrderComparator7.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.remove(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap14.remove(obj17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap22.remove(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap28.remove(obj31);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        boolean b35 = defaultedMap28.containsKey((java.lang.Object) (short) 10);
        boolean b37 = defaultedMap28.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array44 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b46 = fixedOrderComparator45.isLocked();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap48.clear();
        java.util.Collection collection50 = defaultedMap48.values();
        java.lang.Object obj51 = defaultedMap28.put((java.lang.Object) fixedOrderComparator45, (java.lang.Object) defaultedMap48);
        java.lang.Object obj53 = defaultedMap48.get((java.lang.Object) (short) 0);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate54, predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.lang.String str60 = defaultedMap58.toString();
        java.lang.Object obj62 = defaultedMap58.get((java.lang.Object) 1.0f);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) fixedOrderComparator65);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate68 = null;
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate54, predicate67);
        java.lang.Object obj71 = null;
        boolean b72 = defaultedMap14.equals(obj71);
        collections.Factory factory73 = null;
        try {
            java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, factory73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0.0d + "'", obj5.equals(0.0d));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0.0d + "'", obj20.equals(0.0d));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0.0d + "'", obj53.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0.0d + "'", obj62.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b72 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.get(obj13);
        int i15 = defaultedMap1.size();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) (byte) 10);
        boolean b26 = fixedOrderComparator23.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap28.clear();
        boolean b30 = defaultedMap28.isEmpty();
        boolean b31 = fixedOrderComparator23.add((java.lang.Object) defaultedMap28);
        defaultedMap1.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) (-1.0d));
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap41.remove(obj44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = defaultedMap47.remove(obj50);
        defaultedMap41.putAll((java.util.Map) defaultedMap47);
        boolean b54 = defaultedMap47.containsKey((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap47.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array63 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        boolean b65 = fixedOrderComparator64.isLocked();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap67.clear();
        java.util.Collection collection69 = defaultedMap67.values();
        java.lang.Object obj70 = defaultedMap47.put((java.lang.Object) fixedOrderComparator64, (java.lang.Object) defaultedMap67);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate39, predicate71);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b78 = defaultedMap76.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj79 = null;
        java.lang.Object obj80 = defaultedMap76.remove(obj79);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap82.clear();
        java.util.Collection collection84 = defaultedMap82.values();
        java.lang.Object obj85 = defaultedMap76.get((java.lang.Object) collection84);
        java.lang.Object[] obj_array92 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator93 = new collections.comparators.FixedOrderComparator(obj_array92);
        collections.comparators.FixedOrderComparator fixedOrderComparator94 = new collections.comparators.FixedOrderComparator(obj_array92);
        java.lang.Object obj95 = defaultedMap76.get((java.lang.Object) fixedOrderComparator94);
        java.lang.String str96 = defaultedMap76.toString();
        defaultedMap76.clear();
        java.lang.Object obj98 = defaultedMap28.put((java.lang.Object) defaultedMap34, (java.lang.Object) defaultedMap76);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0.0d + "'", obj36.equals(0.0d));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + 0.0d + "'", obj85.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array92);
        org.junit.Assert.assertTrue("'" + obj95 + "' != '" + 0.0d + "'", obj95.equals(0.0d));
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "{}" + "'", str96.equals("{}"));
        org.junit.Assert.assertNull(obj98);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b10 = fixedOrderComparator8.add((java.lang.Object) (byte) 100);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        boolean b12 = fixedOrderComparator8.isLocked();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap15.remove(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap21.remove(obj24);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        boolean b28 = defaultedMap21.containsKey((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap21.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array37 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        boolean b39 = fixedOrderComparator38.isLocked();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap41.clear();
        java.util.Collection collection43 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap21.put((java.lang.Object) fixedOrderComparator38, (java.lang.Object) defaultedMap41);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate45, predicate46);
        try {
            boolean b48 = fixedOrderComparator8.addAsEqual(obj13, (java.lang.Object) map47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) defaultedMap11);
        boolean b15 = defaultedMap11.equals((java.lang.Object) true);
        defaultedMap11.clear();
        java.util.Collection collection17 = defaultedMap11.values();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.remove(obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap15.clear();
        java.util.Collection collection17 = defaultedMap15.values();
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) collection17);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object obj28 = defaultedMap9.get((java.lang.Object) fixedOrderComparator27);
        java.util.Set set29 = defaultedMap9.keySet();
        boolean b30 = defaultedMap5.containsKey((java.lang.Object) defaultedMap9);
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) b30);
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0.0d + "'", obj18.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0.0d + "'", obj28.equals(0.0d));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        int i8 = defaultedMap1.size();
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap1.equals(obj9);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) 100L);
        int i22 = defaultedMap17.size();
        boolean b23 = defaultedMap13.equals((java.lang.Object) i22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap25.clear();
        java.lang.String str27 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) str27);
        boolean b29 = defaultedMap13.equals((java.lang.Object) str27);
        int i30 = defaultedMap13.size();
        java.lang.String str31 = defaultedMap13.toString();
        boolean b32 = defaultedMap1.equals((java.lang.Object) str31);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0.0d + "'", obj15.equals(0.0d));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        java.lang.String str31 = defaultedMap27.toString();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap34.remove(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap40.remove(obj43);
        defaultedMap34.putAll((java.util.Map) defaultedMap40);
        boolean b47 = defaultedMap40.containsKey((java.lang.Object) (short) 10);
        boolean b49 = defaultedMap40.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array56 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        boolean b58 = fixedOrderComparator57.isLocked();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap60.clear();
        java.util.Collection collection62 = defaultedMap60.values();
        java.lang.Object obj63 = defaultedMap40.put((java.lang.Object) fixedOrderComparator57, (java.lang.Object) defaultedMap60);
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate64);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        java.lang.String str62 = defaultedMap58.toString();
        java.lang.Object obj63 = defaultedMap7.get((java.lang.Object) defaultedMap58);
        java.lang.Object obj65 = defaultedMap58.remove((java.lang.Object) (byte) 0);
        defaultedMap58.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0.0d + "'", obj63.equals(0.0d));
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap5.remove(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap11.clear();
        java.util.Collection collection13 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) collection13);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) fixedOrderComparator23);
        java.util.Set set25 = defaultedMap5.keySet();
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        java.util.Collection collection27 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0d + "'", obj24.equals(0.0d));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap10.remove(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap16.remove(obj19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        boolean b23 = defaultedMap16.containsKey((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap16.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array32 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b34 = fixedOrderComparator33.isLocked();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap36.clear();
        java.util.Collection collection38 = defaultedMap36.values();
        java.lang.Object obj39 = defaultedMap16.put((java.lang.Object) fixedOrderComparator33, (java.lang.Object) defaultedMap36);
        java.lang.Object obj40 = defaultedMap1.remove(obj39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap42.remove(obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap48.remove(obj51);
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        boolean b55 = defaultedMap48.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj59 = defaultedMap57.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) (-1L));
        boolean b65 = defaultedMap61.containsValue((java.lang.Object) 100L);
        int i66 = defaultedMap61.size();
        boolean b67 = defaultedMap57.equals((java.lang.Object) i66);
        boolean b68 = defaultedMap48.equals((java.lang.Object) b67);
        java.lang.Object obj70 = defaultedMap48.get((java.lang.Object) 1.0d);
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap1.put((java.lang.Object) defaultedMap48, obj71);
        java.lang.String str73 = defaultedMap48.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0.0d + "'", obj59.equals(0.0d));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 0.0d + "'", obj70.equals(0.0d));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap1.get(obj13);
        int i15 = defaultedMap1.size();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b25 = fixedOrderComparator23.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        boolean b29 = fixedOrderComparator23.add((java.lang.Object) defaultedMap27);
        boolean b31 = defaultedMap27.equals((java.lang.Object) true);
        defaultedMap27.clear();
        boolean b33 = defaultedMap1.containsValue((java.lang.Object) defaultedMap27);
        java.util.Set set34 = defaultedMap27.entrySet();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b45 = fixedOrderComparator43.add((java.lang.Object) (byte) 100);
        int i46 = fixedOrderComparator43.getUnknownObjectBehavior();
        java.lang.Object obj47 = defaultedMap27.get((java.lang.Object) fixedOrderComparator43);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 0);
        boolean b52 = defaultedMap49.isEmpty();
        java.lang.Object[] obj_array59 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        boolean b61 = fixedOrderComparator60.isLocked();
        java.lang.Object obj62 = defaultedMap49.get((java.lang.Object) fixedOrderComparator60);
        boolean b63 = fixedOrderComparator43.add(obj62);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0.0d + "'", obj14.equals(0.0d));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0.0d + "'", obj47.equals(0.0d));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0.0d + "'", obj51.equals(0.0d));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0.0d + "'", obj62.equals(0.0d));
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        int i7 = defaultedMap1.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator8.isLocked();
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator8);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0.0d + "'", obj5.equals(0.0d));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap3.remove(obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.remove(obj12);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        boolean b16 = defaultedMap9.containsKey((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap9.containsValue((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap20.clear();
        java.lang.String str22 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) str22);
        java.util.Set set24 = defaultedMap23.keySet();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) set24);
        java.util.Set set26 = defaultedMap9.entrySet();
        boolean b27 = fixedOrderComparator0.add((java.lang.Object) set26);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        boolean b63 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        defaultedMap64.clear();
        defaultedMap64.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap35.clear();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 0);
        java.lang.Object obj43 = defaultedMap39.remove((java.lang.Object) (-1.0d));
        java.util.Set set44 = defaultedMap39.entrySet();
        boolean b45 = defaultedMap39.isEmpty();
        java.lang.Object obj46 = defaultedMap35.get((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap48.remove(obj51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap54.remove(obj57);
        defaultedMap48.putAll((java.util.Map) defaultedMap54);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) (-1L));
        boolean b65 = defaultedMap61.containsValue((java.lang.Object) 100L);
        java.lang.Object obj66 = defaultedMap48.get((java.lang.Object) b65);
        java.util.Set set67 = defaultedMap48.entrySet();
        java.lang.Object obj68 = defaultedMap39.get((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0.0d + "'", obj41.equals(0.0d));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0.0d + "'", obj46.equals(0.0d));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0.0d + "'", obj66.equals(0.0d));
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 0.0d + "'", obj68.equals(0.0d));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        boolean b10 = fixedOrderComparator7.add((java.lang.Object) (short) 10);
        boolean b11 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap13.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap19.remove(obj22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        java.util.Set set25 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap27.remove(obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap33.remove(obj36);
        defaultedMap27.putAll((java.util.Map) defaultedMap33);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap27.get(obj39);
        int i41 = defaultedMap27.size();
        java.lang.Object[] obj_array48 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b51 = fixedOrderComparator49.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap53.clear();
        boolean b55 = fixedOrderComparator49.add((java.lang.Object) defaultedMap53);
        boolean b57 = defaultedMap53.equals((java.lang.Object) true);
        defaultedMap53.clear();
        boolean b59 = defaultedMap27.containsValue((java.lang.Object) defaultedMap53);
        java.util.Collection collection60 = defaultedMap27.values();
        try {
            boolean b61 = fixedOrderComparator7.addAsEqual((java.lang.Object) set25, (java.lang.Object) collection60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0.0d + "'", obj40.equals(0.0d));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        boolean b9 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        boolean b19 = defaultedMap15.containsValue((java.lang.Object) 100L);
        int i20 = defaultedMap15.size();
        boolean b21 = defaultedMap11.equals((java.lang.Object) i20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap23.remove(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap29.remove(obj32);
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        boolean b36 = defaultedMap29.containsKey((java.lang.Object) (short) 10);
        boolean b38 = defaultedMap29.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array45 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        boolean b47 = fixedOrderComparator46.isLocked();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap49.clear();
        java.util.Collection collection51 = defaultedMap49.values();
        java.lang.Object obj52 = defaultedMap29.put((java.lang.Object) fixedOrderComparator46, (java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap54.remove(obj57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj63 = null;
        java.lang.Object obj64 = defaultedMap60.remove(obj63);
        defaultedMap54.putAll((java.util.Map) defaultedMap60);
        boolean b67 = defaultedMap60.containsKey((java.lang.Object) (short) 10);
        boolean b69 = defaultedMap60.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array76 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        boolean b78 = fixedOrderComparator77.isLocked();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap80.clear();
        java.util.Collection collection82 = defaultedMap80.values();
        java.lang.Object obj83 = defaultedMap60.put((java.lang.Object) fixedOrderComparator77, (java.lang.Object) defaultedMap80);
        defaultedMap29.putAll((java.util.Map) defaultedMap60);
        defaultedMap11.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj89 = defaultedMap87.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b93 = defaultedMap91.containsKey((java.lang.Object) (-1L));
        boolean b95 = defaultedMap91.containsValue((java.lang.Object) 100L);
        int i96 = defaultedMap91.size();
        boolean b97 = defaultedMap87.equals((java.lang.Object) i96);
        boolean b98 = defaultedMap11.containsValue((java.lang.Object) defaultedMap87);
        boolean b99 = fixedOrderComparator7.add((java.lang.Object) defaultedMap87);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0.0d + "'", obj13.equals(0.0d));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 0.0d + "'", obj89.equals(0.0d));
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue(i96 == 0);
        org.junit.Assert.assertTrue(b97 == false);
        org.junit.Assert.assertTrue(b98 == true);
        org.junit.Assert.assertTrue(b99 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i13 = defaultedMap1.size();
        java.lang.String str14 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) str3);
        java.util.Set set5 = defaultedMap4.keySet();
        int i6 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.remove(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap14.remove(obj17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap14.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array30 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        boolean b32 = fixedOrderComparator31.isLocked();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap34.clear();
        java.util.Collection collection36 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap14.put((java.lang.Object) fixedOrderComparator31, (java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = defaultedMap39.remove(obj42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap45.remove(obj48);
        defaultedMap39.putAll((java.util.Map) defaultedMap45);
        boolean b52 = defaultedMap45.containsKey((java.lang.Object) (short) 10);
        boolean b54 = defaultedMap45.containsValue((java.lang.Object) '#');
        java.lang.Object obj56 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.Object obj57 = defaultedMap34.remove((java.lang.Object) 'a');
        int i58 = defaultedMap34.size();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        boolean b64 = defaultedMap60.containsValue((java.lang.Object) 100L);
        int i65 = defaultedMap60.size();
        boolean b66 = defaultedMap34.containsValue((java.lang.Object) defaultedMap60);
        java.lang.Object obj67 = defaultedMap4.remove((java.lang.Object) defaultedMap60);
        defaultedMap60.clear();
        int i69 = defaultedMap60.size();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0.0d + "'", obj56.equals(0.0d));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(i69 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap1.clear();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) i3);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        java.lang.Object obj32 = defaultedMap27.get((java.lang.Object) (short) 0);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate34);
        java.lang.Object[] obj_array42 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b45 = defaultedMap27.containsKey((java.lang.Object) obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array42);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0.0d + "'", obj32.equals(0.0d));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i10 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        defaultedMap27.clear();
        collections.Factory factory32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, factory32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object obj49 = defaultedMap38.get((java.lang.Object) 'a');
        java.lang.Object obj50 = defaultedMap27.remove((java.lang.Object) 'a');
        int i51 = defaultedMap27.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b59 = defaultedMap57.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj60 = null;
        java.lang.Object obj61 = defaultedMap57.remove(obj60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap63.clear();
        java.util.Collection collection65 = defaultedMap63.values();
        java.lang.Object obj66 = defaultedMap57.get((java.lang.Object) collection65);
        java.lang.Object[] obj_array73 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array73);
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array73);
        java.lang.Object obj76 = defaultedMap57.get((java.lang.Object) fixedOrderComparator75);
        java.util.Set set77 = defaultedMap57.keySet();
        boolean b78 = defaultedMap53.containsKey((java.lang.Object) defaultedMap57);
        boolean b79 = defaultedMap27.containsKey((java.lang.Object) defaultedMap53);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0.0d + "'", obj49.equals(0.0d));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 0.0d + "'", obj55.equals(0.0d));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0.0d + "'", obj66.equals(0.0d));
        org.junit.Assert.assertNotNull(obj_array73);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0.0d + "'", obj76.equals(0.0d));
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap7.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap32.remove(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap38.remove(obj41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap38.containsValue((java.lang.Object) '#');
        java.lang.Object[] obj_array54 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = fixedOrderComparator55.isLocked();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap38.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) defaultedMap58);
        defaultedMap7.putAll((java.util.Map) defaultedMap38);
        boolean b63 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        int i65 = defaultedMap64.size();
        java.lang.Object[] obj_array72 = new java.lang.Object[] { false, 0.0d, '#', (short) 100, (byte) 100, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        boolean b75 = fixedOrderComparator73.add((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        defaultedMap77.clear();
        boolean b79 = fixedOrderComparator73.add((java.lang.Object) defaultedMap77);
        java.util.Set set80 = defaultedMap77.entrySet();
        defaultedMap64.putAll((java.util.Map) defaultedMap77);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(set80);
    }
}

