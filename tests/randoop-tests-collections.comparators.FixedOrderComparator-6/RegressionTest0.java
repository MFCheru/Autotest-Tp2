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
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        try {
            fixedOrderComparator6.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        try {
            boolean b13 = fixedOrderComparator6.addAsEqual((java.lang.Object) fixedOrderComparator11, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) map7);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (short) 1);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) predicateUtils10);
        boolean b12 = defaultedMap8.isEmpty();
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) b12);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str18 = defaultedMap17.toString();
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        java.util.Set set23 = defaultedMap21.entrySet();
        try {
            boolean b25 = fixedOrderComparator14.addAsEqual((java.lang.Object) defaultedMap21, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) map7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b11 = defaultedMap10.isEmpty();
        java.util.Collection collection12 = defaultedMap10.values();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        boolean b15 = defaultedMap10.containsValue((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) str4);
        defaultedMap5.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) str4);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set3 = defaultedMap2.keySet();
        collections.PredicateUtils predicateUtils4 = new collections.PredicateUtils();
        java.lang.Object obj5 = defaultedMap2.remove((java.lang.Object) predicateUtils4);
        boolean b6 = defaultedMap2.isEmpty();
        java.util.Set set7 = defaultedMap2.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str10 = defaultedMap9.toString();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1));
        try {
            boolean b13 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap2, (java.lang.Object) b12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map4, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        boolean b11 = fixedOrderComparator9.isLocked();
        java.lang.Object obj12 = null;
        boolean b13 = fixedOrderComparator9.add(obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        java.lang.Object obj18 = defaultedMap15.remove((java.lang.Object) predicateUtils17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        defaultedMap15.putAll((java.util.Map) defaultedMap20);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        fixedOrderComparator33.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator33.add((java.lang.Object) fixedOrderComparator36);
        java.lang.Object obj38 = null;
        boolean b39 = fixedOrderComparator36.add(obj38);
        try {
            int i40 = fixedOrderComparator9.compare((java.lang.Object) defaultedMap20, (java.lang.Object) fixedOrderComparator36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) map7);
        java.lang.String str9 = defaultedMap1.toString();
        boolean b10 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set4 = defaultedMap3.keySet();
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        java.lang.Object obj6 = defaultedMap3.remove((java.lang.Object) predicateUtils5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) predicateUtils10);
        boolean b12 = defaultedMap8.isEmpty();
        java.util.Set set13 = defaultedMap8.keySet();
        java.lang.Object obj14 = defaultedMap3.remove((java.lang.Object) defaultedMap8);
        try {
            int i16 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap3, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str7 = defaultedMap6.toString();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set13 = defaultedMap6.keySet();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator20.add((java.lang.Object) fixedOrderComparator23);
        boolean b25 = fixedOrderComparator23.isLocked();
        java.lang.Object obj26 = null;
        boolean b27 = fixedOrderComparator23.add(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set30 = defaultedMap29.entrySet();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = defaultedMap29.equals((java.lang.Object) fixedOrderComparator37);
        java.lang.Object obj39 = defaultedMap6.put(obj26, (java.lang.Object) b38);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator14);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator11);
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        try {
            int i16 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator8, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set7 = defaultedMap5.entrySet();
        int i8 = defaultedMap5.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        int i11 = fixedOrderComparator9.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str14 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b17 = defaultedMap16.isEmpty();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 100.0d);
        boolean b20 = defaultedMap13.equals((java.lang.Object) map19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b23 = defaultedMap22.isEmpty();
        java.util.Collection collection24 = defaultedMap22.values();
        boolean b25 = defaultedMap13.containsKey((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b28 = defaultedMap27.isEmpty();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.String str30 = defaultedMap27.toString();
        int i31 = defaultedMap27.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        java.lang.Object obj36 = defaultedMap33.remove((java.lang.Object) predicateUtils35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set39 = defaultedMap38.keySet();
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        java.lang.Object obj41 = defaultedMap38.remove((java.lang.Object) predicateUtils40);
        boolean b42 = defaultedMap38.isEmpty();
        java.util.Set set43 = defaultedMap38.keySet();
        java.lang.Object obj44 = defaultedMap33.remove((java.lang.Object) defaultedMap38);
        int i45 = defaultedMap38.size();
        boolean b46 = defaultedMap27.equals((java.lang.Object) defaultedMap38);
        try {
            boolean b47 = fixedOrderComparator9.addAsEqual((java.lang.Object) defaultedMap13, (java.lang.Object) defaultedMap38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) predicateUtils11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) predicateUtils16);
        boolean b18 = defaultedMap14.isEmpty();
        java.util.Set set19 = defaultedMap14.keySet();
        java.lang.Object obj20 = defaultedMap9.remove((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str24 = defaultedMap23.toString();
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap23.putAll((java.util.Map) defaultedMap27);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        boolean b31 = defaultedMap21.equals((java.lang.Object) 10L);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        fixedOrderComparator38.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b42 = fixedOrderComparator38.add((java.lang.Object) fixedOrderComparator41);
        fixedOrderComparator38.setUnknownObjectBehavior(0);
        boolean b46 = fixedOrderComparator38.add((java.lang.Object) ' ');
        int i47 = fixedOrderComparator38.getUnknownObjectBehavior();
        java.lang.Object obj48 = defaultedMap21.get((java.lang.Object) fixedOrderComparator38);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set51 = defaultedMap50.keySet();
        collections.PredicateUtils predicateUtils52 = new collections.PredicateUtils();
        java.lang.Object obj53 = defaultedMap50.remove((java.lang.Object) predicateUtils52);
        boolean b54 = defaultedMap50.isEmpty();
        java.lang.Object obj56 = defaultedMap50.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection59 = defaultedMap58.values();
        java.lang.Object obj60 = defaultedMap50.remove((java.lang.Object) defaultedMap58);
        try {
            int i61 = fixedOrderComparator7.compare(obj48, (java.lang.Object) defaultedMap50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set12 = defaultedMap11.entrySet();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        fixedOrderComparator19.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0f, defaultedMap11, fixedOrderComparator19, 100.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate31, predicate32);
        try {
            boolean b34 = fixedOrderComparator6.addAsEqual((java.lang.Object) fixedOrderComparator26, (java.lang.Object) map33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        boolean b11 = fixedOrderComparator9.isLocked();
        java.lang.Object obj12 = null;
        boolean b13 = fixedOrderComparator9.add(obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set21 = defaultedMap19.entrySet();
        boolean b22 = fixedOrderComparator9.add((java.lang.Object) set21);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj12 = null;
        int i13 = fixedOrderComparator6.compare((java.lang.Object) (short) 0, obj12);
        int i14 = fixedOrderComparator6.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator14);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        boolean b11 = fixedOrderComparator9.isLocked();
        java.lang.Object obj12 = null;
        boolean b13 = fixedOrderComparator9.add(obj12);
        try {
            fixedOrderComparator9.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) predicateUtils10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1L + "'", obj22.equals(1L));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str15 = defaultedMap14.toString();
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        java.util.Set set20 = defaultedMap18.entrySet();
        boolean b21 = defaultedMap6.containsValue((java.lang.Object) set20);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set3 = defaultedMap2.entrySet();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 10.0f, defaultedMap2, fixedOrderComparator10, 100.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        try {
            fixedOrderComparator16.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(obj_array14);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str3 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b6 = defaultedMap5.isEmpty();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100.0d);
        boolean b9 = defaultedMap2.equals((java.lang.Object) map8);
        java.lang.String str10 = defaultedMap2.toString();
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) str10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set5 = defaultedMap4.keySet();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) predicateUtils6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) predicateUtils11);
        boolean b13 = defaultedMap9.isEmpty();
        java.util.Set set14 = defaultedMap9.keySet();
        java.lang.Object obj15 = defaultedMap4.remove((java.lang.Object) defaultedMap9);
        int i16 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) predicateUtils20);
        java.lang.Object obj22 = defaultedMap9.remove((java.lang.Object) predicateUtils20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str25 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b28 = defaultedMap27.isEmpty();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        boolean b31 = defaultedMap24.equals((java.lang.Object) map30);
        java.lang.String str32 = defaultedMap24.toString();
        java.lang.Object obj33 = defaultedMap9.get((java.lang.Object) defaultedMap24);
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap24);
        collections.Transformer transformer35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1L + "'", obj33.equals(1L));
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) predicateUtils9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) predicateUtils14);
        boolean b16 = defaultedMap12.isEmpty();
        java.util.Set set17 = defaultedMap12.keySet();
        java.lang.Object obj18 = defaultedMap7.remove((java.lang.Object) defaultedMap12);
        int i19 = defaultedMap12.size();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) predicateUtils26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set30 = defaultedMap29.keySet();
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        java.lang.Object obj32 = defaultedMap29.remove((java.lang.Object) predicateUtils31);
        boolean b33 = defaultedMap29.isEmpty();
        java.util.Set set34 = defaultedMap29.keySet();
        java.lang.Object obj35 = defaultedMap24.remove((java.lang.Object) defaultedMap29);
        int i36 = defaultedMap29.size();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set39 = defaultedMap38.keySet();
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        java.lang.Object obj41 = defaultedMap38.remove((java.lang.Object) predicateUtils40);
        java.lang.Object obj42 = defaultedMap29.remove((java.lang.Object) predicateUtils40);
        java.lang.Object obj43 = defaultedMap1.remove(obj42);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1L + "'", obj22.equals(1L));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set5 = defaultedMap4.keySet();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) predicateUtils6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) predicateUtils11);
        boolean b13 = defaultedMap9.isEmpty();
        java.util.Set set14 = defaultedMap9.keySet();
        java.lang.Object obj15 = defaultedMap4.remove((java.lang.Object) defaultedMap9);
        int i16 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) predicateUtils20);
        java.lang.Object obj22 = defaultedMap9.remove((java.lang.Object) predicateUtils20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str25 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b28 = defaultedMap27.isEmpty();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        boolean b31 = defaultedMap24.equals((java.lang.Object) map30);
        java.lang.String str32 = defaultedMap24.toString();
        java.lang.Object obj33 = defaultedMap9.get((java.lang.Object) defaultedMap24);
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) predicateUtils38);
        boolean b40 = defaultedMap36.isEmpty();
        java.lang.Object obj42 = defaultedMap36.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection45 = defaultedMap44.values();
        java.lang.Object obj46 = defaultedMap36.remove((java.lang.Object) defaultedMap44);
        boolean b47 = defaultedMap1.containsValue((java.lang.Object) defaultedMap36);
        java.util.Set set48 = defaultedMap1.keySet();
        collections.Factory factory49 = null;
        try {
            java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1L + "'", obj33.equals(1L));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator13);
        boolean b15 = fixedOrderComparator13.isLocked();
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) b15);
        java.util.Set set17 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set16 = defaultedMap15.entrySet();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b24 = defaultedMap15.equals((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator23);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) predicateUtils10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) predicateUtils15);
        boolean b17 = defaultedMap13.isEmpty();
        java.util.Set set18 = defaultedMap13.keySet();
        java.lang.Object obj19 = defaultedMap8.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str23 = defaultedMap22.toString();
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        boolean b30 = defaultedMap20.equals((java.lang.Object) 10L);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator37.add((java.lang.Object) fixedOrderComparator40);
        fixedOrderComparator37.setUnknownObjectBehavior(0);
        boolean b45 = fixedOrderComparator37.add((java.lang.Object) ' ');
        int i46 = fixedOrderComparator37.getUnknownObjectBehavior();
        java.lang.Object obj47 = defaultedMap20.get((java.lang.Object) fixedOrderComparator37);
        boolean b48 = defaultedMap1.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        fixedOrderComparator55.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        boolean b59 = fixedOrderComparator55.add((java.lang.Object) fixedOrderComparator58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set62 = defaultedMap61.keySet();
        collections.PredicateUtils predicateUtils63 = new collections.PredicateUtils();
        java.lang.Object obj64 = defaultedMap61.remove((java.lang.Object) predicateUtils63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str67 = defaultedMap66.toString();
        defaultedMap66.clear();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap66.putAll((java.util.Map) defaultedMap70);
        defaultedMap61.putAll((java.util.Map) defaultedMap66);
        boolean b74 = defaultedMap66.containsKey((java.lang.Object) "");
        boolean b75 = fixedOrderComparator55.add((java.lang.Object) defaultedMap66);
        java.lang.Object[] obj_array81 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array81);
        fixedOrderComparator82.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator();
        boolean b86 = fixedOrderComparator82.add((java.lang.Object) fixedOrderComparator85);
        fixedOrderComparator82.setUnknownObjectBehavior(0);
        boolean b89 = fixedOrderComparator55.add((java.lang.Object) 0);
        java.lang.Object obj90 = defaultedMap20.get((java.lang.Object) 0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(obj_array81);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(obj90);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) str4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) "hi!");
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) b9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Collection collection19 = defaultedMap17.values();
        java.lang.String str20 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) str20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) "hi!");
        boolean b26 = defaultedMap21.containsKey((java.lang.Object) b25);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap21.get(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        int i33 = defaultedMap30.size();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap30);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap30);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { b9, defaultedMap30 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        int i38 = fixedOrderComparator37.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "{}" + "'", obj28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(i38 == 2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set5 = defaultedMap4.keySet();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) predicateUtils6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) predicateUtils11);
        boolean b13 = defaultedMap9.isEmpty();
        java.util.Set set14 = defaultedMap9.keySet();
        java.lang.Object obj15 = defaultedMap4.remove((java.lang.Object) defaultedMap9);
        int i16 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) predicateUtils20);
        java.lang.Object obj22 = defaultedMap9.remove((java.lang.Object) predicateUtils20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str25 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b28 = defaultedMap27.isEmpty();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        boolean b31 = defaultedMap24.equals((java.lang.Object) map30);
        java.lang.String str32 = defaultedMap24.toString();
        java.lang.Object obj33 = defaultedMap9.get((java.lang.Object) defaultedMap24);
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap24);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        fixedOrderComparator41.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator();
        boolean b45 = fixedOrderComparator41.add((java.lang.Object) fixedOrderComparator44);
        java.lang.Object obj47 = null;
        int i48 = fixedOrderComparator41.compare((java.lang.Object) (short) 0, obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate53, predicate54);
        java.lang.Object obj56 = defaultedMap24.put((java.lang.Object) i48, (java.lang.Object) defaultedMap50);
        java.util.Set set57 = defaultedMap24.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1L + "'", obj33.equals(1L));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj11 = null;
        boolean b12 = fixedOrderComparator9.add(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str17 = defaultedMap16.toString();
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set24 = defaultedMap23.keySet();
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        java.lang.Object obj26 = defaultedMap23.remove((java.lang.Object) predicateUtils25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str29 = defaultedMap28.toString();
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        defaultedMap23.putAll((java.util.Map) defaultedMap28);
        defaultedMap16.putAll((java.util.Map) defaultedMap23);
        defaultedMap14.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str39 = defaultedMap38.toString();
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap38.putAll((java.util.Map) defaultedMap42);
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array49);
        java.lang.Object obj52 = defaultedMap38.remove((java.lang.Object) fixedOrderComparator51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        boolean b54 = fixedOrderComparator51.add((java.lang.Object) predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate53, predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b59 = defaultedMap58.isEmpty();
        java.util.Collection collection60 = defaultedMap58.values();
        java.lang.String str61 = defaultedMap58.toString();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) str61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b66 = defaultedMap64.containsKey((java.lang.Object) "hi!");
        boolean b67 = defaultedMap62.containsKey((java.lang.Object) b66);
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap62.get(obj68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str72 = defaultedMap71.toString();
        defaultedMap71.clear();
        int i74 = defaultedMap71.size();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) defaultedMap71);
        java.lang.Object obj76 = defaultedMap23.get((java.lang.Object) defaultedMap71);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set79 = defaultedMap78.keySet();
        collections.PredicateUtils predicateUtils80 = new collections.PredicateUtils();
        java.lang.Object obj81 = defaultedMap78.remove((java.lang.Object) predicateUtils80);
        boolean b82 = defaultedMap78.isEmpty();
        java.lang.Object obj84 = defaultedMap78.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection87 = defaultedMap86.values();
        java.lang.Object obj88 = defaultedMap78.remove((java.lang.Object) defaultedMap86);
        try {
            boolean b89 = fixedOrderComparator9.addAsEqual((java.lang.Object) defaultedMap71, (java.lang.Object) defaultedMap86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + "{}" + "'", obj69.equals("{}"));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 1L + "'", obj76.equals(1L));
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Collection collection8 = defaultedMap6.values();
        java.lang.String str9 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) str9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) "hi!");
        boolean b15 = defaultedMap10.containsKey((java.lang.Object) b14);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap10.get(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        int i22 = defaultedMap19.size();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap19);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set27 = defaultedMap26.keySet();
        collections.PredicateUtils predicateUtils28 = new collections.PredicateUtils();
        java.lang.Object obj29 = defaultedMap26.remove((java.lang.Object) predicateUtils28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) predicateUtils33);
        boolean b35 = defaultedMap31.isEmpty();
        java.util.Set set36 = defaultedMap31.keySet();
        java.lang.Object obj37 = defaultedMap26.remove((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str41 = defaultedMap40.toString();
        defaultedMap40.clear();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap40.putAll((java.util.Map) defaultedMap44);
        defaultedMap38.putAll((java.util.Map) defaultedMap44);
        boolean b48 = defaultedMap38.equals((java.lang.Object) 10L);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        fixedOrderComparator55.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        boolean b59 = fixedOrderComparator55.add((java.lang.Object) fixedOrderComparator58);
        fixedOrderComparator55.setUnknownObjectBehavior(0);
        boolean b63 = fixedOrderComparator55.add((java.lang.Object) ' ');
        int i64 = fixedOrderComparator55.getUnknownObjectBehavior();
        java.lang.Object obj65 = defaultedMap38.get((java.lang.Object) fixedOrderComparator55);
        java.lang.Object obj66 = defaultedMap1.remove(obj65);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "{}" + "'", obj17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) predicateUtils14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str18 = defaultedMap17.toString();
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap17);
        boolean b25 = defaultedMap17.containsKey((java.lang.Object) "");
        boolean b26 = fixedOrderComparator6.add((java.lang.Object) defaultedMap17);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        fixedOrderComparator33.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator33.add((java.lang.Object) fixedOrderComparator36);
        fixedOrderComparator33.setUnknownObjectBehavior(0);
        boolean b40 = fixedOrderComparator6.add((java.lang.Object) 0);
        int i41 = fixedOrderComparator6.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set6 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) predicateUtils10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) predicateUtils15);
        boolean b17 = defaultedMap13.isEmpty();
        java.util.Set set18 = defaultedMap13.keySet();
        java.lang.Object obj19 = defaultedMap8.remove((java.lang.Object) defaultedMap13);
        int i20 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) predicateUtils24);
        java.lang.Object obj26 = defaultedMap13.remove((java.lang.Object) predicateUtils24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str29 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100.0d);
        boolean b35 = defaultedMap28.equals((java.lang.Object) map34);
        java.lang.String str36 = defaultedMap28.toString();
        java.lang.Object obj37 = defaultedMap13.get((java.lang.Object) defaultedMap28);
        boolean b38 = defaultedMap5.equals((java.lang.Object) defaultedMap28);
        java.lang.Object obj39 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 1L + "'", obj37.equals(1L));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1L + "'", obj39.equals(1L));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b4 = defaultedMap3.isEmpty();
        java.util.Collection collection5 = defaultedMap3.values();
        java.lang.String str6 = defaultedMap3.toString();
        int i7 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) predicateUtils11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) predicateUtils16);
        boolean b18 = defaultedMap14.isEmpty();
        java.util.Set set19 = defaultedMap14.keySet();
        java.lang.Object obj20 = defaultedMap9.remove((java.lang.Object) defaultedMap14);
        int i21 = defaultedMap14.size();
        boolean b22 = defaultedMap3.equals((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str25 = defaultedMap24.toString();
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        java.util.Set set30 = defaultedMap28.entrySet();
        boolean b31 = defaultedMap3.equals((java.lang.Object) set30);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) b31);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + false + "'", obj32.equals(false));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        int i13 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b19 = defaultedMap18.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 100.0d);
        boolean b22 = defaultedMap15.equals((java.lang.Object) map21);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj30 = defaultedMap15.remove((java.lang.Object) fixedOrderComparator29);
        boolean b31 = defaultedMap6.containsValue((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        int i5 = defaultedMap1.size();
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        boolean b15 = defaultedMap8.equals((java.lang.Object) map14);
        java.lang.String str16 = defaultedMap8.toString();
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) "hi!");
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) defaultedMap23);
        java.util.Set set27 = defaultedMap23.entrySet();
        java.util.Set set28 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str32 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b35 = defaultedMap34.isEmpty();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100.0d);
        boolean b38 = defaultedMap31.equals((java.lang.Object) map37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b41 = defaultedMap40.isEmpty();
        java.util.Collection collection42 = defaultedMap40.values();
        boolean b43 = defaultedMap31.containsKey((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b46 = defaultedMap45.isEmpty();
        java.util.Collection collection47 = defaultedMap45.values();
        java.lang.String str48 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) str48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) "hi!");
        boolean b54 = defaultedMap49.containsKey((java.lang.Object) b53);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap49.get(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str59 = defaultedMap58.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b62 = defaultedMap61.isEmpty();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) 100.0d);
        boolean b65 = defaultedMap58.equals((java.lang.Object) map64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b68 = defaultedMap67.isEmpty();
        java.util.Collection collection69 = defaultedMap67.values();
        boolean b70 = defaultedMap58.containsKey((java.lang.Object) defaultedMap67);
        defaultedMap49.putAll((java.util.Map) defaultedMap58);
        java.lang.Object obj72 = defaultedMap23.put((java.lang.Object) defaultedMap31, (java.lang.Object) defaultedMap49);
        java.lang.Object[] obj_array78 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array78);
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array78);
        java.lang.Object obj81 = defaultedMap49.remove((java.lang.Object) fixedOrderComparator80);
        int i82 = defaultedMap49.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "{}" + "'", obj56.equals("{}"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(obj_array78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(i82 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap8.putAll((java.util.Map) defaultedMap12);
        try {
            boolean b15 = fixedOrderComparator6.addAsEqual((java.lang.Object) defaultedMap12, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b14 = fixedOrderComparator6.add((java.lang.Object) ' ');
        try {
            fixedOrderComparator6.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set7 = defaultedMap5.entrySet();
        java.lang.String str8 = defaultedMap5.toString();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator15.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator18);
        boolean b20 = fixedOrderComparator18.isLocked();
        java.lang.Object obj21 = defaultedMap5.get((java.lang.Object) b20);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b16 = defaultedMap15.isEmpty();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b21 = defaultedMap20.isEmpty();
        java.util.Collection collection22 = defaultedMap20.values();
        java.lang.String str23 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) "hi!");
        boolean b29 = defaultedMap24.containsKey((java.lang.Object) b28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap24.get(obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str34 = defaultedMap33.toString();
        defaultedMap33.clear();
        int i36 = defaultedMap33.size();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) defaultedMap33);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap33);
        defaultedMap13.putAll(map38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b42 = defaultedMap41.isEmpty();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) 100.0d);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str48 = defaultedMap47.toString();
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap47.putAll((java.util.Map) defaultedMap51);
        java.util.Set set53 = defaultedMap51.entrySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str56 = defaultedMap55.toString();
        defaultedMap55.clear();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap55.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set63 = defaultedMap62.keySet();
        collections.PredicateUtils predicateUtils64 = new collections.PredicateUtils();
        java.lang.Object obj65 = defaultedMap62.remove((java.lang.Object) predicateUtils64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str68 = defaultedMap67.toString();
        defaultedMap67.clear();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap67.putAll((java.util.Map) defaultedMap71);
        defaultedMap62.putAll((java.util.Map) defaultedMap67);
        defaultedMap55.putAll((java.util.Map) defaultedMap62);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b79 = defaultedMap77.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate80, predicate81);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate75, predicate80);
        java.lang.Object obj84 = null;
        java.lang.Object obj85 = defaultedMap51.put((java.lang.Object) predicate75, obj84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate(map44, predicate45, predicate75);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set89 = defaultedMap88.keySet();
        collections.PredicateUtils predicateUtils90 = new collections.PredicateUtils();
        java.lang.Object obj91 = defaultedMap88.remove((java.lang.Object) predicateUtils90);
        boolean b92 = defaultedMap88.isEmpty();
        java.util.Set set93 = defaultedMap88.keySet();
        java.lang.String str94 = defaultedMap88.toString();
        collections.Predicate predicate95 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj96 = defaultedMap88.remove((java.lang.Object) predicate95);
        java.util.Map map97 = collections.map.PredicatedMap.decorate(map38, predicate75, predicate95);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "{}" + "'", obj31.equals("{}"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "{}" + "'", str94.equals("{}"));
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        int i5 = defaultedMap1.size();
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        boolean b15 = defaultedMap8.equals((java.lang.Object) map14);
        java.lang.String str16 = defaultedMap8.toString();
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) "hi!");
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) defaultedMap23);
        java.util.Set set27 = defaultedMap23.entrySet();
        java.util.Set set28 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str32 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b35 = defaultedMap34.isEmpty();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100.0d);
        boolean b38 = defaultedMap31.equals((java.lang.Object) map37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b41 = defaultedMap40.isEmpty();
        java.util.Collection collection42 = defaultedMap40.values();
        boolean b43 = defaultedMap31.containsKey((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b46 = defaultedMap45.isEmpty();
        java.util.Collection collection47 = defaultedMap45.values();
        java.lang.String str48 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) str48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) "hi!");
        boolean b54 = defaultedMap49.containsKey((java.lang.Object) b53);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap49.get(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str59 = defaultedMap58.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b62 = defaultedMap61.isEmpty();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) 100.0d);
        boolean b65 = defaultedMap58.equals((java.lang.Object) map64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b68 = defaultedMap67.isEmpty();
        java.util.Collection collection69 = defaultedMap67.values();
        boolean b70 = defaultedMap58.containsKey((java.lang.Object) defaultedMap67);
        defaultedMap49.putAll((java.util.Map) defaultedMap58);
        java.lang.Object obj72 = defaultedMap23.put((java.lang.Object) defaultedMap31, (java.lang.Object) defaultedMap49);
        java.lang.Object[] obj_array78 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array78);
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array78);
        java.lang.Object obj81 = defaultedMap49.remove((java.lang.Object) fixedOrderComparator80);
        try {
            fixedOrderComparator80.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "{}" + "'", obj56.equals("{}"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(obj_array78);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        int i11 = fixedOrderComparator9.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b14 = defaultedMap13.isEmpty();
        try {
            boolean b16 = fixedOrderComparator9.addAsEqual((java.lang.Object) b14, (java.lang.Object) "{}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str7 = defaultedMap6.toString();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set13 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b23 = defaultedMap13.equals((java.lang.Object) 10L);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        fixedOrderComparator30.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b34 = fixedOrderComparator30.add((java.lang.Object) fixedOrderComparator33);
        fixedOrderComparator30.setUnknownObjectBehavior(0);
        boolean b38 = fixedOrderComparator30.add((java.lang.Object) ' ');
        int i39 = fixedOrderComparator30.getUnknownObjectBehavior();
        java.lang.Object obj40 = defaultedMap13.get((java.lang.Object) fixedOrderComparator30);
        java.util.Set set41 = defaultedMap13.keySet();
        collections.Factory factory42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) str4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) "hi!");
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) b9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap5.get(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str15 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 100.0d);
        boolean b21 = defaultedMap14.equals((java.lang.Object) map20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Collection collection25 = defaultedMap23.values();
        boolean b26 = defaultedMap14.containsKey((java.lang.Object) defaultedMap23);
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set30 = defaultedMap29.entrySet();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b38 = defaultedMap29.equals((java.lang.Object) fixedOrderComparator37);
        boolean b39 = defaultedMap14.equals((java.lang.Object) defaultedMap29);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "{}" + "'", obj12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        int i2 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator14);
        boolean b16 = fixedOrderComparator14.isLocked();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set5 = defaultedMap4.keySet();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) predicateUtils6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) predicateUtils11);
        boolean b13 = defaultedMap9.isEmpty();
        java.util.Set set14 = defaultedMap9.keySet();
        java.lang.Object obj15 = defaultedMap4.remove((java.lang.Object) defaultedMap9);
        int i16 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) predicateUtils20);
        java.lang.Object obj22 = defaultedMap9.remove((java.lang.Object) predicateUtils20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str25 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b28 = defaultedMap27.isEmpty();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        boolean b31 = defaultedMap24.equals((java.lang.Object) map30);
        java.lang.String str32 = defaultedMap24.toString();
        java.lang.Object obj33 = defaultedMap9.get((java.lang.Object) defaultedMap24);
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) predicateUtils38);
        boolean b40 = defaultedMap36.isEmpty();
        java.lang.Object obj42 = defaultedMap36.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection45 = defaultedMap44.values();
        java.lang.Object obj46 = defaultedMap36.remove((java.lang.Object) defaultedMap44);
        boolean b47 = defaultedMap1.containsValue((java.lang.Object) defaultedMap36);
        collections.Transformer transformer48 = null;
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, transformer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1L + "'", obj33.equals(1L));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str4 = defaultedMap3.toString();
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) predicateUtils12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.lang.Object obj39 = defaultedMap25.remove((java.lang.Object) fixedOrderComparator38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        boolean b41 = fixedOrderComparator38.add((java.lang.Object) predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate40, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b46 = defaultedMap45.isEmpty();
        java.util.Collection collection47 = defaultedMap45.values();
        java.lang.String str48 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) str48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) "hi!");
        boolean b54 = defaultedMap49.containsKey((java.lang.Object) b53);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap49.get(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str59 = defaultedMap58.toString();
        defaultedMap58.clear();
        int i61 = defaultedMap58.size();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) defaultedMap58);
        java.lang.Object obj63 = defaultedMap10.get((java.lang.Object) defaultedMap58);
        boolean b65 = defaultedMap10.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "{}" + "'", obj56.equals("{}"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 1L + "'", obj63.equals(1L));
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b10 = fixedOrderComparator9.isLocked();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) str4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) "hi!");
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) b9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap5.get(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str15 = defaultedMap14.toString();
        defaultedMap14.clear();
        int i17 = defaultedMap14.size();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "{}" + "'", obj12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str4 = defaultedMap3.toString();
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) predicateUtils12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) false);
        boolean b29 = defaultedMap1.equals((java.lang.Object) map28);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        int i5 = defaultedMap1.size();
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        boolean b15 = defaultedMap8.equals((java.lang.Object) map14);
        java.lang.String str16 = defaultedMap8.toString();
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) "hi!");
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) defaultedMap23);
        java.util.Set set27 = defaultedMap23.entrySet();
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set15 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) predicateUtils19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) predicateUtils24);
        boolean b26 = defaultedMap22.isEmpty();
        java.util.Set set27 = defaultedMap22.keySet();
        java.lang.Object obj28 = defaultedMap17.remove((java.lang.Object) defaultedMap22);
        int i29 = defaultedMap22.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) predicateUtils33);
        java.lang.Object obj35 = defaultedMap22.remove((java.lang.Object) predicateUtils33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b41 = defaultedMap40.isEmpty();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) 100.0d);
        boolean b44 = defaultedMap37.equals((java.lang.Object) map43);
        java.lang.String str45 = defaultedMap37.toString();
        java.lang.Object obj46 = defaultedMap22.get((java.lang.Object) defaultedMap37);
        boolean b47 = defaultedMap14.equals((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set50 = defaultedMap49.keySet();
        collections.PredicateUtils predicateUtils51 = new collections.PredicateUtils();
        java.lang.Object obj52 = defaultedMap49.remove((java.lang.Object) predicateUtils51);
        boolean b53 = defaultedMap49.isEmpty();
        java.lang.Object obj55 = defaultedMap49.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection58 = defaultedMap57.values();
        java.lang.Object obj59 = defaultedMap49.remove((java.lang.Object) defaultedMap57);
        boolean b60 = defaultedMap14.containsValue((java.lang.Object) defaultedMap49);
        java.util.Set set61 = defaultedMap14.keySet();
        boolean b62 = defaultedMap1.containsKey((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1L + "'", obj46.equals(1L));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b23 = defaultedMap13.equals((java.lang.Object) 10L);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        fixedOrderComparator30.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator();
        boolean b34 = fixedOrderComparator30.add((java.lang.Object) fixedOrderComparator33);
        fixedOrderComparator30.setUnknownObjectBehavior(0);
        boolean b38 = fixedOrderComparator30.add((java.lang.Object) ' ');
        int i39 = fixedOrderComparator30.getUnknownObjectBehavior();
        java.lang.Object obj40 = defaultedMap13.get((java.lang.Object) fixedOrderComparator30);
        java.util.Set set41 = defaultedMap13.keySet();
        collections.Transformer transformer42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, transformer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) predicateUtils10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate21, predicate26);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate(map29, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set3 = defaultedMap2.entrySet();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 10.0f, defaultedMap2, fixedOrderComparator10, 100.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array14);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(obj_array14);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str4 = defaultedMap3.toString();
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) predicateUtils12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.lang.Object obj39 = defaultedMap25.remove((java.lang.Object) fixedOrderComparator38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        boolean b41 = fixedOrderComparator38.add((java.lang.Object) predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate40, predicate42);
        boolean b44 = defaultedMap10.isEmpty();
        java.util.Collection collection45 = defaultedMap10.values();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) predicateUtils14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str18 = defaultedMap17.toString();
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap17);
        boolean b25 = defaultedMap17.containsKey((java.lang.Object) "");
        boolean b26 = fixedOrderComparator6.add((java.lang.Object) defaultedMap17);
        boolean b27 = fixedOrderComparator6.isLocked();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set31 = defaultedMap30.entrySet();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        fixedOrderComparator38.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 10.0f, defaultedMap30, fixedOrderComparator38, 100.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        fixedOrderComparator50.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator();
        boolean b54 = fixedOrderComparator50.add((java.lang.Object) fixedOrderComparator53);
        fixedOrderComparator50.setUnknownObjectBehavior(0);
        boolean b58 = fixedOrderComparator50.add((java.lang.Object) ' ');
        int i59 = fixedOrderComparator50.getUnknownObjectBehavior();
        int i60 = fixedOrderComparator6.compare((java.lang.Object) fixedOrderComparator43, (java.lang.Object) fixedOrderComparator50);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str63 = defaultedMap62.toString();
        defaultedMap62.clear();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap62.putAll((java.util.Map) defaultedMap66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set70 = defaultedMap69.keySet();
        collections.PredicateUtils predicateUtils71 = new collections.PredicateUtils();
        java.lang.Object obj72 = defaultedMap69.remove((java.lang.Object) predicateUtils71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str75 = defaultedMap74.toString();
        defaultedMap74.clear();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap74.putAll((java.util.Map) defaultedMap78);
        defaultedMap69.putAll((java.util.Map) defaultedMap74);
        defaultedMap62.putAll((java.util.Map) defaultedMap69);
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b86 = defaultedMap84.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate87, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate82, predicate87);
        boolean b91 = fixedOrderComparator43.add((java.lang.Object) defaultedMap62);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set3 = defaultedMap2.entrySet();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 10.0f, defaultedMap2, fixedOrderComparator10, 100.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set20 = defaultedMap19.keySet();
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        java.lang.Object obj22 = defaultedMap19.remove((java.lang.Object) predicateUtils21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        java.lang.Object obj27 = defaultedMap24.remove((java.lang.Object) predicateUtils26);
        boolean b28 = defaultedMap24.isEmpty();
        java.util.Set set29 = defaultedMap24.keySet();
        java.lang.Object obj30 = defaultedMap19.remove((java.lang.Object) defaultedMap24);
        int i31 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) "hi!");
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        fixedOrderComparator42.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator();
        boolean b46 = fixedOrderComparator42.add((java.lang.Object) fixedOrderComparator45);
        boolean b47 = fixedOrderComparator45.isLocked();
        boolean b48 = defaultedMap33.containsKey((java.lang.Object) b47);
        boolean b49 = defaultedMap24.containsKey((java.lang.Object) b48);
        boolean b50 = fixedOrderComparator17.add((java.lang.Object) b49);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        java.lang.String str12 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.lang.String str11 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) predicateUtils15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str19 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap18.putAll((java.util.Map) defaultedMap22);
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) predicateUtils29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set33 = defaultedMap32.keySet();
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        java.lang.Object obj35 = defaultedMap32.remove((java.lang.Object) predicateUtils34);
        boolean b36 = defaultedMap32.isEmpty();
        java.util.Set set37 = defaultedMap32.keySet();
        java.lang.Object obj38 = defaultedMap27.remove((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap27);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        fixedOrderComparator46.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        boolean b50 = fixedOrderComparator46.add((java.lang.Object) fixedOrderComparator49);
        boolean b51 = fixedOrderComparator49.isLocked();
        java.lang.Object obj52 = null;
        boolean b53 = fixedOrderComparator49.add(obj52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str56 = defaultedMap55.toString();
        defaultedMap55.clear();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap55.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set63 = defaultedMap62.keySet();
        collections.PredicateUtils predicateUtils64 = new collections.PredicateUtils();
        java.lang.Object obj65 = defaultedMap62.remove((java.lang.Object) predicateUtils64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str68 = defaultedMap67.toString();
        defaultedMap67.clear();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap67.putAll((java.util.Map) defaultedMap71);
        defaultedMap62.putAll((java.util.Map) defaultedMap67);
        defaultedMap55.putAll((java.util.Map) defaultedMap62);
        java.lang.Object obj75 = defaultedMap27.put((java.lang.Object) b53, (java.lang.Object) defaultedMap55);
        java.lang.Object obj76 = defaultedMap6.get((java.lang.Object) defaultedMap55);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 1L + "'", obj76.equals(1L));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b23 = defaultedMap13.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) false);
        java.lang.Object obj29 = defaultedMap13.get((java.lang.Object) false);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) predicateUtils9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) predicateUtils14);
        boolean b16 = defaultedMap12.isEmpty();
        java.util.Set set17 = defaultedMap12.keySet();
        java.lang.Object obj18 = defaultedMap7.remove((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b22 = defaultedMap21.isEmpty();
        java.util.Collection collection23 = defaultedMap21.values();
        defaultedMap7.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.Factory factory26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1L + "'", obj25.equals(1L));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b16 = defaultedMap15.isEmpty();
        java.util.Collection collection17 = defaultedMap15.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b21 = defaultedMap20.isEmpty();
        java.util.Collection collection22 = defaultedMap20.values();
        java.lang.String str23 = defaultedMap20.toString();
        int i24 = defaultedMap20.size();
        boolean b25 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b31 = defaultedMap30.isEmpty();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 100.0d);
        boolean b34 = defaultedMap27.equals((java.lang.Object) map33);
        java.lang.String str35 = defaultedMap27.toString();
        boolean b36 = defaultedMap20.containsValue((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) "hi!");
        java.lang.Object obj45 = defaultedMap20.put((java.lang.Object) 1.0d, (java.lang.Object) defaultedMap42);
        java.util.Set set46 = defaultedMap42.entrySet();
        java.util.Set set47 = defaultedMap42.entrySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str51 = defaultedMap50.toString();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b54 = defaultedMap53.isEmpty();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) 100.0d);
        boolean b57 = defaultedMap50.equals((java.lang.Object) map56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b60 = defaultedMap59.isEmpty();
        java.util.Collection collection61 = defaultedMap59.values();
        boolean b62 = defaultedMap50.containsKey((java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b65 = defaultedMap64.isEmpty();
        java.util.Collection collection66 = defaultedMap64.values();
        java.lang.String str67 = defaultedMap64.toString();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) str67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b72 = defaultedMap70.containsKey((java.lang.Object) "hi!");
        boolean b73 = defaultedMap68.containsKey((java.lang.Object) b72);
        java.lang.Object obj74 = null;
        java.lang.Object obj75 = defaultedMap68.get(obj74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str78 = defaultedMap77.toString();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b81 = defaultedMap80.isEmpty();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap80, (java.lang.Object) 100.0d);
        boolean b84 = defaultedMap77.equals((java.lang.Object) map83);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b87 = defaultedMap86.isEmpty();
        java.util.Collection collection88 = defaultedMap86.values();
        boolean b89 = defaultedMap77.containsKey((java.lang.Object) defaultedMap86);
        defaultedMap68.putAll((java.util.Map) defaultedMap77);
        java.lang.Object obj91 = defaultedMap42.put((java.lang.Object) defaultedMap50, (java.lang.Object) defaultedMap68);
        boolean b92 = defaultedMap15.containsValue((java.lang.Object) defaultedMap68);
        collections.Factory factory93 = null;
        try {
            java.util.Map map94 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, factory93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + "{}" + "'", obj75.equals("{}"));
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{}" + "'", str78.equals("{}"));
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str4 = defaultedMap3.toString();
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) predicateUtils12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.lang.Object obj39 = defaultedMap25.remove((java.lang.Object) fixedOrderComparator38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        boolean b41 = fixedOrderComparator38.add((java.lang.Object) predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate40, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b46 = defaultedMap45.isEmpty();
        java.util.Collection collection47 = defaultedMap45.values();
        java.lang.String str48 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) str48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) "hi!");
        boolean b54 = defaultedMap49.containsKey((java.lang.Object) b53);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap49.get(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str59 = defaultedMap58.toString();
        defaultedMap58.clear();
        int i61 = defaultedMap58.size();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) defaultedMap58);
        java.lang.Object obj63 = defaultedMap10.get((java.lang.Object) defaultedMap58);
        defaultedMap10.clear();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "{}" + "'", obj56.equals("{}"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 1L + "'", obj63.equals(1L));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) predicateUtils9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) predicateUtils14);
        boolean b16 = defaultedMap12.isEmpty();
        java.util.Set set17 = defaultedMap12.keySet();
        java.lang.Object obj18 = defaultedMap7.remove((java.lang.Object) defaultedMap12);
        int i19 = defaultedMap12.size();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set25 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        java.lang.Object obj30 = defaultedMap27.remove((java.lang.Object) predicateUtils29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set33 = defaultedMap32.keySet();
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        java.lang.Object obj35 = defaultedMap32.remove((java.lang.Object) predicateUtils34);
        boolean b36 = defaultedMap32.isEmpty();
        java.util.Set set37 = defaultedMap32.keySet();
        java.lang.Object obj38 = defaultedMap27.remove((java.lang.Object) defaultedMap32);
        int i39 = defaultedMap32.size();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set42 = defaultedMap41.keySet();
        collections.PredicateUtils predicateUtils43 = new collections.PredicateUtils();
        java.lang.Object obj44 = defaultedMap41.remove((java.lang.Object) predicateUtils43);
        java.lang.Object obj45 = defaultedMap32.remove((java.lang.Object) predicateUtils43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str48 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b51 = defaultedMap50.isEmpty();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 100.0d);
        boolean b54 = defaultedMap47.equals((java.lang.Object) map53);
        java.lang.String str55 = defaultedMap47.toString();
        java.lang.Object obj56 = defaultedMap32.get((java.lang.Object) defaultedMap47);
        boolean b57 = defaultedMap24.equals((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set60 = defaultedMap59.keySet();
        collections.PredicateUtils predicateUtils61 = new collections.PredicateUtils();
        java.lang.Object obj62 = defaultedMap59.remove((java.lang.Object) predicateUtils61);
        boolean b63 = defaultedMap59.isEmpty();
        java.lang.Object obj65 = defaultedMap59.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection68 = defaultedMap67.values();
        java.lang.Object obj69 = defaultedMap59.remove((java.lang.Object) defaultedMap67);
        boolean b70 = defaultedMap24.containsValue((java.lang.Object) defaultedMap59);
        java.lang.Object obj71 = defaultedMap1.get((java.lang.Object) b70);
        collections.Transformer transformer72 = null;
        try {
            java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1L + "'", obj22.equals(1L));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1L + "'", obj56.equals(1L));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 1L + "'", obj71.equals(1L));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator13);
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator10.add((java.lang.Object) ' ');
        int i19 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) fixedOrderComparator10);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        java.lang.Object obj36 = defaultedMap33.remove((java.lang.Object) predicateUtils35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set39 = defaultedMap38.keySet();
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        java.lang.Object obj41 = defaultedMap38.remove((java.lang.Object) predicateUtils40);
        boolean b42 = defaultedMap38.isEmpty();
        java.util.Set set43 = defaultedMap38.keySet();
        java.lang.Object obj44 = defaultedMap33.remove((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str48 = defaultedMap47.toString();
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap47.putAll((java.util.Map) defaultedMap51);
        defaultedMap45.putAll((java.util.Map) defaultedMap51);
        boolean b55 = defaultedMap45.equals((java.lang.Object) 10L);
        java.lang.Object[] obj_array61 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        fixedOrderComparator62.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator();
        boolean b66 = fixedOrderComparator62.add((java.lang.Object) fixedOrderComparator65);
        fixedOrderComparator62.setUnknownObjectBehavior(0);
        boolean b70 = fixedOrderComparator62.add((java.lang.Object) ' ');
        int i71 = fixedOrderComparator62.getUnknownObjectBehavior();
        java.lang.Object obj72 = defaultedMap45.get((java.lang.Object) fixedOrderComparator62);
        boolean b73 = defaultedMap26.containsKey((java.lang.Object) defaultedMap45);
        boolean b74 = defaultedMap24.equals((java.lang.Object) b73);
        java.lang.Object[] obj_array80 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array80);
        fixedOrderComparator81.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator();
        boolean b85 = fixedOrderComparator81.add((java.lang.Object) fixedOrderComparator84);
        java.lang.Object obj87 = null;
        int i88 = fixedOrderComparator81.compare((java.lang.Object) (short) 0, obj87);
        try {
            boolean b89 = fixedOrderComparator10.addAsEqual((java.lang.Object) b74, obj87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(obj_array80);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(i88 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1));
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) str4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) "hi!");
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str15 = defaultedMap14.toString();
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        java.lang.Object obj24 = defaultedMap21.remove((java.lang.Object) predicateUtils23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str27 = defaultedMap26.toString();
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        defaultedMap21.putAll((java.util.Map) defaultedMap26);
        defaultedMap14.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set36 = defaultedMap35.keySet();
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        java.lang.Object obj38 = defaultedMap35.remove((java.lang.Object) predicateUtils37);
        boolean b39 = defaultedMap35.isEmpty();
        java.util.Set set40 = defaultedMap35.keySet();
        java.lang.String str41 = defaultedMap35.toString();
        java.util.Collection collection42 = defaultedMap35.values();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) collection42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) "hi!");
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        fixedOrderComparator54.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator();
        boolean b58 = fixedOrderComparator54.add((java.lang.Object) fixedOrderComparator57);
        fixedOrderComparator54.setUnknownObjectBehavior(0);
        boolean b62 = fixedOrderComparator54.add((java.lang.Object) ' ');
        int i63 = fixedOrderComparator54.getUnknownObjectBehavior();
        boolean b64 = defaultedMap45.containsKey((java.lang.Object) fixedOrderComparator54);
        java.lang.Object obj65 = defaultedMap14.get((java.lang.Object) fixedOrderComparator54);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b68 = defaultedMap67.isEmpty();
        java.util.Collection collection69 = defaultedMap67.values();
        java.lang.String str70 = defaultedMap67.toString();
        java.util.Collection collection71 = defaultedMap67.values();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set74 = defaultedMap73.keySet();
        collections.PredicateUtils predicateUtils75 = new collections.PredicateUtils();
        java.lang.Object obj76 = defaultedMap73.remove((java.lang.Object) predicateUtils75);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set79 = defaultedMap78.keySet();
        collections.PredicateUtils predicateUtils80 = new collections.PredicateUtils();
        java.lang.Object obj81 = defaultedMap78.remove((java.lang.Object) predicateUtils80);
        boolean b82 = defaultedMap78.isEmpty();
        java.util.Set set83 = defaultedMap78.keySet();
        java.lang.Object obj84 = defaultedMap73.remove((java.lang.Object) defaultedMap78);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap73);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b88 = defaultedMap87.isEmpty();
        java.util.Collection collection89 = defaultedMap87.values();
        defaultedMap73.putAll((java.util.Map) defaultedMap87);
        java.lang.Object obj91 = defaultedMap67.get((java.lang.Object) defaultedMap73);
        java.lang.Object obj92 = defaultedMap5.put((java.lang.Object) fixedOrderComparator54, obj91);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "{}" + "'", obj12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1L + "'", obj65.equals(1L));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 1L + "'", obj91.equals(1L));
        org.junit.Assert.assertNull(obj92);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str28 = defaultedMap27.toString();
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set35 = defaultedMap34.keySet();
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap34.remove((java.lang.Object) predicateUtils36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str40 = defaultedMap39.toString();
        defaultedMap39.clear();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap39.putAll((java.util.Map) defaultedMap43);
        defaultedMap34.putAll((java.util.Map) defaultedMap39);
        defaultedMap27.putAll((java.util.Map) defaultedMap34);
        defaultedMap25.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str50 = defaultedMap49.toString();
        defaultedMap49.clear();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap49.putAll((java.util.Map) defaultedMap53);
        java.lang.Object[] obj_array60 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array60);
        java.lang.Object obj63 = defaultedMap49.remove((java.lang.Object) fixedOrderComparator62);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        boolean b65 = fixedOrderComparator62.add((java.lang.Object) predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate64, predicate66);
        defaultedMap23.putAll(map67);
        java.lang.Object obj69 = defaultedMap13.get((java.lang.Object) map67);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        int i5 = defaultedMap1.size();
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        boolean b15 = defaultedMap8.equals((java.lang.Object) map14);
        java.lang.String str16 = defaultedMap8.toString();
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) "hi!");
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) defaultedMap23);
        java.util.Set set27 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set30 = defaultedMap29.keySet();
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        java.lang.Object obj32 = defaultedMap29.remove((java.lang.Object) predicateUtils31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str35 = defaultedMap34.toString();
        defaultedMap34.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap34.putAll((java.util.Map) defaultedMap38);
        defaultedMap29.putAll((java.util.Map) defaultedMap34);
        java.util.Set set41 = defaultedMap34.keySet();
        boolean b42 = defaultedMap23.containsValue((java.lang.Object) set41);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap1.isEmpty();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        fixedOrderComparator20.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator20.add((java.lang.Object) fixedOrderComparator23);
        boolean b25 = fixedOrderComparator23.isLocked();
        java.lang.Object obj26 = null;
        boolean b27 = fixedOrderComparator23.add(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str30 = defaultedMap29.toString();
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap29.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) predicateUtils38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str42 = defaultedMap41.toString();
        defaultedMap41.clear();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap41.putAll((java.util.Map) defaultedMap45);
        defaultedMap36.putAll((java.util.Map) defaultedMap41);
        defaultedMap29.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) b27, (java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set52 = defaultedMap51.keySet();
        collections.PredicateUtils predicateUtils53 = new collections.PredicateUtils();
        java.lang.Object obj54 = defaultedMap51.remove((java.lang.Object) predicateUtils53);
        boolean b55 = defaultedMap51.isEmpty();
        java.lang.Object obj57 = defaultedMap51.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection60 = defaultedMap59.values();
        java.lang.Object obj61 = defaultedMap51.remove((java.lang.Object) defaultedMap59);
        boolean b62 = defaultedMap29.containsValue((java.lang.Object) defaultedMap59);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        fixedOrderComparator9.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator9.add((java.lang.Object) fixedOrderComparator12);
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        boolean b17 = fixedOrderComparator9.add((java.lang.Object) ' ');
        int i18 = fixedOrderComparator9.getUnknownObjectBehavior();
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) i18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str22 = defaultedMap21.toString();
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap21.putAll((java.util.Map) defaultedMap25);
        int i27 = defaultedMap21.size();
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) str4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) "hi!");
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) b9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap5.get(obj11);
        java.util.Set set13 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "{}" + "'", obj12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) predicateUtils13);
        boolean b15 = defaultedMap11.isEmpty();
        java.util.Set set16 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b19 = defaultedMap18.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 100.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str25 = defaultedMap24.toString();
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        java.util.Set set30 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str33 = defaultedMap32.toString();
        defaultedMap32.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap32.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set40 = defaultedMap39.keySet();
        collections.PredicateUtils predicateUtils41 = new collections.PredicateUtils();
        java.lang.Object obj42 = defaultedMap39.remove((java.lang.Object) predicateUtils41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str45 = defaultedMap44.toString();
        defaultedMap44.clear();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap44.putAll((java.util.Map) defaultedMap48);
        defaultedMap39.putAll((java.util.Map) defaultedMap44);
        defaultedMap32.putAll((java.util.Map) defaultedMap39);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate52, predicate57);
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = defaultedMap28.put((java.lang.Object) predicate52, obj61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate(map21, predicate22, predicate52);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str66 = defaultedMap65.toString();
        defaultedMap65.clear();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap65.putAll((java.util.Map) defaultedMap69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set73 = defaultedMap72.keySet();
        collections.PredicateUtils predicateUtils74 = new collections.PredicateUtils();
        java.lang.Object obj75 = defaultedMap72.remove((java.lang.Object) predicateUtils74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str78 = defaultedMap77.toString();
        defaultedMap77.clear();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap77.putAll((java.util.Map) defaultedMap81);
        defaultedMap72.putAll((java.util.Map) defaultedMap77);
        defaultedMap65.putAll((java.util.Map) defaultedMap72);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b89 = defaultedMap87.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap87, predicate90, predicate91);
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate85, predicate90);
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate22, predicate90);
        boolean b95 = defaultedMap1.equals((java.lang.Object) predicate90);
        boolean b97 = defaultedMap1.containsValue((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1L + "'", obj8.equals(1L));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{}" + "'", str78.equals("{}"));
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) predicateUtils14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str18 = defaultedMap17.toString();
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap17);
        boolean b25 = defaultedMap17.containsKey((java.lang.Object) "");
        boolean b26 = fixedOrderComparator6.add((java.lang.Object) defaultedMap17);
        boolean b27 = fixedOrderComparator6.isLocked();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set31 = defaultedMap30.entrySet();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        fixedOrderComparator38.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 10.0f, defaultedMap30, fixedOrderComparator38, 100.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        fixedOrderComparator50.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator();
        boolean b54 = fixedOrderComparator50.add((java.lang.Object) fixedOrderComparator53);
        fixedOrderComparator50.setUnknownObjectBehavior(0);
        boolean b58 = fixedOrderComparator50.add((java.lang.Object) ' ');
        int i59 = fixedOrderComparator50.getUnknownObjectBehavior();
        int i60 = fixedOrderComparator6.compare((java.lang.Object) fixedOrderComparator43, (java.lang.Object) fixedOrderComparator50);
        boolean b61 = fixedOrderComparator50.isLocked();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b64 = defaultedMap63.isEmpty();
        java.util.Collection collection65 = defaultedMap63.values();
        java.lang.String str66 = defaultedMap63.toString();
        int i67 = defaultedMap63.size();
        boolean b68 = defaultedMap63.isEmpty();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str71 = defaultedMap70.toString();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b74 = defaultedMap73.isEmpty();
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) 100.0d);
        boolean b77 = defaultedMap70.equals((java.lang.Object) map76);
        java.lang.String str78 = defaultedMap70.toString();
        boolean b79 = defaultedMap63.containsValue((java.lang.Object) defaultedMap70);
        java.util.Collection collection80 = defaultedMap63.values();
        boolean b81 = fixedOrderComparator50.add((java.lang.Object) defaultedMap63);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{}" + "'", str78.equals("{}"));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertTrue(b81 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b16 = defaultedMap15.isEmpty();
        java.util.Collection collection17 = defaultedMap15.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        defaultedMap15.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap8.putAll((java.util.Map) defaultedMap12);
        java.util.Set set14 = defaultedMap12.entrySet();
        java.lang.String str15 = defaultedMap12.toString();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) str4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) "hi!");
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) b9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Collection collection19 = defaultedMap17.values();
        java.lang.String str20 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) str20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) "hi!");
        boolean b26 = defaultedMap21.containsKey((java.lang.Object) b25);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap21.get(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        int i33 = defaultedMap30.size();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap30);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap30);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { b9, defaultedMap30 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array36);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "{}" + "'", obj28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(obj_array36);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) false);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) map7);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator15);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) '#');
        java.util.Set set20 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        int i13 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        java.lang.Object obj18 = defaultedMap15.remove((java.lang.Object) predicateUtils17);
        java.lang.Object obj19 = defaultedMap6.remove((java.lang.Object) predicateUtils17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b25 = defaultedMap24.isEmpty();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 100.0d);
        boolean b28 = defaultedMap21.equals((java.lang.Object) map27);
        java.lang.String str29 = defaultedMap21.toString();
        java.lang.Object obj30 = defaultedMap6.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set33 = defaultedMap32.keySet();
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        java.lang.Object obj35 = defaultedMap32.remove((java.lang.Object) predicateUtils34);
        boolean b36 = defaultedMap32.isEmpty();
        java.lang.Object obj38 = defaultedMap32.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set43 = defaultedMap42.entrySet();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        fixedOrderComparator50.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 10.0f, defaultedMap42, fixedOrderComparator50, 100.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        boolean b56 = defaultedMap39.equals((java.lang.Object) fixedOrderComparator55);
        boolean b57 = defaultedMap21.equals((java.lang.Object) b56);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1L + "'", obj30.equals(1L));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0d);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str15 = defaultedMap14.toString();
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        java.util.Set set20 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str23 = defaultedMap22.toString();
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set30 = defaultedMap29.keySet();
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        java.lang.Object obj32 = defaultedMap29.remove((java.lang.Object) predicateUtils31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str35 = defaultedMap34.toString();
        defaultedMap34.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap34.putAll((java.util.Map) defaultedMap38);
        defaultedMap29.putAll((java.util.Map) defaultedMap34);
        defaultedMap22.putAll((java.util.Map) defaultedMap29);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate42, predicate47);
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap18.put((java.lang.Object) predicate42, obj51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map11, predicate12, predicate42);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str56 = defaultedMap55.toString();
        defaultedMap55.clear();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap55.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set63 = defaultedMap62.keySet();
        collections.PredicateUtils predicateUtils64 = new collections.PredicateUtils();
        java.lang.Object obj65 = defaultedMap62.remove((java.lang.Object) predicateUtils64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str68 = defaultedMap67.toString();
        defaultedMap67.clear();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap67.putAll((java.util.Map) defaultedMap71);
        defaultedMap62.putAll((java.util.Map) defaultedMap67);
        defaultedMap55.putAll((java.util.Map) defaultedMap62);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b79 = defaultedMap77.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate80, predicate81);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate75, predicate80);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate80);
        collections.Factory factory85 = null;
        try {
            java.util.Map map86 = collections.map.DefaultedMap.decorate(map84, factory85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set5 = defaultedMap4.keySet();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) predicateUtils6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) predicateUtils11);
        boolean b13 = defaultedMap9.isEmpty();
        java.util.Set set14 = defaultedMap9.keySet();
        java.lang.Object obj15 = defaultedMap4.remove((java.lang.Object) defaultedMap9);
        int i16 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) predicateUtils20);
        java.lang.Object obj22 = defaultedMap9.remove((java.lang.Object) predicateUtils20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str25 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b28 = defaultedMap27.isEmpty();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        boolean b31 = defaultedMap24.equals((java.lang.Object) map30);
        java.lang.String str32 = defaultedMap24.toString();
        java.lang.Object obj33 = defaultedMap9.get((java.lang.Object) defaultedMap24);
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap24);
        java.lang.String str35 = defaultedMap24.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1L + "'", obj33.equals(1L));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) collection5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) predicateUtils10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) predicateUtils15);
        boolean b17 = defaultedMap13.isEmpty();
        java.util.Set set18 = defaultedMap13.keySet();
        java.lang.Object obj19 = defaultedMap8.remove((java.lang.Object) defaultedMap13);
        int i20 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        java.lang.Object obj25 = defaultedMap22.remove((java.lang.Object) predicateUtils24);
        java.lang.Object obj26 = defaultedMap13.remove((java.lang.Object) predicateUtils24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str29 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100.0d);
        boolean b35 = defaultedMap28.equals((java.lang.Object) map34);
        java.lang.String str36 = defaultedMap28.toString();
        java.lang.Object obj37 = defaultedMap13.get((java.lang.Object) defaultedMap28);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 1L + "'", obj37.equals(1L));
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        int i12 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap14.remove((java.lang.Object) predicateUtils16);
        boolean b18 = defaultedMap14.isEmpty();
        java.lang.String str19 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        java.lang.Object obj24 = defaultedMap21.remove((java.lang.Object) predicateUtils23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str27 = defaultedMap26.toString();
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        defaultedMap21.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj33 = defaultedMap9.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b36 = defaultedMap35.isEmpty();
        java.util.Collection collection37 = defaultedMap35.values();
        java.lang.String str38 = defaultedMap35.toString();
        int i39 = defaultedMap35.size();
        boolean b40 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str43 = defaultedMap42.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b46 = defaultedMap45.isEmpty();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) 100.0d);
        boolean b49 = defaultedMap42.equals((java.lang.Object) map48);
        java.lang.String str50 = defaultedMap42.toString();
        boolean b51 = defaultedMap35.containsValue((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b59 = defaultedMap57.containsKey((java.lang.Object) "hi!");
        java.lang.Object obj60 = defaultedMap35.put((java.lang.Object) 1.0d, (java.lang.Object) defaultedMap57);
        java.util.Set set61 = defaultedMap57.entrySet();
        try {
            boolean b62 = fixedOrderComparator7.addAsEqual((java.lang.Object) defaultedMap9, (java.lang.Object) defaultedMap57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) predicateUtils9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) predicateUtils14);
        boolean b16 = defaultedMap12.isEmpty();
        java.util.Set set17 = defaultedMap12.keySet();
        java.lang.Object obj18 = defaultedMap7.remove((java.lang.Object) defaultedMap12);
        int i19 = defaultedMap12.size();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str23 = defaultedMap22.toString();
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        java.util.Set set28 = defaultedMap26.entrySet();
        boolean b29 = defaultedMap1.equals((java.lang.Object) set28);
        java.util.Collection collection30 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b10 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) predicateUtils14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) predicateUtils19);
        boolean b21 = defaultedMap17.isEmpty();
        java.util.Set set22 = defaultedMap17.keySet();
        java.lang.Object obj23 = defaultedMap12.remove((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b27 = defaultedMap26.isEmpty();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b32 = defaultedMap31.isEmpty();
        java.util.Collection collection33 = defaultedMap31.values();
        java.lang.String str34 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) str34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) "hi!");
        boolean b40 = defaultedMap35.containsKey((java.lang.Object) b39);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap35.get(obj41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str45 = defaultedMap44.toString();
        defaultedMap44.clear();
        int i47 = defaultedMap44.size();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) defaultedMap44);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap44);
        defaultedMap24.putAll(map49);
        boolean b51 = fixedOrderComparator9.add((java.lang.Object) map49);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "{}" + "'", obj42.equals("{}"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b51 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap9.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        java.lang.Object obj19 = defaultedMap16.remove((java.lang.Object) predicateUtils18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str22 = defaultedMap21.toString();
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap21.putAll((java.util.Map) defaultedMap25);
        defaultedMap16.putAll((java.util.Map) defaultedMap21);
        defaultedMap9.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        java.lang.Object obj33 = defaultedMap30.remove((java.lang.Object) predicateUtils32);
        boolean b34 = defaultedMap30.isEmpty();
        java.util.Set set35 = defaultedMap30.keySet();
        java.lang.String str36 = defaultedMap30.toString();
        java.util.Collection collection37 = defaultedMap30.values();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) collection37);
        java.lang.Object obj39 = defaultedMap1.get((java.lang.Object) collection37);
        collections.Factory factory40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1L + "'", obj39.equals(1L));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1));
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        boolean b15 = defaultedMap8.equals((java.lang.Object) map14);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj23 = defaultedMap8.remove((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) (-1), (java.lang.Object) '#');
        java.util.Collection collection27 = defaultedMap8.values();
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) collection27);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        int i5 = defaultedMap1.size();
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        boolean b15 = defaultedMap8.equals((java.lang.Object) map14);
        java.lang.String str16 = defaultedMap8.toString();
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) "hi!");
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) defaultedMap23);
        java.util.Set set27 = defaultedMap23.entrySet();
        java.util.Set set28 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str32 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b35 = defaultedMap34.isEmpty();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100.0d);
        boolean b38 = defaultedMap31.equals((java.lang.Object) map37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b41 = defaultedMap40.isEmpty();
        java.util.Collection collection42 = defaultedMap40.values();
        boolean b43 = defaultedMap31.containsKey((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b46 = defaultedMap45.isEmpty();
        java.util.Collection collection47 = defaultedMap45.values();
        java.lang.String str48 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) str48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) "hi!");
        boolean b54 = defaultedMap49.containsKey((java.lang.Object) b53);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap49.get(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str59 = defaultedMap58.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b62 = defaultedMap61.isEmpty();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) 100.0d);
        boolean b65 = defaultedMap58.equals((java.lang.Object) map64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b68 = defaultedMap67.isEmpty();
        java.util.Collection collection69 = defaultedMap67.values();
        boolean b70 = defaultedMap58.containsKey((java.lang.Object) defaultedMap67);
        defaultedMap49.putAll((java.util.Map) defaultedMap58);
        java.lang.Object obj72 = defaultedMap23.put((java.lang.Object) defaultedMap31, (java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str75 = defaultedMap74.toString();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b78 = defaultedMap77.isEmpty();
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, (java.lang.Object) 100.0d);
        boolean b81 = defaultedMap74.equals((java.lang.Object) map80);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b84 = defaultedMap83.isEmpty();
        java.util.Collection collection85 = defaultedMap83.values();
        boolean b86 = defaultedMap74.containsKey((java.lang.Object) defaultedMap83);
        boolean b87 = defaultedMap23.containsKey((java.lang.Object) defaultedMap83);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "{}" + "'", obj56.equals("{}"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b87 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b14 = fixedOrderComparator6.add((java.lang.Object) (short) 0);
        try {
            fixedOrderComparator6.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        boolean b15 = defaultedMap8.equals((java.lang.Object) map14);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj23 = defaultedMap8.remove((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) (-1), (java.lang.Object) '#');
        java.util.Collection collection27 = defaultedMap8.values();
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) predicateUtils15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) predicateUtils20);
        boolean b22 = defaultedMap18.isEmpty();
        java.util.Set set23 = defaultedMap18.keySet();
        java.lang.Object obj24 = defaultedMap13.remove((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str28 = defaultedMap27.toString();
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj35 = defaultedMap9.put((java.lang.Object) defaultedMap25, (java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) str4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) "hi!");
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) b9);
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) 1.0f);
        int i13 = defaultedMap5.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "{}" + "'", obj12.equals("{}"));
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b16 = defaultedMap15.isEmpty();
        java.util.Collection collection17 = defaultedMap15.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.util.Set set19 = defaultedMap15.keySet();
        boolean b20 = defaultedMap15.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) predicateUtils10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str23 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b26 = defaultedMap25.isEmpty();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100.0d);
        boolean b29 = defaultedMap22.equals((java.lang.Object) map28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str32 = defaultedMap31.toString();
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap31.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set39 = defaultedMap38.keySet();
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        java.lang.Object obj41 = defaultedMap38.remove((java.lang.Object) predicateUtils40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str44 = defaultedMap43.toString();
        defaultedMap43.clear();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap43.putAll((java.util.Map) defaultedMap47);
        defaultedMap38.putAll((java.util.Map) defaultedMap43);
        defaultedMap31.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set53 = defaultedMap52.keySet();
        collections.PredicateUtils predicateUtils54 = new collections.PredicateUtils();
        java.lang.Object obj55 = defaultedMap52.remove((java.lang.Object) predicateUtils54);
        boolean b56 = defaultedMap52.isEmpty();
        java.util.Set set57 = defaultedMap52.keySet();
        java.lang.String str58 = defaultedMap52.toString();
        java.util.Collection collection59 = defaultedMap52.values();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) collection59);
        java.lang.Object obj61 = defaultedMap22.get((java.lang.Object) defaultedMap31);
        java.lang.Object obj62 = null;
        java.lang.Object obj63 = defaultedMap8.put((java.lang.Object) defaultedMap22, obj62);
        java.util.Collection collection64 = defaultedMap22.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 1L + "'", obj61.equals(1L));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(collection64);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap8.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        java.lang.Object obj18 = defaultedMap15.remove((java.lang.Object) predicateUtils17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.putAll((java.util.Map) defaultedMap24);
        defaultedMap15.putAll((java.util.Map) defaultedMap20);
        defaultedMap8.putAll((java.util.Map) defaultedMap15);
        defaultedMap6.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap30.putAll((java.util.Map) defaultedMap34);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        java.lang.Object obj44 = defaultedMap30.remove((java.lang.Object) fixedOrderComparator43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        boolean b46 = fixedOrderComparator43.add((java.lang.Object) predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate45, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b51 = defaultedMap50.isEmpty();
        java.util.Collection collection52 = defaultedMap50.values();
        java.lang.String str53 = defaultedMap50.toString();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) str53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) "hi!");
        boolean b59 = defaultedMap54.containsKey((java.lang.Object) b58);
        java.lang.Object obj60 = null;
        java.lang.Object obj61 = defaultedMap54.get(obj60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str64 = defaultedMap63.toString();
        defaultedMap63.clear();
        int i66 = defaultedMap63.size();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) defaultedMap63);
        java.lang.Object obj68 = defaultedMap15.get((java.lang.Object) defaultedMap63);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set71 = defaultedMap70.keySet();
        collections.PredicateUtils predicateUtils72 = new collections.PredicateUtils();
        java.lang.Object obj73 = defaultedMap70.remove((java.lang.Object) predicateUtils72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str76 = defaultedMap75.toString();
        defaultedMap75.clear();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap75.putAll((java.util.Map) defaultedMap79);
        defaultedMap70.putAll((java.util.Map) defaultedMap75);
        boolean b83 = defaultedMap75.containsKey((java.lang.Object) "");
        defaultedMap75.clear();
        java.lang.Object obj85 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) defaultedMap75);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + "{}" + "'", obj61.equals("{}"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 1L + "'", obj68.equals(1L));
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) predicateUtils14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str18 = defaultedMap17.toString();
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap17);
        boolean b25 = defaultedMap17.containsKey((java.lang.Object) "");
        boolean b26 = fixedOrderComparator6.add((java.lang.Object) defaultedMap17);
        boolean b27 = fixedOrderComparator6.isLocked();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b30 = defaultedMap29.isEmpty();
        java.util.Collection collection31 = defaultedMap29.values();
        java.lang.String str32 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) str32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) "hi!");
        boolean b38 = defaultedMap33.containsKey((java.lang.Object) b37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap33.get(obj39);
        boolean b41 = fixedOrderComparator6.add((java.lang.Object) defaultedMap33);
        int i42 = fixedOrderComparator6.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "{}" + "'", obj40.equals("{}"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        boolean b23 = defaultedMap13.equals((java.lang.Object) 10L);
        java.util.Set set24 = defaultedMap13.keySet();
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b14 = fixedOrderComparator6.add((java.lang.Object) ' ');
        int i15 = fixedOrderComparator6.getUnknownObjectBehavior();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator22.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        boolean b26 = fixedOrderComparator22.add((java.lang.Object) fixedOrderComparator25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set29 = defaultedMap28.keySet();
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        java.lang.Object obj31 = defaultedMap28.remove((java.lang.Object) predicateUtils30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str34 = defaultedMap33.toString();
        defaultedMap33.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap33.putAll((java.util.Map) defaultedMap37);
        defaultedMap28.putAll((java.util.Map) defaultedMap33);
        boolean b41 = defaultedMap33.containsKey((java.lang.Object) "");
        boolean b42 = fixedOrderComparator22.add((java.lang.Object) defaultedMap33);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        fixedOrderComparator49.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator();
        boolean b53 = fixedOrderComparator49.add((java.lang.Object) fixedOrderComparator52);
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        boolean b56 = fixedOrderComparator22.add((java.lang.Object) 0);
        java.lang.Object[] obj_array62 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        fixedOrderComparator63.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator();
        boolean b67 = fixedOrderComparator63.add((java.lang.Object) fixedOrderComparator66);
        fixedOrderComparator63.setUnknownObjectBehavior(0);
        boolean b71 = fixedOrderComparator63.add((java.lang.Object) ' ');
        boolean b72 = fixedOrderComparator6.addAsEqual((java.lang.Object) 0, (java.lang.Object) b71);
        boolean b73 = fixedOrderComparator6.isLocked();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str3 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b6 = defaultedMap5.isEmpty();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100.0d);
        boolean b9 = defaultedMap2.equals((java.lang.Object) map8);
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) b9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set5 = defaultedMap4.keySet();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) predicateUtils6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) predicateUtils11);
        boolean b13 = defaultedMap9.isEmpty();
        java.util.Set set14 = defaultedMap9.keySet();
        java.lang.Object obj15 = defaultedMap4.remove((java.lang.Object) defaultedMap9);
        int i16 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) predicateUtils20);
        java.lang.Object obj22 = defaultedMap9.remove((java.lang.Object) predicateUtils20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str25 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b28 = defaultedMap27.isEmpty();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        boolean b31 = defaultedMap24.equals((java.lang.Object) map30);
        java.lang.String str32 = defaultedMap24.toString();
        java.lang.Object obj33 = defaultedMap9.get((java.lang.Object) defaultedMap24);
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) predicateUtils38);
        boolean b40 = defaultedMap36.isEmpty();
        java.lang.Object obj42 = defaultedMap36.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection45 = defaultedMap44.values();
        java.lang.Object obj46 = defaultedMap36.remove((java.lang.Object) defaultedMap44);
        boolean b47 = defaultedMap1.containsValue((java.lang.Object) defaultedMap36);
        java.util.Set set48 = defaultedMap1.entrySet();
        java.util.Set set49 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1L + "'", obj33.equals(1L));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b15 = defaultedMap14.isEmpty();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b20 = defaultedMap19.isEmpty();
        java.util.Collection collection21 = defaultedMap19.values();
        java.lang.String str22 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) str22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) "hi!");
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) b27);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap23.get(obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str33 = defaultedMap32.toString();
        defaultedMap32.clear();
        int i35 = defaultedMap32.size();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) defaultedMap32);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set40 = defaultedMap39.keySet();
        collections.PredicateUtils predicateUtils41 = new collections.PredicateUtils();
        java.lang.Object obj42 = defaultedMap39.remove((java.lang.Object) predicateUtils41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set45 = defaultedMap44.keySet();
        collections.PredicateUtils predicateUtils46 = new collections.PredicateUtils();
        java.lang.Object obj47 = defaultedMap44.remove((java.lang.Object) predicateUtils46);
        boolean b48 = defaultedMap44.isEmpty();
        java.util.Set set49 = defaultedMap44.keySet();
        java.lang.Object obj50 = defaultedMap39.remove((java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str54 = defaultedMap53.toString();
        defaultedMap53.clear();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap53.putAll((java.util.Map) defaultedMap57);
        defaultedMap51.putAll((java.util.Map) defaultedMap57);
        boolean b61 = defaultedMap51.equals((java.lang.Object) 10L);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        fixedOrderComparator68.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator();
        boolean b72 = fixedOrderComparator68.add((java.lang.Object) fixedOrderComparator71);
        fixedOrderComparator68.setUnknownObjectBehavior(0);
        boolean b76 = fixedOrderComparator68.add((java.lang.Object) ' ');
        int i77 = fixedOrderComparator68.getUnknownObjectBehavior();
        java.lang.Object obj78 = defaultedMap51.get((java.lang.Object) fixedOrderComparator68);
        java.lang.Object obj79 = defaultedMap14.remove(obj78);
        java.lang.Object[] obj_array81 = new java.lang.Object[] { obj12, obj79, 100.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array81);
        int i83 = fixedOrderComparator82.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "{}" + "'", obj30.equals("{}"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(obj_array81);
        org.junit.Assert.assertTrue(i83 == 2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) predicateUtils10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        defaultedMap21.clear();
        java.util.Set set23 = defaultedMap21.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10L);
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set5 = defaultedMap4.keySet();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap4.remove((java.lang.Object) predicateUtils6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        java.lang.Object obj12 = defaultedMap9.remove((java.lang.Object) predicateUtils11);
        boolean b13 = defaultedMap9.isEmpty();
        java.util.Set set14 = defaultedMap9.keySet();
        java.lang.Object obj15 = defaultedMap4.remove((java.lang.Object) defaultedMap9);
        int i16 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj21 = defaultedMap18.remove((java.lang.Object) predicateUtils20);
        java.lang.Object obj22 = defaultedMap9.remove((java.lang.Object) predicateUtils20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str25 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b28 = defaultedMap27.isEmpty();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        boolean b31 = defaultedMap24.equals((java.lang.Object) map30);
        java.lang.String str32 = defaultedMap24.toString();
        java.lang.Object obj33 = defaultedMap9.get((java.lang.Object) defaultedMap24);
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) predicateUtils38);
        boolean b40 = defaultedMap36.isEmpty();
        java.lang.Object obj42 = defaultedMap36.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection45 = defaultedMap44.values();
        java.lang.Object obj46 = defaultedMap36.remove((java.lang.Object) defaultedMap44);
        boolean b47 = defaultedMap1.containsValue((java.lang.Object) defaultedMap36);
        java.util.Set set48 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1L + "'", obj33.equals(1L));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) predicateUtils10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b25 = defaultedMap24.isEmpty();
        java.util.Collection collection26 = defaultedMap24.values();
        java.lang.String str27 = defaultedMap24.toString();
        int i28 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        java.lang.Object obj33 = defaultedMap30.remove((java.lang.Object) predicateUtils32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set36 = defaultedMap35.keySet();
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        java.lang.Object obj38 = defaultedMap35.remove((java.lang.Object) predicateUtils37);
        boolean b39 = defaultedMap35.isEmpty();
        java.util.Set set40 = defaultedMap35.keySet();
        java.lang.Object obj41 = defaultedMap30.remove((java.lang.Object) defaultedMap35);
        int i42 = defaultedMap35.size();
        boolean b43 = defaultedMap24.equals((java.lang.Object) defaultedMap35);
        java.lang.Object obj45 = defaultedMap24.get((java.lang.Object) (byte) 0);
        boolean b46 = defaultedMap21.containsValue(obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str49 = defaultedMap48.toString();
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap48.putAll((java.util.Map) defaultedMap52);
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array59);
        java.lang.Object obj62 = defaultedMap48.remove((java.lang.Object) fixedOrderComparator61);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        boolean b64 = fixedOrderComparator61.add((java.lang.Object) predicate63);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) b64);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1L + "'", obj45.equals(1L));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) predicateUtils13);
        boolean b15 = defaultedMap11.isEmpty();
        java.util.Set set16 = defaultedMap11.keySet();
        java.lang.Object obj17 = defaultedMap6.remove((java.lang.Object) defaultedMap11);
        int i18 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 100.0d);
        boolean b27 = defaultedMap20.equals((java.lang.Object) map26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b30 = defaultedMap29.isEmpty();
        java.util.Collection collection31 = defaultedMap29.values();
        boolean b32 = defaultedMap20.containsKey((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap11.put((java.lang.Object) defaultedMap29, obj33);
        java.lang.Object obj35 = defaultedMap1.remove((java.lang.Object) defaultedMap29);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        boolean b11 = fixedOrderComparator9.isLocked();
        java.lang.Object obj12 = null;
        boolean b13 = fixedOrderComparator9.add(obj12);
        try {
            fixedOrderComparator9.setUnknownObjectBehavior((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator13);
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator10.add((java.lang.Object) ' ');
        int i19 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) fixedOrderComparator10);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set26 = defaultedMap25.keySet();
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) predicateUtils27);
        boolean b29 = defaultedMap25.isEmpty();
        java.util.Set set30 = defaultedMap25.keySet();
        boolean b31 = defaultedMap23.containsKey((java.lang.Object) set30);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) str4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) "hi!");
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) b9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b13 = defaultedMap12.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Collection collection19 = defaultedMap17.values();
        java.lang.String str20 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) str20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) "hi!");
        boolean b26 = defaultedMap21.containsKey((java.lang.Object) b25);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap21.get(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        int i33 = defaultedMap30.size();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap30);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap30);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { b9, defaultedMap30 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        fixedOrderComparator38.setUnknownObjectBehavior(0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "{}" + "'", obj28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(obj_array36);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj12 = null;
        int i13 = fixedOrderComparator6.compare((java.lang.Object) (short) 0, obj12);
        boolean b14 = fixedOrderComparator6.isLocked();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        java.lang.String str9 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1L + "'", obj8.equals(1L));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) str4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) "hi!");
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) b9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap5.get(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str15 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 100.0d);
        boolean b21 = defaultedMap14.equals((java.lang.Object) map20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b24 = defaultedMap23.isEmpty();
        java.util.Collection collection25 = defaultedMap23.values();
        boolean b26 = defaultedMap14.containsKey((java.lang.Object) defaultedMap23);
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b30 = defaultedMap29.isEmpty();
        java.util.Collection collection31 = defaultedMap29.values();
        java.lang.String str32 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) str32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) "hi!");
        boolean b38 = defaultedMap33.containsKey((java.lang.Object) b37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap33.get(obj39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str43 = defaultedMap42.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b46 = defaultedMap45.isEmpty();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) 100.0d);
        boolean b49 = defaultedMap42.equals((java.lang.Object) map48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b52 = defaultedMap51.isEmpty();
        java.util.Collection collection53 = defaultedMap51.values();
        boolean b54 = defaultedMap42.containsKey((java.lang.Object) defaultedMap51);
        defaultedMap33.putAll((java.util.Map) defaultedMap42);
        java.lang.Object obj56 = defaultedMap14.remove((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "{}" + "'", obj12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "{}" + "'", obj40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array5);
        org.junit.Assert.assertNotNull(obj_array5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        int i5 = defaultedMap1.size();
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        boolean b15 = defaultedMap8.equals((java.lang.Object) map14);
        java.lang.String str16 = defaultedMap8.toString();
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) "hi!");
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) 1.0d, (java.lang.Object) defaultedMap23);
        java.util.Set set27 = defaultedMap23.entrySet();
        java.util.Set set28 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str32 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b35 = defaultedMap34.isEmpty();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100.0d);
        boolean b38 = defaultedMap31.equals((java.lang.Object) map37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b41 = defaultedMap40.isEmpty();
        java.util.Collection collection42 = defaultedMap40.values();
        boolean b43 = defaultedMap31.containsKey((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b46 = defaultedMap45.isEmpty();
        java.util.Collection collection47 = defaultedMap45.values();
        java.lang.String str48 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) str48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) "hi!");
        boolean b54 = defaultedMap49.containsKey((java.lang.Object) b53);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap49.get(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str59 = defaultedMap58.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b62 = defaultedMap61.isEmpty();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) 100.0d);
        boolean b65 = defaultedMap58.equals((java.lang.Object) map64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b68 = defaultedMap67.isEmpty();
        java.util.Collection collection69 = defaultedMap67.values();
        boolean b70 = defaultedMap58.containsKey((java.lang.Object) defaultedMap67);
        defaultedMap49.putAll((java.util.Map) defaultedMap58);
        java.lang.Object obj72 = defaultedMap23.put((java.lang.Object) defaultedMap31, (java.lang.Object) defaultedMap49);
        int i73 = defaultedMap49.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "{}" + "'", obj56.equals("{}"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(i73 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        int i13 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b19 = defaultedMap18.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 100.0d);
        boolean b22 = defaultedMap15.equals((java.lang.Object) map21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b25 = defaultedMap24.isEmpty();
        java.util.Collection collection26 = defaultedMap24.values();
        boolean b27 = defaultedMap15.containsKey((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap6.put((java.lang.Object) defaultedMap24, obj28);
        java.util.Set set30 = defaultedMap24.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        int i9 = fixedOrderComparator8.getUnknownObjectBehavior();
        try {
            fixedOrderComparator8.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(i9 == 2);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) map7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b11 = defaultedMap10.isEmpty();
        java.util.Collection collection12 = defaultedMap10.values();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set17 = defaultedMap16.entrySet();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        fixedOrderComparator24.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0f, defaultedMap16, fixedOrderComparator24, 100.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj31 = defaultedMap10.remove((java.lang.Object) fixedOrderComparator30);
        int i32 = fixedOrderComparator30.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        boolean b14 = fixedOrderComparator6.add((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator6);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Collection collection19 = defaultedMap17.values();
        java.lang.String str20 = defaultedMap17.toString();
        int i21 = defaultedMap17.size();
        boolean b22 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str25 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b28 = defaultedMap27.isEmpty();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100.0d);
        boolean b31 = defaultedMap24.equals((java.lang.Object) map30);
        java.lang.String str32 = defaultedMap24.toString();
        boolean b33 = defaultedMap17.containsValue((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) "hi!");
        java.lang.Object obj42 = defaultedMap17.put((java.lang.Object) 1.0d, (java.lang.Object) defaultedMap39);
        java.util.Set set43 = defaultedMap39.entrySet();
        java.util.Set set44 = defaultedMap39.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        java.util.Set set46 = defaultedMap45.keySet();
        java.util.Set set47 = defaultedMap45.entrySet();
        java.lang.Object obj48 = defaultedMap15.remove((java.lang.Object) set47);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) map7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b11 = defaultedMap10.isEmpty();
        java.util.Collection collection12 = defaultedMap10.values();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        boolean b14 = defaultedMap10.isEmpty();
        defaultedMap10.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str7 = defaultedMap6.toString();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        boolean b14 = defaultedMap6.containsKey((java.lang.Object) "");
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b18 = defaultedMap17.isEmpty();
        java.util.Collection collection19 = defaultedMap17.values();
        java.lang.String str20 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) str20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) "hi!");
        boolean b26 = defaultedMap21.containsKey((java.lang.Object) b25);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap21.get(obj27);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap6.put(obj28, obj29);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator37.add((java.lang.Object) fixedOrderComparator40);
        fixedOrderComparator37.setUnknownObjectBehavior(0);
        boolean b45 = fixedOrderComparator37.add((java.lang.Object) ' ');
        int i46 = fixedOrderComparator37.getUnknownObjectBehavior();
        boolean b47 = defaultedMap6.containsValue((java.lang.Object) i46);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "{}" + "'", obj28.equals("{}"));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b5 = defaultedMap4.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) map7);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator15);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) '#');
        java.lang.String str20 = defaultedMap1.toString();
        java.lang.Object obj21 = null;
        boolean b22 = defaultedMap1.containsValue(obj21);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{-1=#}" + "'", str20.equals("{-1=#}"));
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.util.Set set3 = defaultedMap2.entrySet();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 10.0f, defaultedMap2, fixedOrderComparator10, 100.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b18 = fixedOrderComparator17.isLocked();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        int i13 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b19 = defaultedMap18.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 100.0d);
        boolean b22 = defaultedMap15.equals((java.lang.Object) map21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b25 = defaultedMap24.isEmpty();
        java.util.Collection collection26 = defaultedMap24.values();
        boolean b27 = defaultedMap15.containsKey((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap6.put((java.lang.Object) defaultedMap24, obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) predicateUtils33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap36.remove((java.lang.Object) predicateUtils38);
        boolean b40 = defaultedMap36.isEmpty();
        java.util.Set set41 = defaultedMap36.keySet();
        java.lang.Object obj42 = defaultedMap31.remove((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b46 = defaultedMap45.isEmpty();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b51 = defaultedMap50.isEmpty();
        java.util.Collection collection52 = defaultedMap50.values();
        java.lang.String str53 = defaultedMap50.toString();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) str53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) "hi!");
        boolean b59 = defaultedMap54.containsKey((java.lang.Object) b58);
        java.lang.Object obj60 = null;
        java.lang.Object obj61 = defaultedMap54.get(obj60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str64 = defaultedMap63.toString();
        defaultedMap63.clear();
        int i66 = defaultedMap63.size();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) defaultedMap63);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) defaultedMap63);
        defaultedMap43.putAll(map68);
        boolean b70 = defaultedMap24.containsKey((java.lang.Object) map68);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + "{}" + "'", obj61.equals("{}"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        int i5 = defaultedMap1.size();
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b12 = defaultedMap11.isEmpty();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 100.0d);
        boolean b15 = defaultedMap8.equals((java.lang.Object) map14);
        java.lang.String str16 = defaultedMap8.toString();
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        java.util.Collection collection18 = defaultedMap1.values();
        java.util.Set set19 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Set set6 = defaultedMap1.keySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) predicate8);
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str13 = defaultedMap12.toString();
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set20 = defaultedMap19.keySet();
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        java.lang.Object obj22 = defaultedMap19.remove((java.lang.Object) predicateUtils21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str25 = defaultedMap24.toString();
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        defaultedMap19.putAll((java.util.Map) defaultedMap24);
        defaultedMap12.putAll((java.util.Map) defaultedMap19);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate32, predicate37);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str45 = defaultedMap44.toString();
        defaultedMap44.clear();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap44.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set52 = defaultedMap51.keySet();
        collections.PredicateUtils predicateUtils53 = new collections.PredicateUtils();
        java.lang.Object obj54 = defaultedMap51.remove((java.lang.Object) predicateUtils53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str57 = defaultedMap56.toString();
        defaultedMap56.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap56.putAll((java.util.Map) defaultedMap60);
        defaultedMap51.putAll((java.util.Map) defaultedMap56);
        defaultedMap44.putAll((java.util.Map) defaultedMap51);
        defaultedMap42.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str67 = defaultedMap66.toString();
        defaultedMap66.clear();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap66.putAll((java.util.Map) defaultedMap70);
        java.lang.Object[] obj_array77 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array77);
        java.lang.Object obj80 = defaultedMap66.remove((java.lang.Object) fixedOrderComparator79);
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        boolean b82 = fixedOrderComparator79.add((java.lang.Object) predicate81);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate81, predicate83);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate37, predicate81);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set88 = defaultedMap87.keySet();
        collections.PredicateUtils predicateUtils89 = new collections.PredicateUtils();
        java.lang.Object obj90 = defaultedMap87.remove((java.lang.Object) predicateUtils89);
        java.lang.String str91 = defaultedMap87.toString();
        java.lang.Object obj92 = defaultedMap1.get((java.lang.Object) str91);
        java.util.Collection collection93 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array77);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "{}" + "'", str91.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + 1L + "'", obj92.equals(1L));
        org.junit.Assert.assertNotNull(collection93);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str4 = defaultedMap3.toString();
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) predicateUtils12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap10.putAll((java.util.Map) defaultedMap15);
        defaultedMap3.putAll((java.util.Map) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.util.Set set24 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Collection collection6 = defaultedMap1.values();
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap6.isEmpty();
        java.util.Set set11 = defaultedMap6.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        java.util.Set set22 = defaultedMap19.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap12.remove((java.lang.Object) predicateUtils14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str18 = defaultedMap17.toString();
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap17);
        boolean b25 = defaultedMap17.containsKey((java.lang.Object) "");
        boolean b26 = fixedOrderComparator6.add((java.lang.Object) defaultedMap17);
        boolean b27 = fixedOrderComparator6.isLocked();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b30 = defaultedMap29.isEmpty();
        java.util.Collection collection31 = defaultedMap29.values();
        java.lang.String str32 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) str32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) "hi!");
        boolean b38 = defaultedMap33.containsKey((java.lang.Object) b37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap33.get(obj39);
        boolean b41 = fixedOrderComparator6.add((java.lang.Object) defaultedMap33);
        java.util.Set set42 = defaultedMap33.keySet();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "{}" + "'", obj40.equals("{}"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str9 = defaultedMap8.toString();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap8.putAll((java.util.Map) defaultedMap12);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj22 = defaultedMap8.remove((java.lang.Object) fixedOrderComparator21);
        java.lang.Object obj23 = defaultedMap5.get(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set26 = defaultedMap25.keySet();
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) predicateUtils27);
        boolean b29 = defaultedMap25.isEmpty();
        java.util.Set set30 = defaultedMap25.keySet();
        java.lang.String str31 = defaultedMap25.toString();
        java.util.Collection collection32 = defaultedMap25.values();
        defaultedMap5.putAll((java.util.Map) defaultedMap25);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1L + "'", obj23.equals(1L));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator();
        boolean b14 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator13);
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator10.add((java.lang.Object) ' ');
        int i19 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) fixedOrderComparator10);
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str26 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b29 = defaultedMap28.isEmpty();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 100.0d);
        boolean b32 = defaultedMap25.equals((java.lang.Object) map31);
        defaultedMap25.clear();
        boolean b34 = defaultedMap23.containsValue((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        java.lang.Object obj11 = defaultedMap8.remove((java.lang.Object) predicateUtils10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj16 = defaultedMap13.remove((java.lang.Object) predicateUtils15);
        boolean b17 = defaultedMap13.isEmpty();
        java.util.Set set18 = defaultedMap13.keySet();
        java.lang.Object obj19 = defaultedMap8.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str23 = defaultedMap22.toString();
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        boolean b30 = defaultedMap20.equals((java.lang.Object) 10L);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        fixedOrderComparator37.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator37.add((java.lang.Object) fixedOrderComparator40);
        fixedOrderComparator37.setUnknownObjectBehavior(0);
        boolean b45 = fixedOrderComparator37.add((java.lang.Object) ' ');
        int i46 = fixedOrderComparator37.getUnknownObjectBehavior();
        java.lang.Object obj47 = defaultedMap20.get((java.lang.Object) fixedOrderComparator37);
        boolean b48 = defaultedMap1.containsKey((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b51 = defaultedMap50.isEmpty();
        java.util.Collection collection52 = defaultedMap50.values();
        java.lang.String str53 = defaultedMap50.toString();
        int i54 = defaultedMap50.size();
        boolean b55 = defaultedMap50.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str58 = defaultedMap57.toString();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b61 = defaultedMap60.isEmpty();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) 100.0d);
        boolean b64 = defaultedMap57.equals((java.lang.Object) map63);
        java.lang.String str65 = defaultedMap57.toString();
        boolean b66 = defaultedMap50.containsValue((java.lang.Object) defaultedMap57);
        java.util.Collection collection67 = defaultedMap50.values();
        boolean b68 = defaultedMap1.equals((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue(b68 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set7 = defaultedMap5.entrySet();
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) "hi!");
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        fixedOrderComparator17.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        boolean b21 = fixedOrderComparator17.add((java.lang.Object) fixedOrderComparator20);
        boolean b22 = fixedOrderComparator20.isLocked();
        boolean b23 = defaultedMap8.containsKey((java.lang.Object) b22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set33 = defaultedMap32.keySet();
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        java.lang.Object obj35 = defaultedMap32.remove((java.lang.Object) predicateUtils34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str38 = defaultedMap37.toString();
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap37.putAll((java.util.Map) defaultedMap41);
        defaultedMap32.putAll((java.util.Map) defaultedMap37);
        defaultedMap25.putAll((java.util.Map) defaultedMap32);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) "hi!");
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate45, predicate50);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set56 = defaultedMap55.keySet();
        collections.PredicateUtils predicateUtils57 = new collections.PredicateUtils();
        java.lang.Object obj58 = defaultedMap55.remove((java.lang.Object) predicateUtils57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set61 = defaultedMap60.keySet();
        collections.PredicateUtils predicateUtils62 = new collections.PredicateUtils();
        java.lang.Object obj63 = defaultedMap60.remove((java.lang.Object) predicateUtils62);
        boolean b64 = defaultedMap60.isEmpty();
        java.util.Set set65 = defaultedMap60.keySet();
        java.lang.Object obj66 = defaultedMap55.remove((java.lang.Object) defaultedMap60);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap55);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.String str70 = defaultedMap69.toString();
        defaultedMap69.clear();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap69.putAll((java.util.Map) defaultedMap73);
        defaultedMap67.putAll((java.util.Map) defaultedMap73);
        boolean b77 = defaultedMap67.equals((java.lang.Object) 10L);
        java.lang.Object[] obj_array83 = new java.lang.Object[] { 0.0d, 0L, 0, (byte) 10, (short) 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array83);
        fixedOrderComparator84.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator();
        boolean b88 = fixedOrderComparator84.add((java.lang.Object) fixedOrderComparator87);
        fixedOrderComparator84.setUnknownObjectBehavior(0);
        boolean b92 = fixedOrderComparator84.add((java.lang.Object) ' ');
        int i93 = fixedOrderComparator84.getUnknownObjectBehavior();
        java.lang.Object obj94 = defaultedMap67.get((java.lang.Object) fixedOrderComparator84);
        java.lang.Object obj95 = defaultedMap8.put((java.lang.Object) predicate45, (java.lang.Object) fixedOrderComparator84);
        java.lang.Object obj96 = defaultedMap1.get(obj95);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(obj_array83);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(i93 == 0);
        org.junit.Assert.assertNotNull(obj94);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + 1L + "'", obj96.equals(1L));
    }
}

