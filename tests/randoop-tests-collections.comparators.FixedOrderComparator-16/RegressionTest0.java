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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) 1);
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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 'a');
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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        java.lang.Object obj4 = null;
        try {
            int i6 = fixedOrderComparator2.compare(obj4, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        try {
            int i3 = fixedOrderComparator0.compare(obj1, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Object[] obj_array0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 100.0f);
        java.util.Set set15 = defaultedMap12.entrySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj17 = new java.lang.Object();
        try {
            int i18 = fixedOrderComparator8.compare((java.lang.Object) defaultedMap12, obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Map map4 = null;
        try {
            defaultedMap1.putAll(map4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) 100);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            int i3 = fixedOrderComparator0.compare((java.lang.Object) "hi!", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        try {
            fixedOrderComparator2.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b10 = fixedOrderComparator8.add((java.lang.Object) (byte) 100);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        try {
            fixedOrderComparator8.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i4 = defaultedMap3.size();
        defaultedMap3.clear();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) "{}");
        java.lang.Object obj28 = defaultedMap9.get((java.lang.Object) defaultedMap23);
        try {
            int i29 = fixedOrderComparator0.compare((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i11 = defaultedMap10.size();
        java.util.Collection collection12 = defaultedMap10.values();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) (short) 100);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) 100);
        boolean b17 = fixedOrderComparator7.add((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        defaultedMap19.clear();
        java.util.Set set22 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 100.0f);
        java.util.Set set27 = defaultedMap24.entrySet();
        java.lang.String str28 = defaultedMap24.toString();
        try {
            int i29 = fixedOrderComparator7.compare((java.lang.Object) set22, (java.lang.Object) defaultedMap24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 100.0f);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 100.0f);
        java.util.Set set16 = defaultedMap13.entrySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj18 = defaultedMap4.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i21 = defaultedMap20.size();
        java.util.Collection collection22 = defaultedMap20.values();
        try {
            int i23 = fixedOrderComparator2.compare((java.lang.Object) defaultedMap4, (java.lang.Object) defaultedMap20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0L + "'", obj6.equals(0L));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i6 = defaultedMap5.size();
        java.util.Collection collection7 = defaultedMap5.values();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) (short) 100);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (short) 100);
        int i12 = defaultedMap5.size();
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) i12);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap15.remove((java.lang.Object) "{}");
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        try {
            fixedOrderComparator10.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b22 = fixedOrderComparator16.add((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        java.util.Map map24 = null;
        try {
            defaultedMap19.putAll(map24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) 10);
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) "{}");
        java.lang.String str8 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate13, predicate14);
        try {
            int i16 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap3, (java.lang.Object) map15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) false);
        try {
            fixedOrderComparator11.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        boolean b4 = fixedOrderComparator2.isLocked();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 100.0f);
        java.util.Set set10 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap14.entrySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) "{}");
        java.lang.Object obj26 = defaultedMap7.get((java.lang.Object) defaultedMap21);
        boolean b27 = defaultedMap1.containsKey((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i30 = defaultedMap29.size();
        java.util.Collection collection31 = defaultedMap29.values();
        java.lang.Object obj33 = defaultedMap29.remove((java.lang.Object) (short) 100);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 100.0f);
        java.util.Set set40 = defaultedMap37.entrySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) 100.0f);
        java.util.Set set47 = defaultedMap44.entrySet();
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        defaultedMap37.putAll((java.util.Map) defaultedMap42);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) (byte) 10);
        java.lang.Object obj55 = defaultedMap51.remove((java.lang.Object) "{}");
        java.lang.Object obj56 = defaultedMap37.get((java.lang.Object) defaultedMap51);
        boolean b57 = defaultedMap29.containsKey((java.lang.Object) defaultedMap37);
        defaultedMap37.clear();
        boolean b59 = defaultedMap21.containsValue((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0L + "'", obj56.equals(0L));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i4 = defaultedMap3.size();
        defaultedMap3.clear();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i11 = defaultedMap10.size();
        defaultedMap10.clear();
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap15.remove((java.lang.Object) "{}");
        java.lang.String str20 = defaultedMap15.toString();
        java.util.Set set21 = defaultedMap15.entrySet();
        try {
            boolean b22 = fixedOrderComparator0.addAsEqual((java.lang.Object) fixedOrderComparator7, (java.lang.Object) defaultedMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) 100);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) "{}");
        java.lang.Object obj28 = defaultedMap9.get((java.lang.Object) defaultedMap23);
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        defaultedMap9.clear();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator36 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) (byte) 100);
        boolean b42 = defaultedMap9.containsKey((java.lang.Object) (byte) 100);
        java.util.Set set43 = defaultedMap9.keySet();
        java.lang.String str44 = defaultedMap9.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b22 = fixedOrderComparator16.add((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 100.0f);
        java.util.Set set35 = defaultedMap32.entrySet();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        defaultedMap25.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = defaultedMap39.remove((java.lang.Object) "{}");
        java.lang.Object obj44 = defaultedMap25.get((java.lang.Object) defaultedMap39);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap25);
        java.lang.String str46 = defaultedMap19.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b10 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 100.0f);
        java.util.Set set15 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 100.0f);
        java.util.Set set22 = defaultedMap19.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        defaultedMap12.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i27 = defaultedMap26.size();
        java.util.Collection collection28 = defaultedMap26.values();
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) (short) 100);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 100.0f);
        java.util.Set set37 = defaultedMap34.entrySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj43 = defaultedMap41.get((java.lang.Object) 100.0f);
        java.util.Set set44 = defaultedMap41.entrySet();
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        defaultedMap34.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) (byte) 10);
        java.lang.Object obj52 = defaultedMap48.remove((java.lang.Object) "{}");
        java.lang.Object obj53 = defaultedMap34.get((java.lang.Object) defaultedMap48);
        boolean b54 = defaultedMap26.containsKey((java.lang.Object) defaultedMap34);
        java.lang.Object obj55 = defaultedMap17.remove((java.lang.Object) b54);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator();
        boolean b57 = fixedOrderComparator56.isLocked();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i60 = defaultedMap59.size();
        defaultedMap59.clear();
        boolean b62 = fixedOrderComparator56.add((java.lang.Object) defaultedMap59);
        defaultedMap17.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj67 = defaultedMap65.get((java.lang.Object) (byte) 10);
        java.lang.Object obj69 = defaultedMap65.remove((java.lang.Object) "{}");
        java.lang.Object[] obj_array74 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        java.lang.Object[] obj_array76 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator75 };
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array76);
        java.lang.Object obj82 = defaultedMap65.put((java.lang.Object) fixedOrderComparator80, (java.lang.Object) 100);
        try {
            int i83 = fixedOrderComparator9.compare((java.lang.Object) defaultedMap17, obj82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0L + "'", obj36.equals(0L));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0L + "'", obj43.equals(0L));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0L + "'", obj67.equals(0L));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100.0f);
        java.util.Set set14 = defaultedMap11.entrySet();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator22 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b26 = fixedOrderComparator24.add((java.lang.Object) "");
        java.lang.Object obj27 = defaultedMap9.put((java.lang.Object) 0.0f, (java.lang.Object) b26);
        boolean b28 = defaultedMap1.containsKey(obj27);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) "{}");
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator11 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj18 = defaultedMap1.put((java.lang.Object) fixedOrderComparator16, (java.lang.Object) 100);
        boolean b19 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        defaultedMap14.clear();
        boolean b17 = fixedOrderComparator11.add((java.lang.Object) defaultedMap14);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator22.isLocked();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 0, "", 1, (-1L), fixedOrderComparator22, true };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object obj27 = defaultedMap14.get((java.lang.Object) obj_array25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection30 = defaultedMap29.values();
        try {
            boolean b31 = fixedOrderComparator10.addAsEqual((java.lang.Object) obj_array25, (java.lang.Object) collection30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i4 = defaultedMap3.size();
        defaultedMap3.clear();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 0, "", 1, (-1L), fixedOrderComparator11, true };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) obj_array14);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) false);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap3.get((java.lang.Object) defaultedMap16);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap25.entrySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj35 = defaultedMap25.put((java.lang.Object) fixedOrderComparator33, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 100.0f);
        java.util.Set set42 = defaultedMap39.entrySet();
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array45);
        java.lang.Object obj49 = defaultedMap39.put((java.lang.Object) fixedOrderComparator47, (java.lang.Object) false);
        defaultedMap39.clear();
        java.lang.String str51 = defaultedMap39.toString();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate56, predicate57);
        java.util.Set set59 = defaultedMap53.entrySet();
        java.lang.Object obj60 = defaultedMap25.put((java.lang.Object) defaultedMap39, (java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate65, predicate66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate72, predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate(map67, predicate73, predicate75);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj80 = defaultedMap78.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate81, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate75, predicate81);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate20, predicate81);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 0L + "'", obj55.equals(0L));
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0L + "'", obj64.equals(0L));
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0L + "'", obj71.equals(0L));
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 0L + "'", obj80.equals(0L));
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator17);
        try {
            fixedOrderComparator17.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100.0f);
        java.util.Set set23 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 100.0f);
        java.util.Set set30 = defaultedMap27.entrySet();
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        defaultedMap20.putAll((java.util.Map) defaultedMap25);
        boolean b34 = defaultedMap25.containsKey((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 100.0f);
        java.lang.Object obj40 = defaultedMap36.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 100.0f);
        java.util.Set set48 = defaultedMap45.entrySet();
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj50 = defaultedMap36.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap43);
        boolean b51 = defaultedMap25.containsKey((java.lang.Object) defaultedMap43);
        try {
            int i53 = fixedOrderComparator17.compare((java.lang.Object) defaultedMap25, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0L + "'", obj22.equals(0L));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        boolean b15 = defaultedMap6.containsKey((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 100.0f);
        java.util.Set set29 = defaultedMap26.entrySet();
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap24);
        boolean b32 = defaultedMap6.containsKey((java.lang.Object) defaultedMap24);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        try {
            int i13 = fixedOrderComparator2.compare((java.lang.Object) defaultedMap4, (java.lang.Object) map12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) b4);
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) false);
        defaultedMap3.clear();
        java.lang.String str15 = defaultedMap3.toString();
        java.lang.Object obj17 = defaultedMap3.remove((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i5 = defaultedMap4.size();
        java.util.Collection collection6 = defaultedMap4.values();
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) (short) 100);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) (short) 100);
        int i11 = defaultedMap4.size();
        java.lang.String str12 = defaultedMap4.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) 100);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 100);
        int i8 = defaultedMap1.size();
        java.lang.String str9 = defaultedMap1.toString();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) false);
        boolean b14 = fixedOrderComparator11.isLocked();
        int i15 = fixedOrderComparator11.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        java.util.Set set11 = defaultedMap5.entrySet();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator17 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b22 = defaultedMap5.containsValue((java.lang.Object) fixedOrderComparator21);
        try {
            boolean b23 = fixedOrderComparator2.addAsEqual((java.lang.Object) 0L, (java.lang.Object) defaultedMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj19 = defaultedMap8.remove((java.lang.Object) collection18);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate25, predicate26);
        java.util.Set set28 = defaultedMap22.entrySet();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object[] obj_array35 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator34 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b39 = defaultedMap22.containsValue((java.lang.Object) fixedOrderComparator38);
        java.util.Set set40 = defaultedMap22.keySet();
        java.lang.Object obj41 = defaultedMap8.remove((java.lang.Object) set40);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) "{}");
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        int i8 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 100.0f);
        java.util.Set set15 = defaultedMap12.entrySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator23 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b27 = fixedOrderComparator25.add((java.lang.Object) "");
        java.lang.Object obj28 = defaultedMap10.put((java.lang.Object) 0.0f, (java.lang.Object) b27);
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) b27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100.0f);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 100.0f);
        java.util.Set set43 = defaultedMap40.entrySet();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection48 = defaultedMap47.values();
        java.lang.Object obj49 = defaultedMap38.remove((java.lang.Object) collection48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate54, predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate61, predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate(map56, predicate62, predicate64);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) map56);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map66);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0L + "'", obj60.equals(0L));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator8.isLocked();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 0, "", 1, (-1L), fixedOrderComparator8, true };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i15 = defaultedMap14.size();
        java.util.Collection collection16 = defaultedMap14.values();
        java.lang.Object obj18 = defaultedMap14.remove((java.lang.Object) (short) 100);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 100);
        java.util.Set set21 = defaultedMap14.entrySet();
        try {
            boolean b22 = fixedOrderComparator3.addAsEqual((java.lang.Object) fixedOrderComparator12, (java.lang.Object) defaultedMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        java.util.Collection collection8 = defaultedMap6.values();
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (short) 100);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 100.0f);
        java.util.Set set24 = defaultedMap21.entrySet();
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) (byte) 10);
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) "{}");
        java.lang.Object obj33 = defaultedMap14.get((java.lang.Object) defaultedMap28);
        boolean b34 = defaultedMap6.containsKey((java.lang.Object) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i16 = defaultedMap15.size();
        java.util.Collection collection17 = defaultedMap15.values();
        java.lang.Object obj19 = defaultedMap15.remove((java.lang.Object) (short) 100);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) 100.0f);
        java.util.Set set33 = defaultedMap30.entrySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        defaultedMap23.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) (byte) 10);
        java.lang.Object obj41 = defaultedMap37.remove((java.lang.Object) "{}");
        java.lang.Object obj42 = defaultedMap23.get((java.lang.Object) defaultedMap37);
        boolean b43 = defaultedMap15.containsKey((java.lang.Object) defaultedMap23);
        java.lang.Object obj44 = defaultedMap6.remove((java.lang.Object) b43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator();
        boolean b46 = fixedOrderComparator45.isLocked();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i49 = defaultedMap48.size();
        defaultedMap48.clear();
        boolean b51 = fixedOrderComparator45.add((java.lang.Object) defaultedMap48);
        defaultedMap6.putAll((java.util.Map) defaultedMap48);
        java.util.Set set53 = defaultedMap48.keySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) 100.0f);
        java.util.Set set58 = defaultedMap55.entrySet();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) 100.0f);
        java.util.Set set65 = defaultedMap62.entrySet();
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        defaultedMap55.putAll((java.util.Map) defaultedMap60);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) (byte) 10);
        java.lang.Object obj73 = defaultedMap69.remove((java.lang.Object) "{}");
        java.lang.Object obj74 = defaultedMap55.get((java.lang.Object) defaultedMap69);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator();
        boolean b80 = fixedOrderComparator79.isLocked();
        java.lang.Object[] obj_array82 = new java.lang.Object[] { 0, "", 1, (-1L), fixedOrderComparator79, true };
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array82);
        boolean b84 = defaultedMap55.equals((java.lang.Object) obj_array82);
        defaultedMap48.putAll((java.util.Map) defaultedMap55);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0L + "'", obj32.equals(0L));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0L + "'", obj57.equals(0L));
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0L + "'", obj64.equals(0L));
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0L + "'", obj71.equals(0L));
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 0L + "'", obj74.equals(0L));
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(obj_array82);
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b22 = fixedOrderComparator16.add((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 100.0f);
        java.util.Set set35 = defaultedMap32.entrySet();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        defaultedMap25.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = defaultedMap39.remove((java.lang.Object) "{}");
        java.lang.Object obj44 = defaultedMap25.get((java.lang.Object) defaultedMap39);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 100.0f);
        java.util.Set set52 = defaultedMap49.entrySet();
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.lang.Object obj59 = defaultedMap49.put((java.lang.Object) fixedOrderComparator57, (java.lang.Object) false);
        defaultedMap49.clear();
        java.lang.String str61 = defaultedMap49.toString();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i64 = defaultedMap63.size();
        java.util.Collection collection65 = defaultedMap63.values();
        java.lang.Object obj67 = defaultedMap63.remove((java.lang.Object) (short) 100);
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) (short) 100);
        int i70 = defaultedMap63.size();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj74 = defaultedMap72.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate75, predicate76);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj81 = defaultedMap79.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate82, predicate83);
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate(map77, predicate83, predicate85);
        java.lang.Object obj87 = defaultedMap49.put((java.lang.Object) i70, (java.lang.Object) map77);
        java.lang.Object obj88 = defaultedMap25.remove(obj87);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0L + "'", obj51.equals(0L));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 0L + "'", obj74.equals(0L));
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 0L + "'", obj81.equals(0L));
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b22 = fixedOrderComparator16.add((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100.0f);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 100.0f);
        java.util.Set set43 = defaultedMap40.entrySet();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap38);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        boolean b47 = defaultedMap19.containsKey((java.lang.Object) defaultedMap25);
        java.util.Collection collection48 = defaultedMap25.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b22 = fixedOrderComparator16.add((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 100.0f);
        java.util.Set set35 = defaultedMap32.entrySet();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        defaultedMap25.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = defaultedMap39.remove((java.lang.Object) "{}");
        java.lang.Object obj44 = defaultedMap25.get((java.lang.Object) defaultedMap39);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap25);
        int i46 = defaultedMap25.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(i46 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) false);
        defaultedMap17.clear();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.Factory factory30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, factory30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) false);
        defaultedMap17.clear();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj31 = defaultedMap17.get((java.lang.Object) (byte) 1);
        int i32 = defaultedMap17.size();
        int i33 = defaultedMap17.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i4 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 100.0f);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 100.0f);
        java.util.Set set18 = defaultedMap15.entrySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj20 = defaultedMap6.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap13);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i25 = defaultedMap24.size();
        defaultedMap24.clear();
        boolean b27 = fixedOrderComparator21.add((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = defaultedMap13.get((java.lang.Object) defaultedMap24);
        boolean b29 = defaultedMap24.isEmpty();
        java.util.Collection collection30 = defaultedMap24.values();
        boolean b32 = defaultedMap24.containsValue((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 100.0f);
        java.util.Set set40 = defaultedMap37.entrySet();
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj47 = defaultedMap37.put((java.lang.Object) fixedOrderComparator45, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 100.0f);
        java.util.Set set54 = defaultedMap51.entrySet();
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        java.lang.Object[] obj_array57 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object obj61 = defaultedMap51.put((java.lang.Object) fixedOrderComparator59, (java.lang.Object) false);
        defaultedMap51.clear();
        java.lang.String str63 = defaultedMap51.toString();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj67 = defaultedMap65.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate68, predicate69);
        java.util.Set set71 = defaultedMap65.entrySet();
        java.lang.Object obj72 = defaultedMap37.put((java.lang.Object) defaultedMap51, (java.lang.Object) defaultedMap65);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj76 = defaultedMap74.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate77, predicate78);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj83 = defaultedMap81.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate84, predicate85);
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate(map79, predicate85, predicate87);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj92 = defaultedMap90.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate93 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap90, predicate93, predicate94);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate87, predicate93);
        java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) map96);
        try {
            int i98 = fixedOrderComparator0.compare((java.lang.Object) 1.0d, (java.lang.Object) map96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0L + "'", obj67.equals(0L));
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0L + "'", obj76.equals(0L));
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 0L + "'", obj83.equals(0L));
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + 0L + "'", obj92.equals(0L));
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.String str14 = defaultedMap1.toString();
        java.lang.String str15 = defaultedMap1.toString();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate22);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b29 = fixedOrderComparator27.add((java.lang.Object) (short) 10);
        int i30 = fixedOrderComparator27.getUnknownObjectBehavior();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) i30);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) false);
        boolean b14 = fixedOrderComparator11.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap23.entrySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        defaultedMap16.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) "{}");
        java.lang.Object obj35 = defaultedMap16.get((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 100.0f);
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj48 = defaultedMap46.get((java.lang.Object) 100.0f);
        java.util.Set set49 = defaultedMap46.entrySet();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        java.lang.Object obj51 = defaultedMap37.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap44);
        try {
            boolean b52 = fixedOrderComparator11.addAsEqual((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0L + "'", obj32.equals(0L));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0L + "'", obj48.equals(0L));
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) 100);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) "{}");
        java.lang.Object obj28 = defaultedMap9.get((java.lang.Object) defaultedMap23);
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate34, predicate35);
        java.util.Set set37 = defaultedMap31.entrySet();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator43 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array44);
        boolean b48 = defaultedMap31.containsValue((java.lang.Object) fixedOrderComparator47);
        java.lang.Object obj49 = defaultedMap9.remove((java.lang.Object) b48);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj19 = defaultedMap8.remove((java.lang.Object) collection18);
        int i20 = defaultedMap8.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) false);
        defaultedMap17.clear();
        java.lang.String str29 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate34, predicate35);
        java.util.Set set37 = defaultedMap31.entrySet();
        java.lang.Object obj38 = defaultedMap3.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate(map45, predicate51, predicate53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj58 = defaultedMap56.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate53, predicate59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) map62);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0L + "'", obj58.equals(0L));
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(0);
        int i10 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) (byte) 1);
        boolean b15 = fixedOrderComparator7.add((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj19 = defaultedMap8.remove((java.lang.Object) collection18);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 100.0f);
        java.util.Set set25 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap29.entrySet();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap22.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) (byte) 10);
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) "{}");
        java.lang.Object obj41 = defaultedMap22.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj42 = defaultedMap8.get((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate47, predicate48);
        java.util.Set set50 = defaultedMap44.entrySet();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator56 };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array57);
        boolean b61 = defaultedMap44.containsValue((java.lang.Object) fixedOrderComparator60);
        java.util.Set set62 = defaultedMap44.keySet();
        boolean b63 = defaultedMap8.containsKey((java.lang.Object) defaultedMap44);
        boolean b64 = defaultedMap8.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        boolean b15 = defaultedMap6.containsKey((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 100.0f);
        java.util.Set set27 = defaultedMap24.entrySet();
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        defaultedMap17.putAll((java.util.Map) defaultedMap22);
        java.lang.String str30 = defaultedMap17.toString();
        java.lang.String str31 = defaultedMap17.toString();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate32, predicate38);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap6.put((java.lang.Object) map40, obj41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) 100.0f);
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) 100.0f);
        java.util.Set set56 = defaultedMap53.entrySet();
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.lang.Object obj58 = defaultedMap44.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection61 = defaultedMap60.values();
        java.lang.Object obj62 = defaultedMap51.remove((java.lang.Object) collection61);
        java.lang.String str63 = defaultedMap51.toString();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj68 = defaultedMap66.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate69, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate64, predicate70);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj76 = defaultedMap74.get((java.lang.Object) 100.0f);
        java.util.Collection collection77 = defaultedMap74.values();
        java.lang.Object obj78 = defaultedMap6.put((java.lang.Object) predicate70, (java.lang.Object) collection77);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0L + "'", obj36.equals(0L));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0L + "'", obj48.equals(0L));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 0L + "'", obj55.equals(0L));
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 0L + "'", obj68.equals(0L));
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0L + "'", obj76.equals(0L));
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) false);
        defaultedMap17.clear();
        java.lang.String str29 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate34, predicate35);
        java.util.Set set37 = defaultedMap31.entrySet();
        java.lang.Object obj38 = defaultedMap3.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 100.0f);
        java.util.Set set43 = defaultedMap40.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 100.0f);
        java.util.Set set50 = defaultedMap47.entrySet();
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        defaultedMap40.putAll((java.util.Map) defaultedMap45);
        boolean b53 = defaultedMap3.containsKey((java.lang.Object) defaultedMap40);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b53 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) b4);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator14 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator16.setUnknownObjectBehavior(0);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        boolean b20 = fixedOrderComparator19.isLocked();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i23 = defaultedMap22.size();
        defaultedMap22.clear();
        boolean b25 = fixedOrderComparator19.add((java.lang.Object) defaultedMap22);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator30.isLocked();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 0, "", 1, (-1L), fixedOrderComparator30, true };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj35 = defaultedMap22.get((java.lang.Object) obj_array33);
        boolean b36 = fixedOrderComparator16.add((java.lang.Object) defaultedMap22);
        java.lang.Object obj37 = null;
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        defaultedMap39.clear();
        int i41 = fixedOrderComparator16.compare(obj37, (java.lang.Object) defaultedMap39);
        boolean b42 = fixedOrderComparator8.add((java.lang.Object) defaultedMap39);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(b42 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b22 = fixedOrderComparator16.add((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 100.0f);
        java.util.Set set35 = defaultedMap32.entrySet();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        defaultedMap25.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = defaultedMap39.remove((java.lang.Object) "{}");
        java.lang.Object obj44 = defaultedMap25.get((java.lang.Object) defaultedMap39);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 100.0f);
        java.util.Set set52 = defaultedMap49.entrySet();
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.lang.Object obj59 = defaultedMap49.put((java.lang.Object) fixedOrderComparator57, (java.lang.Object) false);
        java.lang.Object obj60 = defaultedMap19.remove((java.lang.Object) false);
        java.lang.String str61 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj65 = defaultedMap63.get((java.lang.Object) 100.0f);
        java.lang.Object obj67 = defaultedMap63.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj74 = defaultedMap72.get((java.lang.Object) 100.0f);
        java.util.Set set75 = defaultedMap72.entrySet();
        defaultedMap70.putAll((java.util.Map) defaultedMap72);
        java.lang.Object obj77 = defaultedMap63.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap70);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator();
        boolean b79 = fixedOrderComparator78.isLocked();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i82 = defaultedMap81.size();
        defaultedMap81.clear();
        boolean b84 = fixedOrderComparator78.add((java.lang.Object) defaultedMap81);
        java.lang.Object obj85 = defaultedMap70.get((java.lang.Object) defaultedMap81);
        boolean b86 = defaultedMap81.isEmpty();
        java.util.Collection collection87 = defaultedMap81.values();
        java.util.Set set88 = defaultedMap81.entrySet();
        boolean b89 = defaultedMap19.containsKey((java.lang.Object) set88);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0L + "'", obj51.equals(0L));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0L + "'", obj65.equals(0L));
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0L + "'", obj67.equals(0L));
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 0L + "'", obj74.equals(0L));
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + 0L + "'", obj85.equals(0L));
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertTrue(b89 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b10 = fixedOrderComparator8.add((java.lang.Object) (byte) 100);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        boolean b12 = fixedOrderComparator8.isLocked();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.String str14 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap23.entrySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        defaultedMap16.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) (byte) 10);
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) "{}");
        java.lang.Object obj35 = defaultedMap16.get((java.lang.Object) defaultedMap30);
        boolean b36 = defaultedMap10.containsKey((java.lang.Object) defaultedMap30);
        try {
            boolean b38 = fixedOrderComparator8.addAsEqual((java.lang.Object) defaultedMap30, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0L + "'", obj32.equals(0L));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i4 = defaultedMap3.size();
        defaultedMap3.clear();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 0, "", 1, (-1L), fixedOrderComparator11, true };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) obj_array14);
        java.lang.Object obj18 = defaultedMap3.get((java.lang.Object) 'a');
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b22 = fixedOrderComparator16.add((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100.0f);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 100.0f);
        java.util.Set set43 = defaultedMap40.entrySet();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap38);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        boolean b47 = defaultedMap19.containsKey((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i50 = defaultedMap49.size();
        java.util.Collection collection51 = defaultedMap49.values();
        java.lang.Object obj53 = defaultedMap49.remove((java.lang.Object) (short) 100);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj59 = defaultedMap57.get((java.lang.Object) 100.0f);
        java.util.Set set60 = defaultedMap57.entrySet();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj66 = defaultedMap64.get((java.lang.Object) 100.0f);
        java.util.Set set67 = defaultedMap64.entrySet();
        defaultedMap62.putAll((java.util.Map) defaultedMap64);
        defaultedMap57.putAll((java.util.Map) defaultedMap62);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj73 = defaultedMap71.get((java.lang.Object) (byte) 10);
        java.lang.Object obj75 = defaultedMap71.remove((java.lang.Object) "{}");
        java.lang.Object obj76 = defaultedMap57.get((java.lang.Object) defaultedMap71);
        boolean b77 = defaultedMap49.containsKey((java.lang.Object) defaultedMap57);
        java.lang.Object obj78 = defaultedMap19.get((java.lang.Object) defaultedMap49);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0L + "'", obj59.equals(0L));
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0L + "'", obj66.equals(0L));
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0L + "'", obj73.equals(0L));
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0L + "'", obj76.equals(0L));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 0L + "'", obj78.equals(0L));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i16 = defaultedMap15.size();
        defaultedMap15.clear();
        boolean b18 = fixedOrderComparator12.add((java.lang.Object) defaultedMap15);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 0, "", 1, (-1L), fixedOrderComparator23, true };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj28 = defaultedMap15.get((java.lang.Object) obj_array26);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 100.0f);
        java.util.Set set36 = defaultedMap33.entrySet();
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array39);
        java.lang.Object obj43 = defaultedMap33.put((java.lang.Object) fixedOrderComparator41, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 100.0f);
        java.util.Set set50 = defaultedMap47.entrySet();
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array53);
        java.lang.Object obj57 = defaultedMap47.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) false);
        defaultedMap47.clear();
        java.lang.String str59 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj63 = defaultedMap61.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate64, predicate65);
        java.util.Set set67 = defaultedMap61.entrySet();
        java.lang.Object obj68 = defaultedMap33.put((java.lang.Object) defaultedMap47, (java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj72 = defaultedMap70.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate73, predicate74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj79 = defaultedMap77.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate80, predicate81);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate(map75, predicate81, predicate83);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj88 = defaultedMap86.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap86, predicate89, predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate83, predicate89);
        boolean b93 = defaultedMap15.containsKey((java.lang.Object) defaultedMap47);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0L + "'", obj63.equals(0L));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 0L + "'", obj72.equals(0L));
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 0L + "'", obj79.equals(0L));
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 0L + "'", obj88.equals(0L));
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) "{}");
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator11 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj18 = defaultedMap1.put((java.lang.Object) fixedOrderComparator16, (java.lang.Object) 100);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 100.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100.0f);
        java.util.Set set34 = defaultedMap31.entrySet();
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection39 = defaultedMap38.values();
        java.lang.Object obj40 = defaultedMap29.remove((java.lang.Object) collection39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate(map47, predicate53, predicate55);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) map47);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj61 = defaultedMap59.get((java.lang.Object) 100.0f);
        java.util.Set set62 = defaultedMap59.entrySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj68 = defaultedMap66.get((java.lang.Object) 100.0f);
        java.util.Set set69 = defaultedMap66.entrySet();
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        defaultedMap59.putAll((java.util.Map) defaultedMap64);
        java.lang.Object obj73 = defaultedMap64.get((java.lang.Object) '4');
        int i74 = fixedOrderComparator16.compare((java.lang.Object) map47, (java.lang.Object) defaultedMap64);
        try {
            fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0L + "'", obj51.equals(0L));
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0L + "'", obj61.equals(0L));
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 0L + "'", obj68.equals(0L));
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0L + "'", obj73.equals(0L));
        org.junit.Assert.assertTrue(i74 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator14 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) "");
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) 0.0f, (java.lang.Object) b18);
        java.lang.String str20 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{0.0=true}" + "'", str20.equals("{0.0=true}"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap15.remove((java.lang.Object) "{}");
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i23 = defaultedMap22.size();
        java.util.Collection collection24 = defaultedMap22.values();
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap22.get((java.lang.Object) predicate31);
        boolean b35 = defaultedMap15.containsValue((java.lang.Object) predicate31);
        int i36 = defaultedMap15.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i11 = defaultedMap10.size();
        java.util.Collection collection12 = defaultedMap10.values();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) (short) 100);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) 100);
        boolean b17 = fixedOrderComparator7.add((java.lang.Object) (short) 100);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator23 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        boolean b26 = fixedOrderComparator25.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i29 = defaultedMap28.size();
        java.util.Collection collection30 = defaultedMap28.values();
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) (short) 100);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (short) 100);
        boolean b35 = fixedOrderComparator25.add((java.lang.Object) (short) 100);
        boolean b36 = fixedOrderComparator25.isLocked();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator42 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array43);
        try {
            int i49 = fixedOrderComparator7.compare((java.lang.Object) fixedOrderComparator25, (java.lang.Object) fixedOrderComparator48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNotNull(obj_array43);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100.0f);
        java.util.Set set23 = defaultedMap20.entrySet();
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap18);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator31 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b34 = fixedOrderComparator33.isLocked();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i37 = defaultedMap36.size();
        java.util.Collection collection38 = defaultedMap36.values();
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) (short) 100);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) (short) 100);
        boolean b43 = fixedOrderComparator33.add((java.lang.Object) (short) 100);
        boolean b44 = fixedOrderComparator33.isLocked();
        try {
            int i45 = fixedOrderComparator7.compare((java.lang.Object) defaultedMap18, (java.lang.Object) fixedOrderComparator33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0L + "'", obj22.equals(0L));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i11 = defaultedMap10.size();
        java.util.Collection collection12 = defaultedMap10.values();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) (short) 100);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) 100);
        boolean b17 = fixedOrderComparator7.add((java.lang.Object) (short) 100);
        boolean b18 = fixedOrderComparator7.isLocked();
        boolean b20 = fixedOrderComparator7.add((java.lang.Object) 100.0d);
        int i21 = fixedOrderComparator7.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 100.0f);
        java.util.Set set10 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap14.entrySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) "{}");
        java.lang.Object obj26 = defaultedMap7.get((java.lang.Object) defaultedMap21);
        boolean b27 = defaultedMap1.containsKey((java.lang.Object) defaultedMap21);
        java.util.Collection collection28 = defaultedMap21.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        boolean b12 = defaultedMap1.isEmpty();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) false);
        defaultedMap17.clear();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        java.util.Set set30 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap25.entrySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj35 = defaultedMap25.put((java.lang.Object) fixedOrderComparator33, (java.lang.Object) false);
        defaultedMap25.clear();
        java.lang.Object obj37 = defaultedMap9.get((java.lang.Object) defaultedMap25);
        defaultedMap1.putAll((java.util.Map) defaultedMap25);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) 100);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 100.0f);
        java.util.Set set21 = defaultedMap18.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj23 = defaultedMap9.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap16);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i28 = defaultedMap27.size();
        defaultedMap27.clear();
        boolean b30 = fixedOrderComparator24.add((java.lang.Object) defaultedMap27);
        java.lang.Object obj31 = defaultedMap16.get((java.lang.Object) defaultedMap27);
        java.lang.String str32 = defaultedMap27.toString();
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap27);
        java.util.Set set34 = defaultedMap1.entrySet();
        boolean b36 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 100.0f);
        java.util.Set set23 = defaultedMap20.entrySet();
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap18);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i30 = defaultedMap29.size();
        defaultedMap29.clear();
        boolean b32 = fixedOrderComparator26.add((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = defaultedMap18.get((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) 100.0f);
        java.util.Set set38 = defaultedMap35.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 100.0f);
        java.util.Set set45 = defaultedMap42.entrySet();
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        defaultedMap35.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = defaultedMap49.remove((java.lang.Object) "{}");
        java.lang.Object obj54 = defaultedMap35.get((java.lang.Object) defaultedMap49);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap35);
        boolean b56 = defaultedMap7.containsKey((java.lang.Object) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        boolean b59 = fixedOrderComparator58.isLocked();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i62 = defaultedMap61.size();
        defaultedMap61.clear();
        boolean b64 = fixedOrderComparator58.add((java.lang.Object) defaultedMap61);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        boolean b70 = fixedOrderComparator69.isLocked();
        java.lang.Object[] obj_array72 = new java.lang.Object[] { 0, "", 1, (-1L), fixedOrderComparator69, true };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        java.lang.Object obj74 = defaultedMap61.get((java.lang.Object) obj_array72);
        boolean b76 = defaultedMap61.equals((java.lang.Object) "");
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) b76);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0L + "'", obj22.equals(0L));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0L + "'", obj51.equals(0L));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0L + "'", obj54.equals(0L));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 0L + "'", obj74.equals(0L));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map79);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i10 = defaultedMap9.size();
        java.util.Collection collection11 = defaultedMap9.values();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) (short) 100);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 100.0f);
        java.util.Set set29 = defaultedMap26.entrySet();
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap24);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        boolean b33 = fixedOrderComparator32.isLocked();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i36 = defaultedMap35.size();
        defaultedMap35.clear();
        boolean b38 = fixedOrderComparator32.add((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) defaultedMap35);
        java.lang.String str40 = defaultedMap35.toString();
        boolean b41 = defaultedMap9.containsKey((java.lang.Object) defaultedMap35);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap35);
        int i43 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(i43 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i16 = defaultedMap15.size();
        java.util.Collection collection17 = defaultedMap15.values();
        java.lang.Object obj19 = defaultedMap15.remove((java.lang.Object) (short) 100);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) 100.0f);
        java.util.Set set33 = defaultedMap30.entrySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        defaultedMap23.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) (byte) 10);
        java.lang.Object obj41 = defaultedMap37.remove((java.lang.Object) "{}");
        java.lang.Object obj42 = defaultedMap23.get((java.lang.Object) defaultedMap37);
        boolean b43 = defaultedMap15.containsKey((java.lang.Object) defaultedMap23);
        java.lang.Object obj44 = defaultedMap6.remove((java.lang.Object) b43);
        defaultedMap6.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0L + "'", obj32.equals(0L));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) false);
        defaultedMap17.clear();
        java.lang.String str29 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate34, predicate35);
        java.util.Set set37 = defaultedMap31.entrySet();
        java.lang.Object obj38 = defaultedMap3.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap31);
        int i39 = defaultedMap17.size();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b22 = fixedOrderComparator16.add((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) 10);
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100.0f);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 100.0f);
        java.util.Set set43 = defaultedMap40.entrySet();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap38);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        boolean b47 = defaultedMap19.containsKey((java.lang.Object) defaultedMap25);
        java.lang.Object[] obj_array52 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator53 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap25.put((java.lang.Object) fixedOrderComparator57, obj58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i62 = defaultedMap61.size();
        java.util.Collection collection63 = defaultedMap61.values();
        java.lang.Object obj65 = defaultedMap61.remove((java.lang.Object) (short) 100);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) 100.0f);
        java.util.Set set72 = defaultedMap69.entrySet();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj78 = defaultedMap76.get((java.lang.Object) 100.0f);
        java.util.Set set79 = defaultedMap76.entrySet();
        defaultedMap74.putAll((java.util.Map) defaultedMap76);
        defaultedMap69.putAll((java.util.Map) defaultedMap74);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj85 = defaultedMap83.get((java.lang.Object) (byte) 10);
        java.lang.Object obj87 = defaultedMap83.remove((java.lang.Object) "{}");
        java.lang.Object obj88 = defaultedMap69.get((java.lang.Object) defaultedMap83);
        boolean b89 = defaultedMap61.containsKey((java.lang.Object) defaultedMap69);
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator();
        try {
            int i91 = fixedOrderComparator57.compare((java.lang.Object) b89, (java.lang.Object) fixedOrderComparator90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0L + "'", obj71.equals(0L));
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 0L + "'", obj78.equals(0L));
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + 0L + "'", obj85.equals(0L));
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 0L + "'", obj88.equals(0L));
        org.junit.Assert.assertTrue(b89 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 100.0f);
        java.util.Set set18 = defaultedMap15.entrySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj25 = defaultedMap15.put((java.lang.Object) fixedOrderComparator23, (java.lang.Object) false);
        defaultedMap15.clear();
        java.lang.String str27 = defaultedMap15.toString();
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        boolean b29 = defaultedMap15.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        java.util.Set set8 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 100.0f);
        java.util.Set set15 = defaultedMap12.entrySet();
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        boolean b19 = defaultedMap10.containsKey((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) b19);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 100.0f);
        java.util.Set set10 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap14.entrySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) (byte) 10);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) "{}");
        java.lang.Object obj26 = defaultedMap7.get((java.lang.Object) defaultedMap21);
        boolean b27 = defaultedMap1.containsKey((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate39, predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate(map41, predicate47, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate49);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0L + "'", obj45.equals(0L));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator8.isLocked();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) false);
        defaultedMap17.clear();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        int i30 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0f);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) false);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap3.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 100.0f);
        java.util.Set set24 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 100.0f);
        java.util.Set set31 = defaultedMap28.entrySet();
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        defaultedMap21.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 100.0f);
        java.util.Set set40 = defaultedMap37.entrySet();
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj47 = defaultedMap37.put((java.lang.Object) fixedOrderComparator45, (java.lang.Object) false);
        defaultedMap37.clear();
        java.lang.Object obj49 = defaultedMap21.get((java.lang.Object) defaultedMap37);
        java.lang.Object obj51 = defaultedMap37.get((java.lang.Object) (byte) 1);
        int i52 = defaultedMap37.size();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i56 = defaultedMap55.size();
        defaultedMap55.clear();
        java.util.Set set58 = defaultedMap55.entrySet();
        java.util.Set set59 = defaultedMap55.entrySet();
        java.util.Map map60 = collections.map.DefaultedMap.decorate(map53, (java.lang.Object) set59);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0L + "'", obj51.equals(0L));
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        fixedOrderComparator2.setUnknownObjectBehavior(0);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 1);
        try {
            fixedOrderComparator2.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) 100);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 100.0f);
        java.util.Set set21 = defaultedMap18.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj23 = defaultedMap9.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap16);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i28 = defaultedMap27.size();
        defaultedMap27.clear();
        boolean b30 = fixedOrderComparator24.add((java.lang.Object) defaultedMap27);
        java.lang.Object obj31 = defaultedMap16.get((java.lang.Object) defaultedMap27);
        java.lang.String str32 = defaultedMap27.toString();
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i36 = defaultedMap35.size();
        java.util.Collection collection37 = defaultedMap35.values();
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) (short) 100);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 100.0f);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 100.0f);
        java.util.Set set55 = defaultedMap52.entrySet();
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap50);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator();
        boolean b59 = fixedOrderComparator58.isLocked();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i62 = defaultedMap61.size();
        defaultedMap61.clear();
        boolean b64 = fixedOrderComparator58.add((java.lang.Object) defaultedMap61);
        java.lang.Object obj65 = defaultedMap50.get((java.lang.Object) defaultedMap61);
        java.lang.String str66 = defaultedMap61.toString();
        boolean b67 = defaultedMap35.containsKey((java.lang.Object) defaultedMap61);
        defaultedMap27.putAll((java.util.Map) defaultedMap61);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0L + "'", obj45.equals(0L));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0L + "'", obj54.equals(0L));
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0L + "'", obj65.equals(0L));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) "{}");
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 100.0f);
        java.util.Set set22 = defaultedMap19.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj24 = defaultedMap10.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj28 = defaultedMap17.remove((java.lang.Object) collection27);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) collection27);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i4 = defaultedMap3.size();
        defaultedMap3.clear();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        boolean b7 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map14, predicate20, predicate22);
        boolean b24 = defaultedMap3.equals((java.lang.Object) predicate20);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 100.0f);
        java.util.Collection collection15 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        java.lang.Object obj17 = null;
        try {
            boolean b18 = fixedOrderComparator10.addAsEqual((java.lang.Object) defaultedMap12, obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b22 = fixedOrderComparator16.add((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        boolean b24 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection27 = defaultedMap26.values();
        boolean b28 = defaultedMap19.equals((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) 100);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.util.Set set12 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) "{}");
        java.lang.Object obj28 = defaultedMap9.get((java.lang.Object) defaultedMap23);
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        java.util.Set set30 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) predicate10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 100.0f);
        java.util.Set set18 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 100.0f);
        java.util.Set set25 = defaultedMap22.entrySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        defaultedMap15.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100.0f);
        java.util.Set set34 = defaultedMap31.entrySet();
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap31.put((java.lang.Object) fixedOrderComparator39, (java.lang.Object) false);
        defaultedMap31.clear();
        java.lang.Object obj43 = defaultedMap15.get((java.lang.Object) defaultedMap31);
        java.lang.Object obj44 = defaultedMap1.remove((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) 100.0f);
        java.util.Set set51 = defaultedMap48.entrySet();
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i55 = defaultedMap54.size();
        java.util.Collection collection56 = defaultedMap54.values();
        java.lang.Object obj58 = defaultedMap54.remove((java.lang.Object) (short) 100);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) 100.0f);
        java.lang.Object obj66 = defaultedMap62.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj73 = defaultedMap71.get((java.lang.Object) 100.0f);
        java.util.Set set74 = defaultedMap71.entrySet();
        defaultedMap69.putAll((java.util.Map) defaultedMap71);
        java.lang.Object obj76 = defaultedMap62.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap69);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator();
        boolean b78 = fixedOrderComparator77.isLocked();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i81 = defaultedMap80.size();
        defaultedMap80.clear();
        boolean b83 = fixedOrderComparator77.add((java.lang.Object) defaultedMap80);
        java.lang.Object obj84 = defaultedMap69.get((java.lang.Object) defaultedMap80);
        java.lang.String str85 = defaultedMap80.toString();
        boolean b86 = defaultedMap54.containsKey((java.lang.Object) defaultedMap80);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) defaultedMap80);
        defaultedMap1.putAll(map87);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0L + "'", obj43.equals(0L));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0L + "'", obj64.equals(0L));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0L + "'", obj66.equals(0L));
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0L + "'", obj73.equals(0L));
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 0L + "'", obj84.equals(0L));
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{}" + "'", str85.equals("{}"));
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(map87);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        java.util.Collection collection8 = defaultedMap6.values();
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (short) 100);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 100.0f);
        java.util.Set set24 = defaultedMap21.entrySet();
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) (byte) 10);
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) "{}");
        java.lang.Object obj33 = defaultedMap14.get((java.lang.Object) defaultedMap28);
        boolean b34 = defaultedMap6.containsKey((java.lang.Object) defaultedMap14);
        defaultedMap14.clear();
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        java.lang.Object[] obj_array42 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator41 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b46 = fixedOrderComparator44.add((java.lang.Object) (byte) 100);
        boolean b47 = defaultedMap14.containsKey((java.lang.Object) (byte) 100);
        java.util.Collection collection48 = defaultedMap14.values();
        java.util.Collection collection49 = defaultedMap14.values();
        boolean b50 = defaultedMap1.containsValue((java.lang.Object) defaultedMap14);
        java.lang.Object obj52 = defaultedMap1.get((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0L + "'", obj52.equals(0L));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i4 = defaultedMap3.size();
        defaultedMap3.clear();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 0, "", 1, (-1L), fixedOrderComparator11, true };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) obj_array14);
        java.util.Collection collection17 = defaultedMap3.values();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) 100);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 100.0f);
        java.util.Set set21 = defaultedMap18.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj23 = defaultedMap9.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap16);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i28 = defaultedMap27.size();
        defaultedMap27.clear();
        boolean b30 = fixedOrderComparator24.add((java.lang.Object) defaultedMap27);
        java.lang.Object obj31 = defaultedMap16.get((java.lang.Object) defaultedMap27);
        java.lang.String str32 = defaultedMap27.toString();
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap27);
        java.util.Set set34 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate39, predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate(map41, predicate47, predicate49);
        defaultedMap1.putAll(map50);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0L + "'", obj45.equals(0L));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) "{}");
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) "{}");
        java.lang.String str16 = defaultedMap11.toString();
        defaultedMap11.clear();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap11);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        fixedOrderComparator0.setUnknownObjectBehavior(2);
        boolean b4 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) predicate10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 100.0f);
        java.util.Set set18 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 100.0f);
        java.util.Set set25 = defaultedMap22.entrySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        defaultedMap15.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100.0f);
        java.util.Set set34 = defaultedMap31.entrySet();
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap31.put((java.lang.Object) fixedOrderComparator39, (java.lang.Object) false);
        defaultedMap31.clear();
        java.lang.Object obj43 = defaultedMap15.get((java.lang.Object) defaultedMap31);
        java.lang.Object obj44 = defaultedMap1.remove((java.lang.Object) defaultedMap31);
        defaultedMap1.clear();
        collections.Factory factory46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0L + "'", obj43.equals(0L));
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) false);
        defaultedMap17.clear();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate34, predicate35);
        java.util.Set set37 = defaultedMap31.entrySet();
        java.util.Collection collection38 = defaultedMap31.values();
        java.lang.Object obj39 = defaultedMap1.get((java.lang.Object) collection38);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj22 = defaultedMap8.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap15);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i27 = defaultedMap26.size();
        defaultedMap26.clear();
        boolean b29 = fixedOrderComparator23.add((java.lang.Object) defaultedMap26);
        java.lang.Object obj30 = defaultedMap15.get((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 100.0f);
        java.util.Set set35 = defaultedMap32.entrySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 100.0f);
        java.util.Set set42 = defaultedMap39.entrySet();
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        defaultedMap32.putAll((java.util.Map) defaultedMap37);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj48 = defaultedMap46.get((java.lang.Object) (byte) 10);
        java.lang.Object obj50 = defaultedMap46.remove((java.lang.Object) "{}");
        java.lang.Object obj51 = defaultedMap32.get((java.lang.Object) defaultedMap46);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj55 = defaultedMap4.put((java.lang.Object) defaultedMap32, (java.lang.Object) 0L);
        boolean b56 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0L + "'", obj6.equals(0L));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0L + "'", obj48.equals(0L));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0L + "'", obj51.equals(0L));
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b22 = fixedOrderComparator16.add((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate28, predicate29);
        java.util.Set set31 = defaultedMap25.entrySet();
        java.lang.Object obj32 = defaultedMap8.remove((java.lang.Object) set31);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i4 = defaultedMap3.size();
        defaultedMap3.clear();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 0, "", 1, (-1L), fixedOrderComparator11, true };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) obj_array14);
        java.lang.Object obj18 = defaultedMap3.get((java.lang.Object) 'a');
        int i19 = defaultedMap3.size();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap14.entrySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap12);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        boolean b21 = fixedOrderComparator20.isLocked();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i24 = defaultedMap23.size();
        defaultedMap23.clear();
        boolean b26 = fixedOrderComparator20.add((java.lang.Object) defaultedMap23);
        java.lang.Object obj27 = defaultedMap12.get((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 100.0f);
        java.util.Set set32 = defaultedMap29.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 100.0f);
        java.util.Set set39 = defaultedMap36.entrySet();
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        defaultedMap29.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) (byte) 10);
        java.lang.Object obj47 = defaultedMap43.remove((java.lang.Object) "{}");
        java.lang.Object obj48 = defaultedMap29.get((java.lang.Object) defaultedMap43);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) defaultedMap29);
        boolean b50 = defaultedMap1.containsKey((java.lang.Object) defaultedMap23);
        collections.Transformer transformer51 = null;
        try {
            java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0L + "'", obj45.equals(0L));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0L + "'", obj48.equals(0L));
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) false);
        defaultedMap17.clear();
        java.lang.String str29 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate34, predicate35);
        java.util.Set set37 = defaultedMap31.entrySet();
        java.lang.Object obj38 = defaultedMap3.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap31);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator44 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        boolean b47 = defaultedMap17.equals((java.lang.Object) fixedOrderComparator46);
        java.util.Set set48 = defaultedMap17.entrySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b10 = fixedOrderComparator8.add((java.lang.Object) (byte) 100);
        int i11 = fixedOrderComparator8.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator8.add((java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) "{}");
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        int i8 = defaultedMap1.size();
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) false);
        defaultedMap3.clear();
        java.lang.String str15 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i18 = defaultedMap17.size();
        java.util.Collection collection19 = defaultedMap17.values();
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) (short) 100);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) (short) 100);
        int i24 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate(map31, predicate37, predicate39);
        java.lang.Object obj41 = defaultedMap3.put((java.lang.Object) i24, (java.lang.Object) map31);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 100.0f);
        java.util.Set set48 = defaultedMap45.entrySet();
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array51);
        java.lang.Object obj55 = defaultedMap45.put((java.lang.Object) fixedOrderComparator53, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj61 = defaultedMap59.get((java.lang.Object) 100.0f);
        java.util.Set set62 = defaultedMap59.entrySet();
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        java.lang.Object[] obj_array65 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array65);
        java.lang.Object obj69 = defaultedMap59.put((java.lang.Object) fixedOrderComparator67, (java.lang.Object) false);
        defaultedMap59.clear();
        java.lang.String str71 = defaultedMap59.toString();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj75 = defaultedMap73.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate76, predicate77);
        java.util.Set set79 = defaultedMap73.entrySet();
        java.lang.Object obj80 = defaultedMap45.put((java.lang.Object) defaultedMap59, (java.lang.Object) defaultedMap73);
        defaultedMap3.putAll((java.util.Map) defaultedMap73);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0L + "'", obj61.equals(0L));
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 0L + "'", obj75.equals(0L));
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) b4);
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) "{}");
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        int i8 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.keySet();
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) set13);
        java.util.Set set15 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i18 = defaultedMap17.size();
        java.util.Collection collection19 = defaultedMap17.values();
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate26, predicate27);
        java.lang.Object obj29 = defaultedMap17.get((java.lang.Object) predicate26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100.0f);
        java.util.Set set34 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap38.get((java.lang.Object) 100.0f);
        java.util.Set set41 = defaultedMap38.entrySet();
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        defaultedMap31.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 100.0f);
        java.util.Set set50 = defaultedMap47.entrySet();
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array53);
        java.lang.Object obj57 = defaultedMap47.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) false);
        defaultedMap47.clear();
        java.lang.Object obj59 = defaultedMap31.get((java.lang.Object) defaultedMap47);
        java.lang.Object obj60 = defaultedMap17.remove((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection63 = defaultedMap62.values();
        java.lang.String str64 = defaultedMap62.toString();
        java.lang.Object obj65 = defaultedMap1.put((java.lang.Object) defaultedMap47, (java.lang.Object) defaultedMap62);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0L + "'", obj59.equals(0L));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i16 = defaultedMap15.size();
        defaultedMap15.clear();
        boolean b18 = fixedOrderComparator12.add((java.lang.Object) defaultedMap15);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        boolean b24 = fixedOrderComparator23.isLocked();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 0, "", 1, (-1L), fixedOrderComparator23, true };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj28 = defaultedMap15.get((java.lang.Object) obj_array26);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100.0f);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 100.0f);
        java.util.Set set43 = defaultedMap40.entrySet();
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection48 = defaultedMap47.values();
        java.lang.Object obj49 = defaultedMap38.remove((java.lang.Object) collection48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate54, predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate61, predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate(map56, predicate62, predicate64);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) map56);
        java.lang.Object obj67 = defaultedMap15.get((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0L + "'", obj60.equals(0L));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0L + "'", obj67.equals(0L));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator14 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) "");
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) 0.0f, (java.lang.Object) b18);
        java.util.Set set20 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.String str14 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 100.0f);
        java.util.Set set19 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap23.entrySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        defaultedMap16.putAll((java.util.Map) defaultedMap21);
        java.lang.String str29 = defaultedMap16.toString();
        java.lang.String str30 = defaultedMap16.toString();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate36, predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate31, predicate37);
        boolean b40 = defaultedMap1.equals((java.lang.Object) predicate31);
        boolean b41 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i18 = defaultedMap17.size();
        defaultedMap17.clear();
        java.util.Set set20 = defaultedMap17.entrySet();
        java.util.Set set21 = defaultedMap17.entrySet();
        try {
            int i22 = fixedOrderComparator10.compare((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array8);
        boolean b11 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) (byte) 10);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) "{}");
        java.lang.String str18 = defaultedMap13.toString();
        java.util.Set set19 = defaultedMap13.entrySet();
        java.util.Set set20 = defaultedMap13.entrySet();
        java.util.Collection collection21 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i24 = defaultedMap23.size();
        java.util.Collection collection25 = defaultedMap23.values();
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) (short) 100);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100.0f);
        java.util.Set set34 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap38.get((java.lang.Object) 100.0f);
        java.util.Set set41 = defaultedMap38.entrySet();
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        defaultedMap31.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) (byte) 10);
        java.lang.Object obj49 = defaultedMap45.remove((java.lang.Object) "{}");
        java.lang.Object obj50 = defaultedMap31.get((java.lang.Object) defaultedMap45);
        boolean b51 = defaultedMap23.containsKey((java.lang.Object) defaultedMap31);
        java.util.Set set52 = defaultedMap31.keySet();
        try {
            int i53 = fixedOrderComparator10.compare((java.lang.Object) collection21, (java.lang.Object) set52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i4 = defaultedMap3.size();
        defaultedMap3.clear();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        boolean b12 = fixedOrderComparator11.isLocked();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 0, "", 1, (-1L), fixedOrderComparator11, true };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        boolean b15 = defaultedMap6.containsKey((java.lang.Object) (short) 1);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator21 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator26);
        boolean b28 = fixedOrderComparator26.isLocked();
        java.lang.Object obj29 = defaultedMap6.get((java.lang.Object) b28);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) predicate10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 100.0f);
        java.util.Set set18 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 100.0f);
        java.util.Set set25 = defaultedMap22.entrySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        defaultedMap15.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100.0f);
        java.util.Set set34 = defaultedMap31.entrySet();
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj41 = defaultedMap31.put((java.lang.Object) fixedOrderComparator39, (java.lang.Object) false);
        defaultedMap31.clear();
        java.lang.Object obj43 = defaultedMap15.get((java.lang.Object) defaultedMap31);
        java.lang.Object obj44 = defaultedMap1.remove((java.lang.Object) defaultedMap31);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicate45);
        defaultedMap46.clear();
        java.lang.Object obj48 = defaultedMap1.get((java.lang.Object) defaultedMap46);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0L + "'", obj43.equals(0L));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0L + "'", obj48.equals(0L));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b22 = fixedOrderComparator16.add((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 100.0f);
        java.util.Set set28 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 100.0f);
        java.util.Set set35 = defaultedMap32.entrySet();
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        defaultedMap25.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) (byte) 10);
        java.lang.Object obj43 = defaultedMap39.remove((java.lang.Object) "{}");
        java.lang.Object obj44 = defaultedMap25.get((java.lang.Object) defaultedMap39);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap25);
        java.util.Collection collection46 = defaultedMap19.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(collection46);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) (short) 10);
        int i5 = fixedOrderComparator2.getUnknownObjectBehavior();
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        boolean b7 = fixedOrderComparator2.add((java.lang.Object) predicateUtils6);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b10 = fixedOrderComparator8.add((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate15, predicate16);
        java.util.Set set18 = defaultedMap12.entrySet();
        boolean b19 = fixedOrderComparator8.add((java.lang.Object) set18);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) false);
        defaultedMap17.clear();
        java.lang.String str29 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate34, predicate35);
        java.util.Set set37 = defaultedMap31.entrySet();
        java.lang.Object obj38 = defaultedMap3.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap31);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator44 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        boolean b47 = defaultedMap17.equals((java.lang.Object) fixedOrderComparator46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 100.0f);
        java.lang.Object obj53 = defaultedMap49.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) 100.0f);
        java.util.Set set61 = defaultedMap58.entrySet();
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        java.lang.Object obj63 = defaultedMap49.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap56);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator();
        boolean b65 = fixedOrderComparator64.isLocked();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i68 = defaultedMap67.size();
        defaultedMap67.clear();
        boolean b70 = fixedOrderComparator64.add((java.lang.Object) defaultedMap67);
        java.lang.Object obj71 = defaultedMap56.get((java.lang.Object) defaultedMap67);
        boolean b72 = defaultedMap67.isEmpty();
        java.util.Collection collection73 = defaultedMap67.values();
        java.util.Set set74 = defaultedMap67.entrySet();
        java.lang.Object obj75 = defaultedMap17.get((java.lang.Object) defaultedMap67);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0L + "'", obj51.equals(0L));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0L + "'", obj60.equals(0L));
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0L + "'", obj71.equals(0L));
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 0L + "'", obj75.equals(0L));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.util.Set set7 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.remove(obj5);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i7 = defaultedMap6.size();
        java.util.Collection collection8 = defaultedMap6.values();
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (short) 100);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 100.0f);
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 100.0f);
        java.util.Set set24 = defaultedMap21.entrySet();
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) (byte) 10);
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) "{}");
        java.lang.Object obj33 = defaultedMap14.get((java.lang.Object) defaultedMap28);
        boolean b34 = defaultedMap6.containsKey((java.lang.Object) defaultedMap14);
        defaultedMap14.clear();
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        java.lang.Object[] obj_array42 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator41 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b46 = fixedOrderComparator44.add((java.lang.Object) (byte) 100);
        boolean b47 = defaultedMap14.containsKey((java.lang.Object) (byte) 100);
        java.util.Collection collection48 = defaultedMap14.values();
        java.util.Collection collection49 = defaultedMap14.values();
        boolean b50 = defaultedMap1.containsValue((java.lang.Object) defaultedMap14);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator56 };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array57);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i8 = defaultedMap7.size();
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i12 = defaultedMap11.size();
        java.util.Collection collection13 = defaultedMap11.values();
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap11.get((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate20, predicate28);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) map31);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = fixedOrderComparator16.isLocked();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i20 = defaultedMap19.size();
        defaultedMap19.clear();
        boolean b22 = fixedOrderComparator16.add((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) defaultedMap19);
        boolean b24 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 100.0f);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) 100.0f);
        java.util.Set set38 = defaultedMap35.entrySet();
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj40 = defaultedMap26.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection43 = defaultedMap42.values();
        java.lang.Object obj44 = defaultedMap33.remove((java.lang.Object) collection43);
        boolean b45 = defaultedMap19.equals(obj44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 100.0f);
        java.util.Set set50 = defaultedMap47.entrySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj56 = defaultedMap54.get((java.lang.Object) 100.0f);
        java.util.Set set57 = defaultedMap54.entrySet();
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        defaultedMap47.putAll((java.util.Map) defaultedMap52);
        boolean b61 = defaultedMap52.containsKey((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj65 = defaultedMap63.get((java.lang.Object) 100.0f);
        java.lang.Object obj67 = defaultedMap63.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj74 = defaultedMap72.get((java.lang.Object) 100.0f);
        java.util.Set set75 = defaultedMap72.entrySet();
        defaultedMap70.putAll((java.util.Map) defaultedMap72);
        java.lang.Object obj77 = defaultedMap63.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap70);
        boolean b78 = defaultedMap52.containsKey((java.lang.Object) defaultedMap70);
        java.lang.Object obj79 = defaultedMap19.get((java.lang.Object) defaultedMap52);
        java.util.Set set80 = defaultedMap52.keySet();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj84 = defaultedMap82.get((java.lang.Object) 100.0f);
        java.util.Set set85 = defaultedMap82.keySet();
        boolean b86 = defaultedMap52.containsKey((java.lang.Object) defaultedMap82);
        collections.Factory factory87 = null;
        try {
            java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, factory87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0L + "'", obj56.equals(0L));
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0L + "'", obj65.equals(0L));
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0L + "'", obj67.equals(0L));
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 0L + "'", obj74.equals(0L));
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 0L + "'", obj79.equals(0L));
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 0L + "'", obj84.equals(0L));
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 100.0f);
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 100.0f);
        java.util.Set set14 = defaultedMap11.keySet();
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) set14);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap15.remove((java.lang.Object) "{}");
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator();
        boolean b26 = fixedOrderComparator25.isLocked();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 0, "", 1, (-1L), fixedOrderComparator25, true };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b30 = defaultedMap1.equals((java.lang.Object) obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array28);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj13 = defaultedMap3.put((java.lang.Object) fixedOrderComparator11, (java.lang.Object) false);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap3.get((java.lang.Object) defaultedMap16);
        int i20 = defaultedMap16.size();
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) "{}");
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator11 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj18 = defaultedMap1.put((java.lang.Object) fixedOrderComparator16, (java.lang.Object) 100);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (short) 0);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator26 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b29 = fixedOrderComparator28.isLocked();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i32 = defaultedMap31.size();
        java.util.Collection collection33 = defaultedMap31.values();
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) (short) 100);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) (short) 100);
        boolean b38 = fixedOrderComparator28.add((java.lang.Object) (short) 100);
        fixedOrderComparator28.setUnknownObjectBehavior(1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i43 = defaultedMap42.size();
        java.util.Collection collection44 = defaultedMap42.values();
        java.lang.Object obj46 = defaultedMap42.remove((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate51, predicate52);
        java.lang.Object obj54 = defaultedMap42.get((java.lang.Object) predicate51);
        int i55 = fixedOrderComparator16.compare((java.lang.Object) 1, obj54);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0L + "'", obj54.equals(0L));
        org.junit.Assert.assertTrue(i55 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator5 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) "");
        boolean b10 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) "{}");
        java.lang.String str17 = defaultedMap12.toString();
        java.util.Set set18 = defaultedMap12.entrySet();
        int i19 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 100.0f);
        java.util.Set set24 = defaultedMap21.keySet();
        java.lang.Object obj25 = defaultedMap12.remove((java.lang.Object) set24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i28 = defaultedMap27.size();
        java.util.Collection collection29 = defaultedMap27.values();
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) (short) 100);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) 100.0f);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) 100.0f);
        java.util.Set set47 = defaultedMap44.entrySet();
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj49 = defaultedMap35.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap42);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator();
        boolean b51 = fixedOrderComparator50.isLocked();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i54 = defaultedMap53.size();
        defaultedMap53.clear();
        boolean b56 = fixedOrderComparator50.add((java.lang.Object) defaultedMap53);
        java.lang.Object obj57 = defaultedMap42.get((java.lang.Object) defaultedMap53);
        java.lang.String str58 = defaultedMap53.toString();
        boolean b59 = defaultedMap27.containsKey((java.lang.Object) defaultedMap53);
        java.util.Set set60 = defaultedMap27.entrySet();
        try {
            boolean b61 = fixedOrderComparator7.addAsEqual((java.lang.Object) defaultedMap12, (java.lang.Object) set60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0L + "'", obj57.equals(0L));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 100.0f);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj19 = defaultedMap8.remove((java.lang.Object) collection18);
        java.util.Set set20 = defaultedMap8.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) false);
        defaultedMap17.clear();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i32 = defaultedMap31.size();
        java.util.Collection collection33 = defaultedMap31.values();
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) (short) 100);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 100.0f);
        java.util.Set set42 = defaultedMap39.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj48 = defaultedMap46.get((java.lang.Object) 100.0f);
        java.util.Set set49 = defaultedMap46.entrySet();
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        defaultedMap39.putAll((java.util.Map) defaultedMap44);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) (byte) 10);
        java.lang.Object obj57 = defaultedMap53.remove((java.lang.Object) "{}");
        java.lang.Object obj58 = defaultedMap39.get((java.lang.Object) defaultedMap53);
        boolean b59 = defaultedMap31.containsKey((java.lang.Object) defaultedMap39);
        defaultedMap39.clear();
        java.lang.Object[] obj_array65 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { (byte) 100, 100.0d, 100L, fixedOrderComparator66 };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array67);
        boolean b71 = fixedOrderComparator69.add((java.lang.Object) (byte) 100);
        boolean b72 = defaultedMap39.containsKey((java.lang.Object) (byte) 100);
        java.util.Set set73 = defaultedMap39.keySet();
        java.util.Set set74 = defaultedMap39.keySet();
        java.lang.Object obj75 = defaultedMap17.get((java.lang.Object) set74);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0L + "'", obj48.equals(0L));
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 0L + "'", obj55.equals(0L));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0L + "'", obj58.equals(0L));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 0L + "'", obj75.equals(0L));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.lang.String str14 = defaultedMap1.toString();
        java.lang.String str15 = defaultedMap1.toString();
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.String str17 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate22, predicate23);
        boolean b25 = defaultedMap1.containsValue((java.lang.Object) predicate23);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj27 = defaultedMap17.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) false);
        defaultedMap17.clear();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        boolean b31 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 100.0f);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap15.remove((java.lang.Object) "{}");
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 100.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 100.0f);
        java.util.Set set34 = defaultedMap31.entrySet();
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Collection collection39 = defaultedMap38.values();
        java.lang.Object obj40 = defaultedMap29.remove((java.lang.Object) collection39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) (byte) 10);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate52, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate(map47, predicate53, predicate55);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) map47);
        java.lang.Object obj58 = defaultedMap1.get((java.lang.Object) map57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj62 = defaultedMap60.get((java.lang.Object) 100.0f);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) 100.0f);
        java.util.Set set72 = defaultedMap69.entrySet();
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.lang.Object obj74 = defaultedMap60.put((java.lang.Object) 10.0f, (java.lang.Object) defaultedMap67);
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator();
        boolean b76 = fixedOrderComparator75.isLocked();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        int i79 = defaultedMap78.size();
        defaultedMap78.clear();
        boolean b81 = fixedOrderComparator75.add((java.lang.Object) defaultedMap78);
        java.lang.Object obj82 = defaultedMap67.get((java.lang.Object) defaultedMap78);
        java.util.Collection collection83 = defaultedMap78.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap78);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0L + "'", obj51.equals(0L));
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0L + "'", obj58.equals(0L));
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0L + "'", obj62.equals(0L));
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0L + "'", obj64.equals(0L));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0L + "'", obj71.equals(0L));
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 0L + "'", obj82.equals(0L));
        org.junit.Assert.assertNotNull(collection83);
    }
}

