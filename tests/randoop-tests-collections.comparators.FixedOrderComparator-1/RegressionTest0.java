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
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) 10.0d);
        try {
            boolean b7 = fixedOrderComparator0.addAsEqual((java.lang.Object) 10, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.String str2 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b9 = fixedOrderComparator8.isLocked();
        java.lang.Object obj10 = new java.lang.Object();
        try {
            boolean b12 = fixedOrderComparator8.addAsEqual(obj10, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        int i7 = fixedOrderComparator6.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(i7 == 2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap7.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { fixedOrderComparator13, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) fixedOrderComparator21);
        collections.Factory factory23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate(map22, factory23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap1.toString();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) 100.0f);
        java.util.Set set8 = defaultedMap4.entrySet();
        try {
            int i10 = fixedOrderComparator0.compare((java.lang.Object) set8, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { fixedOrderComparator4, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap22);
        java.util.Map map30 = null;
        try {
            defaultedMap22.putAll(map30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (-1.0f));
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + true + "'", obj8.equals(true));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        java.util.Collection collection8 = defaultedMap1.values();
        java.util.Set set9 = defaultedMap1.entrySet();
        java.util.Collection collection10 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap7.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { fixedOrderComparator13, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) fixedOrderComparator21);
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate(map22, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { fixedOrderComparator7, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj16 = null;
        boolean b17 = fixedOrderComparator15.add(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj22 = defaultedMap19.remove((java.lang.Object) 100.0f);
        java.util.Set set23 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 100.0f);
        java.util.Set set29 = defaultedMap25.entrySet();
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.util.Collection collection31 = defaultedMap25.values();
        java.lang.Object obj32 = defaultedMap4.put(obj16, (java.lang.Object) defaultedMap25);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate33, predicate34);
        try {
            boolean b37 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap4, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + true + "'", obj6.equals(true));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { fixedOrderComparator16, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap34.remove((java.lang.Object) 100.0f);
        java.util.Set set38 = defaultedMap34.entrySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        java.util.Collection collection40 = defaultedMap34.values();
        java.lang.Object obj41 = defaultedMap13.put(obj25, (java.lang.Object) defaultedMap34);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate42, predicate43);
        try {
            int i45 = fixedOrderComparator9.compare(obj10, (java.lang.Object) predicate43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true + "'", obj15.equals(true));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj9 = null;
        try {
            boolean b11 = fixedOrderComparator8.addAsEqual(obj9, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator3.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array8 = new java.lang.Object[] { fixedOrderComparator3, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b12 = fixedOrderComparator11.isLocked();
        boolean b14 = fixedOrderComparator11.add((java.lang.Object) "hi!");
        try {
            boolean b15 = fixedOrderComparator0.addAsEqual((java.lang.Object) (short) 0, (java.lang.Object) fixedOrderComparator11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator8.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { fixedOrderComparator8, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj23 = defaultedMap20.remove((java.lang.Object) 100.0f);
        java.util.Set set24 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj29 = defaultedMap26.remove((java.lang.Object) 100.0f);
        java.util.Set set30 = defaultedMap26.entrySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        java.util.Collection collection32 = defaultedMap26.values();
        java.lang.Object obj33 = defaultedMap5.put(obj17, (java.lang.Object) defaultedMap26);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + true + "'", obj7.equals(true));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + true + "'", obj34.equals(true));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection13 = defaultedMap12.values();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) 100.0f);
        java.util.Set set16 = defaultedMap12.keySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (byte) -1);
        java.util.Collection collection19 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj24 = defaultedMap21.remove((java.lang.Object) 100.0f);
        java.util.Set set25 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) 100.0f);
        java.util.Set set31 = defaultedMap27.entrySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        boolean b34 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { fixedOrderComparator39, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array44);
        java.lang.Object obj48 = null;
        boolean b49 = fixedOrderComparator47.add(obj48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection52 = defaultedMap51.values();
        java.lang.Object obj54 = defaultedMap51.remove((java.lang.Object) 100.0f);
        java.util.Set set55 = defaultedMap51.keySet();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection58 = defaultedMap57.values();
        java.lang.Object obj60 = defaultedMap57.remove((java.lang.Object) 100.0f);
        java.util.Set set61 = defaultedMap57.entrySet();
        defaultedMap51.putAll((java.util.Map) defaultedMap57);
        java.util.Collection collection63 = defaultedMap57.values();
        java.lang.Object obj64 = defaultedMap36.put(obj48, (java.lang.Object) defaultedMap57);
        boolean b66 = defaultedMap36.containsValue((java.lang.Object) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator();
        boolean b69 = fixedOrderComparator67.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array72 = new java.lang.Object[] { fixedOrderComparator67, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array72);
        java.lang.Object obj77 = defaultedMap36.get((java.lang.Object) obj_array72);
        try {
            int i78 = fixedOrderComparator10.compare((java.lang.Object) b34, obj77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + true + "'", obj38.equals(true));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + true + "'", obj77.equals(true));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap2.keySet();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (byte) -1);
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) map8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { fixedOrderComparator13, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj22 = null;
        boolean b23 = fixedOrderComparator21.add(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 100.0f);
        java.util.Set set29 = defaultedMap25.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 100.0f);
        java.util.Set set35 = defaultedMap31.entrySet();
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Collection collection37 = defaultedMap31.values();
        java.lang.Object obj38 = defaultedMap10.put(obj22, (java.lang.Object) defaultedMap31);
        boolean b40 = defaultedMap10.containsValue((java.lang.Object) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator41.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array46 = new java.lang.Object[] { fixedOrderComparator41, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array46);
        java.lang.Object obj51 = defaultedMap10.get((java.lang.Object) obj_array46);
        java.lang.Object obj52 = defaultedMap1.get(obj51);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + true + "'", obj12.equals(true));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + true + "'", obj51.equals(true));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + true + "'", obj52.equals(true));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 100.0f);
        java.util.Set set15 = defaultedMap11.keySet();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) (byte) -1);
        try {
            boolean b19 = fixedOrderComparator9.addAsEqual((java.lang.Object) defaultedMap11, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap9.keySet();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) -1);
        java.util.Collection collection16 = defaultedMap9.values();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b9 = fixedOrderComparator8.isLocked();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 100.0f);
        java.util.Set set15 = defaultedMap11.entrySet();
        java.util.Collection collection16 = defaultedMap11.values();
        java.util.Collection collection17 = defaultedMap11.values();
        java.lang.String str18 = defaultedMap11.toString();
        java.util.Collection collection19 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection22 = defaultedMap21.values();
        java.util.Set set23 = defaultedMap21.entrySet();
        boolean b24 = defaultedMap21.isEmpty();
        int i25 = defaultedMap21.size();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.lang.String str32 = defaultedMap28.toString();
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection36 = defaultedMap35.values();
        java.lang.Object obj38 = defaultedMap35.remove((java.lang.Object) 100.0f);
        java.util.Set set39 = defaultedMap35.entrySet();
        java.util.Collection collection40 = defaultedMap35.values();
        java.util.Collection collection41 = defaultedMap35.values();
        try {
            boolean b42 = fixedOrderComparator8.addAsEqual(obj33, (java.lang.Object) collection41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + true + "'", obj33.equals(true));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        try {
            boolean b14 = fixedOrderComparator10.addAsEqual((java.lang.Object) predicateUtils11, (java.lang.Object) i13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(i13 == 2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) 100.0f);
        java.util.Set set12 = defaultedMap8.entrySet();
        java.util.Collection collection13 = defaultedMap8.values();
        java.util.Collection collection14 = defaultedMap8.values();
        java.lang.String str15 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) 100.0f);
        java.util.Set set21 = defaultedMap17.entrySet();
        java.util.Collection collection22 = defaultedMap17.values();
        java.util.Collection collection23 = defaultedMap17.values();
        java.lang.String str24 = defaultedMap17.toString();
        java.util.Collection collection25 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection28 = defaultedMap27.values();
        java.util.Set set29 = defaultedMap27.entrySet();
        boolean b30 = defaultedMap27.isEmpty();
        int i31 = defaultedMap27.size();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) defaultedMap27);
        try {
            int i33 = fixedOrderComparator6.compare((java.lang.Object) str15, (java.lang.Object) defaultedMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0);
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 100.0f);
        java.util.Set set14 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.entrySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { fixedOrderComparator22, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array27);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) fixedOrderComparator30);
        try {
            boolean b32 = fixedOrderComparator7.addAsEqual(obj8, (java.lang.Object) map31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b9 = fixedOrderComparator8.isLocked();
        boolean b11 = fixedOrderComparator8.add((java.lang.Object) "hi!");
        try {
            fixedOrderComparator8.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.String str2 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap1.toString();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { fixedOrderComparator11, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) 100.0f);
        java.util.Set set27 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection30 = defaultedMap29.values();
        java.lang.Object obj32 = defaultedMap29.remove((java.lang.Object) 100.0f);
        java.util.Set set33 = defaultedMap29.entrySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection35 = defaultedMap29.values();
        java.lang.Object obj36 = defaultedMap8.put(obj20, (java.lang.Object) defaultedMap29);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection42 = defaultedMap41.values();
        java.util.Set set43 = defaultedMap41.entrySet();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj45 = defaultedMap41.get((java.lang.Object) predicate44);
        boolean b46 = defaultedMap8.containsKey((java.lang.Object) predicate44);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate44);
        collections.Transformer transformer48 = null;
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate(map47, transformer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + true + "'", obj10.equals(true));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + true + "'", obj45.equals(true));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap1.toString();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { fixedOrderComparator11, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object obj20 = null;
        boolean b21 = fixedOrderComparator19.add(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) 100.0f);
        java.util.Set set27 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection30 = defaultedMap29.values();
        java.lang.Object obj32 = defaultedMap29.remove((java.lang.Object) 100.0f);
        java.util.Set set33 = defaultedMap29.entrySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection35 = defaultedMap29.values();
        java.lang.Object obj36 = defaultedMap8.put(obj20, (java.lang.Object) defaultedMap29);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection42 = defaultedMap41.values();
        java.util.Set set43 = defaultedMap41.entrySet();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj45 = defaultedMap41.get((java.lang.Object) predicate44);
        boolean b46 = defaultedMap8.containsKey((java.lang.Object) predicate44);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + true + "'", obj10.equals(true));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + true + "'", obj45.equals(true));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.remove((java.lang.Object) 100.0f);
        java.util.Set set7 = defaultedMap3.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) -1);
        java.util.Collection collection10 = defaultedMap3.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection14 = defaultedMap13.values();
        java.util.Set set15 = defaultedMap13.entrySet();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) predicate16);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + true + "'", obj17.equals(true));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 100.0f);
        java.util.Set set14 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.entrySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b23 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        boolean b30 = fixedOrderComparator28.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { fixedOrderComparator28, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj37 = null;
        boolean b38 = fixedOrderComparator36.add(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 100.0f);
        java.util.Set set44 = defaultedMap40.keySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection47 = defaultedMap46.values();
        java.lang.Object obj49 = defaultedMap46.remove((java.lang.Object) 100.0f);
        java.util.Set set50 = defaultedMap46.entrySet();
        defaultedMap40.putAll((java.util.Map) defaultedMap46);
        java.util.Collection collection52 = defaultedMap46.values();
        java.lang.Object obj53 = defaultedMap25.put(obj37, (java.lang.Object) defaultedMap46);
        defaultedMap1.putAll((java.util.Map) defaultedMap46);
        java.util.Set set55 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + true + "'", obj27.equals(true));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set55);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) (short) 100);
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) 10.0d);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) fixedOrderComparator6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { fixedOrderComparator16, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap34.remove((java.lang.Object) 100.0f);
        java.util.Set set38 = defaultedMap34.entrySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        java.util.Collection collection40 = defaultedMap34.values();
        java.lang.Object obj41 = defaultedMap13.put(obj25, (java.lang.Object) defaultedMap34);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate42, predicate43);
        boolean b45 = defaultedMap1.equals((java.lang.Object) map44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set48 = defaultedMap47.keySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = null;
        java.util.Map map52 = collections.map.PredicatedMap.decorate(map49, predicate50, predicate51);
        collections.Factory factory53 = null;
        try {
            java.util.Map map54 = collections.map.DefaultedMap.decorate(map52, factory53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + true + "'", obj11.equals(true));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true + "'", obj15.equals(true));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) b6);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) 100.0f);
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (byte) -1);
        java.util.Collection collection13 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection16 = defaultedMap15.values();
        java.lang.Object obj18 = defaultedMap15.remove((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj24 = defaultedMap21.remove((java.lang.Object) 100.0f);
        java.util.Set set25 = defaultedMap21.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        defaultedMap6.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        defaultedMap1.clear();
        java.lang.String str30 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator8.add(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection13 = defaultedMap12.values();
        java.util.Set set14 = defaultedMap12.entrySet();
        try {
            int i16 = fixedOrderComparator8.compare((java.lang.Object) defaultedMap12, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10.0d + "'", obj4.equals(10.0d));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 100.0f);
        java.util.Set set15 = defaultedMap11.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) (short) 100);
        boolean b20 = fixedOrderComparator16.add((java.lang.Object) 10.0d);
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) fixedOrderComparator16);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b28 = fixedOrderComparator26.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { fixedOrderComparator26, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj35 = null;
        boolean b36 = fixedOrderComparator34.add(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection39 = defaultedMap38.values();
        java.lang.Object obj41 = defaultedMap38.remove((java.lang.Object) 100.0f);
        java.util.Set set42 = defaultedMap38.keySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection45 = defaultedMap44.values();
        java.lang.Object obj47 = defaultedMap44.remove((java.lang.Object) 100.0f);
        java.util.Set set48 = defaultedMap44.entrySet();
        defaultedMap38.putAll((java.util.Map) defaultedMap44);
        java.util.Collection collection50 = defaultedMap44.values();
        java.lang.Object obj51 = defaultedMap23.put(obj35, (java.lang.Object) defaultedMap44);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate52, predicate53);
        boolean b55 = defaultedMap11.equals((java.lang.Object) map54);
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) map54);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + true + "'", obj8.equals(true));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + true + "'", obj21.equals(true));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + true + "'", obj25.equals(true));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + true + "'", obj56.equals(true));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b2 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { fixedOrderComparator4, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap22);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection35 = defaultedMap34.values();
        java.util.Set set36 = defaultedMap34.entrySet();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) predicate37);
        boolean b39 = defaultedMap1.containsKey((java.lang.Object) predicate37);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj43 = defaultedMap41.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        boolean b46 = fixedOrderComparator44.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array49 = new java.lang.Object[] { fixedOrderComparator44, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array49);
        java.lang.Object obj53 = null;
        boolean b54 = fixedOrderComparator52.add(obj53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection57 = defaultedMap56.values();
        java.lang.Object obj59 = defaultedMap56.remove((java.lang.Object) 100.0f);
        java.util.Set set60 = defaultedMap56.keySet();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection63 = defaultedMap62.values();
        java.lang.Object obj65 = defaultedMap62.remove((java.lang.Object) 100.0f);
        java.util.Set set66 = defaultedMap62.entrySet();
        defaultedMap56.putAll((java.util.Map) defaultedMap62);
        java.util.Collection collection68 = defaultedMap62.values();
        java.lang.Object obj69 = defaultedMap41.put(obj53, (java.lang.Object) defaultedMap62);
        java.lang.Object obj70 = defaultedMap1.get(obj53);
        java.util.Set set71 = defaultedMap1.entrySet();
        java.util.Set set72 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + true + "'", obj38.equals(true));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + true + "'", obj43.equals(true));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(set72);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) 10.0d);
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { fixedOrderComparator4, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap22);
        java.lang.Object obj31 = defaultedMap22.remove((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.isEmpty();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { fixedOrderComparator10, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj19 = null;
        boolean b20 = fixedOrderComparator18.add(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap28.entrySet();
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection34 = defaultedMap28.values();
        java.lang.Object obj35 = defaultedMap7.put(obj19, (java.lang.Object) defaultedMap28);
        boolean b37 = defaultedMap7.containsValue((java.lang.Object) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator();
        boolean b40 = fixedOrderComparator38.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { fixedOrderComparator38, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj48 = defaultedMap7.get((java.lang.Object) obj_array43);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator();
        boolean b57 = fixedOrderComparator55.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array60 = new java.lang.Object[] { fixedOrderComparator55, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array60);
        java.lang.Object obj64 = null;
        boolean b65 = fixedOrderComparator63.add(obj64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection68 = defaultedMap67.values();
        java.lang.Object obj70 = defaultedMap67.remove((java.lang.Object) 100.0f);
        java.util.Set set71 = defaultedMap67.keySet();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection74 = defaultedMap73.values();
        java.lang.Object obj76 = defaultedMap73.remove((java.lang.Object) 100.0f);
        java.util.Set set77 = defaultedMap73.entrySet();
        defaultedMap67.putAll((java.util.Map) defaultedMap73);
        java.util.Collection collection79 = defaultedMap73.values();
        java.lang.Object obj80 = defaultedMap52.put(obj64, (java.lang.Object) defaultedMap73);
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate81, predicate82);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection86 = defaultedMap85.values();
        java.util.Set set87 = defaultedMap85.entrySet();
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj89 = defaultedMap85.get((java.lang.Object) predicate88);
        boolean b90 = defaultedMap52.containsKey((java.lang.Object) predicate88);
        java.lang.String str91 = defaultedMap52.toString();
        java.lang.Object obj92 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) defaultedMap52);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + true + "'", obj48.equals(true));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + true + "'", obj54.equals(true));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + true + "'", obj89.equals(true));
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "{null={}}" + "'", str91.equals("{null={}}"));
        org.junit.Assert.assertNull(obj92);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator8.add(obj9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { fixedOrderComparator11, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b21 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator20);
        fixedOrderComparator8.setUnknownObjectBehavior(2);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 100.0f);
        java.util.Set set29 = defaultedMap25.keySet();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (byte) -1);
        java.util.Collection collection32 = defaultedMap25.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap34.remove((java.lang.Object) 100.0f);
        java.util.Set set38 = defaultedMap34.keySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 100.0f);
        java.util.Set set44 = defaultedMap40.entrySet();
        defaultedMap34.putAll((java.util.Map) defaultedMap40);
        defaultedMap25.putAll((java.util.Map) defaultedMap34);
        boolean b47 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator();
        boolean b54 = fixedOrderComparator52.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array57 = new java.lang.Object[] { fixedOrderComparator52, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object obj61 = null;
        boolean b62 = fixedOrderComparator60.add(obj61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection65 = defaultedMap64.values();
        java.lang.Object obj67 = defaultedMap64.remove((java.lang.Object) 100.0f);
        java.util.Set set68 = defaultedMap64.keySet();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection71 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap70.remove((java.lang.Object) 100.0f);
        java.util.Set set74 = defaultedMap70.entrySet();
        defaultedMap64.putAll((java.util.Map) defaultedMap70);
        java.util.Collection collection76 = defaultedMap70.values();
        java.lang.Object obj77 = defaultedMap49.put(obj61, (java.lang.Object) defaultedMap70);
        defaultedMap25.putAll((java.util.Map) defaultedMap70);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection81 = defaultedMap80.values();
        java.lang.Object obj83 = defaultedMap80.remove((java.lang.Object) 100.0f);
        java.util.Set set84 = defaultedMap80.entrySet();
        java.util.Collection collection85 = defaultedMap80.values();
        boolean b86 = defaultedMap80.isEmpty();
        try {
            boolean b87 = fixedOrderComparator8.addAsEqual((java.lang.Object) defaultedMap70, (java.lang.Object) defaultedMap80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + true + "'", obj51.equals(true));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue(b86 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { fixedOrderComparator9, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator20.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { fixedOrderComparator20, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b30 = fixedOrderComparator17.add((java.lang.Object) fixedOrderComparator29);
        fixedOrderComparator17.setUnknownObjectBehavior(2);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b35 = fixedOrderComparator33.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { fixedOrderComparator33, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        boolean b42 = fixedOrderComparator40.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { fixedOrderComparator40, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array45);
        boolean b50 = fixedOrderComparator39.add((java.lang.Object) obj_array45);
        try {
            int i51 = fixedOrderComparator8.compare((java.lang.Object) 2, (java.lang.Object) b50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) fixedOrderComparator7);
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) "{}");
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        boolean b3 = fixedOrderComparator1.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { fixedOrderComparator1, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj10 = null;
        boolean b11 = fixedOrderComparator9.add(obj10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator12.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { fixedOrderComparator12, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b22 = fixedOrderComparator9.add((java.lang.Object) fixedOrderComparator21);
        fixedOrderComparator21.setUnknownObjectBehavior((int) (byte) 0);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        boolean b29 = fixedOrderComparator27.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { fixedOrderComparator27, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array32);
        java.lang.Object obj36 = null;
        boolean b37 = fixedOrderComparator35.add(obj36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator();
        boolean b40 = fixedOrderComparator38.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { fixedOrderComparator38, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b48 = fixedOrderComparator35.add((java.lang.Object) fixedOrderComparator47);
        fixedOrderComparator47.setUnknownObjectBehavior(2);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 2);
        try {
            int i52 = fixedOrderComparator0.compare((java.lang.Object) (byte) 0, (java.lang.Object) map51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap7.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.remove((java.lang.Object) 100.0f);
        java.util.Set set7 = defaultedMap3.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) -1);
        java.util.Collection collection10 = defaultedMap3.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { fixedOrderComparator16, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap34.remove((java.lang.Object) 100.0f);
        java.util.Set set38 = defaultedMap34.entrySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        java.util.Collection collection40 = defaultedMap34.values();
        java.lang.Object obj41 = defaultedMap13.put(obj25, (java.lang.Object) defaultedMap34);
        java.util.Collection collection42 = defaultedMap34.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap34);
        boolean b44 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true + "'", obj15.equals(true));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.isEmpty();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { fixedOrderComparator10, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj19 = null;
        boolean b20 = fixedOrderComparator18.add(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap28.entrySet();
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection34 = defaultedMap28.values();
        java.lang.Object obj35 = defaultedMap7.put(obj19, (java.lang.Object) defaultedMap28);
        boolean b37 = defaultedMap7.containsValue((java.lang.Object) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator();
        boolean b40 = fixedOrderComparator38.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { fixedOrderComparator38, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj48 = defaultedMap7.get((java.lang.Object) obj_array43);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set50 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + true + "'", obj48.equals(true));
        org.junit.Assert.assertNotNull(set50);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) 10.0d);
        boolean b5 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator8.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { fixedOrderComparator8, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj17 = null;
        boolean b18 = fixedOrderComparator16.add(obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj23 = defaultedMap20.remove((java.lang.Object) 100.0f);
        java.util.Set set24 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj29 = defaultedMap26.remove((java.lang.Object) 100.0f);
        java.util.Set set30 = defaultedMap26.entrySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        java.util.Collection collection32 = defaultedMap26.values();
        java.lang.Object obj33 = defaultedMap5.put(obj17, (java.lang.Object) defaultedMap26);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        java.util.Set set35 = defaultedMap1.entrySet();
        java.util.Collection collection36 = defaultedMap1.values();
        collections.Transformer transformer37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + true + "'", obj7.equals(true));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + true + "'", obj34.equals(true));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { fixedOrderComparator4, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap22);
        boolean b31 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        boolean b34 = fixedOrderComparator32.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { fixedOrderComparator32, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) obj_array37);
        boolean b43 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + true + "'", obj42.equals(true));
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { fixedOrderComparator7, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        try {
            int i18 = fixedOrderComparator6.compare((java.lang.Object) fixedOrderComparator16, (java.lang.Object) fixedOrderComparator17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { fixedOrderComparator4, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap22);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection35 = defaultedMap34.values();
        java.util.Set set36 = defaultedMap34.entrySet();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) predicate37);
        boolean b39 = defaultedMap1.containsKey((java.lang.Object) predicate37);
        java.lang.String str40 = defaultedMap1.toString();
        java.lang.String str41 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + true + "'", obj38.equals(true));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{null={}}" + "'", str40.equals("{null={}}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{null={}}" + "'", str41.equals("{null={}}"));
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { fixedOrderComparator5, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { fixedOrderComparator16, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b26 = fixedOrderComparator13.add((java.lang.Object) fixedOrderComparator25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator13);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        boolean b34 = fixedOrderComparator32.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { fixedOrderComparator32, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = null;
        boolean b42 = fixedOrderComparator40.add(obj41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection45 = defaultedMap44.values();
        java.lang.Object obj47 = defaultedMap44.remove((java.lang.Object) 100.0f);
        java.util.Set set48 = defaultedMap44.keySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection51 = defaultedMap50.values();
        java.lang.Object obj53 = defaultedMap50.remove((java.lang.Object) 100.0f);
        java.util.Set set54 = defaultedMap50.entrySet();
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        java.util.Collection collection56 = defaultedMap50.values();
        java.lang.Object obj57 = defaultedMap29.put(obj41, (java.lang.Object) defaultedMap50);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection63 = defaultedMap62.values();
        java.util.Set set64 = defaultedMap62.entrySet();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj66 = defaultedMap62.get((java.lang.Object) predicate65);
        boolean b67 = defaultedMap29.containsKey((java.lang.Object) predicate65);
        java.lang.String str68 = defaultedMap29.toString();
        java.util.Set set69 = defaultedMap29.entrySet();
        boolean b70 = fixedOrderComparator13.add((java.lang.Object) defaultedMap29);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + true + "'", obj31.equals(true));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + true + "'", obj66.equals(true));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{null={}}" + "'", str68.equals("{null={}}"));
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue(b70 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        boolean b4 = fixedOrderComparator0.add((java.lang.Object) 10.0d);
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.remove((java.lang.Object) 100.0f);
        java.util.Set set7 = defaultedMap3.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) -1);
        java.util.Collection collection10 = defaultedMap3.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection14 = defaultedMap13.values();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap13.entrySet();
        java.util.Collection collection18 = defaultedMap13.values();
        java.util.Collection collection19 = defaultedMap13.values();
        java.lang.String str20 = defaultedMap13.toString();
        java.util.Collection collection21 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection24 = defaultedMap23.values();
        java.util.Set set25 = defaultedMap23.entrySet();
        boolean b26 = defaultedMap23.isEmpty();
        int i27 = defaultedMap23.size();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection31 = defaultedMap30.values();
        java.lang.Object obj33 = defaultedMap30.remove((java.lang.Object) 100.0f);
        java.lang.String str34 = defaultedMap30.toString();
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) defaultedMap30);
        defaultedMap30.clear();
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap30);
        boolean b38 = defaultedMap30.isEmpty();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + true + "'", obj35.equals(true));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { fixedOrderComparator4, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 100.0f);
        java.util.Set set35 = defaultedMap31.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator36.add((java.lang.Object) (short) 100);
        boolean b40 = fixedOrderComparator36.add((java.lang.Object) 10.0d);
        java.lang.Object obj41 = defaultedMap31.get((java.lang.Object) fixedOrderComparator36);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator46.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { fixedOrderComparator46, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array51);
        java.lang.Object obj55 = null;
        boolean b56 = fixedOrderComparator54.add(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection59 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap58.remove((java.lang.Object) 100.0f);
        java.util.Set set62 = defaultedMap58.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection65 = defaultedMap64.values();
        java.lang.Object obj67 = defaultedMap64.remove((java.lang.Object) 100.0f);
        java.util.Set set68 = defaultedMap64.entrySet();
        defaultedMap58.putAll((java.util.Map) defaultedMap64);
        java.util.Collection collection70 = defaultedMap64.values();
        java.lang.Object obj71 = defaultedMap43.put(obj55, (java.lang.Object) defaultedMap64);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate72, predicate73);
        boolean b75 = defaultedMap31.equals((java.lang.Object) map74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set78 = defaultedMap77.keySet();
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) set78);
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate81 = null;
        java.util.Map map82 = collections.map.PredicatedMap.decorate(map79, predicate80, predicate81);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate80, predicate83);
        java.util.Set set85 = defaultedMap22.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + true + "'", obj41.equals(true));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + true + "'", obj45.equals(true));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(set85);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { fixedOrderComparator4, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 100.0f);
        java.util.Set set35 = defaultedMap31.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator36.add((java.lang.Object) (short) 100);
        boolean b40 = fixedOrderComparator36.add((java.lang.Object) 10.0d);
        java.lang.Object obj41 = defaultedMap31.get((java.lang.Object) fixedOrderComparator36);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator46.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { fixedOrderComparator46, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array51);
        java.lang.Object obj55 = null;
        boolean b56 = fixedOrderComparator54.add(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection59 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap58.remove((java.lang.Object) 100.0f);
        java.util.Set set62 = defaultedMap58.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection65 = defaultedMap64.values();
        java.lang.Object obj67 = defaultedMap64.remove((java.lang.Object) 100.0f);
        java.util.Set set68 = defaultedMap64.entrySet();
        defaultedMap58.putAll((java.util.Map) defaultedMap64);
        java.util.Collection collection70 = defaultedMap64.values();
        java.lang.Object obj71 = defaultedMap43.put(obj55, (java.lang.Object) defaultedMap64);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate72, predicate73);
        boolean b75 = defaultedMap31.equals((java.lang.Object) map74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set78 = defaultedMap77.keySet();
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) set78);
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate81 = null;
        java.util.Map map82 = collections.map.PredicatedMap.decorate(map79, predicate80, predicate81);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate80, predicate83);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        java.util.Set set86 = defaultedMap22.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + true + "'", obj41.equals(true));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + true + "'", obj45.equals(true));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(set86);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { fixedOrderComparator10, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) obj_array15);
        int i20 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + true + "'", obj19.equals(true));
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 100.0f);
        java.util.Set set14 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.entrySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b23 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        boolean b30 = fixedOrderComparator28.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { fixedOrderComparator28, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj37 = null;
        boolean b38 = fixedOrderComparator36.add(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 100.0f);
        java.util.Set set44 = defaultedMap40.keySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection47 = defaultedMap46.values();
        java.lang.Object obj49 = defaultedMap46.remove((java.lang.Object) 100.0f);
        java.util.Set set50 = defaultedMap46.entrySet();
        defaultedMap40.putAll((java.util.Map) defaultedMap46);
        java.util.Collection collection52 = defaultedMap46.values();
        java.lang.Object obj53 = defaultedMap25.put(obj37, (java.lang.Object) defaultedMap46);
        defaultedMap1.putAll((java.util.Map) defaultedMap46);
        collections.Transformer transformer55 = null;
        try {
            java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + true + "'", obj27.equals(true));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection13 = defaultedMap12.values();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) 100.0f);
        java.util.Set set16 = defaultedMap12.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) (short) 100);
        boolean b21 = fixedOrderComparator17.add((java.lang.Object) 10.0d);
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) fixedOrderComparator17);
        java.util.Set set23 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 100.0f);
        java.util.Set set29 = defaultedMap25.entrySet();
        java.util.Collection collection30 = defaultedMap25.values();
        boolean b31 = defaultedMap12.equals((java.lang.Object) collection30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection34 = defaultedMap33.values();
        java.lang.Object obj36 = defaultedMap33.remove((java.lang.Object) 100.0f);
        java.util.Set set37 = defaultedMap33.keySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) (byte) -1);
        defaultedMap33.clear();
        try {
            int i41 = fixedOrderComparator10.compare((java.lang.Object) defaultedMap12, (java.lang.Object) defaultedMap33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + true + "'", obj22.equals(true));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) predicate4);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { fixedOrderComparator6, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator13);
        boolean b15 = defaultedMap14.isEmpty();
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) b15);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true + "'", obj16.equals(true));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { fixedOrderComparator9, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj18 = null;
        boolean b19 = fixedOrderComparator17.add(obj18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator20.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { fixedOrderComparator20, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array25);
        boolean b30 = fixedOrderComparator17.add((java.lang.Object) fixedOrderComparator29);
        fixedOrderComparator29.setUnknownObjectBehavior(2);
        boolean b33 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator29);
        int i34 = fixedOrderComparator8.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(i34 == 2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection3 = defaultedMap2.values();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap2.entrySet();
        java.util.Collection collection7 = defaultedMap2.values();
        java.util.Collection collection8 = defaultedMap2.values();
        java.lang.String str9 = defaultedMap2.toString();
        java.util.Collection collection10 = defaultedMap2.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection13 = defaultedMap12.values();
        java.util.Set set14 = defaultedMap12.entrySet();
        boolean b15 = defaultedMap12.isEmpty();
        int i16 = defaultedMap12.size();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection20 = defaultedMap19.values();
        java.lang.Object obj22 = defaultedMap19.remove((java.lang.Object) 100.0f);
        java.lang.String str23 = defaultedMap19.toString();
        java.lang.Object obj24 = defaultedMap12.get((java.lang.Object) defaultedMap19);
        boolean b25 = fixedOrderComparator0.add(obj24);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + true + "'", obj24.equals(true));
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array5);
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { fixedOrderComparator7, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) obj_array12);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        int i10 = fixedOrderComparator9.getUnknownObjectBehavior();
        int i11 = fixedOrderComparator9.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { fixedOrderComparator4, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap22);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection34 = defaultedMap33.values();
        java.lang.Object obj36 = defaultedMap33.remove((java.lang.Object) 100.0f);
        java.util.Set set37 = defaultedMap33.keySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) (byte) -1);
        java.util.Collection collection40 = defaultedMap33.values();
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection44 = defaultedMap43.values();
        java.util.Set set45 = defaultedMap43.entrySet();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) predicate46);
        defaultedMap31.putAll((java.util.Map) defaultedMap43);
        java.util.Collection collection49 = defaultedMap43.values();
        boolean b50 = defaultedMap22.containsValue((java.lang.Object) collection49);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + true + "'", obj47.equals(true));
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b9 = fixedOrderComparator8.isLocked();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) (short) 100);
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) 10.0d);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) fixedOrderComparator6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { fixedOrderComparator16, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap34.remove((java.lang.Object) 100.0f);
        java.util.Set set38 = defaultedMap34.entrySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        java.util.Collection collection40 = defaultedMap34.values();
        java.lang.Object obj41 = defaultedMap13.put(obj25, (java.lang.Object) defaultedMap34);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate42, predicate43);
        boolean b45 = defaultedMap1.equals((java.lang.Object) map44);
        java.lang.Object obj47 = defaultedMap1.get((java.lang.Object) '#');
        java.lang.Object obj48 = null;
        boolean b49 = defaultedMap1.containsValue(obj48);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + true + "'", obj11.equals(true));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true + "'", obj15.equals(true));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + true + "'", obj47.equals(true));
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        java.util.Collection collection8 = defaultedMap1.values();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { fixedOrderComparator10, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b19 = fixedOrderComparator18.isLocked();
        int i20 = fixedOrderComparator18.getUnknownObjectBehavior();
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) i20);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) 100.0f);
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (byte) -1);
        java.util.Collection collection13 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection16 = defaultedMap15.values();
        java.lang.Object obj18 = defaultedMap15.remove((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj24 = defaultedMap21.remove((java.lang.Object) 100.0f);
        java.util.Set set25 = defaultedMap21.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        defaultedMap6.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        int i29 = defaultedMap15.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(i29 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { fixedOrderComparator10, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj19 = null;
        boolean b20 = fixedOrderComparator18.add(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap28.entrySet();
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection34 = defaultedMap28.values();
        java.lang.Object obj35 = defaultedMap7.put(obj19, (java.lang.Object) defaultedMap28);
        java.util.Collection collection36 = defaultedMap28.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection38 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 100.0f);
        java.util.Set set14 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.entrySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection26 = defaultedMap25.values();
        java.util.Set set27 = defaultedMap25.entrySet();
        java.util.Set set28 = defaultedMap25.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection31 = defaultedMap30.values();
        java.lang.Object obj33 = defaultedMap30.remove((java.lang.Object) 100.0f);
        java.util.Set set34 = defaultedMap30.keySet();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (byte) -1);
        java.util.Collection collection37 = defaultedMap30.values();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection40 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap39.remove((java.lang.Object) 100.0f);
        java.util.Set set43 = defaultedMap39.keySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection46 = defaultedMap45.values();
        java.lang.Object obj48 = defaultedMap45.remove((java.lang.Object) 100.0f);
        java.util.Set set49 = defaultedMap45.entrySet();
        defaultedMap39.putAll((java.util.Map) defaultedMap45);
        defaultedMap30.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj52 = defaultedMap25.get((java.lang.Object) defaultedMap39);
        defaultedMap10.putAll((java.util.Map) defaultedMap25);
        collections.Transformer transformer54 = null;
        try {
            java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + true + "'", obj52.equals(true));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 100.0f);
        java.util.Set set14 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.entrySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        boolean b22 = fixedOrderComparator8.add((java.lang.Object) defaultedMap10);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator23.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object obj26 = defaultedMap10.get((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + true + "'", obj26.equals(true));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) fixedOrderComparator7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) true);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + true + "'", obj12.equals(true));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) (short) 100);
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) 10.0d);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) fixedOrderComparator6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { fixedOrderComparator16, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap34.remove((java.lang.Object) 100.0f);
        java.util.Set set38 = defaultedMap34.entrySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        java.util.Collection collection40 = defaultedMap34.values();
        java.lang.Object obj41 = defaultedMap13.put(obj25, (java.lang.Object) defaultedMap34);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate42, predicate43);
        boolean b45 = defaultedMap1.equals((java.lang.Object) map44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set48 = defaultedMap47.keySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection52 = defaultedMap51.values();
        java.lang.Object obj54 = defaultedMap51.remove((java.lang.Object) 100.0f);
        java.util.Set set55 = defaultedMap51.keySet();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection58 = defaultedMap57.values();
        java.lang.Object obj60 = defaultedMap57.remove((java.lang.Object) 100.0f);
        java.util.Set set61 = defaultedMap57.entrySet();
        defaultedMap51.putAll((java.util.Map) defaultedMap57);
        boolean b64 = defaultedMap51.containsValue((java.lang.Object) 0.0f);
        java.lang.String str65 = defaultedMap51.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap51);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + true + "'", obj11.equals(true));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true + "'", obj15.equals(true));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { fixedOrderComparator11 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj_array12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection14 = defaultedMap13.values();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap13.keySet();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (byte) -1);
        java.util.Collection collection20 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap28.entrySet();
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator35.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { fixedOrderComparator35, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection46 = defaultedMap45.values();
        java.lang.Object obj48 = defaultedMap45.remove((java.lang.Object) 100.0f);
        java.util.Set set49 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection52 = defaultedMap51.values();
        java.lang.Object obj54 = defaultedMap51.remove((java.lang.Object) 100.0f);
        java.util.Set set55 = defaultedMap51.entrySet();
        defaultedMap45.putAll((java.util.Map) defaultedMap51);
        boolean b57 = fixedOrderComparator43.add((java.lang.Object) defaultedMap45);
        java.lang.Object obj58 = defaultedMap22.get((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection61 = defaultedMap60.values();
        try {
            int i62 = fixedOrderComparator11.compare(obj58, (java.lang.Object) defaultedMap60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + true + "'", obj58.equals(true));
        org.junit.Assert.assertNotNull(collection61);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap9.entrySet();
        java.util.Collection collection14 = defaultedMap9.values();
        java.util.Collection collection15 = defaultedMap9.values();
        java.lang.String str16 = defaultedMap9.toString();
        java.util.Collection collection17 = defaultedMap9.values();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection20 = defaultedMap19.values();
        java.util.Set set21 = defaultedMap19.entrySet();
        boolean b22 = defaultedMap19.isEmpty();
        int i23 = defaultedMap19.size();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj29 = defaultedMap26.remove((java.lang.Object) 100.0f);
        java.util.Set set30 = defaultedMap26.entrySet();
        java.util.Collection collection31 = defaultedMap26.values();
        java.util.Collection collection32 = defaultedMap26.values();
        java.lang.String str33 = defaultedMap26.toString();
        java.util.Collection collection34 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection37 = defaultedMap36.values();
        java.util.Set set38 = defaultedMap36.entrySet();
        boolean b39 = defaultedMap36.isEmpty();
        int i40 = defaultedMap36.size();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection44 = defaultedMap43.values();
        java.lang.Object obj46 = defaultedMap43.remove((java.lang.Object) 100.0f);
        java.lang.String str47 = defaultedMap43.toString();
        java.lang.Object obj48 = defaultedMap36.get((java.lang.Object) defaultedMap43);
        defaultedMap43.clear();
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator();
        boolean b52 = fixedOrderComparator50.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { fixedOrderComparator50, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection61 = defaultedMap60.values();
        java.lang.Object obj63 = defaultedMap60.remove((java.lang.Object) 100.0f);
        java.util.Set set64 = defaultedMap60.keySet();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection67 = defaultedMap66.values();
        java.lang.Object obj69 = defaultedMap66.remove((java.lang.Object) 100.0f);
        java.util.Set set70 = defaultedMap66.entrySet();
        defaultedMap60.putAll((java.util.Map) defaultedMap66);
        boolean b72 = fixedOrderComparator58.add((java.lang.Object) defaultedMap60);
        java.lang.Object obj74 = defaultedMap43.put((java.lang.Object) fixedOrderComparator58, (java.lang.Object) 1.0f);
        try {
            int i75 = fixedOrderComparator7.compare((java.lang.Object) defaultedMap19, (java.lang.Object) fixedOrderComparator58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + true + "'", obj48.equals(true));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { fixedOrderComparator2, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array7);
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator10.add(obj11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { fixedOrderComparator13, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b23 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator22);
        fixedOrderComparator22.setUnknownObjectBehavior(2);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator();
        boolean b33 = fixedOrderComparator31.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { fixedOrderComparator31, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.lang.Object obj40 = null;
        boolean b41 = fixedOrderComparator39.add(obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection44 = defaultedMap43.values();
        java.lang.Object obj46 = defaultedMap43.remove((java.lang.Object) 100.0f);
        java.util.Set set47 = defaultedMap43.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection50 = defaultedMap49.values();
        java.lang.Object obj52 = defaultedMap49.remove((java.lang.Object) 100.0f);
        java.util.Set set53 = defaultedMap49.entrySet();
        defaultedMap43.putAll((java.util.Map) defaultedMap49);
        java.util.Collection collection55 = defaultedMap49.values();
        java.lang.Object obj56 = defaultedMap28.put(obj40, (java.lang.Object) defaultedMap49);
        java.util.Collection collection57 = defaultedMap49.values();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection60 = defaultedMap59.values();
        java.lang.Object obj62 = defaultedMap59.remove((java.lang.Object) 100.0f);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 0);
        java.util.Set set65 = defaultedMap59.entrySet();
        java.lang.Object obj66 = defaultedMap1.put((java.lang.Object) collection57, (java.lang.Object) defaultedMap59);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + true + "'", obj30.equals(true));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator8.add(obj9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { fixedOrderComparator11, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b21 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection25 = defaultedMap24.values();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap24.keySet();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) (byte) -1);
        java.util.Collection collection31 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection34 = defaultedMap33.values();
        java.lang.Object obj36 = defaultedMap33.remove((java.lang.Object) 100.0f);
        java.util.Set set37 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection40 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap39.remove((java.lang.Object) 100.0f);
        java.util.Set set43 = defaultedMap39.entrySet();
        defaultedMap33.putAll((java.util.Map) defaultedMap39);
        defaultedMap24.putAll((java.util.Map) defaultedMap33);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator46.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { fixedOrderComparator46, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection57 = defaultedMap56.values();
        java.lang.Object obj59 = defaultedMap56.remove((java.lang.Object) 100.0f);
        java.util.Set set60 = defaultedMap56.keySet();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection63 = defaultedMap62.values();
        java.lang.Object obj65 = defaultedMap62.remove((java.lang.Object) 100.0f);
        java.util.Set set66 = defaultedMap62.entrySet();
        defaultedMap56.putAll((java.util.Map) defaultedMap62);
        boolean b68 = fixedOrderComparator54.add((java.lang.Object) defaultedMap56);
        java.lang.Object obj69 = defaultedMap33.get((java.lang.Object) defaultedMap56);
        try {
            boolean b70 = fixedOrderComparator8.addAsEqual((java.lang.Object) 100L, obj69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + true + "'", obj69.equals(true));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { fixedOrderComparator4, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 100.0f);
        java.util.Set set35 = defaultedMap31.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator36.add((java.lang.Object) (short) 100);
        boolean b40 = fixedOrderComparator36.add((java.lang.Object) 10.0d);
        java.lang.Object obj41 = defaultedMap31.get((java.lang.Object) fixedOrderComparator36);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator46.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { fixedOrderComparator46, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array51);
        java.lang.Object obj55 = null;
        boolean b56 = fixedOrderComparator54.add(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection59 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap58.remove((java.lang.Object) 100.0f);
        java.util.Set set62 = defaultedMap58.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection65 = defaultedMap64.values();
        java.lang.Object obj67 = defaultedMap64.remove((java.lang.Object) 100.0f);
        java.util.Set set68 = defaultedMap64.entrySet();
        defaultedMap58.putAll((java.util.Map) defaultedMap64);
        java.util.Collection collection70 = defaultedMap64.values();
        java.lang.Object obj71 = defaultedMap43.put(obj55, (java.lang.Object) defaultedMap64);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate72, predicate73);
        boolean b75 = defaultedMap31.equals((java.lang.Object) map74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set78 = defaultedMap77.keySet();
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) set78);
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate81 = null;
        java.util.Map map82 = collections.map.PredicatedMap.decorate(map79, predicate80, predicate81);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate80, predicate83);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection88 = defaultedMap87.values();
        java.lang.Object obj90 = defaultedMap87.remove((java.lang.Object) 100.0f);
        java.util.Set set91 = defaultedMap87.keySet();
        boolean b92 = defaultedMap87.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator93 = new collections.comparators.FixedOrderComparator();
        int i94 = fixedOrderComparator93.getUnknownObjectBehavior();
        java.lang.Object obj95 = defaultedMap87.get((java.lang.Object) fixedOrderComparator93);
        collections.Predicate predicate96 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap97 = new collections.map.DefaultedMap((java.lang.Object) predicate96);
        java.lang.Object obj98 = defaultedMap87.get((java.lang.Object) defaultedMap97);
        java.lang.Object obj99 = defaultedMap22.remove((java.lang.Object) defaultedMap87);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + true + "'", obj41.equals(true));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + true + "'", obj45.equals(true));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(i94 == 2);
        org.junit.Assert.assertTrue("'" + obj95 + "' != '" + true + "'", obj95.equals(true));
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertTrue("'" + obj98 + "' != '" + true + "'", obj98.equals(true));
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator8.add(obj9);
        boolean b11 = fixedOrderComparator8.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { fixedOrderComparator10, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) obj_array15);
        java.util.Collection collection20 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + true + "'", obj19.equals(true));
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Map map8 = null;
        try {
            defaultedMap1.putAll(map8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 100.0f);
        java.util.Set set14 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.entrySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        boolean b22 = fixedOrderComparator8.add((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection25 = defaultedMap24.values();
        java.util.Set set26 = defaultedMap24.entrySet();
        boolean b27 = fixedOrderComparator8.add((java.lang.Object) set26);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { fixedOrderComparator4, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap22);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection35 = defaultedMap34.values();
        java.util.Set set36 = defaultedMap34.entrySet();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) predicate37);
        boolean b39 = defaultedMap1.containsKey((java.lang.Object) predicate37);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj43 = defaultedMap41.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        boolean b46 = fixedOrderComparator44.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array49 = new java.lang.Object[] { fixedOrderComparator44, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array49);
        java.lang.Object obj53 = null;
        boolean b54 = fixedOrderComparator52.add(obj53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection57 = defaultedMap56.values();
        java.lang.Object obj59 = defaultedMap56.remove((java.lang.Object) 100.0f);
        java.util.Set set60 = defaultedMap56.keySet();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection63 = defaultedMap62.values();
        java.lang.Object obj65 = defaultedMap62.remove((java.lang.Object) 100.0f);
        java.util.Set set66 = defaultedMap62.entrySet();
        defaultedMap56.putAll((java.util.Map) defaultedMap62);
        java.util.Collection collection68 = defaultedMap62.values();
        java.lang.Object obj69 = defaultedMap41.put(obj53, (java.lang.Object) defaultedMap62);
        java.lang.Object obj70 = defaultedMap1.get(obj53);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + true + "'", obj38.equals(true));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + true + "'", obj43.equals(true));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(obj70);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator7);
        java.util.Set set9 = defaultedMap8.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { fixedOrderComparator5, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { fixedOrderComparator16, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b26 = fixedOrderComparator13.add((java.lang.Object) fixedOrderComparator25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator13);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.isEmpty();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { fixedOrderComparator10, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj19 = null;
        boolean b20 = fixedOrderComparator18.add(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap28.entrySet();
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection34 = defaultedMap28.values();
        java.lang.Object obj35 = defaultedMap7.put(obj19, (java.lang.Object) defaultedMap28);
        boolean b37 = defaultedMap7.containsValue((java.lang.Object) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator();
        boolean b40 = fixedOrderComparator38.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { fixedOrderComparator38, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj48 = defaultedMap7.get((java.lang.Object) obj_array43);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i50 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection53 = defaultedMap52.values();
        java.lang.Object obj55 = defaultedMap52.remove((java.lang.Object) 100.0f);
        java.util.Set set56 = defaultedMap52.entrySet();
        java.util.Collection collection57 = defaultedMap52.values();
        java.util.Collection collection58 = defaultedMap52.values();
        java.lang.String str59 = defaultedMap52.toString();
        java.util.Collection collection60 = defaultedMap52.values();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection63 = defaultedMap62.values();
        java.util.Set set64 = defaultedMap62.entrySet();
        boolean b65 = defaultedMap62.isEmpty();
        int i66 = defaultedMap62.size();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) defaultedMap62);
        java.lang.Object obj68 = defaultedMap1.get((java.lang.Object) map67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection71 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap70.remove((java.lang.Object) 100.0f);
        java.util.Set set74 = defaultedMap70.keySet();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection77 = defaultedMap76.values();
        java.lang.Object obj79 = defaultedMap76.remove((java.lang.Object) 100.0f);
        java.util.Set set80 = defaultedMap76.entrySet();
        defaultedMap70.putAll((java.util.Map) defaultedMap76);
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator();
        boolean b84 = fixedOrderComparator82.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array87 = new java.lang.Object[] { fixedOrderComparator82, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array87);
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array87);
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array87);
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) fixedOrderComparator90);
        boolean b92 = defaultedMap1.containsKey((java.lang.Object) fixedOrderComparator90);
        boolean b93 = fixedOrderComparator90.isLocked();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + true + "'", obj48.equals(true));
        org.junit.Assert.assertTrue(i50 == 1);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + true + "'", obj68.equals(true));
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNotNull(obj_array87);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { fixedOrderComparator7, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b17 = fixedOrderComparator6.add((java.lang.Object) obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) (short) 100);
        boolean b22 = fixedOrderComparator18.add((java.lang.Object) 10.0d);
        boolean b23 = fixedOrderComparator6.add((java.lang.Object) 10.0d);
        int i24 = fixedOrderComparator6.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i24 == 2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.remove((java.lang.Object) 100.0f);
        java.util.Set set7 = defaultedMap3.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) -1);
        java.util.Collection collection10 = defaultedMap3.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set12 = defaultedMap1.entrySet();
        java.util.Set set13 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap7.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { fixedOrderComparator13, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) fixedOrderComparator21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate(map22, predicate23, predicate24);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap7.entrySet();
        java.util.Collection collection12 = defaultedMap7.values();
        java.util.Collection collection13 = defaultedMap7.values();
        java.lang.String str14 = defaultedMap7.toString();
        java.util.Collection collection15 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection18 = defaultedMap17.values();
        java.util.Set set19 = defaultedMap17.entrySet();
        boolean b20 = defaultedMap17.isEmpty();
        int i21 = defaultedMap17.size();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection25 = defaultedMap24.values();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) 100.0f);
        java.lang.String str28 = defaultedMap24.toString();
        java.lang.Object obj29 = defaultedMap17.get((java.lang.Object) defaultedMap24);
        boolean b30 = defaultedMap1.equals((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + true + "'", obj29.equals(true));
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b4 = defaultedMap1.isEmpty();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { fixedOrderComparator10, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj19 = null;
        boolean b20 = fixedOrderComparator18.add(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap28.entrySet();
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection34 = defaultedMap28.values();
        java.lang.Object obj35 = defaultedMap7.put(obj19, (java.lang.Object) defaultedMap28);
        boolean b37 = defaultedMap7.containsValue((java.lang.Object) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator();
        boolean b40 = fixedOrderComparator38.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { fixedOrderComparator38, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj48 = defaultedMap7.get((java.lang.Object) obj_array43);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i50 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection53 = defaultedMap52.values();
        java.lang.Object obj55 = defaultedMap52.remove((java.lang.Object) 100.0f);
        java.util.Set set56 = defaultedMap52.entrySet();
        java.util.Collection collection57 = defaultedMap52.values();
        java.util.Collection collection58 = defaultedMap52.values();
        java.lang.String str59 = defaultedMap52.toString();
        java.util.Collection collection60 = defaultedMap52.values();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection63 = defaultedMap62.values();
        java.util.Set set64 = defaultedMap62.entrySet();
        boolean b65 = defaultedMap62.isEmpty();
        int i66 = defaultedMap62.size();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) defaultedMap62);
        java.lang.Object obj68 = defaultedMap1.get((java.lang.Object) map67);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + true + "'", obj48.equals(true));
        org.junit.Assert.assertTrue(i50 == 1);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + true + "'", obj68.equals(true));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) (short) 100);
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) 10.0d);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) fixedOrderComparator6);
        java.util.Set set12 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) 100.0f);
        java.util.Set set18 = defaultedMap14.entrySet();
        java.util.Collection collection19 = defaultedMap14.values();
        boolean b20 = defaultedMap1.equals((java.lang.Object) collection19);
        java.util.Set set21 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + true + "'", obj11.equals(true));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { fixedOrderComparator7, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b17 = fixedOrderComparator6.add((java.lang.Object) obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) (short) 100);
        boolean b22 = fixedOrderComparator18.add((java.lang.Object) 10.0d);
        boolean b23 = fixedOrderComparator6.add((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 100.0f);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection33 = defaultedMap32.values();
        java.lang.Object obj35 = defaultedMap32.remove((java.lang.Object) 100.0f);
        java.util.Set set36 = defaultedMap32.keySet();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (byte) -1);
        java.util.Collection collection39 = defaultedMap32.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection42 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap41.remove((java.lang.Object) 100.0f);
        java.util.Set set45 = defaultedMap41.keySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection48 = defaultedMap47.values();
        java.lang.Object obj50 = defaultedMap47.remove((java.lang.Object) 100.0f);
        java.util.Set set51 = defaultedMap47.entrySet();
        defaultedMap41.putAll((java.util.Map) defaultedMap47);
        defaultedMap32.putAll((java.util.Map) defaultedMap41);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator();
        boolean b56 = fixedOrderComparator54.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array59 = new java.lang.Object[] { fixedOrderComparator54, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection65 = defaultedMap64.values();
        java.lang.Object obj67 = defaultedMap64.remove((java.lang.Object) 100.0f);
        java.util.Set set68 = defaultedMap64.keySet();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection71 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap70.remove((java.lang.Object) 100.0f);
        java.util.Set set74 = defaultedMap70.entrySet();
        defaultedMap64.putAll((java.util.Map) defaultedMap70);
        boolean b76 = fixedOrderComparator62.add((java.lang.Object) defaultedMap64);
        java.lang.Object obj77 = defaultedMap41.get((java.lang.Object) defaultedMap64);
        try {
            int i78 = fixedOrderComparator6.compare((java.lang.Object) map30, (java.lang.Object) defaultedMap64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + true + "'", obj77.equals(true));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        java.util.Collection collection8 = defaultedMap1.values();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 100.0f);
        java.util.Set set15 = defaultedMap11.keySet();
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap1.remove(obj18);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + true + "'", obj17.equals(true));
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        java.util.Collection collection9 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator8.add(obj9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { fixedOrderComparator11, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b21 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator20);
        boolean b22 = fixedOrderComparator20.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (byte) 100);
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array5);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) 100.0f);
        java.util.Set set18 = defaultedMap14.keySet();
        java.util.Set set19 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection22 = defaultedMap21.values();
        java.util.Set set23 = defaultedMap21.entrySet();
        boolean b24 = defaultedMap21.isEmpty();
        int i25 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b32 = fixedOrderComparator30.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array35 = new java.lang.Object[] { fixedOrderComparator30, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array35);
        java.lang.Object obj39 = null;
        boolean b40 = fixedOrderComparator38.add(obj39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection43 = defaultedMap42.values();
        java.lang.Object obj45 = defaultedMap42.remove((java.lang.Object) 100.0f);
        java.util.Set set46 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection49 = defaultedMap48.values();
        java.lang.Object obj51 = defaultedMap48.remove((java.lang.Object) 100.0f);
        java.util.Set set52 = defaultedMap48.entrySet();
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        java.util.Collection collection54 = defaultedMap48.values();
        java.lang.Object obj55 = defaultedMap27.put(obj39, (java.lang.Object) defaultedMap48);
        boolean b57 = defaultedMap27.containsValue((java.lang.Object) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        boolean b60 = fixedOrderComparator58.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { fixedOrderComparator58, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array63);
        java.lang.Object obj68 = defaultedMap27.get((java.lang.Object) obj_array63);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        int i70 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection73 = defaultedMap72.values();
        java.lang.Object obj75 = defaultedMap72.remove((java.lang.Object) 100.0f);
        java.util.Set set76 = defaultedMap72.entrySet();
        java.util.Collection collection77 = defaultedMap72.values();
        java.util.Collection collection78 = defaultedMap72.values();
        java.lang.String str79 = defaultedMap72.toString();
        java.util.Collection collection80 = defaultedMap72.values();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection83 = defaultedMap82.values();
        java.util.Set set84 = defaultedMap82.entrySet();
        boolean b85 = defaultedMap82.isEmpty();
        int i86 = defaultedMap82.size();
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap72, (java.lang.Object) defaultedMap82);
        java.lang.Object obj88 = defaultedMap21.get((java.lang.Object) map87);
        try {
            boolean b89 = fixedOrderComparator10.addAsEqual((java.lang.Object) set19, (java.lang.Object) map87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + true + "'", obj29.equals(true));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + true + "'", obj68.equals(true));
        org.junit.Assert.assertTrue(i70 == 1);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + true + "'", obj88.equals(true));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.remove((java.lang.Object) 100.0f);
        java.util.Set set7 = defaultedMap3.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) -1);
        java.util.Collection collection10 = defaultedMap3.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection14 = defaultedMap13.values();
        java.util.Set set15 = defaultedMap13.entrySet();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) predicate16);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj23 = defaultedMap20.remove((java.lang.Object) 100.0f);
        java.util.Set set24 = defaultedMap20.keySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (byte) -1);
        java.util.Collection collection27 = defaultedMap20.values();
        java.util.Set set28 = defaultedMap20.entrySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap13.remove(obj30);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + true + "'", obj17.equals(true));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { fixedOrderComparator10, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj19 = null;
        boolean b20 = fixedOrderComparator18.add(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap28.entrySet();
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection34 = defaultedMap28.values();
        java.lang.Object obj35 = defaultedMap7.put(obj19, (java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection38 = defaultedMap37.values();
        java.lang.Object obj40 = defaultedMap37.remove((java.lang.Object) 100.0f);
        java.util.Set set41 = defaultedMap37.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator();
        boolean b44 = fixedOrderComparator42.add((java.lang.Object) (short) 100);
        boolean b46 = fixedOrderComparator42.add((java.lang.Object) 10.0d);
        java.lang.Object obj47 = defaultedMap37.get((java.lang.Object) fixedOrderComparator42);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator();
        boolean b54 = fixedOrderComparator52.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array57 = new java.lang.Object[] { fixedOrderComparator52, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object obj61 = null;
        boolean b62 = fixedOrderComparator60.add(obj61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection65 = defaultedMap64.values();
        java.lang.Object obj67 = defaultedMap64.remove((java.lang.Object) 100.0f);
        java.util.Set set68 = defaultedMap64.keySet();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection71 = defaultedMap70.values();
        java.lang.Object obj73 = defaultedMap70.remove((java.lang.Object) 100.0f);
        java.util.Set set74 = defaultedMap70.entrySet();
        defaultedMap64.putAll((java.util.Map) defaultedMap70);
        java.util.Collection collection76 = defaultedMap70.values();
        java.lang.Object obj77 = defaultedMap49.put(obj61, (java.lang.Object) defaultedMap70);
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate78, predicate79);
        boolean b81 = defaultedMap37.equals((java.lang.Object) map80);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set84 = defaultedMap83.keySet();
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) set84);
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate87 = null;
        java.util.Map map88 = collections.map.PredicatedMap.decorate(map85, predicate86, predicate87);
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate86, predicate89);
        boolean b91 = defaultedMap1.equals((java.lang.Object) predicate86);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + true + "'", obj47.equals(true));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + true + "'", obj51.equals(true));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b9 = fixedOrderComparator8.isLocked();
        boolean b11 = fixedOrderComparator8.add((java.lang.Object) "hi!");
        boolean b12 = fixedOrderComparator8.isLocked();
        boolean b13 = fixedOrderComparator8.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { fixedOrderComparator10, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array15);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + true + "'", obj19.equals(true));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator8.add(obj9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { fixedOrderComparator11, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b21 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator20);
        fixedOrderComparator20.setUnknownObjectBehavior((int) (byte) 0);
        try {
            fixedOrderComparator20.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator14.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { fixedOrderComparator14, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj23 = null;
        boolean b24 = fixedOrderComparator22.add(obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj29 = defaultedMap26.remove((java.lang.Object) 100.0f);
        java.util.Set set30 = defaultedMap26.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection33 = defaultedMap32.values();
        java.lang.Object obj35 = defaultedMap32.remove((java.lang.Object) 100.0f);
        java.util.Set set36 = defaultedMap32.entrySet();
        defaultedMap26.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection38 = defaultedMap32.values();
        java.lang.Object obj39 = defaultedMap11.put(obj23, (java.lang.Object) defaultedMap32);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate41, predicate43);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + true + "'", obj13.equals(true));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj9 = null;
        boolean b10 = fixedOrderComparator8.add(obj9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { fixedOrderComparator11, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b21 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator20);
        boolean b22 = fixedOrderComparator8.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { fixedOrderComparator5, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj14 = null;
        boolean b15 = fixedOrderComparator13.add(obj14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { fixedOrderComparator16, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b26 = fixedOrderComparator13.add((java.lang.Object) fixedOrderComparator25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator13);
        fixedOrderComparator13.setUnknownObjectBehavior((int) (byte) 0);
        boolean b30 = fixedOrderComparator13.isLocked();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection12 = defaultedMap11.values();
        java.util.Set set13 = defaultedMap11.entrySet();
        boolean b14 = defaultedMap11.isEmpty();
        int i15 = defaultedMap11.size();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) 100.0f);
        java.lang.String str22 = defaultedMap18.toString();
        java.lang.Object obj23 = defaultedMap11.get((java.lang.Object) defaultedMap18);
        defaultedMap18.clear();
        boolean b25 = defaultedMap18.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + true + "'", obj23.equals(true));
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 100.0f);
        java.util.Set set14 = defaultedMap10.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator15.add((java.lang.Object) (short) 100);
        boolean b19 = fixedOrderComparator15.add((java.lang.Object) 10.0d);
        java.lang.Object obj20 = defaultedMap10.get((java.lang.Object) fixedOrderComparator15);
        java.util.Set set21 = defaultedMap10.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        defaultedMap10.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true + "'", obj20.equals(true));
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.remove((java.lang.Object) 100.0f);
        java.util.Set set7 = defaultedMap3.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) -1);
        java.util.Collection collection10 = defaultedMap3.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { fixedOrderComparator16, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj25 = null;
        boolean b26 = fixedOrderComparator24.add(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap34.remove((java.lang.Object) 100.0f);
        java.util.Set set38 = defaultedMap34.entrySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        java.util.Collection collection40 = defaultedMap34.values();
        java.lang.Object obj41 = defaultedMap13.put(obj25, (java.lang.Object) defaultedMap34);
        java.util.Collection collection42 = defaultedMap34.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap34);
        java.util.Set set44 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true + "'", obj15.equals(true));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { fixedOrderComparator6, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) 100.0f);
        java.util.Set set22 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection25 = defaultedMap24.values();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap24.entrySet();
        defaultedMap18.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap3.put(obj15, (java.lang.Object) defaultedMap24);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate32, predicate33);
        defaultedMap1.putAll(map34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) 100.0f);
        java.util.Set set12 = defaultedMap8.entrySet();
        java.util.Collection collection13 = defaultedMap8.values();
        java.util.Collection collection14 = defaultedMap8.values();
        java.lang.String str15 = defaultedMap8.toString();
        java.util.Collection collection16 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection19 = defaultedMap18.values();
        java.util.Set set20 = defaultedMap18.entrySet();
        boolean b21 = defaultedMap18.isEmpty();
        int i22 = defaultedMap18.size();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 100.0f);
        java.lang.String str29 = defaultedMap25.toString();
        java.lang.Object obj30 = defaultedMap18.get((java.lang.Object) defaultedMap25);
        defaultedMap25.clear();
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap25);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection36 = defaultedMap35.values();
        java.util.Set set37 = defaultedMap35.entrySet();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate33, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection43 = defaultedMap42.values();
        java.lang.Object obj45 = defaultedMap42.remove((java.lang.Object) 100.0f);
        java.util.Set set46 = defaultedMap42.keySet();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) (byte) -1);
        java.util.Set set49 = defaultedMap42.entrySet();
        boolean b50 = defaultedMap25.containsKey((java.lang.Object) set49);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + true + "'", obj30.equals(true));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + true + "'", obj39.equals(true));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 100.0f);
        java.util.Set set14 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.entrySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        int i23 = defaultedMap10.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b26 = fixedOrderComparator24.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { fixedOrderComparator24, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b35 = fixedOrderComparator33.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { fixedOrderComparator33, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array38);
        java.lang.Object obj42 = null;
        boolean b43 = fixedOrderComparator41.add(obj42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        boolean b46 = fixedOrderComparator44.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array49 = new java.lang.Object[] { fixedOrderComparator44, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array49);
        boolean b54 = fixedOrderComparator41.add((java.lang.Object) fixedOrderComparator53);
        fixedOrderComparator53.setUnknownObjectBehavior(2);
        boolean b57 = fixedOrderComparator32.add((java.lang.Object) fixedOrderComparator53);
        boolean b58 = defaultedMap10.containsValue((java.lang.Object) b57);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        try {
            fixedOrderComparator8.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.remove((java.lang.Object) 100.0f);
        java.util.Set set7 = defaultedMap3.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) -1);
        java.util.Collection collection10 = defaultedMap3.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection14 = defaultedMap13.values();
        java.util.Set set15 = defaultedMap13.entrySet();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) predicate16);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj21 = defaultedMap13.put((java.lang.Object) "", (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + true + "'", obj17.equals(true));
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { fixedOrderComparator4, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap22);
        boolean b31 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection34 = defaultedMap33.values();
        java.lang.Object obj36 = defaultedMap33.remove((java.lang.Object) 100.0f);
        java.lang.String str37 = defaultedMap33.toString();
        java.lang.String str38 = defaultedMap33.toString();
        java.util.Collection collection39 = defaultedMap33.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection42 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap41.remove((java.lang.Object) 100.0f);
        java.util.Set set45 = defaultedMap41.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator46.add((java.lang.Object) (short) 100);
        boolean b50 = fixedOrderComparator46.add((java.lang.Object) 10.0d);
        java.lang.Object obj51 = defaultedMap41.get((java.lang.Object) fixedOrderComparator46);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        boolean b58 = fixedOrderComparator56.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array61 = new java.lang.Object[] { fixedOrderComparator56, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array61);
        java.lang.Object obj65 = null;
        boolean b66 = fixedOrderComparator64.add(obj65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection69 = defaultedMap68.values();
        java.lang.Object obj71 = defaultedMap68.remove((java.lang.Object) 100.0f);
        java.util.Set set72 = defaultedMap68.keySet();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection75 = defaultedMap74.values();
        java.lang.Object obj77 = defaultedMap74.remove((java.lang.Object) 100.0f);
        java.util.Set set78 = defaultedMap74.entrySet();
        defaultedMap68.putAll((java.util.Map) defaultedMap74);
        java.util.Collection collection80 = defaultedMap74.values();
        java.lang.Object obj81 = defaultedMap53.put(obj65, (java.lang.Object) defaultedMap74);
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate82, predicate83);
        boolean b85 = defaultedMap41.equals((java.lang.Object) map84);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set88 = defaultedMap87.keySet();
        java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) set88);
        collections.Predicate predicate90 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate91 = null;
        java.util.Map map92 = collections.map.PredicatedMap.decorate(map89, predicate90, predicate91);
        java.lang.Object obj93 = defaultedMap33.remove((java.lang.Object) predicate91);
        java.util.Collection collection94 = defaultedMap33.values();
        java.lang.Object obj95 = defaultedMap1.get((java.lang.Object) defaultedMap33);
        collections.Transformer transformer96 = null;
        try {
            java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, transformer96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + true + "'", obj51.equals(true));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + true + "'", obj55.equals(true));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertTrue("'" + obj95 + "' != '" + true + "'", obj95.equals(true));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { fixedOrderComparator6, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj15 = null;
        boolean b16 = fixedOrderComparator14.add(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) 100.0f);
        java.util.Set set22 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection25 = defaultedMap24.values();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap24.entrySet();
        defaultedMap18.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap3.put(obj15, (java.lang.Object) defaultedMap24);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate32, predicate33);
        defaultedMap1.putAll(map34);
        boolean b36 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { fixedOrderComparator0, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b9 = fixedOrderComparator8.isLocked();
        int i10 = fixedOrderComparator8.getUnknownObjectBehavior();
        fixedOrderComparator8.setUnknownObjectBehavior((int) (byte) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) 100.0f);
        java.util.Set set18 = defaultedMap14.entrySet();
        java.util.Collection collection19 = defaultedMap14.values();
        java.util.Collection collection20 = defaultedMap14.values();
        java.lang.String str21 = defaultedMap14.toString();
        java.util.Collection collection22 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection25 = defaultedMap24.values();
        java.util.Set set26 = defaultedMap24.entrySet();
        boolean b27 = defaultedMap24.isEmpty();
        int i28 = defaultedMap24.size();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 100.0f);
        java.util.Set set35 = defaultedMap31.keySet();
        java.util.Set set36 = defaultedMap31.entrySet();
        int i37 = fixedOrderComparator8.compare((java.lang.Object) defaultedMap24, (java.lang.Object) set36);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) 100.0f);
        java.util.Set set12 = defaultedMap8.entrySet();
        java.util.Collection collection13 = defaultedMap8.values();
        java.util.Collection collection14 = defaultedMap8.values();
        java.lang.String str15 = defaultedMap8.toString();
        java.util.Collection collection16 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection19 = defaultedMap18.values();
        java.util.Set set20 = defaultedMap18.entrySet();
        boolean b21 = defaultedMap18.isEmpty();
        int i22 = defaultedMap18.size();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 100.0f);
        java.lang.String str29 = defaultedMap25.toString();
        java.lang.Object obj30 = defaultedMap18.get((java.lang.Object) defaultedMap25);
        defaultedMap25.clear();
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap25);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection36 = defaultedMap35.values();
        java.util.Set set37 = defaultedMap35.entrySet();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate33, predicate38);
        java.lang.Object obj43 = defaultedMap25.put((java.lang.Object) (-1), (java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + true + "'", obj30.equals(true));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + true + "'", obj39.equals(true));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) 100.0f);
        java.util.Set set14 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.entrySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b23 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        boolean b30 = fixedOrderComparator28.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { fixedOrderComparator28, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj37 = null;
        boolean b38 = fixedOrderComparator36.add(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 100.0f);
        java.util.Set set44 = defaultedMap40.keySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection47 = defaultedMap46.values();
        java.lang.Object obj49 = defaultedMap46.remove((java.lang.Object) 100.0f);
        java.util.Set set50 = defaultedMap46.entrySet();
        defaultedMap40.putAll((java.util.Map) defaultedMap46);
        java.util.Collection collection52 = defaultedMap46.values();
        java.lang.Object obj53 = defaultedMap25.put(obj37, (java.lang.Object) defaultedMap46);
        defaultedMap1.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj58 = defaultedMap56.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator();
        boolean b61 = fixedOrderComparator59.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { fixedOrderComparator59, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array64);
        java.lang.Object obj68 = null;
        boolean b69 = fixedOrderComparator67.add(obj68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection72 = defaultedMap71.values();
        java.lang.Object obj74 = defaultedMap71.remove((java.lang.Object) 100.0f);
        java.util.Set set75 = defaultedMap71.keySet();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection78 = defaultedMap77.values();
        java.lang.Object obj80 = defaultedMap77.remove((java.lang.Object) 100.0f);
        java.util.Set set81 = defaultedMap77.entrySet();
        defaultedMap71.putAll((java.util.Map) defaultedMap77);
        java.util.Collection collection83 = defaultedMap77.values();
        java.lang.Object obj84 = defaultedMap56.put(obj68, (java.lang.Object) defaultedMap77);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate85, predicate86);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection90 = defaultedMap89.values();
        java.util.Set set91 = defaultedMap89.entrySet();
        collections.Predicate predicate92 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj93 = defaultedMap89.get((java.lang.Object) predicate92);
        boolean b94 = defaultedMap56.containsKey((java.lang.Object) predicate92);
        java.lang.String str95 = defaultedMap56.toString();
        java.util.Set set96 = defaultedMap56.entrySet();
        java.lang.Object obj97 = defaultedMap46.get((java.lang.Object) defaultedMap56);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + true + "'", obj27.equals(true));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + true + "'", obj58.equals(true));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + true + "'", obj93.equals(true));
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "{null={}}" + "'", str95.equals("{null={}}"));
        org.junit.Assert.assertNotNull(set96);
        org.junit.Assert.assertTrue("'" + obj97 + "' != '" + true + "'", obj97.equals(true));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection13 = defaultedMap12.values();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) 100.0f);
        java.util.Set set16 = defaultedMap12.keySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (byte) -1);
        java.util.Collection collection19 = defaultedMap12.values();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.keySet();
        boolean b27 = defaultedMap22.isEmpty();
        java.util.Set set28 = defaultedMap22.entrySet();
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) set28);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) (short) 100);
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) 10.0d);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) fixedOrderComparator6);
        int i12 = fixedOrderComparator6.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + true + "'", obj11.equals(true));
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set3 = defaultedMap2.keySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 100.0f);
        java.util.Set set5 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) fixedOrderComparator7);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { fixedOrderComparator4, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator12.add(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection23 = defaultedMap22.values();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap22.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap1.put(obj13, (java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 100.0f);
        java.util.Set set35 = defaultedMap31.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator36.add((java.lang.Object) (short) 100);
        boolean b40 = fixedOrderComparator36.add((java.lang.Object) 10.0d);
        java.lang.Object obj41 = defaultedMap31.get((java.lang.Object) fixedOrderComparator36);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 2);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator();
        boolean b48 = fixedOrderComparator46.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { fixedOrderComparator46, 10L, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array51);
        java.lang.Object obj55 = null;
        boolean b56 = fixedOrderComparator54.add(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection59 = defaultedMap58.values();
        java.lang.Object obj61 = defaultedMap58.remove((java.lang.Object) 100.0f);
        java.util.Set set62 = defaultedMap58.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection65 = defaultedMap64.values();
        java.lang.Object obj67 = defaultedMap64.remove((java.lang.Object) 100.0f);
        java.util.Set set68 = defaultedMap64.entrySet();
        defaultedMap58.putAll((java.util.Map) defaultedMap64);
        java.util.Collection collection70 = defaultedMap64.values();
        java.lang.Object obj71 = defaultedMap43.put(obj55, (java.lang.Object) defaultedMap64);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate72, predicate73);
        boolean b75 = defaultedMap31.equals((java.lang.Object) map74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set78 = defaultedMap77.keySet();
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) set78);
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate81 = null;
        java.util.Map map82 = collections.map.PredicatedMap.decorate(map79, predicate80, predicate81);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate80, predicate83);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection88 = defaultedMap87.values();
        java.util.Set set89 = defaultedMap87.entrySet();
        java.util.Set set90 = defaultedMap87.keySet();
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap85, (java.lang.Object) defaultedMap87);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + true + "'", obj41.equals(true));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + true + "'", obj45.equals(true));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertNotNull(map91);
    }
}

