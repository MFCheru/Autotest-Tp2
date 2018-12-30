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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) true);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0);
        int i6 = defaultedMap1.size();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) -1 + "'", obj5.equals((byte) -1));
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) true);
        defaultedMap1.clear();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) true);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) true);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) -1 + "'", obj5.equals((byte) -1));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i13 = defaultedMap12.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap10.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i22 = defaultedMap21.size();
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) true);
        boolean b27 = defaultedMap21.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate28, predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i35 = defaultedMap34.size();
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        defaultedMap32.clear();
        java.lang.String str38 = defaultedMap32.toString();
        java.lang.Object obj39 = defaultedMap10.put((java.lang.Object) predicate29, (java.lang.Object) str38);
        boolean b40 = defaultedMap3.equals((java.lang.Object) defaultedMap10);
        boolean b41 = defaultedMap1.containsKey((java.lang.Object) b40);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 100);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) true);
        boolean b9 = defaultedMap3.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate10, predicate11);
        defaultedMap3.clear();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) true);
        boolean b9 = defaultedMap3.equals((java.lang.Object) (short) 0);
        java.util.Set set10 = defaultedMap3.entrySet();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b3 = fixedOrderComparator1.isLocked();
        try {
            fixedOrderComparator1.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b3 = fixedOrderComparator2.isLocked();
        try {
            fixedOrderComparator2.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b6 = defaultedMap4.containsValue((java.lang.Object) true);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 0);
        int i9 = defaultedMap4.size();
        boolean b10 = fixedOrderComparator1.add((java.lang.Object) defaultedMap4);
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i54 = defaultedMap53.size();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap51.isEmpty();
        int i57 = defaultedMap51.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) true);
        java.lang.Object obj63 = defaultedMap51.put((java.lang.Object) defaultedMap59, (java.lang.Object) 10.0f);
        java.util.Set set64 = defaultedMap51.keySet();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b69 = defaultedMap67.containsValue((java.lang.Object) true);
        java.lang.Object obj71 = defaultedMap67.get((java.lang.Object) 0);
        int i72 = defaultedMap67.size();
        boolean b73 = defaultedMap51.containsValue((java.lang.Object) i72);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (byte) -1 + "'", obj71.equals((byte) -1));
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) true);
        boolean b11 = defaultedMap5.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i19 = defaultedMap18.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) true);
        boolean b24 = defaultedMap18.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate26);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i35 = defaultedMap34.size();
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        boolean b37 = defaultedMap32.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i42 = defaultedMap41.size();
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        defaultedMap39.clear();
        java.lang.Object obj46 = defaultedMap39.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i51 = defaultedMap50.size();
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        boolean b54 = defaultedMap50.containsValue((java.lang.Object) true);
        boolean b56 = defaultedMap50.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i64 = defaultedMap63.size();
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        defaultedMap61.clear();
        java.lang.String str67 = defaultedMap61.toString();
        java.lang.Object obj68 = defaultedMap39.put((java.lang.Object) predicate58, (java.lang.Object) str67);
        boolean b69 = defaultedMap32.equals((java.lang.Object) defaultedMap39);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap39);
        defaultedMap39.clear();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i13 = defaultedMap12.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) true);
        boolean b18 = defaultedMap12.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i26 = defaultedMap25.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        defaultedMap23.clear();
        java.lang.String str29 = defaultedMap23.toString();
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) predicate20, (java.lang.Object) str29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate32);
        collections.Transformer transformer34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate(map33, transformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i8 = defaultedMap7.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) true);
        boolean b13 = defaultedMap7.equals((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i18 = defaultedMap17.size();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) true);
        boolean b23 = defaultedMap17.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate24, predicate25);
        boolean b27 = defaultedMap7.equals((java.lang.Object) map26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj29 = defaultedMap7.get((java.lang.Object) predicate28);
        try {
            boolean b30 = fixedOrderComparator2.addAsEqual((java.lang.Object) (-1), obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) -1 + "'", obj29.equals((byte) -1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i4 = defaultedMap1.size();
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) true);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) 0);
        int i15 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        try {
            boolean b17 = fixedOrderComparator6.addAsEqual((java.lang.Object) "", (java.lang.Object) defaultedMap10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (byte) -1 + "'", obj14.equals((byte) -1));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i2 = fixedOrderComparator1.getUnknownObjectBehavior();
        int i3 = fixedOrderComparator1.getUnknownObjectBehavior();
        boolean b4 = fixedOrderComparator1.isLocked();
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        defaultedMap7.clear();
        java.lang.Object obj14 = defaultedMap7.remove((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap7.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set15);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i17 = defaultedMap16.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap14.clear();
        java.lang.Object obj21 = defaultedMap14.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i26 = defaultedMap25.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b29 = defaultedMap25.containsValue((java.lang.Object) true);
        boolean b31 = defaultedMap25.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i39 = defaultedMap38.size();
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        defaultedMap36.clear();
        java.lang.String str42 = defaultedMap36.toString();
        java.lang.Object obj43 = defaultedMap14.put((java.lang.Object) predicate33, (java.lang.Object) str42);
        boolean b44 = defaultedMap7.equals((java.lang.Object) defaultedMap14);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) b44);
        collections.Factory factory46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate(map45, factory46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        collections.Factory factory50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, factory50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i17 = defaultedMap16.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap14.clear();
        java.lang.Object obj21 = defaultedMap14.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i26 = defaultedMap25.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b29 = defaultedMap25.containsValue((java.lang.Object) true);
        boolean b31 = defaultedMap25.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i39 = defaultedMap38.size();
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        defaultedMap36.clear();
        java.lang.String str42 = defaultedMap36.toString();
        java.lang.Object obj43 = defaultedMap14.put((java.lang.Object) predicate33, (java.lang.Object) str42);
        boolean b44 = defaultedMap7.equals((java.lang.Object) defaultedMap14);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) b44);
        java.util.Set set46 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        boolean b11 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) -1 + "'", obj10.equals((byte) -1));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) true);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) 10.0f);
        java.util.Set set14 = defaultedMap1.keySet();
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) true);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) -1 + "'", obj5.equals((byte) -1));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) true);
        boolean b11 = defaultedMap5.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i19 = defaultedMap18.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) true);
        boolean b24 = defaultedMap18.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate26);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i35 = defaultedMap34.size();
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        boolean b37 = defaultedMap32.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i42 = defaultedMap41.size();
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        defaultedMap39.clear();
        java.lang.Object obj46 = defaultedMap39.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i51 = defaultedMap50.size();
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        boolean b54 = defaultedMap50.containsValue((java.lang.Object) true);
        boolean b56 = defaultedMap50.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i64 = defaultedMap63.size();
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        defaultedMap61.clear();
        java.lang.String str67 = defaultedMap61.toString();
        java.lang.Object obj68 = defaultedMap39.put((java.lang.Object) predicate58, (java.lang.Object) str67);
        boolean b69 = defaultedMap32.equals((java.lang.Object) defaultedMap39);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap39);
        java.util.Set set71 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(set71);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b4 = fixedOrderComparator3.isLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        defaultedMap7.clear();
        java.lang.String str13 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i18 = defaultedMap17.size();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) true);
        boolean b22 = defaultedMap7.containsValue((java.lang.Object) true);
        java.util.Set set23 = defaultedMap7.entrySet();
        int i24 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) true);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) 0);
        int i31 = defaultedMap26.size();
        java.lang.String str32 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i43 = defaultedMap42.size();
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        defaultedMap40.clear();
        java.lang.Object obj47 = defaultedMap40.remove((java.lang.Object) 100L);
        java.util.Set set48 = defaultedMap40.entrySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) set48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (short) 1);
        boolean b54 = defaultedMap34.equals((java.lang.Object) defaultedMap51);
        java.lang.Object obj55 = defaultedMap7.put((java.lang.Object) defaultedMap26, (java.lang.Object) b54);
        boolean b56 = defaultedMap1.containsValue((java.lang.Object) b54);
        int i57 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (byte) -1 + "'", obj30.equals((byte) -1));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(i57 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        java.lang.Object[] obj_array50 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array50);
        int i53 = fixedOrderComparator52.getUnknownObjectBehavior();
        boolean b54 = defaultedMap1.equals((java.lang.Object) i53);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i4 = defaultedMap1.size();
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b7 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator6);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        defaultedMap7.clear();
        java.lang.Object obj14 = defaultedMap7.remove((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap7.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set15);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        defaultedMap9.clear();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap9.entrySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i24 = defaultedMap23.size();
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        defaultedMap21.clear();
        java.lang.String str27 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i32 = defaultedMap31.size();
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b35 = defaultedMap31.containsValue((java.lang.Object) true);
        boolean b36 = defaultedMap21.containsValue((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i41 = defaultedMap40.size();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        defaultedMap38.clear();
        java.lang.Object obj45 = defaultedMap38.remove((java.lang.Object) 100L);
        java.util.Set set46 = defaultedMap38.entrySet();
        java.lang.Object obj48 = defaultedMap21.put((java.lang.Object) set46, (java.lang.Object) (short) -1);
        java.lang.Object obj49 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i54 = defaultedMap53.size();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        defaultedMap51.clear();
        java.lang.Object obj58 = defaultedMap51.remove((java.lang.Object) 100L);
        java.util.Set set59 = defaultedMap51.entrySet();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i64 = defaultedMap63.size();
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        boolean b67 = defaultedMap63.containsValue((java.lang.Object) true);
        boolean b69 = defaultedMap63.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate70, predicate71);
        boolean b73 = defaultedMap51.containsKey((java.lang.Object) predicate71);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i78 = defaultedMap77.size();
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        boolean b80 = defaultedMap75.isEmpty();
        int i81 = defaultedMap75.size();
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i87 = defaultedMap86.size();
        defaultedMap84.putAll((java.util.Map) defaultedMap86);
        boolean b90 = defaultedMap86.containsValue((java.lang.Object) true);
        boolean b92 = defaultedMap86.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate93 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap86, predicate93, predicate94);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate82, predicate94);
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate71, predicate82);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (byte) -1 + "'", obj49.equals((byte) -1));
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertTrue(i87 == 0);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i16 = defaultedMap15.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        defaultedMap13.clear();
        java.lang.Object obj20 = defaultedMap13.remove((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap13.entrySet();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (short) 1);
        boolean b27 = defaultedMap7.equals((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i32 = defaultedMap31.size();
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        defaultedMap29.clear();
        java.lang.Object obj36 = defaultedMap29.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i41 = defaultedMap40.size();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        boolean b44 = defaultedMap40.containsValue((java.lang.Object) true);
        boolean b46 = defaultedMap40.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate47, predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i54 = defaultedMap53.size();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        defaultedMap51.clear();
        java.lang.String str57 = defaultedMap51.toString();
        java.lang.Object obj58 = defaultedMap29.put((java.lang.Object) predicate48, (java.lang.Object) str57);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate59, predicate60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i66 = defaultedMap65.size();
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        boolean b68 = defaultedMap63.isEmpty();
        int i69 = defaultedMap63.size();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i75 = defaultedMap74.size();
        defaultedMap72.putAll((java.util.Map) defaultedMap74);
        boolean b78 = defaultedMap74.containsValue((java.lang.Object) true);
        boolean b80 = defaultedMap74.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate81, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate70, predicate82);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate59, predicate70);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj89 = defaultedMap87.remove((java.lang.Object) (short) 1);
        java.util.Set set90 = defaultedMap87.entrySet();
        java.util.Collection collection91 = defaultedMap87.values();
        java.lang.Object obj92 = defaultedMap1.put((java.lang.Object) map85, (java.lang.Object) collection91);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertNull(obj92);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b3 = fixedOrderComparator1.isLocked();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = fixedOrderComparator1.add(obj4);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) true);
        boolean b9 = defaultedMap3.equals((java.lang.Object) (short) 0);
        java.util.Set set10 = defaultedMap3.entrySet();
        java.util.Collection collection11 = defaultedMap3.values();
        java.util.Set set12 = defaultedMap3.keySet();
        java.util.Set set13 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b6 = defaultedMap4.containsValue((java.lang.Object) true);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 0);
        int i9 = defaultedMap4.size();
        boolean b10 = fixedOrderComparator1.add((java.lang.Object) defaultedMap4);
        defaultedMap4.clear();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        java.util.Set set8 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i8 = defaultedMap7.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) true);
        boolean b13 = defaultedMap7.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap3.remove((java.lang.Object) predicate15);
        int i18 = defaultedMap3.size();
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) true);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) true);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 0);
        int i17 = defaultedMap12.size();
        boolean b18 = fixedOrderComparator9.add((java.lang.Object) defaultedMap12);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) true);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) 0);
        int i26 = defaultedMap21.size();
        java.lang.String str27 = defaultedMap21.toString();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap21.containsKey(obj28);
        int i30 = defaultedMap21.size();
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) i30);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) -1 + "'", obj5.equals((byte) -1));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) -1 + "'", obj16.equals((byte) -1));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) -1 + "'", obj19.equals((byte) -1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte) -1 + "'", obj25.equals((byte) -1));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) -1 + "'", obj31.equals((byte) -1));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (byte) 0);
        fixedOrderComparator2.setUnknownObjectBehavior(2);
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        defaultedMap9.clear();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap9.entrySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) true);
        boolean b15 = defaultedMap9.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i23 = defaultedMap22.size();
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) true);
        boolean b28 = defaultedMap22.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate16, predicate30);
        java.lang.Object[] obj_array33 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        int i36 = fixedOrderComparator34.getUnknownObjectBehavior();
        boolean b37 = fixedOrderComparator34.isLocked();
        try {
            boolean b38 = fixedOrderComparator3.addAsEqual((java.lang.Object) map32, (java.lang.Object) fixedOrderComparator34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) predicate10);
        java.util.Set set12 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i15 = defaultedMap14.size();
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) true);
        boolean b20 = defaultedMap14.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate21, predicate22);
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) predicate22);
        java.lang.String str25 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) -1 + "'", obj10.equals((byte) -1));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i13 = defaultedMap12.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) true);
        boolean b18 = defaultedMap12.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate19, predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate20);
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i14 = defaultedMap13.size();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap13.containsValue((java.lang.Object) true);
        boolean b19 = defaultedMap13.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate20, predicate21);
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) predicate21);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        defaultedMap7.clear();
        java.lang.Object obj14 = defaultedMap7.remove((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap7.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i21 = defaultedMap20.size();
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b23 = defaultedMap18.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i28 = defaultedMap27.size();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        defaultedMap25.clear();
        java.lang.Object obj32 = defaultedMap25.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        boolean b40 = defaultedMap36.containsValue((java.lang.Object) true);
        boolean b42 = defaultedMap36.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i50 = defaultedMap49.size();
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        defaultedMap47.clear();
        java.lang.String str53 = defaultedMap47.toString();
        java.lang.Object obj54 = defaultedMap25.put((java.lang.Object) predicate44, (java.lang.Object) str53);
        boolean b55 = defaultedMap18.equals((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i60 = defaultedMap59.size();
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        defaultedMap57.clear();
        java.lang.Object obj64 = defaultedMap57.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i69 = defaultedMap68.size();
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        boolean b72 = defaultedMap68.containsValue((java.lang.Object) true);
        boolean b74 = defaultedMap68.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate75, predicate76);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i82 = defaultedMap81.size();
        defaultedMap79.putAll((java.util.Map) defaultedMap81);
        defaultedMap79.clear();
        java.lang.String str85 = defaultedMap79.toString();
        java.lang.Object obj86 = defaultedMap57.put((java.lang.Object) predicate76, (java.lang.Object) str85);
        boolean b87 = defaultedMap18.containsKey((java.lang.Object) defaultedMap57);
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b87);
        java.util.Set set89 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{}" + "'", str85.equals("{}"));
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(set89);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        defaultedMap7.clear();
        java.lang.String str13 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i18 = defaultedMap17.size();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) true);
        boolean b22 = defaultedMap7.containsValue((java.lang.Object) true);
        java.util.Set set23 = defaultedMap7.entrySet();
        int i24 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) true);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) 0);
        int i31 = defaultedMap26.size();
        java.lang.String str32 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i43 = defaultedMap42.size();
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        defaultedMap40.clear();
        java.lang.Object obj47 = defaultedMap40.remove((java.lang.Object) 100L);
        java.util.Set set48 = defaultedMap40.entrySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) set48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (short) 1);
        boolean b54 = defaultedMap34.equals((java.lang.Object) defaultedMap51);
        java.lang.Object obj55 = defaultedMap7.put((java.lang.Object) defaultedMap26, (java.lang.Object) b54);
        boolean b56 = defaultedMap1.containsValue((java.lang.Object) b54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i61 = defaultedMap60.size();
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        defaultedMap58.clear();
        java.lang.String str64 = defaultedMap58.toString();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i69 = defaultedMap68.size();
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        boolean b72 = defaultedMap68.containsValue((java.lang.Object) true);
        boolean b73 = defaultedMap58.containsValue((java.lang.Object) true);
        java.util.Set set74 = defaultedMap58.entrySet();
        int i75 = defaultedMap58.size();
        java.util.Collection collection76 = defaultedMap58.values();
        java.lang.Object obj77 = defaultedMap1.get((java.lang.Object) collection76);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (byte) -1 + "'", obj30.equals((byte) -1));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (byte) -1 + "'", obj77.equals((byte) -1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        int i7 = fixedOrderComparator6.getUnknownObjectBehavior();
        int i8 = fixedOrderComparator6.getUnknownObjectBehavior();
        try {
            int i9 = fixedOrderComparator3.compare((java.lang.Object) 100L, (java.lang.Object) i8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        defaultedMap7.clear();
        java.lang.Object obj14 = defaultedMap7.remove((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap7.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (short) 1);
        boolean b21 = defaultedMap1.equals((java.lang.Object) defaultedMap18);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap24);
        int i27 = defaultedMap24.size();
        java.util.Set set28 = defaultedMap24.entrySet();
        java.lang.Object obj29 = defaultedMap18.put((java.lang.Object) predicateUtils22, (java.lang.Object) set28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i34 = defaultedMap33.size();
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b36 = defaultedMap31.isEmpty();
        int i37 = defaultedMap31.size();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i43 = defaultedMap42.size();
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        boolean b46 = defaultedMap42.containsValue((java.lang.Object) true);
        boolean b48 = defaultedMap42.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate50);
        boolean b53 = defaultedMap18.equals((java.lang.Object) predicate38);
        int i54 = defaultedMap18.size();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i54 = defaultedMap53.size();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b57 = defaultedMap53.containsValue((java.lang.Object) true);
        defaultedMap53.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap53);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) true);
        boolean b15 = defaultedMap9.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap5.remove((java.lang.Object) predicate17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i24 = defaultedMap23.size();
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        defaultedMap21.clear();
        java.lang.String str27 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i32 = defaultedMap31.size();
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b35 = defaultedMap31.containsValue((java.lang.Object) true);
        boolean b36 = defaultedMap21.containsValue((java.lang.Object) true);
        java.util.Set set37 = defaultedMap21.entrySet();
        int i38 = defaultedMap21.size();
        java.util.Collection collection39 = defaultedMap21.values();
        try {
            boolean b40 = fixedOrderComparator1.addAsEqual(obj19, (java.lang.Object) collection39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) obj_array0);
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) true);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) 10.0f);
        java.util.Set set14 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i19 = defaultedMap18.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b21 = defaultedMap16.isEmpty();
        int i22 = defaultedMap16.size();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i28 = defaultedMap27.size();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) true);
        boolean b33 = defaultedMap27.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate23, predicate35);
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) true);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) true);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 0);
        int i17 = defaultedMap12.size();
        boolean b18 = fixedOrderComparator9.add((java.lang.Object) defaultedMap12);
        boolean b19 = fixedOrderComparator7.add((java.lang.Object) b18);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b18);
        java.util.Set set21 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) -1 + "'", obj5.equals((byte) -1));
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) -1 + "'", obj16.equals((byte) -1));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) true);
        boolean b11 = defaultedMap5.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i19 = defaultedMap18.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) true);
        boolean b24 = defaultedMap18.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate26);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i35 = defaultedMap34.size();
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        boolean b37 = defaultedMap32.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i42 = defaultedMap41.size();
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        defaultedMap39.clear();
        java.lang.Object obj46 = defaultedMap39.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i51 = defaultedMap50.size();
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        boolean b54 = defaultedMap50.containsValue((java.lang.Object) true);
        boolean b56 = defaultedMap50.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i64 = defaultedMap63.size();
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        defaultedMap61.clear();
        java.lang.String str67 = defaultedMap61.toString();
        java.lang.Object obj68 = defaultedMap39.put((java.lang.Object) predicate58, (java.lang.Object) str67);
        boolean b69 = defaultedMap32.equals((java.lang.Object) defaultedMap39);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap39);
        java.lang.String str71 = defaultedMap39.toString();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) true);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0);
        int i6 = defaultedMap1.size();
        java.lang.String str7 = defaultedMap1.toString();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsKey(obj8);
        java.lang.String str10 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) -1 + "'", obj5.equals((byte) -1));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        int i9 = defaultedMap6.size();
        java.util.Set set10 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (short) 1);
        java.util.Set set15 = defaultedMap12.entrySet();
        java.util.Collection collection16 = defaultedMap12.values();
        try {
            int i17 = fixedOrderComparator4.compare((java.lang.Object) set10, (java.lang.Object) defaultedMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) true);
        boolean b9 = defaultedMap3.equals((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i14 = defaultedMap13.size();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i20 = defaultedMap19.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        defaultedMap17.clear();
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) 100L);
        java.util.Set set25 = defaultedMap17.entrySet();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) set25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (short) 1);
        boolean b31 = defaultedMap11.equals((java.lang.Object) defaultedMap28);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) (byte) 10);
        java.lang.Object obj34 = defaultedMap3.get((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte) -1 + "'", obj34.equals((byte) -1));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i19 = defaultedMap18.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        defaultedMap16.clear();
        java.lang.Object obj23 = defaultedMap16.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i28 = defaultedMap27.size();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) true);
        boolean b33 = defaultedMap27.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i41 = defaultedMap40.size();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        defaultedMap38.clear();
        java.lang.String str44 = defaultedMap38.toString();
        java.lang.Object obj45 = defaultedMap16.put((java.lang.Object) predicate35, (java.lang.Object) str44);
        boolean b46 = defaultedMap9.equals((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i51 = defaultedMap50.size();
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        defaultedMap48.clear();
        java.lang.Object obj55 = defaultedMap48.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i60 = defaultedMap59.size();
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        boolean b63 = defaultedMap59.containsValue((java.lang.Object) true);
        boolean b65 = defaultedMap59.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate66, predicate67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i73 = defaultedMap72.size();
        defaultedMap70.putAll((java.util.Map) defaultedMap72);
        defaultedMap70.clear();
        java.lang.String str76 = defaultedMap70.toString();
        java.lang.Object obj77 = defaultedMap48.put((java.lang.Object) predicate67, (java.lang.Object) str76);
        boolean b78 = defaultedMap9.containsKey((java.lang.Object) defaultedMap48);
        boolean b79 = defaultedMap1.containsKey((java.lang.Object) defaultedMap48);
        collections.Transformer transformer80 = null;
        try {
            java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i13 = defaultedMap12.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) true);
        boolean b18 = defaultedMap12.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate19, predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i27 = defaultedMap26.size();
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap24.isEmpty();
        int i30 = defaultedMap24.size();
        boolean b32 = defaultedMap24.containsKey((java.lang.Object) (byte) 1);
        java.util.Set set33 = defaultedMap24.keySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate(map22, (java.lang.Object) defaultedMap24);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i8 = defaultedMap7.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) true);
        boolean b13 = defaultedMap7.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap3.remove((java.lang.Object) predicate15);
        java.util.Map map18 = null;
        try {
            defaultedMap3.putAll(map18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) true);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) -1 + "'", obj5.equals((byte) -1));
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i11 = defaultedMap10.size();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap8.clear();
        java.lang.Object obj15 = defaultedMap8.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i20 = defaultedMap19.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b23 = defaultedMap19.containsValue((java.lang.Object) true);
        boolean b25 = defaultedMap19.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i33 = defaultedMap32.size();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        defaultedMap30.clear();
        java.lang.String str36 = defaultedMap30.toString();
        java.lang.Object obj37 = defaultedMap8.put((java.lang.Object) predicate27, (java.lang.Object) str36);
        boolean b38 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i43 = defaultedMap42.size();
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        defaultedMap40.clear();
        java.lang.Object obj47 = defaultedMap40.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i52 = defaultedMap51.size();
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        boolean b55 = defaultedMap51.containsValue((java.lang.Object) true);
        boolean b57 = defaultedMap51.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i65 = defaultedMap64.size();
        defaultedMap62.putAll((java.util.Map) defaultedMap64);
        defaultedMap62.clear();
        java.lang.String str68 = defaultedMap62.toString();
        java.lang.Object obj69 = defaultedMap40.put((java.lang.Object) predicate59, (java.lang.Object) str68);
        boolean b70 = defaultedMap1.containsKey((java.lang.Object) defaultedMap40);
        boolean b71 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i76 = defaultedMap75.size();
        defaultedMap73.putAll((java.util.Map) defaultedMap75);
        boolean b78 = defaultedMap73.isEmpty();
        int i79 = defaultedMap73.size();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i85 = defaultedMap84.size();
        defaultedMap82.putAll((java.util.Map) defaultedMap84);
        boolean b88 = defaultedMap84.containsValue((java.lang.Object) true);
        boolean b90 = defaultedMap84.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate91 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate92 = collections.PredicateUtils.truePredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate91, predicate92);
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate80, predicate92);
        boolean b95 = defaultedMap40.containsValue((java.lang.Object) defaultedMap73);
        java.util.Collection collection96 = defaultedMap40.values();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertTrue(i85 == 0);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertNotNull(collection96);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap3.clear();
        java.lang.Object obj10 = defaultedMap3.remove((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i16 = defaultedMap15.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b19 = defaultedMap15.containsValue((java.lang.Object) true);
        boolean b21 = defaultedMap15.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate23);
        boolean b25 = defaultedMap3.containsKey((java.lang.Object) predicate23);
        int i26 = defaultedMap3.size();
        boolean b27 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i32 = defaultedMap31.size();
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        defaultedMap29.clear();
        java.lang.Object obj36 = defaultedMap29.remove((java.lang.Object) 100L);
        boolean b37 = defaultedMap3.equals(obj36);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b8 = defaultedMap3.containsValue((java.lang.Object) true);
        java.util.Set set9 = defaultedMap3.keySet();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        defaultedMap7.clear();
        java.lang.Object obj14 = defaultedMap7.remove((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap7.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) set15);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i54 = defaultedMap53.size();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap51.isEmpty();
        int i57 = defaultedMap51.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) true);
        java.lang.Object obj63 = defaultedMap51.put((java.lang.Object) defaultedMap59, (java.lang.Object) 10.0f);
        java.util.Set set64 = defaultedMap51.keySet();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i70 = defaultedMap69.size();
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        boolean b73 = defaultedMap69.containsValue((java.lang.Object) true);
        boolean b75 = defaultedMap69.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate76, predicate77);
        java.lang.Object obj79 = defaultedMap51.get((java.lang.Object) predicate77);
        collections.PredicateUtils predicateUtils80 = new collections.PredicateUtils();
        boolean b81 = defaultedMap51.containsKey((java.lang.Object) predicateUtils80);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (byte) -1 + "'", obj79.equals((byte) -1));
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i54 = defaultedMap53.size();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i60 = defaultedMap59.size();
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        defaultedMap57.clear();
        java.lang.Object obj64 = defaultedMap57.remove((java.lang.Object) 100L);
        java.util.Set set65 = defaultedMap57.entrySet();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) set65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (short) 1);
        boolean b71 = defaultedMap51.equals((java.lang.Object) defaultedMap68);
        collections.PredicateUtils predicateUtils72 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap74.clear();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap74);
        int i77 = defaultedMap74.size();
        java.util.Set set78 = defaultedMap74.entrySet();
        java.lang.Object obj79 = defaultedMap68.put((java.lang.Object) predicateUtils72, (java.lang.Object) set78);
        java.util.Set set80 = defaultedMap68.keySet();
        java.lang.Object obj81 = defaultedMap1.get((java.lang.Object) set80);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + (byte) -1 + "'", obj81.equals((byte) -1));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i54 = defaultedMap53.size();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap51.isEmpty();
        int i57 = defaultedMap51.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) true);
        java.lang.Object obj63 = defaultedMap51.put((java.lang.Object) defaultedMap59, (java.lang.Object) 10.0f);
        java.util.Set set64 = defaultedMap51.keySet();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap51);
        java.lang.String str66 = defaultedMap51.toString();
        java.util.Set set67 = defaultedMap51.entrySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i72 = defaultedMap71.size();
        defaultedMap69.putAll((java.util.Map) defaultedMap71);
        boolean b74 = defaultedMap69.isEmpty();
        int i75 = defaultedMap69.size();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i81 = defaultedMap80.size();
        defaultedMap78.putAll((java.util.Map) defaultedMap80);
        boolean b84 = defaultedMap80.containsValue((java.lang.Object) true);
        boolean b86 = defaultedMap80.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate87, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate76, predicate88);
        java.lang.Object obj91 = defaultedMap51.remove((java.lang.Object) defaultedMap69);
        collections.Transformer transformer92 = null;
        try {
            java.util.Map map93 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, transformer92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{{}=10.0}" + "'", str66.equals("{{}=10.0}"));
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 10.0f + "'", obj91.equals(10.0f));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object[] obj_array2 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        boolean b4 = fixedOrderComparator3.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) true);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) 0);
        int i11 = defaultedMap6.size();
        boolean b12 = fixedOrderComparator3.add((java.lang.Object) defaultedMap6);
        boolean b13 = fixedOrderComparator1.add((java.lang.Object) b12);
        boolean b15 = fixedOrderComparator1.add((java.lang.Object) ' ');
        fixedOrderComparator1.setUnknownObjectBehavior(2);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) -1 + "'", obj10.equals((byte) -1));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i54 = defaultedMap53.size();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap51.isEmpty();
        int i57 = defaultedMap51.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) true);
        java.lang.Object obj63 = defaultedMap51.put((java.lang.Object) defaultedMap59, (java.lang.Object) 10.0f);
        java.util.Set set64 = defaultedMap51.keySet();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap51);
        java.lang.String str66 = defaultedMap51.toString();
        java.util.Set set67 = defaultedMap51.entrySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i72 = defaultedMap71.size();
        defaultedMap69.putAll((java.util.Map) defaultedMap71);
        boolean b74 = defaultedMap69.isEmpty();
        int i75 = defaultedMap69.size();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i81 = defaultedMap80.size();
        defaultedMap78.putAll((java.util.Map) defaultedMap80);
        boolean b84 = defaultedMap80.containsValue((java.lang.Object) true);
        boolean b86 = defaultedMap80.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate87, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate76, predicate88);
        java.lang.Object obj91 = defaultedMap51.remove((java.lang.Object) defaultedMap69);
        defaultedMap51.clear();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{{}=10.0}" + "'", str66.equals("{{}=10.0}"));
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 10.0f + "'", obj91.equals(10.0f));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i17 = defaultedMap16.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap14.clear();
        java.lang.Object obj21 = defaultedMap14.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i26 = defaultedMap25.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b29 = defaultedMap25.containsValue((java.lang.Object) true);
        boolean b31 = defaultedMap25.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i39 = defaultedMap38.size();
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        defaultedMap36.clear();
        java.lang.String str42 = defaultedMap36.toString();
        java.lang.Object obj43 = defaultedMap14.put((java.lang.Object) predicate33, (java.lang.Object) str42);
        boolean b44 = defaultedMap7.equals((java.lang.Object) defaultedMap14);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) b44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i51 = defaultedMap50.size();
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        defaultedMap48.clear();
        java.lang.Object obj55 = defaultedMap48.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i60 = defaultedMap59.size();
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        boolean b63 = defaultedMap59.containsValue((java.lang.Object) true);
        boolean b65 = defaultedMap59.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate66, predicate67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i73 = defaultedMap72.size();
        defaultedMap70.putAll((java.util.Map) defaultedMap72);
        defaultedMap70.clear();
        java.lang.String str76 = defaultedMap70.toString();
        java.lang.Object obj77 = defaultedMap48.put((java.lang.Object) predicate67, (java.lang.Object) str76);
        java.lang.Object obj78 = defaultedMap3.put((java.lang.Object) true, (java.lang.Object) predicate67);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i83 = defaultedMap82.size();
        defaultedMap80.putAll((java.util.Map) defaultedMap82);
        boolean b86 = defaultedMap82.containsValue((java.lang.Object) true);
        boolean b88 = defaultedMap82.equals((java.lang.Object) (short) 0);
        java.util.Set set89 = defaultedMap82.entrySet();
        java.util.Collection collection90 = defaultedMap82.values();
        java.util.Set set91 = defaultedMap82.keySet();
        boolean b92 = defaultedMap3.containsValue((java.lang.Object) defaultedMap82);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i11 = defaultedMap10.size();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap8.clear();
        java.lang.Object obj15 = defaultedMap8.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i20 = defaultedMap19.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b23 = defaultedMap19.containsValue((java.lang.Object) true);
        boolean b25 = defaultedMap19.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i33 = defaultedMap32.size();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        defaultedMap30.clear();
        java.lang.String str36 = defaultedMap30.toString();
        java.lang.Object obj37 = defaultedMap8.put((java.lang.Object) predicate27, (java.lang.Object) str36);
        boolean b38 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i43 = defaultedMap42.size();
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        defaultedMap40.clear();
        java.lang.Object obj47 = defaultedMap40.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i52 = defaultedMap51.size();
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        boolean b55 = defaultedMap51.containsValue((java.lang.Object) true);
        boolean b57 = defaultedMap51.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i65 = defaultedMap64.size();
        defaultedMap62.putAll((java.util.Map) defaultedMap64);
        defaultedMap62.clear();
        java.lang.String str68 = defaultedMap62.toString();
        java.lang.Object obj69 = defaultedMap40.put((java.lang.Object) predicate59, (java.lang.Object) str68);
        boolean b70 = defaultedMap1.containsKey((java.lang.Object) defaultedMap40);
        boolean b71 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i76 = defaultedMap75.size();
        defaultedMap73.putAll((java.util.Map) defaultedMap75);
        boolean b78 = defaultedMap73.isEmpty();
        int i79 = defaultedMap73.size();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i85 = defaultedMap84.size();
        defaultedMap82.putAll((java.util.Map) defaultedMap84);
        boolean b88 = defaultedMap84.containsValue((java.lang.Object) true);
        boolean b90 = defaultedMap84.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate91 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate92 = collections.PredicateUtils.truePredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate91, predicate92);
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate80, predicate92);
        boolean b95 = defaultedMap40.containsValue((java.lang.Object) defaultedMap73);
        collections.Transformer transformer96 = null;
        try {
            java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, transformer96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertTrue(i85 == 0);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertTrue(b95 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        defaultedMap7.clear();
        java.lang.Object obj14 = defaultedMap7.remove((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap7.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (short) 1);
        boolean b21 = defaultedMap1.equals((java.lang.Object) defaultedMap18);
        java.util.Set set22 = defaultedMap18.keySet();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i11 = defaultedMap10.size();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i17 = defaultedMap16.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap14.clear();
        java.lang.Object obj21 = defaultedMap14.remove((java.lang.Object) 100L);
        java.util.Set set22 = defaultedMap14.entrySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) set22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i28 = defaultedMap27.size();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        defaultedMap25.clear();
        java.lang.Object obj32 = defaultedMap25.remove((java.lang.Object) 100L);
        java.util.Set set33 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i38 = defaultedMap37.size();
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b41 = defaultedMap37.containsValue((java.lang.Object) true);
        boolean b43 = defaultedMap37.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate44, predicate45);
        boolean b47 = defaultedMap25.containsKey((java.lang.Object) predicate45);
        java.util.Map map48 = collections.map.DefaultedMap.decorate(map23, (java.lang.Object) predicate45);
        boolean b49 = defaultedMap1.equals((java.lang.Object) map48);
        int i50 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i50 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i11 = defaultedMap10.size();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap8.clear();
        java.lang.Object obj15 = defaultedMap8.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i20 = defaultedMap19.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b23 = defaultedMap19.containsValue((java.lang.Object) true);
        boolean b25 = defaultedMap19.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i33 = defaultedMap32.size();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        defaultedMap30.clear();
        java.lang.String str36 = defaultedMap30.toString();
        java.lang.Object obj37 = defaultedMap8.put((java.lang.Object) predicate27, (java.lang.Object) str36);
        boolean b38 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.Factory factory39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i14 = defaultedMap13.size();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap13.containsValue((java.lang.Object) true);
        boolean b19 = defaultedMap13.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate20, predicate21);
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i30 = defaultedMap29.size();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) true);
        boolean b35 = defaultedMap29.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i43 = defaultedMap42.size();
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        boolean b46 = defaultedMap42.containsValue((java.lang.Object) true);
        boolean b48 = defaultedMap42.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate36, predicate50);
        defaultedMap1.putAll(map52);
        java.util.Collection collection54 = defaultedMap1.values();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (byte) -1 + "'", obj56.equals((byte) -1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b3 = fixedOrderComparator2.isLocked();
        int i4 = fixedOrderComparator2.getUnknownObjectBehavior();
        int i5 = fixedOrderComparator2.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        defaultedMap9.clear();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap9.entrySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (short) 1);
        boolean b23 = defaultedMap3.equals((java.lang.Object) defaultedMap20);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        int i29 = defaultedMap26.size();
        java.util.Set set30 = defaultedMap26.entrySet();
        java.lang.Object obj31 = defaultedMap20.put((java.lang.Object) predicateUtils24, (java.lang.Object) set30);
        java.util.Set set32 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.String str40 = defaultedMap34.toString();
        int i41 = defaultedMap34.size();
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) set32, (java.lang.Object) i41);
        collections.Factory factory43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        defaultedMap9.clear();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap9.entrySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i24 = defaultedMap23.size();
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        defaultedMap21.clear();
        java.lang.String str27 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i32 = defaultedMap31.size();
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b35 = defaultedMap31.containsValue((java.lang.Object) true);
        boolean b36 = defaultedMap21.containsValue((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i41 = defaultedMap40.size();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        defaultedMap38.clear();
        java.lang.Object obj45 = defaultedMap38.remove((java.lang.Object) 100L);
        java.util.Set set46 = defaultedMap38.entrySet();
        java.lang.Object obj48 = defaultedMap21.put((java.lang.Object) set46, (java.lang.Object) (short) -1);
        java.lang.Object obj49 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj50 = null;
        boolean b51 = defaultedMap21.equals(obj50);
        java.util.Collection collection52 = defaultedMap21.values();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (byte) -1 + "'", obj49.equals((byte) -1));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(collection52);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i15 = defaultedMap14.size();
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) true);
        boolean b20 = defaultedMap14.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i28 = defaultedMap27.size();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) true);
        boolean b33 = defaultedMap27.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate21, predicate35);
        java.lang.Object obj39 = defaultedMap10.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i44 = defaultedMap43.size();
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        boolean b46 = defaultedMap41.isEmpty();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i51 = defaultedMap50.size();
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        defaultedMap48.clear();
        java.lang.Object obj55 = defaultedMap48.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i60 = defaultedMap59.size();
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        boolean b63 = defaultedMap59.containsValue((java.lang.Object) true);
        boolean b65 = defaultedMap59.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate66, predicate67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i73 = defaultedMap72.size();
        defaultedMap70.putAll((java.util.Map) defaultedMap72);
        defaultedMap70.clear();
        java.lang.String str76 = defaultedMap70.toString();
        java.lang.Object obj77 = defaultedMap48.put((java.lang.Object) predicate67, (java.lang.Object) str76);
        boolean b78 = defaultedMap41.equals((java.lang.Object) defaultedMap48);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap48);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i83 = defaultedMap82.size();
        java.lang.Object obj84 = defaultedMap1.get((java.lang.Object) i83);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (byte) -1 + "'", obj84.equals((byte) -1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i15 = defaultedMap14.size();
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) true);
        boolean b20 = defaultedMap14.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate21, predicate22);
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) predicate22);
        defaultedMap1.clear();
        collections.Factory factory26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) -1 + "'", obj10.equals((byte) -1));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) true);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) true);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 0);
        int i17 = defaultedMap12.size();
        boolean b18 = fixedOrderComparator9.add((java.lang.Object) defaultedMap12);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) fixedOrderComparator9);
        try {
            fixedOrderComparator9.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) -1 + "'", obj5.equals((byte) -1));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (byte) -1 + "'", obj16.equals((byte) -1));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) -1 + "'", obj19.equals((byte) -1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        defaultedMap9.clear();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap9.entrySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i24 = defaultedMap23.size();
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        boolean b26 = defaultedMap21.isEmpty();
        int i27 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) true);
        java.lang.Object obj33 = defaultedMap21.put((java.lang.Object) defaultedMap29, (java.lang.Object) 10.0f);
        java.util.Set set34 = defaultedMap21.keySet();
        boolean b35 = defaultedMap1.containsKey((java.lang.Object) defaultedMap21);
        java.util.Collection collection36 = defaultedMap21.values();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i13 = defaultedMap12.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) true);
        boolean b18 = defaultedMap12.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i26 = defaultedMap25.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        defaultedMap23.clear();
        java.lang.String str29 = defaultedMap23.toString();
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) predicate20, (java.lang.Object) str29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        defaultedMap7.clear();
        java.lang.Object obj14 = defaultedMap7.remove((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap7.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (short) 1);
        boolean b21 = defaultedMap1.equals((java.lang.Object) defaultedMap18);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i54 = defaultedMap53.size();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap51.isEmpty();
        int i57 = defaultedMap51.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) true);
        java.lang.Object obj63 = defaultedMap51.put((java.lang.Object) defaultedMap59, (java.lang.Object) 10.0f);
        java.util.Set set64 = defaultedMap51.keySet();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap51);
        java.lang.Object[] obj_array66 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array66);
        boolean b69 = fixedOrderComparator68.isLocked();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) b69);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i8 = defaultedMap7.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) true);
        boolean b13 = defaultedMap7.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap3.remove((java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i22 = defaultedMap21.size();
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        defaultedMap19.clear();
        java.lang.Object obj26 = defaultedMap19.remove((java.lang.Object) 100L);
        java.util.Set set27 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i32 = defaultedMap31.size();
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b35 = defaultedMap31.containsValue((java.lang.Object) true);
        boolean b37 = defaultedMap31.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate39);
        boolean b41 = defaultedMap19.containsKey((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i48 = defaultedMap47.size();
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        boolean b51 = defaultedMap47.containsValue((java.lang.Object) true);
        boolean b53 = defaultedMap47.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate54, predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i61 = defaultedMap60.size();
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        boolean b64 = defaultedMap60.containsValue((java.lang.Object) true);
        boolean b66 = defaultedMap60.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate54, predicate68);
        defaultedMap19.putAll(map70);
        java.lang.Object[] obj_array72 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        boolean b74 = fixedOrderComparator73.isLocked();
        boolean b75 = fixedOrderComparator73.isLocked();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i80 = defaultedMap79.size();
        defaultedMap77.putAll((java.util.Map) defaultedMap79);
        boolean b82 = defaultedMap77.isEmpty();
        int i83 = defaultedMap77.size();
        boolean b85 = defaultedMap77.containsKey((java.lang.Object) (byte) 1);
        boolean b86 = fixedOrderComparator73.add((java.lang.Object) defaultedMap77);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap77);
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) map87);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b3 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i8 = defaultedMap7.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b10 = fixedOrderComparator1.add((java.lang.Object) defaultedMap5);
        fixedOrderComparator1.setUnknownObjectBehavior((int) (short) 0);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        int i8 = defaultedMap1.size();
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) true);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) 0);
        int i18 = defaultedMap13.size();
        boolean b19 = fixedOrderComparator10.add((java.lang.Object) defaultedMap13);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i25 = defaultedMap24.size();
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        defaultedMap22.clear();
        java.lang.String str28 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i33 = defaultedMap32.size();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) true);
        boolean b37 = defaultedMap22.containsValue((java.lang.Object) true);
        java.util.Set set38 = defaultedMap22.entrySet();
        int i39 = defaultedMap22.size();
        boolean b40 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte) -1 + "'", obj17.equals((byte) -1));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (byte) -1 + "'", obj20.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.entrySet();
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i54 = defaultedMap53.size();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap51.isEmpty();
        int i57 = defaultedMap51.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) true);
        java.lang.Object obj63 = defaultedMap51.put((java.lang.Object) defaultedMap59, (java.lang.Object) 10.0f);
        java.util.Set set64 = defaultedMap51.keySet();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i70 = defaultedMap69.size();
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        boolean b73 = defaultedMap69.containsValue((java.lang.Object) true);
        boolean b75 = defaultedMap69.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate76, predicate77);
        java.lang.Object obj79 = defaultedMap51.get((java.lang.Object) predicate77);
        java.util.Set set80 = defaultedMap51.entrySet();
        defaultedMap51.clear();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (byte) -1 + "'", obj79.equals((byte) -1));
        org.junit.Assert.assertNotNull(set80);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i18 = defaultedMap17.size();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        defaultedMap15.clear();
        java.lang.Object obj22 = defaultedMap15.remove((java.lang.Object) 100L);
        java.util.Set set23 = defaultedMap15.entrySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) set23);
        java.lang.Object obj25 = defaultedMap7.remove((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i30 = defaultedMap29.size();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        boolean b32 = defaultedMap27.isEmpty();
        int i33 = defaultedMap27.size();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) true);
        java.lang.Object obj39 = defaultedMap27.put((java.lang.Object) defaultedMap35, (java.lang.Object) 10.0f);
        java.util.Set set40 = defaultedMap27.keySet();
        boolean b41 = defaultedMap7.containsKey((java.lang.Object) defaultedMap27);
        try {
            boolean b42 = fixedOrderComparator4.addAsEqual((java.lang.Object) 100, (java.lang.Object) defaultedMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i11 = defaultedMap10.size();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        defaultedMap8.clear();
        java.lang.Object obj15 = defaultedMap8.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i20 = defaultedMap19.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b23 = defaultedMap19.containsValue((java.lang.Object) true);
        boolean b25 = defaultedMap19.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i33 = defaultedMap32.size();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        defaultedMap30.clear();
        java.lang.String str36 = defaultedMap30.toString();
        java.lang.Object obj37 = defaultedMap8.put((java.lang.Object) predicate27, (java.lang.Object) str36);
        boolean b38 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i43 = defaultedMap42.size();
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        defaultedMap40.clear();
        java.lang.Object obj47 = defaultedMap40.remove((java.lang.Object) 100L);
        java.util.Set set48 = defaultedMap40.entrySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i53 = defaultedMap52.size();
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        boolean b56 = defaultedMap52.containsValue((java.lang.Object) true);
        boolean b58 = defaultedMap52.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate59, predicate60);
        boolean b62 = defaultedMap40.containsKey((java.lang.Object) predicate60);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i67 = defaultedMap66.size();
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        defaultedMap64.clear();
        java.lang.Object obj71 = defaultedMap64.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i76 = defaultedMap75.size();
        defaultedMap73.putAll((java.util.Map) defaultedMap75);
        boolean b79 = defaultedMap75.containsValue((java.lang.Object) true);
        boolean b81 = defaultedMap75.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate82, predicate83);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i89 = defaultedMap88.size();
        defaultedMap86.putAll((java.util.Map) defaultedMap88);
        defaultedMap86.clear();
        java.lang.String str92 = defaultedMap86.toString();
        java.lang.Object obj93 = defaultedMap64.put((java.lang.Object) predicate83, (java.lang.Object) str92);
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate60, predicate83);
        java.util.Set set95 = defaultedMap8.entrySet();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(i89 == 0);
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "{}" + "'", str92.equals("{}"));
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(set95);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        defaultedMap3.clear();
        java.lang.Object obj10 = defaultedMap3.remove((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i16 = defaultedMap15.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b19 = defaultedMap15.containsValue((java.lang.Object) true);
        boolean b21 = defaultedMap15.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate23);
        boolean b25 = defaultedMap3.containsKey((java.lang.Object) predicate23);
        int i26 = defaultedMap3.size();
        boolean b27 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        java.util.Set set28 = defaultedMap3.keySet();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i13 = defaultedMap12.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap10.clear();
        java.lang.String str16 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i21 = defaultedMap20.size();
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) true);
        boolean b25 = defaultedMap10.containsValue((java.lang.Object) true);
        java.util.Set set26 = defaultedMap10.entrySet();
        int i27 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) true);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) 0);
        int i34 = defaultedMap29.size();
        java.lang.String str35 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i40 = defaultedMap39.size();
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i46 = defaultedMap45.size();
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        defaultedMap43.clear();
        java.lang.Object obj50 = defaultedMap43.remove((java.lang.Object) 100L);
        java.util.Set set51 = defaultedMap43.entrySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) set51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (short) 1);
        boolean b57 = defaultedMap37.equals((java.lang.Object) defaultedMap54);
        java.lang.Object obj58 = defaultedMap10.put((java.lang.Object) defaultedMap29, (java.lang.Object) b57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i63 = defaultedMap62.size();
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        boolean b65 = defaultedMap60.isEmpty();
        int i66 = defaultedMap60.size();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b70 = defaultedMap68.containsValue((java.lang.Object) true);
        java.lang.Object obj72 = defaultedMap60.put((java.lang.Object) defaultedMap68, (java.lang.Object) 10.0f);
        java.util.Set set73 = defaultedMap60.keySet();
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap60);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) -1 + "'", obj33.equals((byte) -1));
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i54 = defaultedMap53.size();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap51.isEmpty();
        int i57 = defaultedMap51.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) true);
        java.lang.Object obj63 = defaultedMap51.put((java.lang.Object) defaultedMap59, (java.lang.Object) 10.0f);
        java.util.Set set64 = defaultedMap51.keySet();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i70 = defaultedMap69.size();
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        boolean b73 = defaultedMap69.containsValue((java.lang.Object) true);
        boolean b75 = defaultedMap69.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate76, predicate77);
        java.lang.Object obj79 = defaultedMap51.get((java.lang.Object) predicate77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) predicate77);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap80, (java.lang.Object) (byte) -1);
        java.lang.Object[] obj_array84 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array84);
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array84);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator(obj_array84);
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array84);
        java.lang.Object obj89 = null;
        java.lang.Object obj90 = defaultedMap80.put((java.lang.Object) obj_array84, obj89);
        collections.comparators.FixedOrderComparator fixedOrderComparator91 = new collections.comparators.FixedOrderComparator(obj_array84);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (byte) -1 + "'", obj79.equals((byte) -1));
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(obj_array84);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) true);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) 10.0f);
        java.util.Set set14 = defaultedMap1.keySet();
        int i15 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i17 = defaultedMap16.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap14.clear();
        java.lang.Object obj21 = defaultedMap14.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i26 = defaultedMap25.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b29 = defaultedMap25.containsValue((java.lang.Object) true);
        boolean b31 = defaultedMap25.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i39 = defaultedMap38.size();
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        defaultedMap36.clear();
        java.lang.String str42 = defaultedMap36.toString();
        java.lang.Object obj43 = defaultedMap14.put((java.lang.Object) predicate33, (java.lang.Object) str42);
        boolean b44 = defaultedMap7.equals((java.lang.Object) defaultedMap14);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) b44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i52 = defaultedMap51.size();
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        boolean b55 = defaultedMap51.containsValue((java.lang.Object) true);
        boolean b57 = defaultedMap51.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i65 = defaultedMap64.size();
        defaultedMap62.putAll((java.util.Map) defaultedMap64);
        boolean b68 = defaultedMap64.containsValue((java.lang.Object) true);
        boolean b70 = defaultedMap64.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate58, predicate72);
        java.lang.Object obj76 = defaultedMap47.remove((java.lang.Object) 100.0d);
        java.util.Map map77 = collections.map.DefaultedMap.decorate(map45, (java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) true);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 0);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) -1 + "'", obj11.equals((byte) -1));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (short) 1);
        java.util.Set set54 = defaultedMap51.entrySet();
        java.util.Set set55 = defaultedMap51.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap51);
        int i57 = defaultedMap51.size();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(i57 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        java.util.Set set18 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i17 = defaultedMap16.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap14.clear();
        java.lang.Object obj21 = defaultedMap14.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i26 = defaultedMap25.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b29 = defaultedMap25.containsValue((java.lang.Object) true);
        boolean b31 = defaultedMap25.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i39 = defaultedMap38.size();
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        defaultedMap36.clear();
        java.lang.String str42 = defaultedMap36.toString();
        java.lang.Object obj43 = defaultedMap14.put((java.lang.Object) predicate33, (java.lang.Object) str42);
        boolean b44 = defaultedMap7.equals((java.lang.Object) defaultedMap14);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) b44);
        java.lang.String str46 = defaultedMap3.toString();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b6 = defaultedMap4.containsValue((java.lang.Object) true);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 0);
        int i9 = defaultedMap4.size();
        boolean b10 = fixedOrderComparator1.add((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i15 = defaultedMap14.size();
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        defaultedMap12.clear();
        java.lang.Object obj19 = defaultedMap12.remove((java.lang.Object) 100L);
        java.util.Set set20 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i25 = defaultedMap24.size();
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        boolean b28 = defaultedMap24.containsValue((java.lang.Object) true);
        boolean b30 = defaultedMap24.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate31, predicate32);
        boolean b34 = defaultedMap12.containsKey((java.lang.Object) predicate32);
        boolean b35 = fixedOrderComparator1.add((java.lang.Object) b34);
        int i36 = fixedOrderComparator1.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == 2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i13 = defaultedMap12.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) true);
        boolean b18 = defaultedMap12.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i26 = defaultedMap25.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        defaultedMap23.clear();
        java.lang.String str29 = defaultedMap23.toString();
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) predicate20, (java.lang.Object) str29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i47 = defaultedMap46.size();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) true);
        boolean b52 = defaultedMap46.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate53, predicate54);
        boolean b56 = defaultedMap34.containsKey((java.lang.Object) predicate54);
        int i57 = defaultedMap34.size();
        boolean b58 = defaultedMap32.containsKey((java.lang.Object) defaultedMap34);
        boolean b59 = defaultedMap1.containsKey((java.lang.Object) b58);
        java.util.Collection collection60 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.Transformer transformer62 = null;
        try {
            java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i54 = defaultedMap53.size();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap51.isEmpty();
        int i57 = defaultedMap51.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) true);
        java.lang.Object obj63 = defaultedMap51.put((java.lang.Object) defaultedMap59, (java.lang.Object) 10.0f);
        java.util.Set set64 = defaultedMap51.keySet();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i70 = defaultedMap69.size();
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        boolean b73 = defaultedMap69.containsValue((java.lang.Object) true);
        boolean b75 = defaultedMap69.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate76, predicate77);
        java.lang.Object obj79 = defaultedMap51.get((java.lang.Object) predicate77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) predicate77);
        defaultedMap80.clear();
        defaultedMap80.clear();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (byte) -1 + "'", obj79.equals((byte) -1));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b10 = fixedOrderComparator9.isLocked();
        boolean b11 = defaultedMap1.equals((java.lang.Object) b10);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i9 = defaultedMap8.size();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) true);
        boolean b14 = defaultedMap8.equals((java.lang.Object) (short) 0);
        java.util.Set set15 = defaultedMap8.entrySet();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) set15);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) true);
        boolean b9 = defaultedMap3.equals((java.lang.Object) (short) 0);
        java.util.Set set10 = defaultedMap3.entrySet();
        java.util.Collection collection11 = defaultedMap3.values();
        java.util.Set set12 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i19 = defaultedMap18.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i25 = defaultedMap24.size();
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        defaultedMap22.clear();
        java.lang.Object obj29 = defaultedMap22.remove((java.lang.Object) 100L);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) set30);
        java.lang.Object obj32 = defaultedMap14.remove((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        boolean b39 = defaultedMap34.isEmpty();
        int i40 = defaultedMap34.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) true);
        java.lang.Object obj46 = defaultedMap34.put((java.lang.Object) defaultedMap42, (java.lang.Object) 10.0f);
        java.util.Set set47 = defaultedMap34.keySet();
        boolean b48 = defaultedMap14.containsKey((java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i53 = defaultedMap52.size();
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        defaultedMap50.clear();
        java.lang.Object obj57 = defaultedMap50.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i62 = defaultedMap61.size();
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        boolean b65 = defaultedMap61.containsValue((java.lang.Object) true);
        boolean b67 = defaultedMap61.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate68, predicate69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i75 = defaultedMap74.size();
        defaultedMap72.putAll((java.util.Map) defaultedMap74);
        defaultedMap72.clear();
        java.lang.String str78 = defaultedMap72.toString();
        java.lang.Object obj79 = defaultedMap50.put((java.lang.Object) predicate69, (java.lang.Object) str78);
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate80, predicate81);
        boolean b83 = defaultedMap34.containsValue((java.lang.Object) predicate81);
        java.util.Set set84 = defaultedMap34.entrySet();
        boolean b85 = defaultedMap3.containsKey((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{}" + "'", str78.equals("{}"));
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i8 = defaultedMap7.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i14 = defaultedMap13.size();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        defaultedMap11.clear();
        java.lang.Object obj18 = defaultedMap11.remove((java.lang.Object) 100L);
        java.util.Set set19 = defaultedMap11.entrySet();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) set19);
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) set19);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i9 = defaultedMap8.size();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap6.clear();
        java.lang.String str12 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i17 = defaultedMap16.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap16.containsValue((java.lang.Object) true);
        boolean b21 = defaultedMap6.containsValue((java.lang.Object) true);
        java.util.Set set22 = defaultedMap6.entrySet();
        int i23 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) true);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) 0);
        int i30 = defaultedMap25.size();
        java.lang.String str31 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i36 = defaultedMap35.size();
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i42 = defaultedMap41.size();
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        defaultedMap39.clear();
        java.lang.Object obj46 = defaultedMap39.remove((java.lang.Object) 100L);
        java.util.Set set47 = defaultedMap39.entrySet();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) set47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (short) 1);
        boolean b53 = defaultedMap33.equals((java.lang.Object) defaultedMap50);
        java.lang.Object obj54 = defaultedMap6.put((java.lang.Object) defaultedMap25, (java.lang.Object) b53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i59 = defaultedMap58.size();
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        boolean b61 = defaultedMap56.isEmpty();
        int i62 = defaultedMap56.size();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b66 = defaultedMap64.containsValue((java.lang.Object) true);
        java.lang.Object obj68 = defaultedMap56.put((java.lang.Object) defaultedMap64, (java.lang.Object) 10.0f);
        java.util.Set set69 = defaultedMap56.keySet();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap56);
        boolean b71 = fixedOrderComparator4.add((java.lang.Object) defaultedMap56);
        java.lang.Object[] obj_array72 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        int i74 = fixedOrderComparator73.getUnknownObjectBehavior();
        int i75 = fixedOrderComparator73.getUnknownObjectBehavior();
        boolean b76 = fixedOrderComparator73.isLocked();
        java.lang.Object[] obj_array77 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array77);
        fixedOrderComparator79.setUnknownObjectBehavior((int) (byte) 0);
        boolean b82 = fixedOrderComparator73.add((java.lang.Object) fixedOrderComparator79);
        boolean b83 = fixedOrderComparator73.isLocked();
        boolean b84 = fixedOrderComparator4.add((java.lang.Object) b83);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) -1 + "'", obj29.equals((byte) -1));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(i74 == 2);
        org.junit.Assert.assertTrue(i75 == 2);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(obj_array77);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b84 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b3 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i8 = defaultedMap7.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b10 = fixedOrderComparator1.add((java.lang.Object) defaultedMap5);
        boolean b11 = fixedOrderComparator1.isLocked();
        int i12 = fixedOrderComparator1.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i13 = defaultedMap12.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) true);
        boolean b18 = defaultedMap12.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i26 = defaultedMap25.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        defaultedMap23.clear();
        java.lang.String str29 = defaultedMap23.toString();
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) predicate20, (java.lang.Object) str29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i47 = defaultedMap46.size();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) true);
        boolean b52 = defaultedMap46.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate53, predicate54);
        boolean b56 = defaultedMap34.containsKey((java.lang.Object) predicate54);
        int i57 = defaultedMap34.size();
        boolean b58 = defaultedMap32.containsKey((java.lang.Object) defaultedMap34);
        boolean b59 = defaultedMap1.containsKey((java.lang.Object) b58);
        java.util.Collection collection60 = defaultedMap1.values();
        collections.Transformer transformer61 = null;
        try {
            java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        java.util.Set set17 = defaultedMap1.entrySet();
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) true);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 0);
        int i25 = defaultedMap20.size();
        java.lang.String str26 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i31 = defaultedMap30.size();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.Object obj41 = defaultedMap34.remove((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap34.entrySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap28.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) defaultedMap20, (java.lang.Object) b48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i54 = defaultedMap53.size();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap51.isEmpty();
        int i57 = defaultedMap51.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) true);
        java.lang.Object obj63 = defaultedMap51.put((java.lang.Object) defaultedMap59, (java.lang.Object) 10.0f);
        java.util.Set set64 = defaultedMap51.keySet();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i70 = defaultedMap69.size();
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        boolean b73 = defaultedMap69.containsValue((java.lang.Object) true);
        boolean b75 = defaultedMap69.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate76, predicate77);
        java.lang.Object obj79 = defaultedMap51.get((java.lang.Object) predicate77);
        int i80 = defaultedMap51.size();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (byte) -1 + "'", obj79.equals((byte) -1));
        org.junit.Assert.assertTrue(i80 == 1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i11 = defaultedMap10.size();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i17 = defaultedMap16.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap14.clear();
        java.lang.Object obj21 = defaultedMap14.remove((java.lang.Object) 100L);
        java.util.Set set22 = defaultedMap14.entrySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) set22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i28 = defaultedMap27.size();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        defaultedMap25.clear();
        java.lang.Object obj32 = defaultedMap25.remove((java.lang.Object) 100L);
        java.util.Set set33 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i38 = defaultedMap37.size();
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b41 = defaultedMap37.containsValue((java.lang.Object) true);
        boolean b43 = defaultedMap37.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate44, predicate45);
        boolean b47 = defaultedMap25.containsKey((java.lang.Object) predicate45);
        java.util.Map map48 = collections.map.DefaultedMap.decorate(map23, (java.lang.Object) predicate45);
        boolean b49 = defaultedMap1.equals((java.lang.Object) map48);
        boolean b50 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b3 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i8 = defaultedMap7.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        defaultedMap5.clear();
        java.lang.String str11 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i16 = defaultedMap15.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b19 = defaultedMap15.containsValue((java.lang.Object) true);
        boolean b20 = defaultedMap5.containsValue((java.lang.Object) true);
        java.util.Set set21 = defaultedMap5.entrySet();
        int i22 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) true);
        java.lang.Object obj28 = defaultedMap24.get((java.lang.Object) 0);
        int i29 = defaultedMap24.size();
        java.lang.String str30 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i35 = defaultedMap34.size();
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i41 = defaultedMap40.size();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        defaultedMap38.clear();
        java.lang.Object obj45 = defaultedMap38.remove((java.lang.Object) 100L);
        java.util.Set set46 = defaultedMap38.entrySet();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) set46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (short) 1);
        boolean b52 = defaultedMap32.equals((java.lang.Object) defaultedMap49);
        java.lang.Object obj53 = defaultedMap5.put((java.lang.Object) defaultedMap24, (java.lang.Object) b52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i58 = defaultedMap57.size();
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        boolean b60 = defaultedMap55.isEmpty();
        int i61 = defaultedMap55.size();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b65 = defaultedMap63.containsValue((java.lang.Object) true);
        java.lang.Object obj67 = defaultedMap55.put((java.lang.Object) defaultedMap63, (java.lang.Object) 10.0f);
        java.util.Set set68 = defaultedMap55.keySet();
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap55);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i74 = defaultedMap73.size();
        defaultedMap71.putAll((java.util.Map) defaultedMap73);
        boolean b76 = defaultedMap71.isEmpty();
        int i77 = defaultedMap71.size();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b81 = defaultedMap79.containsValue((java.lang.Object) true);
        java.lang.Object obj83 = defaultedMap71.put((java.lang.Object) defaultedMap79, (java.lang.Object) 10.0f);
        java.util.Set set84 = defaultedMap71.keySet();
        boolean b85 = defaultedMap55.containsValue((java.lang.Object) set84);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap87.clear();
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap87);
        int i90 = defaultedMap87.size();
        try {
            boolean b91 = fixedOrderComparator1.addAsEqual((java.lang.Object) set84, (java.lang.Object) i90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (byte) -1 + "'", obj28.equals((byte) -1));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(i90 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        int i3 = fixedOrderComparator1.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i3 == 2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.isEmpty();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) true);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) 10.0f);
        java.util.Set set14 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i19 = defaultedMap18.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b21 = defaultedMap16.isEmpty();
        int i22 = defaultedMap16.size();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i28 = defaultedMap27.size();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) true);
        boolean b33 = defaultedMap27.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate23, predicate35);
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) predicate23);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) true);
        int i8 = defaultedMap3.size();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) true);
        int i17 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i24 = defaultedMap23.size();
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i30 = defaultedMap29.size();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap27.clear();
        java.lang.Object obj34 = defaultedMap27.remove((java.lang.Object) 100L);
        java.util.Set set35 = defaultedMap27.entrySet();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) set35);
        java.lang.Object obj37 = defaultedMap19.remove((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i42 = defaultedMap41.size();
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        boolean b44 = defaultedMap39.isEmpty();
        int i45 = defaultedMap39.size();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) true);
        java.lang.Object obj51 = defaultedMap39.put((java.lang.Object) defaultedMap47, (java.lang.Object) 10.0f);
        java.util.Set set52 = defaultedMap39.keySet();
        boolean b53 = defaultedMap19.containsKey((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i58 = defaultedMap57.size();
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        defaultedMap55.clear();
        java.lang.Object obj62 = defaultedMap55.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i67 = defaultedMap66.size();
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        boolean b70 = defaultedMap66.containsValue((java.lang.Object) true);
        boolean b72 = defaultedMap66.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate73, predicate74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i80 = defaultedMap79.size();
        defaultedMap77.putAll((java.util.Map) defaultedMap79);
        defaultedMap77.clear();
        java.lang.String str83 = defaultedMap77.toString();
        java.lang.Object obj84 = defaultedMap55.put((java.lang.Object) predicate74, (java.lang.Object) str83);
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate85, predicate86);
        boolean b88 = defaultedMap39.containsValue((java.lang.Object) predicate86);
        java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate86);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "{}" + "'", str83.equals("{}"));
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b3 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i8 = defaultedMap7.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b10 = defaultedMap5.isEmpty();
        int i11 = defaultedMap5.size();
        boolean b13 = defaultedMap5.containsKey((java.lang.Object) (byte) 1);
        boolean b14 = fixedOrderComparator1.add((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i19 = defaultedMap18.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        defaultedMap16.clear();
        java.lang.Object obj23 = defaultedMap16.remove((java.lang.Object) 100L);
        java.util.Set set24 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i29 = defaultedMap28.size();
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) true);
        boolean b34 = defaultedMap28.equals((java.lang.Object) (short) 0);
        java.util.Set set35 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        int i40 = defaultedMap37.size();
        java.util.Set set41 = defaultedMap37.entrySet();
        java.lang.Object obj42 = defaultedMap28.remove((java.lang.Object) set41);
        try {
            int i43 = fixedOrderComparator1.compare((java.lang.Object) set24, obj42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        fixedOrderComparator2.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i9 = defaultedMap8.size();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap6.clear();
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) 100L);
        java.util.Set set14 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i19 = defaultedMap18.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        defaultedMap16.clear();
        java.lang.String str22 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i27 = defaultedMap26.size();
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) true);
        boolean b31 = defaultedMap16.containsValue((java.lang.Object) true);
        java.util.Set set32 = defaultedMap16.entrySet();
        int i33 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) true);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) 0);
        int i40 = defaultedMap35.size();
        java.lang.String str41 = defaultedMap35.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i46 = defaultedMap45.size();
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i52 = defaultedMap51.size();
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        defaultedMap49.clear();
        java.lang.Object obj56 = defaultedMap49.remove((java.lang.Object) 100L);
        java.util.Set set57 = defaultedMap49.entrySet();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) set57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (short) 1);
        boolean b63 = defaultedMap43.equals((java.lang.Object) defaultedMap60);
        java.lang.Object obj64 = defaultedMap16.put((java.lang.Object) defaultedMap35, (java.lang.Object) b63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i69 = defaultedMap68.size();
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        boolean b71 = defaultedMap66.isEmpty();
        int i72 = defaultedMap66.size();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b76 = defaultedMap74.containsValue((java.lang.Object) true);
        java.lang.Object obj78 = defaultedMap66.put((java.lang.Object) defaultedMap74, (java.lang.Object) 10.0f);
        java.util.Set set79 = defaultedMap66.keySet();
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap66);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i85 = defaultedMap84.size();
        defaultedMap82.putAll((java.util.Map) defaultedMap84);
        boolean b88 = defaultedMap84.containsValue((java.lang.Object) true);
        boolean b90 = defaultedMap84.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate91 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate92 = collections.PredicateUtils.truePredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate91, predicate92);
        java.lang.Object obj94 = defaultedMap66.get((java.lang.Object) predicate92);
        collections.map.DefaultedMap defaultedMap95 = new collections.map.DefaultedMap((java.lang.Object) predicate92);
        defaultedMap95.clear();
        try {
            boolean b97 = fixedOrderComparator2.addAsEqual((java.lang.Object) set14, (java.lang.Object) defaultedMap95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (byte) -1 + "'", obj39.equals((byte) -1));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue(i85 == 0);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + (byte) -1 + "'", obj94.equals((byte) -1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) obj_array0);
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i19 = defaultedMap18.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        defaultedMap16.clear();
        java.lang.Object obj23 = defaultedMap16.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i28 = defaultedMap27.size();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) true);
        boolean b33 = defaultedMap27.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i41 = defaultedMap40.size();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        defaultedMap38.clear();
        java.lang.String str44 = defaultedMap38.toString();
        java.lang.Object obj45 = defaultedMap16.put((java.lang.Object) predicate35, (java.lang.Object) str44);
        boolean b46 = defaultedMap9.equals((java.lang.Object) defaultedMap16);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) b46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i52 = defaultedMap51.size();
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i58 = defaultedMap57.size();
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        defaultedMap55.clear();
        java.lang.Object obj62 = defaultedMap55.remove((java.lang.Object) 100L);
        java.util.Set set63 = defaultedMap55.entrySet();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) set63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj68 = defaultedMap66.remove((java.lang.Object) (short) 1);
        boolean b69 = defaultedMap49.equals((java.lang.Object) defaultedMap66);
        collections.PredicateUtils predicateUtils70 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap72.clear();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap72);
        int i75 = defaultedMap72.size();
        java.util.Set set76 = defaultedMap72.entrySet();
        java.lang.Object obj77 = defaultedMap66.put((java.lang.Object) predicateUtils70, (java.lang.Object) set76);
        java.lang.Object obj78 = defaultedMap5.get((java.lang.Object) set76);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i83 = defaultedMap82.size();
        defaultedMap80.putAll((java.util.Map) defaultedMap82);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i89 = defaultedMap88.size();
        defaultedMap86.putAll((java.util.Map) defaultedMap88);
        defaultedMap86.clear();
        java.lang.Object obj93 = defaultedMap86.remove((java.lang.Object) 100L);
        java.util.Set set94 = defaultedMap86.entrySet();
        java.util.Map map95 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap80, (java.lang.Object) set94);
        java.lang.Object obj96 = defaultedMap5.remove((java.lang.Object) defaultedMap80);
        boolean b97 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (byte) -1 + "'", obj78.equals((byte) -1));
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertTrue(i89 == 0);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertTrue(b97 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b6 = defaultedMap4.containsValue((java.lang.Object) true);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 0);
        int i9 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        java.lang.Object[] obj_array11 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) true);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) 0);
        int i20 = defaultedMap15.size();
        boolean b21 = fixedOrderComparator12.add((java.lang.Object) defaultedMap15);
        java.lang.Object obj22 = defaultedMap4.get((java.lang.Object) fixedOrderComparator12);
        boolean b23 = fixedOrderComparator1.add(obj22);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) -1 + "'", obj8.equals((byte) -1));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) -1 + "'", obj19.equals((byte) -1));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) -1 + "'", obj22.equals((byte) -1));
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        defaultedMap9.clear();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap9.entrySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i24 = defaultedMap23.size();
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        defaultedMap21.clear();
        java.lang.String str27 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i32 = defaultedMap31.size();
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b35 = defaultedMap31.containsValue((java.lang.Object) true);
        boolean b36 = defaultedMap21.containsValue((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i41 = defaultedMap40.size();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        defaultedMap38.clear();
        java.lang.Object obj45 = defaultedMap38.remove((java.lang.Object) 100L);
        java.util.Set set46 = defaultedMap38.entrySet();
        java.lang.Object obj48 = defaultedMap21.put((java.lang.Object) set46, (java.lang.Object) (short) -1);
        java.lang.Object obj49 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.lang.String str50 = defaultedMap1.toString();
        boolean b51 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap53.clear();
        boolean b55 = defaultedMap1.containsKey((java.lang.Object) defaultedMap53);
        int i56 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (byte) -1 + "'", obj49.equals((byte) -1));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i56 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b5 = fixedOrderComparator4.isLocked();
        boolean b6 = fixedOrderComparator4.isLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b6 = fixedOrderComparator5.isLocked();
        int i7 = fixedOrderComparator5.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) true);
        defaultedMap11.clear();
        try {
            boolean b17 = fixedOrderComparator2.addAsEqual((java.lang.Object) fixedOrderComparator5, (java.lang.Object) defaultedMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i7 = defaultedMap6.size();
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i13 = defaultedMap12.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap10.clear();
        java.lang.Object obj17 = defaultedMap10.remove((java.lang.Object) 100L);
        java.util.Set set18 = defaultedMap10.entrySet();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) set18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (short) 1);
        boolean b24 = defaultedMap4.equals((java.lang.Object) defaultedMap21);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) (byte) 10);
        boolean b27 = fixedOrderComparator1.add((java.lang.Object) map26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i33 = defaultedMap32.size();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        defaultedMap30.clear();
        java.lang.String str36 = defaultedMap30.toString();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i41 = defaultedMap40.size();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        boolean b44 = defaultedMap40.containsValue((java.lang.Object) true);
        boolean b45 = defaultedMap30.containsValue((java.lang.Object) true);
        java.util.Set set46 = defaultedMap30.entrySet();
        int i47 = defaultedMap30.size();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b51 = defaultedMap49.containsValue((java.lang.Object) true);
        java.lang.Object obj53 = defaultedMap49.get((java.lang.Object) 0);
        int i54 = defaultedMap49.size();
        java.lang.String str55 = defaultedMap49.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i60 = defaultedMap59.size();
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i66 = defaultedMap65.size();
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        defaultedMap63.clear();
        java.lang.Object obj70 = defaultedMap63.remove((java.lang.Object) 100L);
        java.util.Set set71 = defaultedMap63.entrySet();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) set71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj76 = defaultedMap74.remove((java.lang.Object) (short) 1);
        boolean b77 = defaultedMap57.equals((java.lang.Object) defaultedMap74);
        java.lang.Object obj78 = defaultedMap30.put((java.lang.Object) defaultedMap49, (java.lang.Object) b77);
        try {
            int i79 = fixedOrderComparator1.compare(obj28, (java.lang.Object) b77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (byte) -1 + "'", obj53.equals((byte) -1));
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i13 = defaultedMap12.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) true);
        boolean b18 = defaultedMap12.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i26 = defaultedMap25.size();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b29 = defaultedMap25.containsValue((java.lang.Object) true);
        boolean b31 = defaultedMap25.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate19, predicate33);
        java.lang.Object obj37 = defaultedMap8.remove((java.lang.Object) 100.0d);
        defaultedMap8.clear();
        java.lang.Object obj39 = defaultedMap1.put(obj6, (java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) true);
        boolean b11 = defaultedMap5.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i19 = defaultedMap18.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) true);
        boolean b24 = defaultedMap18.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate26);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) 100.0d);
        java.util.Set set31 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i8 = defaultedMap7.size();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) true);
        boolean b13 = defaultedMap7.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) map16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i22 = defaultedMap21.size();
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) true);
        boolean b27 = defaultedMap21.equals((java.lang.Object) (short) 0);
        java.util.Set set28 = defaultedMap21.entrySet();
        java.util.Collection collection29 = defaultedMap21.values();
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) collection29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i35 = defaultedMap34.size();
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i41 = defaultedMap40.size();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        defaultedMap38.clear();
        java.lang.Object obj45 = defaultedMap38.remove((java.lang.Object) 100L);
        java.util.Set set46 = defaultedMap38.entrySet();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) set46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (short) 1);
        boolean b52 = defaultedMap32.equals((java.lang.Object) defaultedMap49);
        collections.PredicateUtils predicateUtils53 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap55.clear();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap55);
        int i58 = defaultedMap55.size();
        java.util.Set set59 = defaultedMap55.entrySet();
        java.lang.Object obj60 = defaultedMap49.put((java.lang.Object) predicateUtils53, (java.lang.Object) set59);
        defaultedMap17.putAll((java.util.Map) defaultedMap49);
        try {
            boolean b63 = fixedOrderComparator2.addAsEqual((java.lang.Object) defaultedMap17, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.String str7 = defaultedMap1.toString();
        int i8 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i14 = defaultedMap13.size();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap13.containsValue((java.lang.Object) true);
        boolean b19 = defaultedMap13.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate20, predicate21);
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i30 = defaultedMap29.size();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i36 = defaultedMap35.size();
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        defaultedMap33.clear();
        java.lang.Object obj40 = defaultedMap33.remove((java.lang.Object) 100L);
        java.util.Set set41 = defaultedMap33.entrySet();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) set41);
        java.lang.Object obj43 = defaultedMap25.remove((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i48 = defaultedMap47.size();
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        boolean b50 = defaultedMap45.isEmpty();
        int i51 = defaultedMap45.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b55 = defaultedMap53.containsValue((java.lang.Object) true);
        java.lang.Object obj57 = defaultedMap45.put((java.lang.Object) defaultedMap53, (java.lang.Object) 10.0f);
        java.util.Set set58 = defaultedMap45.keySet();
        boolean b59 = defaultedMap25.containsKey((java.lang.Object) defaultedMap45);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap45);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        defaultedMap7.clear();
        java.lang.String str13 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i18 = defaultedMap17.size();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) true);
        boolean b22 = defaultedMap7.containsValue((java.lang.Object) true);
        java.util.Set set23 = defaultedMap7.entrySet();
        int i24 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) true);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) 0);
        int i31 = defaultedMap26.size();
        java.lang.String str32 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i43 = defaultedMap42.size();
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        defaultedMap40.clear();
        java.lang.Object obj47 = defaultedMap40.remove((java.lang.Object) 100L);
        java.util.Set set48 = defaultedMap40.entrySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) set48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (short) 1);
        boolean b54 = defaultedMap34.equals((java.lang.Object) defaultedMap51);
        java.lang.Object obj55 = defaultedMap7.put((java.lang.Object) defaultedMap26, (java.lang.Object) b54);
        boolean b56 = defaultedMap1.containsValue((java.lang.Object) b54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i61 = defaultedMap60.size();
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        boolean b64 = defaultedMap60.containsValue((java.lang.Object) true);
        boolean b66 = defaultedMap60.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate67, predicate68);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) map69);
        boolean b71 = defaultedMap1.containsKey((java.lang.Object) map69);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i76 = defaultedMap75.size();
        defaultedMap73.putAll((java.util.Map) defaultedMap75);
        boolean b78 = defaultedMap73.isEmpty();
        int i79 = defaultedMap73.size();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b83 = defaultedMap81.containsValue((java.lang.Object) true);
        java.lang.Object obj85 = defaultedMap73.put((java.lang.Object) defaultedMap81, (java.lang.Object) 10.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap81);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (byte) -1 + "'", obj30.equals((byte) -1));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) true);
        defaultedMap3.clear();
        java.util.Set set9 = defaultedMap3.entrySet();
        boolean b10 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) true);
        boolean b11 = defaultedMap5.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i19 = defaultedMap18.size();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) true);
        boolean b24 = defaultedMap18.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate26);
        java.lang.String str29 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i34 = defaultedMap33.size();
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        defaultedMap31.clear();
        java.lang.Object obj38 = defaultedMap31.remove((java.lang.Object) 100L);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap31.get(obj39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i45 = defaultedMap44.size();
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        boolean b48 = defaultedMap44.containsValue((java.lang.Object) true);
        boolean b50 = defaultedMap44.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate51, predicate52);
        boolean b54 = defaultedMap31.containsKey((java.lang.Object) predicate52);
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) defaultedMap31);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (byte) -1 + "'", obj40.equals((byte) -1));
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (byte) -1 + "'", obj55.equals((byte) -1));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i6 = defaultedMap5.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i12 = defaultedMap11.size();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        defaultedMap9.clear();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap9.entrySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (short) 1);
        boolean b23 = defaultedMap3.equals((java.lang.Object) defaultedMap20);
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        int i29 = defaultedMap26.size();
        java.util.Set set30 = defaultedMap26.entrySet();
        java.lang.Object obj31 = defaultedMap20.put((java.lang.Object) predicateUtils24, (java.lang.Object) set30);
        java.util.Set set32 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap34.clear();
        java.lang.String str40 = defaultedMap34.toString();
        int i41 = defaultedMap34.size();
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) set32, (java.lang.Object) i41);
        collections.Transformer transformer43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        boolean b4 = fixedOrderComparator2.isLocked();
        boolean b5 = fixedOrderComparator2.isLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i3 == 2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        boolean b4 = defaultedMap2.containsValue((java.lang.Object) true);
        java.lang.Object obj6 = defaultedMap2.get((java.lang.Object) 0);
        int i7 = defaultedMap2.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap2);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i13 = defaultedMap12.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b15 = defaultedMap10.isEmpty();
        int i16 = defaultedMap10.size();
        boolean b18 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        boolean b19 = defaultedMap10.isEmpty();
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i27 = defaultedMap26.size();
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i33 = defaultedMap32.size();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        defaultedMap30.clear();
        java.lang.Object obj37 = defaultedMap30.remove((java.lang.Object) 100L);
        java.util.Set set38 = defaultedMap30.entrySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) set38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (short) 1);
        boolean b44 = defaultedMap24.equals((java.lang.Object) defaultedMap41);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) (byte) 10);
        boolean b47 = fixedOrderComparator21.add((java.lang.Object) map46);
        java.lang.Object obj48 = defaultedMap8.put((java.lang.Object) b19, (java.lang.Object) fixedOrderComparator21);
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate(map0, obj48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) -1 + "'", obj6.equals((byte) -1));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i4 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i10 = defaultedMap9.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        defaultedMap7.clear();
        java.lang.Object obj14 = defaultedMap7.remove((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap7.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i21 = defaultedMap20.size();
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b23 = defaultedMap18.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i28 = defaultedMap27.size();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        defaultedMap25.clear();
        java.lang.Object obj32 = defaultedMap25.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i37 = defaultedMap36.size();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        boolean b40 = defaultedMap36.containsValue((java.lang.Object) true);
        boolean b42 = defaultedMap36.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i50 = defaultedMap49.size();
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        defaultedMap47.clear();
        java.lang.String str53 = defaultedMap47.toString();
        java.lang.Object obj54 = defaultedMap25.put((java.lang.Object) predicate44, (java.lang.Object) str53);
        boolean b55 = defaultedMap18.equals((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i60 = defaultedMap59.size();
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        defaultedMap57.clear();
        java.lang.Object obj64 = defaultedMap57.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i69 = defaultedMap68.size();
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        boolean b72 = defaultedMap68.containsValue((java.lang.Object) true);
        boolean b74 = defaultedMap68.equals((java.lang.Object) (short) 0);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate75, predicate76);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i82 = defaultedMap81.size();
        defaultedMap79.putAll((java.util.Map) defaultedMap81);
        defaultedMap79.clear();
        java.lang.String str85 = defaultedMap79.toString();
        java.lang.Object obj86 = defaultedMap57.put((java.lang.Object) predicate76, (java.lang.Object) str85);
        boolean b87 = defaultedMap18.containsKey((java.lang.Object) defaultedMap57);
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b87);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{}" + "'", str85.equals("{}"));
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(map88);
    }
}

