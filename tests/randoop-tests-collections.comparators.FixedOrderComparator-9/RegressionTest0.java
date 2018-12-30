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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1L));
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
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            boolean b3 = fixedOrderComparator0.addAsEqual((java.lang.Object) (byte) -1, (java.lang.Object) (byte) 0);
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
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map map0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        try {
            boolean b9 = fixedOrderComparator2.addAsEqual((java.lang.Object) obj_array6, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        try {
            boolean b7 = fixedOrderComparator2.addAsEqual((java.lang.Object) predicate5, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        try {
            int i3 = fixedOrderComparator0.compare(obj1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        try {
            int i5 = fixedOrderComparator2.compare((java.lang.Object) (byte) 100, (java.lang.Object) fixedOrderComparator4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate2 = null;
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        try {
            fixedOrderComparator2.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        int i5 = fixedOrderComparator2.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        try {
            fixedOrderComparator2.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = null;
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i10 = fixedOrderComparator9.getUnknownObjectBehavior();
        boolean b11 = fixedOrderComparator9.isLocked();
        int i12 = fixedOrderComparator9.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) (-1.0f));
        boolean b13 = fixedOrderComparator9.add((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        try {
            fixedOrderComparator3.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        boolean b12 = fixedOrderComparator9.isLocked();
        boolean b13 = fixedOrderComparator9.isLocked();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        java.util.Set set17 = defaultedMap6.keySet();
        java.lang.Object obj19 = defaultedMap6.remove((java.lang.Object) 'a');
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.lang.Object[] obj_array7 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) fixedOrderComparator8);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) predicateUtils17);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator16.add((java.lang.Object) obj_array20);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array20);
        try {
            int i24 = fixedOrderComparator9.compare((java.lang.Object) obj_array11, (java.lang.Object) obj_array20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        try {
            int i7 = fixedOrderComparator2.compare((java.lang.Object) (-1.0d), (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        int i4 = fixedOrderComparator2.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator6);
        try {
            boolean b8 = fixedOrderComparator2.addAsEqual((java.lang.Object) (short) 100, (java.lang.Object) fixedOrderComparator6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.lang.Object[] obj_array7 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) fixedOrderComparator8);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        boolean b14 = fixedOrderComparator12.add((java.lang.Object) predicateUtils13);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b18 = fixedOrderComparator12.add((java.lang.Object) obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array16);
        try {
            boolean b21 = fixedOrderComparator8.addAsEqual((java.lang.Object) obj_array16, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        try {
            int i12 = fixedOrderComparator9.compare((java.lang.Object) (byte) -1, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj27 = new java.lang.Object();
        boolean b28 = defaultedMap23.containsKey(obj27);
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        boolean b38 = defaultedMap35.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate39);
        boolean b42 = defaultedMap6.containsKey((java.lang.Object) defaultedMap23);
        collections.Transformer transformer43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, transformer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.lang.Object[] obj_array7 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) fixedOrderComparator8);
        boolean b10 = fixedOrderComparator8.isLocked();
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        try {
            fixedOrderComparator2.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) predicateUtils19);
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) fixedOrderComparator18);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        boolean b26 = fixedOrderComparator24.add((java.lang.Object) predicateUtils25);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b30 = fixedOrderComparator24.add((java.lang.Object) obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i32 = fixedOrderComparator31.getUnknownObjectBehavior();
        boolean b33 = fixedOrderComparator18.add((java.lang.Object) fixedOrderComparator31);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i32 == 2);
        org.junit.Assert.assertTrue(b33 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate7);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) predicateUtils12);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b17 = fixedOrderComparator11.add((java.lang.Object) obj_array15);
        java.lang.Object obj18 = defaultedMap3.get((java.lang.Object) fixedOrderComparator11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj34 = defaultedMap20.put((java.lang.Object) defaultedMap25, (java.lang.Object) defaultedMap30);
        java.lang.String str35 = defaultedMap25.toString();
        java.util.Set set36 = defaultedMap25.keySet();
        java.lang.Object obj38 = defaultedMap25.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) defaultedMap45, (java.lang.Object) defaultedMap50);
        java.lang.Object obj55 = defaultedMap25.get((java.lang.Object) defaultedMap40);
        defaultedMap3.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        boolean b63 = defaultedMap60.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) predicate64);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.PredicateUtils predicateUtils69 = new collections.PredicateUtils();
        boolean b70 = fixedOrderComparator68.add((java.lang.Object) predicateUtils69);
        java.lang.Object[] obj_array72 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        boolean b74 = fixedOrderComparator68.add((java.lang.Object) obj_array72);
        java.lang.Object obj75 = defaultedMap60.get((java.lang.Object) fixedOrderComparator68);
        defaultedMap3.putAll((java.util.Map) defaultedMap60);
        boolean b77 = defaultedMap60.isEmpty();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1L + "'", obj18.equals(1L));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1L + "'", obj55.equals(1L));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 1L + "'", obj75.equals(1L));
        org.junit.Assert.assertTrue(b77 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = defaultedMap1.containsKey(obj5);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.lang.Object[] obj_array7 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) fixedOrderComparator8);
        try {
            fixedOrderComparator8.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = defaultedMap1.containsKey(obj5);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj24 = defaultedMap10.put((java.lang.Object) defaultedMap15, (java.lang.Object) defaultedMap20);
        java.lang.String str25 = defaultedMap15.toString();
        java.util.Set set26 = defaultedMap15.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        collections.Transformer transformer28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) defaultedMap17);
        java.util.Collection collection22 = defaultedMap6.values();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        boolean b27 = fixedOrderComparator25.add((java.lang.Object) predicateUtils26);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b31 = fixedOrderComparator25.add((java.lang.Object) obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array29);
        fixedOrderComparator32.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        java.lang.Object obj50 = defaultedMap36.put((java.lang.Object) defaultedMap41, (java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        boolean b57 = defaultedMap54.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) predicate58);
        java.lang.Object obj60 = defaultedMap46.get((java.lang.Object) predicate58);
        boolean b61 = fixedOrderComparator32.add((java.lang.Object) defaultedMap46);
        defaultedMap6.putAll((java.util.Map) defaultedMap46);
        defaultedMap46.clear();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap65.putAll((java.util.Map) defaultedMap67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap70.putAll((java.util.Map) defaultedMap72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        java.lang.Object obj79 = defaultedMap65.put((java.lang.Object) defaultedMap70, (java.lang.Object) defaultedMap75);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap81.putAll((java.util.Map) defaultedMap83);
        boolean b86 = defaultedMap83.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap83, (java.lang.Object) predicate87);
        java.lang.Object obj89 = defaultedMap75.get((java.lang.Object) predicate87);
        java.lang.Object obj90 = defaultedMap46.get((java.lang.Object) defaultedMap75);
        collections.Factory factory91 = null;
        try {
            java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap75, factory91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1L + "'", obj60.equals(1L));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 1L + "'", obj89.equals(1L));
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 1L + "'", obj90.equals(1L));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        java.util.Set set17 = defaultedMap6.keySet();
        java.util.Collection collection18 = defaultedMap6.values();
        int i19 = defaultedMap6.size();
        boolean b20 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        int i22 = defaultedMap6.size();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        java.lang.Object[] obj_array3 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 0.0d, (java.lang.Object) false);
        try {
            boolean b10 = fixedOrderComparator0.addAsEqual(obj1, obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) predicateUtils8);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) fixedOrderComparator15);
        boolean b17 = fixedOrderComparator15.isLocked();
        try {
            fixedOrderComparator15.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1L + "'", obj16.equals(1L));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        int i7 = defaultedMap3.size();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator10.isLocked();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator10);
        int i14 = defaultedMap3.size();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        int i12 = fixedOrderComparator9.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) predicateUtils19);
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) fixedOrderComparator18);
        try {
            int i24 = fixedOrderComparator18.compare((java.lang.Object) (-1L), (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = defaultedMap1.containsKey(obj5);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        defaultedMap6.clear();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = defaultedMap1.containsKey(obj5);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate17);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate17);
        boolean b20 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        defaultedMap24.clear();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) fixedOrderComparator29);
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) predicateUtils40);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator39.add((java.lang.Object) obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj48 = defaultedMap33.get((java.lang.Object) fixedOrderComparator47);
        java.lang.Object obj49 = defaultedMap24.get((java.lang.Object) fixedOrderComparator47);
        int i50 = fixedOrderComparator47.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1L + "'", obj30.equals(1L));
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 1L + "'", obj48.equals(1L));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1L + "'", obj49.equals(1L));
        org.junit.Assert.assertTrue(i50 == 2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = defaultedMap1.containsKey(obj5);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) defaultedMap12, (java.lang.Object) defaultedMap17);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        boolean b26 = fixedOrderComparator24.add((java.lang.Object) predicateUtils25);
        java.lang.Object obj27 = defaultedMap17.get((java.lang.Object) fixedOrderComparator24);
        java.lang.Object obj28 = defaultedMap4.put((java.lang.Object) true, (java.lang.Object) fixedOrderComparator24);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        defaultedMap32.clear();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.lang.Object obj38 = defaultedMap32.get((java.lang.Object) fixedOrderComparator37);
        boolean b39 = fixedOrderComparator24.add((java.lang.Object) fixedOrderComparator37);
        boolean b41 = fixedOrderComparator37.add((java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1L + "'", obj27.equals(1L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 1L + "'", obj38.equals(1L));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator9.setUnknownObjectBehavior(2);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj27 = new java.lang.Object();
        boolean b28 = defaultedMap23.containsKey(obj27);
        boolean b29 = defaultedMap16.containsValue((java.lang.Object) b28);
        try {
            boolean b30 = fixedOrderComparator9.addAsEqual((java.lang.Object) 0.0f, (java.lang.Object) b29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        int i4 = fixedOrderComparator2.getUnknownObjectBehavior();
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) b8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap22);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        boolean b31 = fixedOrderComparator29.add((java.lang.Object) predicateUtils30);
        java.lang.Object obj32 = defaultedMap22.get((java.lang.Object) fixedOrderComparator29);
        java.lang.Object obj33 = defaultedMap9.put((java.lang.Object) true, (java.lang.Object) fixedOrderComparator29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        defaultedMap37.clear();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        java.lang.Object obj43 = defaultedMap37.get((java.lang.Object) fixedOrderComparator42);
        boolean b44 = fixedOrderComparator29.add((java.lang.Object) fixedOrderComparator42);
        try {
            boolean b46 = fixedOrderComparator2.addAsEqual((java.lang.Object) b44, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1L + "'", obj32.equals(1L));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1L + "'", obj43.equals(1L));
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        boolean b16 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 0.0d, (java.lang.Object) false);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) predicateUtils8);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) fixedOrderComparator15);
        boolean b17 = fixedOrderComparator15.isLocked();
        int i18 = fixedOrderComparator15.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1L + "'", obj16.equals(1L));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj11 = new java.lang.Object();
        boolean b12 = defaultedMap7.containsKey(obj11);
        java.util.Set set13 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj19 = new java.lang.Object();
        boolean b20 = defaultedMap15.containsKey(obj19);
        boolean b22 = defaultedMap15.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate24);
        boolean b26 = defaultedMap7.equals((java.lang.Object) defaultedMap15);
        boolean b27 = defaultedMap3.containsValue((java.lang.Object) b26);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap6.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap16);
        java.lang.String str21 = defaultedMap11.toString();
        java.util.Set set22 = defaultedMap11.keySet();
        java.util.Collection collection23 = defaultedMap11.values();
        int i24 = defaultedMap11.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        boolean b32 = defaultedMap29.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) predicate33);
        defaultedMap29.clear();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.PredicateUtils predicateUtils39 = new collections.PredicateUtils();
        boolean b40 = fixedOrderComparator38.add((java.lang.Object) predicateUtils39);
        java.lang.Object[] obj_array42 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b44 = fixedOrderComparator38.add((java.lang.Object) obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array42);
        fixedOrderComparator45.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        java.lang.Object obj63 = defaultedMap49.put((java.lang.Object) defaultedMap54, (java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap65.putAll((java.util.Map) defaultedMap67);
        boolean b70 = defaultedMap67.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) predicate71);
        java.lang.Object obj73 = defaultedMap59.get((java.lang.Object) predicate71);
        boolean b74 = fixedOrderComparator45.add((java.lang.Object) defaultedMap59);
        defaultedMap29.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj77 = defaultedMap11.put((java.lang.Object) defaultedMap59, (java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 1L + "'", obj73.equals(1L));
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate7);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) predicateUtils12);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b17 = fixedOrderComparator11.add((java.lang.Object) obj_array15);
        java.lang.Object obj18 = defaultedMap3.get((java.lang.Object) fixedOrderComparator11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b25 = defaultedMap22.containsKey((java.lang.Object) (-1.0f));
        int i26 = defaultedMap22.size();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b30 = fixedOrderComparator29.isLocked();
        int i31 = fixedOrderComparator29.getUnknownObjectBehavior();
        boolean b32 = defaultedMap22.equals((java.lang.Object) fixedOrderComparator29);
        boolean b33 = fixedOrderComparator11.add((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1L + "'", obj18.equals(1L));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        collections.Predicate predicate17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj33 = defaultedMap19.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b40 = defaultedMap37.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) predicate41);
        java.lang.Object obj43 = defaultedMap29.get((java.lang.Object) predicate41);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate17, predicate41);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator45);
        boolean b47 = defaultedMap46.isEmpty();
        boolean b48 = defaultedMap46.isEmpty();
        java.util.Set set49 = defaultedMap46.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        java.lang.Object obj65 = defaultedMap51.put((java.lang.Object) defaultedMap56, (java.lang.Object) defaultedMap61);
        java.lang.String str66 = defaultedMap56.toString();
        java.util.Set set67 = defaultedMap56.keySet();
        java.util.Collection collection68 = defaultedMap56.values();
        int i69 = defaultedMap56.size();
        defaultedMap46.putAll((java.util.Map) defaultedMap56);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap46);
        collections.Transformer transformer72 = null;
        try {
            java.util.Map map73 = collections.map.DefaultedMap.decorate(map71, transformer72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1L + "'", obj43.equals(1L));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) predicateUtils19);
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) fixedOrderComparator18);
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap10, (java.lang.Object) defaultedMap15);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) predicateUtils23);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) fixedOrderComparator22);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        boolean b31 = fixedOrderComparator29.add((java.lang.Object) predicateUtils30);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b35 = fixedOrderComparator29.add((java.lang.Object) obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array33);
        fixedOrderComparator36.setUnknownObjectBehavior(0);
        boolean b39 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1L + "'", obj25.equals(1L));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        boolean b15 = fixedOrderComparator13.add((java.lang.Object) predicateUtils14);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        boolean b19 = fixedOrderComparator13.add((java.lang.Object) obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array17);
        try {
            int i21 = fixedOrderComparator9.compare((java.lang.Object) '4', (java.lang.Object) obj_array17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        boolean b6 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap6.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap16);
        java.lang.String str21 = defaultedMap11.toString();
        java.util.Set set22 = defaultedMap11.keySet();
        java.lang.Object obj24 = defaultedMap11.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        java.lang.Object obj40 = defaultedMap26.put((java.lang.Object) defaultedMap31, (java.lang.Object) defaultedMap36);
        java.lang.Object obj41 = defaultedMap11.get((java.lang.Object) defaultedMap26);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.PredicateUtils predicateUtils45 = new collections.PredicateUtils();
        boolean b46 = fixedOrderComparator44.add((java.lang.Object) predicateUtils45);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        boolean b50 = fixedOrderComparator44.add((java.lang.Object) obj_array48);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array48);
        fixedOrderComparator51.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap65.putAll((java.util.Map) defaultedMap67);
        java.lang.Object obj69 = defaultedMap55.put((java.lang.Object) defaultedMap60, (java.lang.Object) defaultedMap65);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap71.putAll((java.util.Map) defaultedMap73);
        boolean b76 = defaultedMap73.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) predicate77);
        java.lang.Object obj79 = defaultedMap65.get((java.lang.Object) predicate77);
        boolean b80 = fixedOrderComparator51.add((java.lang.Object) defaultedMap65);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap82.putAll((java.util.Map) defaultedMap84);
        java.lang.Object obj86 = defaultedMap26.put((java.lang.Object) defaultedMap65, (java.lang.Object) defaultedMap82);
        java.lang.Object obj87 = new java.lang.Object();
        try {
            int i88 = fixedOrderComparator2.compare((java.lang.Object) defaultedMap26, obj87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1L + "'", obj41.equals(1L));
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 1L + "'", obj79.equals(1L));
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertNotNull(obj86);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) predicateUtils8);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) fixedOrderComparator15);
        fixedOrderComparator15.setUnknownObjectBehavior((int) (byte) 0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1L + "'", obj16.equals(1L));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        java.util.Set set17 = defaultedMap6.keySet();
        java.util.Collection collection18 = defaultedMap6.values();
        int i19 = defaultedMap6.size();
        boolean b20 = defaultedMap6.isEmpty();
        java.util.Set set21 = defaultedMap6.keySet();
        int i22 = defaultedMap6.size();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        java.util.Set set17 = defaultedMap6.keySet();
        java.lang.Object obj19 = defaultedMap6.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        java.lang.Object obj35 = defaultedMap21.put((java.lang.Object) defaultedMap26, (java.lang.Object) defaultedMap31);
        java.lang.Object obj36 = defaultedMap6.get((java.lang.Object) defaultedMap21);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) predicateUtils40);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator39.add((java.lang.Object) obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        fixedOrderComparator46.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        java.lang.Object obj64 = defaultedMap50.put((java.lang.Object) defaultedMap55, (java.lang.Object) defaultedMap60);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        boolean b71 = defaultedMap68.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) predicate72);
        java.lang.Object obj74 = defaultedMap60.get((java.lang.Object) predicate72);
        boolean b75 = fixedOrderComparator46.add((java.lang.Object) defaultedMap60);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap77.putAll((java.util.Map) defaultedMap79);
        java.lang.Object obj81 = defaultedMap21.put((java.lang.Object) defaultedMap60, (java.lang.Object) defaultedMap77);
        defaultedMap77.clear();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1L + "'", obj36.equals(1L));
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 1L + "'", obj74.equals(1L));
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(obj81);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj17 = defaultedMap3.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj33 = defaultedMap19.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap29);
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        boolean b38 = fixedOrderComparator36.add((java.lang.Object) predicateUtils37);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        boolean b42 = fixedOrderComparator36.add((java.lang.Object) obj_array40);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array40);
        int i44 = fixedOrderComparator43.getUnknownObjectBehavior();
        java.lang.Object obj45 = defaultedMap29.get((java.lang.Object) fixedOrderComparator43);
        boolean b46 = defaultedMap3.equals(obj45);
        java.lang.Object[] obj_array47 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array47);
        try {
            boolean b50 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap3, (java.lang.Object) fixedOrderComparator49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(i44 == 2);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1L + "'", obj45.equals(1L));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(obj_array47);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) predicateUtils19);
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) fixedOrderComparator18);
        java.util.Set set22 = defaultedMap11.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj38 = defaultedMap24.put((java.lang.Object) defaultedMap29, (java.lang.Object) defaultedMap34);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.PredicateUtils predicateUtils42 = new collections.PredicateUtils();
        boolean b43 = fixedOrderComparator41.add((java.lang.Object) predicateUtils42);
        java.lang.Object obj44 = defaultedMap34.get((java.lang.Object) fixedOrderComparator41);
        java.util.Set set45 = defaultedMap34.entrySet();
        java.lang.Object obj46 = defaultedMap11.get((java.lang.Object) set45);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1L + "'", obj44.equals(1L));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1L + "'", obj46.equals(1L));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj18 = new java.lang.Object();
        boolean b19 = defaultedMap14.containsKey(obj18);
        boolean b21 = defaultedMap14.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap26.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate22, predicate30);
        boolean b33 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        defaultedMap37.clear();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        java.lang.Object obj43 = defaultedMap37.get((java.lang.Object) fixedOrderComparator42);
        defaultedMap14.putAll((java.util.Map) defaultedMap37);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.PredicateUtils predicateUtils53 = new collections.PredicateUtils();
        boolean b54 = fixedOrderComparator52.add((java.lang.Object) predicateUtils53);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        boolean b58 = fixedOrderComparator52.add((java.lang.Object) obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array56);
        java.lang.Object obj61 = defaultedMap46.get((java.lang.Object) fixedOrderComparator60);
        java.lang.Object obj62 = defaultedMap37.get((java.lang.Object) fixedOrderComparator60);
        try {
            boolean b63 = fixedOrderComparator9.addAsEqual((java.lang.Object) (byte) 1, (java.lang.Object) fixedOrderComparator60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1L + "'", obj43.equals(1L));
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 1L + "'", obj61.equals(1L));
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 1L + "'", obj62.equals(1L));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate7);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) predicateUtils12);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b17 = fixedOrderComparator11.add((java.lang.Object) obj_array15);
        java.lang.Object obj18 = defaultedMap3.get((java.lang.Object) fixedOrderComparator11);
        int i19 = fixedOrderComparator11.getUnknownObjectBehavior();
        boolean b20 = fixedOrderComparator11.isLocked();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1L + "'", obj18.equals(1L));
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        java.util.Set set17 = defaultedMap6.keySet();
        java.util.Collection collection18 = defaultedMap6.values();
        int i19 = defaultedMap6.size();
        boolean b20 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        defaultedMap6.clear();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) predicate24);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        boolean b30 = fixedOrderComparator28.add((java.lang.Object) predicateUtils29);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b34 = fixedOrderComparator28.add((java.lang.Object) obj_array32);
        java.lang.Object obj35 = defaultedMap20.get((java.lang.Object) fixedOrderComparator28);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap20);
        collections.Transformer transformer37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate(map36, transformer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1L + "'", obj35.equals(1L));
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = defaultedMap1.equals((java.lang.Object) obj_array6);
        java.util.Set set10 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        java.util.Set set17 = defaultedMap6.keySet();
        java.lang.Object obj19 = defaultedMap6.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        java.lang.Object obj35 = defaultedMap21.put((java.lang.Object) defaultedMap26, (java.lang.Object) defaultedMap31);
        java.lang.Object obj36 = defaultedMap6.get((java.lang.Object) defaultedMap21);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) predicateUtils40);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator39.add((java.lang.Object) obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        fixedOrderComparator46.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        java.lang.Object obj64 = defaultedMap50.put((java.lang.Object) defaultedMap55, (java.lang.Object) defaultedMap60);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        boolean b71 = defaultedMap68.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) predicate72);
        java.lang.Object obj74 = defaultedMap60.get((java.lang.Object) predicate72);
        boolean b75 = fixedOrderComparator46.add((java.lang.Object) defaultedMap60);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap77.putAll((java.util.Map) defaultedMap79);
        java.lang.Object obj81 = defaultedMap21.put((java.lang.Object) defaultedMap60, (java.lang.Object) defaultedMap77);
        int i82 = defaultedMap21.size();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1L + "'", obj36.equals(1L));
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 1L + "'", obj74.equals(1L));
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue(i82 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        java.util.Set set17 = defaultedMap6.keySet();
        java.util.Collection collection18 = defaultedMap6.values();
        int i19 = defaultedMap6.size();
        int i20 = defaultedMap6.size();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b3 = fixedOrderComparator2.isLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate11);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        boolean b17 = fixedOrderComparator15.add((java.lang.Object) predicateUtils16);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b21 = fixedOrderComparator15.add((java.lang.Object) obj_array19);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) fixedOrderComparator15);
        try {
            boolean b23 = fixedOrderComparator2.addAsEqual(obj3, obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1L + "'", obj22.equals(1L));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) defaultedMap17);
        java.util.Collection collection22 = defaultedMap6.values();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        boolean b27 = fixedOrderComparator25.add((java.lang.Object) predicateUtils26);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b31 = fixedOrderComparator25.add((java.lang.Object) obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array29);
        fixedOrderComparator32.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        java.lang.Object obj50 = defaultedMap36.put((java.lang.Object) defaultedMap41, (java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        boolean b57 = defaultedMap54.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) predicate58);
        java.lang.Object obj60 = defaultedMap46.get((java.lang.Object) predicate58);
        boolean b61 = fixedOrderComparator32.add((java.lang.Object) defaultedMap46);
        defaultedMap6.putAll((java.util.Map) defaultedMap46);
        defaultedMap46.clear();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap65.putAll((java.util.Map) defaultedMap67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap70.putAll((java.util.Map) defaultedMap72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        java.lang.Object obj79 = defaultedMap65.put((java.lang.Object) defaultedMap70, (java.lang.Object) defaultedMap75);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap81.putAll((java.util.Map) defaultedMap83);
        boolean b86 = defaultedMap83.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap83, (java.lang.Object) predicate87);
        java.lang.Object obj89 = defaultedMap75.get((java.lang.Object) predicate87);
        java.lang.Object obj90 = defaultedMap46.get((java.lang.Object) defaultedMap75);
        java.util.Collection collection91 = defaultedMap46.values();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1L + "'", obj60.equals(1L));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 1L + "'", obj89.equals(1L));
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 1L + "'", obj90.equals(1L));
        org.junit.Assert.assertNotNull(collection91);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) predicateUtils19);
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) fixedOrderComparator18);
        int i22 = fixedOrderComparator18.getUnknownObjectBehavior();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(i22 == 2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        java.util.Collection collection7 = defaultedMap3.values();
        java.util.Collection collection8 = defaultedMap3.values();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        java.util.Collection collection7 = defaultedMap3.values();
        java.util.Set set8 = defaultedMap3.keySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        collections.Predicate predicate17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj33 = defaultedMap19.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b40 = defaultedMap37.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) predicate41);
        java.lang.Object obj43 = defaultedMap29.get((java.lang.Object) predicate41);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate17, predicate41);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator45);
        boolean b47 = defaultedMap46.isEmpty();
        boolean b48 = defaultedMap46.isEmpty();
        java.util.Set set49 = defaultedMap46.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        java.lang.Object obj65 = defaultedMap51.put((java.lang.Object) defaultedMap56, (java.lang.Object) defaultedMap61);
        java.lang.String str66 = defaultedMap56.toString();
        java.util.Set set67 = defaultedMap56.keySet();
        java.util.Collection collection68 = defaultedMap56.values();
        int i69 = defaultedMap56.size();
        defaultedMap46.putAll((java.util.Map) defaultedMap56);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap46);
        java.util.Set set72 = defaultedMap6.entrySet();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1L + "'", obj43.equals(1L));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(set72);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) predicate24);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        boolean b30 = fixedOrderComparator28.add((java.lang.Object) predicateUtils29);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b34 = fixedOrderComparator28.add((java.lang.Object) obj_array32);
        java.lang.Object obj35 = defaultedMap20.get((java.lang.Object) fixedOrderComparator28);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        java.lang.Object obj52 = defaultedMap38.put((java.lang.Object) defaultedMap43, (java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        boolean b59 = defaultedMap56.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) predicate60);
        java.lang.Object obj62 = defaultedMap48.get((java.lang.Object) predicate60);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate(map36, predicate60, predicate63);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1L + "'", obj35.equals(1L));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 1L + "'", obj62.equals(1L));
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj27 = defaultedMap13.put((java.lang.Object) defaultedMap18, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap31.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) predicate35);
        java.lang.Object obj37 = defaultedMap23.get((java.lang.Object) predicate35);
        boolean b38 = fixedOrderComparator9.add((java.lang.Object) defaultedMap23);
        java.lang.Object[] obj_array39 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array39);
        java.lang.Object obj42 = defaultedMap23.remove((java.lang.Object) obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator43);
        boolean b45 = defaultedMap44.isEmpty();
        java.lang.Object[] obj_array47 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.PredicateUtils predicateUtils49 = new collections.PredicateUtils();
        boolean b50 = fixedOrderComparator48.add((java.lang.Object) predicateUtils49);
        java.lang.Object[] obj_array52 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        boolean b54 = fixedOrderComparator48.add((java.lang.Object) obj_array52);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array52);
        fixedOrderComparator55.setUnknownObjectBehavior(2);
        int i58 = fixedOrderComparator55.getUnknownObjectBehavior();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) i58);
        java.util.Set set60 = defaultedMap44.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap44);
        java.util.Set set62 = defaultedMap44.keySet();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 1L + "'", obj37.equals(1L));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(i58 == 2);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set62);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap6.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap16);
        java.lang.String str21 = defaultedMap11.toString();
        java.util.Set set22 = defaultedMap11.keySet();
        java.util.Collection collection23 = defaultedMap11.values();
        int i24 = defaultedMap11.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = new java.lang.Object();
        boolean b15 = defaultedMap10.containsKey(obj14);
        boolean b16 = defaultedMap3.containsValue((java.lang.Object) b15);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) predicateUtils8);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i15 = fixedOrderComparator14.getUnknownObjectBehavior();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator14, (java.lang.Object) '4');
        boolean b18 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        java.util.Set set17 = defaultedMap6.keySet();
        java.util.Collection collection18 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b25 = defaultedMap22.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate26);
        int i28 = defaultedMap22.size();
        java.util.Set set29 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) defaultedMap36, (java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        java.lang.Object obj51 = defaultedMap36.get((java.lang.Object) defaultedMap47);
        java.util.Collection collection52 = defaultedMap36.values();
        java.lang.Object obj53 = defaultedMap22.get((java.lang.Object) defaultedMap36);
        defaultedMap6.putAll((java.util.Map) defaultedMap22);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 1L + "'", obj51.equals(1L));
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 1L + "'", obj53.equals(1L));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) (-1.0f));
        int i12 = fixedOrderComparator9.getUnknownObjectBehavior();
        java.lang.Object obj13 = null;
        boolean b14 = fixedOrderComparator9.add(obj13);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = defaultedMap1.containsKey(obj5);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj13 = new java.lang.Object();
        boolean b14 = defaultedMap9.containsKey(obj13);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate18);
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        java.util.Set set21 = defaultedMap1.entrySet();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        boolean b26 = fixedOrderComparator24.add((java.lang.Object) predicateUtils25);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b30 = fixedOrderComparator24.add((java.lang.Object) obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array28);
        fixedOrderComparator31.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.Object obj49 = defaultedMap35.put((java.lang.Object) defaultedMap40, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap53.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) predicate57);
        java.lang.Object obj59 = defaultedMap45.get((java.lang.Object) predicate57);
        boolean b60 = fixedOrderComparator31.add((java.lang.Object) defaultedMap45);
        java.lang.Object[] obj_array61 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array61);
        java.lang.Object obj64 = defaultedMap45.remove((java.lang.Object) obj_array61);
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator65);
        boolean b67 = defaultedMap66.isEmpty();
        java.lang.Object[] obj_array69 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.PredicateUtils predicateUtils71 = new collections.PredicateUtils();
        boolean b72 = fixedOrderComparator70.add((java.lang.Object) predicateUtils71);
        java.lang.Object[] obj_array74 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        boolean b76 = fixedOrderComparator70.add((java.lang.Object) obj_array74);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array74);
        fixedOrderComparator77.setUnknownObjectBehavior(2);
        int i80 = fixedOrderComparator77.getUnknownObjectBehavior();
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) i80);
        java.util.Set set82 = defaultedMap66.keySet();
        defaultedMap45.putAll((java.util.Map) defaultedMap66);
        java.lang.Object obj84 = defaultedMap1.get((java.lang.Object) defaultedMap45);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 1L + "'", obj59.equals(1L));
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(i80 == 2);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 1L + "'", obj84.equals(1L));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = defaultedMap1.containsKey(obj5);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj13 = new java.lang.Object();
        boolean b14 = defaultedMap9.containsKey(obj13);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate18);
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) defaultedMap27, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj42 = defaultedMap27.get((java.lang.Object) defaultedMap38);
        java.lang.Object obj44 = defaultedMap38.remove((java.lang.Object) 'a');
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) defaultedMap38);
        defaultedMap1.clear();
        java.lang.String str47 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1L + "'", obj42.equals(1L));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) defaultedMap17);
        java.util.Collection collection22 = defaultedMap6.values();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        boolean b27 = fixedOrderComparator25.add((java.lang.Object) predicateUtils26);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b31 = fixedOrderComparator25.add((java.lang.Object) obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array29);
        fixedOrderComparator32.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        java.lang.Object obj50 = defaultedMap36.put((java.lang.Object) defaultedMap41, (java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        boolean b57 = defaultedMap54.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) predicate58);
        java.lang.Object obj60 = defaultedMap46.get((java.lang.Object) predicate58);
        boolean b61 = fixedOrderComparator32.add((java.lang.Object) defaultedMap46);
        defaultedMap6.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        boolean b69 = defaultedMap66.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) predicate70);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate70, predicate72);
        defaultedMap46.clear();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1L + "'", obj60.equals(1L));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = defaultedMap1.containsKey(obj5);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj13 = new java.lang.Object();
        boolean b14 = defaultedMap9.containsKey(obj13);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate18);
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) defaultedMap27, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj42 = defaultedMap27.get((java.lang.Object) defaultedMap38);
        java.lang.Object obj44 = defaultedMap38.remove((java.lang.Object) 'a');
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) defaultedMap38);
        java.util.Set set46 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1L + "'", obj42.equals(1L));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        java.util.Set set17 = defaultedMap6.keySet();
        java.lang.Object obj19 = defaultedMap6.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        java.lang.Object obj35 = defaultedMap21.put((java.lang.Object) defaultedMap26, (java.lang.Object) defaultedMap31);
        java.lang.Object obj36 = defaultedMap6.get((java.lang.Object) defaultedMap21);
        java.util.Set set37 = defaultedMap21.entrySet();
        java.lang.Object[] obj_array39 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = fixedOrderComparator40.isLocked();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) b41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        java.lang.Object obj59 = defaultedMap45.put((java.lang.Object) defaultedMap50, (java.lang.Object) defaultedMap55);
        java.lang.Object[] obj_array61 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.PredicateUtils predicateUtils63 = new collections.PredicateUtils();
        boolean b64 = fixedOrderComparator62.add((java.lang.Object) predicateUtils63);
        java.lang.Object obj65 = defaultedMap55.get((java.lang.Object) fixedOrderComparator62);
        java.lang.Object obj66 = defaultedMap42.put((java.lang.Object) true, (java.lang.Object) fixedOrderComparator62);
        boolean b67 = defaultedMap21.equals((java.lang.Object) defaultedMap42);
        defaultedMap21.clear();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1L + "'", obj36.equals(1L));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1L + "'", obj65.equals(1L));
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = defaultedMap1.containsKey(obj5);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj13 = new java.lang.Object();
        boolean b14 = defaultedMap9.containsKey(obj13);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate18);
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        java.util.Set set21 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj37 = defaultedMap23.put((java.lang.Object) defaultedMap28, (java.lang.Object) defaultedMap33);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.PredicateUtils predicateUtils41 = new collections.PredicateUtils();
        boolean b42 = fixedOrderComparator40.add((java.lang.Object) predicateUtils41);
        java.lang.Object obj43 = defaultedMap33.get((java.lang.Object) fixedOrderComparator40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.Object[] obj_array50 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.PredicateUtils predicateUtils52 = new collections.PredicateUtils();
        boolean b53 = fixedOrderComparator51.add((java.lang.Object) predicateUtils52);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        boolean b57 = fixedOrderComparator51.add((java.lang.Object) obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array55);
        int i59 = fixedOrderComparator58.getUnknownObjectBehavior();
        java.lang.Object obj61 = defaultedMap45.put((java.lang.Object) fixedOrderComparator58, (java.lang.Object) '4');
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, obj61);
        boolean b63 = defaultedMap1.containsValue(obj61);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1L + "'", obj43.equals(1L));
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(i59 == 2);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap10, (java.lang.Object) defaultedMap15);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) predicateUtils23);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) fixedOrderComparator22);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj33 = new java.lang.Object();
        boolean b34 = defaultedMap29.containsKey(obj33);
        boolean b36 = defaultedMap29.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate27, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1L + "'", obj25.equals(1L));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate23);
        java.lang.Object obj25 = defaultedMap11.get((java.lang.Object) predicate23);
        java.util.Set set26 = defaultedMap11.keySet();
        java.util.Collection collection27 = defaultedMap11.values();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1L + "'", obj25.equals(1L));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap10, (java.lang.Object) defaultedMap15);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) predicateUtils23);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) fixedOrderComparator22);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        boolean b31 = fixedOrderComparator29.add((java.lang.Object) predicateUtils30);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b35 = fixedOrderComparator29.add((java.lang.Object) obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array33);
        fixedOrderComparator36.setUnknownObjectBehavior(0);
        boolean b39 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj45 = new java.lang.Object();
        boolean b46 = defaultedMap41.containsKey(obj45);
        boolean b48 = defaultedMap41.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap53.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate49, predicate57);
        java.lang.Object[] obj_array61 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        collections.PredicateUtils predicateUtils63 = new collections.PredicateUtils();
        boolean b64 = fixedOrderComparator62.add((java.lang.Object) predicateUtils63);
        int i65 = fixedOrderComparator36.compare((java.lang.Object) predicate49, (java.lang.Object) predicateUtils63);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1L + "'", obj25.equals(1L));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(i65 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b11 = fixedOrderComparator9.add((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj27 = defaultedMap13.put((java.lang.Object) defaultedMap18, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj33 = defaultedMap18.get((java.lang.Object) defaultedMap29);
        java.util.Collection collection34 = defaultedMap18.values();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        boolean b39 = fixedOrderComparator37.add((java.lang.Object) predicateUtils38);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b43 = fixedOrderComparator37.add((java.lang.Object) obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array41);
        fixedOrderComparator44.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        java.lang.Object obj62 = defaultedMap48.put((java.lang.Object) defaultedMap53, (java.lang.Object) defaultedMap58);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        boolean b69 = defaultedMap66.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) predicate70);
        java.lang.Object obj72 = defaultedMap58.get((java.lang.Object) predicate70);
        boolean b73 = fixedOrderComparator44.add((java.lang.Object) defaultedMap58);
        defaultedMap18.putAll((java.util.Map) defaultedMap58);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap76.putAll((java.util.Map) defaultedMap78);
        boolean b81 = defaultedMap78.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap78, (java.lang.Object) predicate82);
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate82, predicate84);
        boolean b86 = fixedOrderComparator9.add((java.lang.Object) defaultedMap58);
        java.util.Collection collection87 = defaultedMap58.values();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1L + "'", obj33.equals(1L));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 1L + "'", obj72.equals(1L));
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertNotNull(collection87);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) predicateUtils19);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b24 = fixedOrderComparator18.add((java.lang.Object) obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        int i26 = fixedOrderComparator25.getUnknownObjectBehavior();
        java.lang.Object obj27 = defaultedMap11.get((java.lang.Object) fixedOrderComparator25);
        defaultedMap11.clear();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1L + "'", obj27.equals(1L));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap10, (java.lang.Object) defaultedMap15);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) predicateUtils23);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) fixedOrderComparator22);
        boolean b27 = fixedOrderComparator22.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1L + "'", obj25.equals(1L));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap6.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap16);
        java.lang.String str21 = defaultedMap11.toString();
        java.util.Set set22 = defaultedMap11.keySet();
        java.util.Collection collection23 = defaultedMap11.values();
        int i24 = defaultedMap11.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        java.util.Set set26 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate7);
        defaultedMap3.clear();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        boolean b14 = fixedOrderComparator12.add((java.lang.Object) predicateUtils13);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b18 = fixedOrderComparator12.add((java.lang.Object) obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array16);
        fixedOrderComparator19.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj37 = defaultedMap23.put((java.lang.Object) defaultedMap28, (java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) predicate45);
        java.lang.Object obj47 = defaultedMap33.get((java.lang.Object) predicate45);
        boolean b48 = fixedOrderComparator19.add((java.lang.Object) defaultedMap33);
        defaultedMap3.putAll((java.util.Map) defaultedMap33);
        java.util.Set set50 = defaultedMap33.keySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 1L + "'", obj47.equals(1L));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set50);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = defaultedMap1.containsKey(obj5);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate17);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate17);
        boolean b20 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj26 = new java.lang.Object();
        boolean b27 = defaultedMap22.containsKey(obj26);
        boolean b29 = defaultedMap22.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate30, predicate31);
        boolean b33 = defaultedMap1.containsValue((java.lang.Object) predicate31);
        java.lang.Object[] obj_array35 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        boolean b38 = fixedOrderComparator36.add((java.lang.Object) predicateUtils37);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        boolean b42 = fixedOrderComparator36.add((java.lang.Object) obj_array40);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array40);
        fixedOrderComparator43.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj61 = defaultedMap47.put((java.lang.Object) defaultedMap52, (java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        boolean b68 = defaultedMap65.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) predicate69);
        java.lang.Object obj71 = defaultedMap57.get((java.lang.Object) predicate69);
        boolean b72 = fixedOrderComparator43.add((java.lang.Object) defaultedMap57);
        boolean b74 = fixedOrderComparator43.add((java.lang.Object) (byte) 10);
        java.lang.Object obj75 = defaultedMap1.remove((java.lang.Object) b74);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 1L + "'", obj71.equals(1L));
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) predicate23);
        java.lang.Object obj25 = defaultedMap11.get((java.lang.Object) predicate23);
        java.lang.String str26 = defaultedMap11.toString();
        collections.Transformer transformer27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, transformer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1L + "'", obj25.equals(1L));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        java.util.Set set17 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj33 = defaultedMap19.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap29);
        java.lang.String str34 = defaultedMap24.toString();
        java.util.Set set35 = defaultedMap24.keySet();
        java.util.Collection collection36 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        java.lang.Object obj52 = defaultedMap38.put((java.lang.Object) defaultedMap43, (java.lang.Object) defaultedMap48);
        java.lang.String str53 = defaultedMap43.toString();
        boolean b54 = defaultedMap24.containsValue((java.lang.Object) defaultedMap43);
        boolean b55 = defaultedMap6.containsKey((java.lang.Object) b54);
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = defaultedMap6.get(obj56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        boolean b64 = defaultedMap61.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate65, predicate67);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 1L + "'", obj57.equals(1L));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate7);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) predicateUtils12);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b17 = fixedOrderComparator11.add((java.lang.Object) obj_array15);
        java.lang.Object obj18 = defaultedMap3.get((java.lang.Object) fixedOrderComparator11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj34 = defaultedMap20.put((java.lang.Object) defaultedMap25, (java.lang.Object) defaultedMap30);
        java.lang.String str35 = defaultedMap25.toString();
        java.util.Set set36 = defaultedMap25.keySet();
        java.lang.Object obj38 = defaultedMap25.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) defaultedMap45, (java.lang.Object) defaultedMap50);
        java.lang.Object obj55 = defaultedMap25.get((java.lang.Object) defaultedMap40);
        defaultedMap3.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        boolean b63 = defaultedMap60.containsKey((java.lang.Object) (-1.0f));
        int i64 = defaultedMap60.size();
        defaultedMap25.putAll((java.util.Map) defaultedMap60);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1L + "'", obj18.equals(1L));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1L + "'", obj55.equals(1L));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate7);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        boolean b13 = fixedOrderComparator11.add((java.lang.Object) predicateUtils12);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        boolean b17 = fixedOrderComparator11.add((java.lang.Object) obj_array15);
        java.lang.Object obj18 = defaultedMap3.get((java.lang.Object) fixedOrderComparator11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj34 = defaultedMap20.put((java.lang.Object) defaultedMap25, (java.lang.Object) defaultedMap30);
        java.lang.String str35 = defaultedMap25.toString();
        java.util.Set set36 = defaultedMap25.keySet();
        java.lang.Object obj38 = defaultedMap25.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) defaultedMap45, (java.lang.Object) defaultedMap50);
        java.lang.Object obj55 = defaultedMap25.get((java.lang.Object) defaultedMap40);
        defaultedMap3.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        boolean b63 = defaultedMap60.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) predicate64);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.PredicateUtils predicateUtils69 = new collections.PredicateUtils();
        boolean b70 = fixedOrderComparator68.add((java.lang.Object) predicateUtils69);
        java.lang.Object[] obj_array72 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        boolean b74 = fixedOrderComparator68.add((java.lang.Object) obj_array72);
        java.lang.Object obj75 = defaultedMap60.get((java.lang.Object) fixedOrderComparator68);
        defaultedMap3.putAll((java.util.Map) defaultedMap60);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap78.putAll((java.util.Map) defaultedMap80);
        boolean b83 = defaultedMap80.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap80, (java.lang.Object) predicate84);
        java.util.Collection collection86 = defaultedMap80.values();
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection86);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1L + "'", obj18.equals(1L));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1L + "'", obj55.equals(1L));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 1L + "'", obj75.equals(1L));
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNotNull(map87);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) predicateUtils8);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i15 = fixedOrderComparator14.getUnknownObjectBehavior();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator14, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) (-1.0f));
        int i25 = defaultedMap21.size();
        java.lang.Object[] obj_array27 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b29 = fixedOrderComparator28.isLocked();
        int i30 = fixedOrderComparator28.getUnknownObjectBehavior();
        boolean b31 = defaultedMap21.equals((java.lang.Object) fixedOrderComparator28);
        int i32 = fixedOrderComparator28.getUnknownObjectBehavior();
        int i33 = fixedOrderComparator28.getUnknownObjectBehavior();
        boolean b34 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator28);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 2);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj27 = defaultedMap13.put((java.lang.Object) defaultedMap18, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap31.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) predicate35);
        java.lang.Object obj37 = defaultedMap23.get((java.lang.Object) predicate35);
        boolean b38 = fixedOrderComparator9.add((java.lang.Object) defaultedMap23);
        boolean b40 = fixedOrderComparator9.add((java.lang.Object) (byte) 10);
        try {
            fixedOrderComparator9.setUnknownObjectBehavior((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 1L + "'", obj37.equals(1L));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj27 = new java.lang.Object();
        boolean b28 = defaultedMap23.containsKey(obj27);
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        boolean b38 = defaultedMap35.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate39);
        boolean b42 = defaultedMap6.containsKey((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        boolean b49 = defaultedMap46.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) predicate50);
        java.lang.Object obj52 = defaultedMap6.get((java.lang.Object) predicate50);
        defaultedMap6.clear();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 1L + "'", obj52.equals(1L));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        int i7 = defaultedMap3.size();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator10.isLocked();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj19 = new java.lang.Object();
        boolean b20 = defaultedMap15.containsKey(obj19);
        boolean b22 = defaultedMap15.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b30 = defaultedMap27.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.lang.Object obj39 = new java.lang.Object();
        boolean b40 = defaultedMap35.containsKey(obj39);
        boolean b42 = defaultedMap35.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate31, predicate44);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        boolean b12 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) defaultedMap20, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        java.lang.Object obj35 = defaultedMap20.get((java.lang.Object) defaultedMap31);
        java.util.Collection collection36 = defaultedMap20.values();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        boolean b41 = fixedOrderComparator39.add((java.lang.Object) predicateUtils40);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = fixedOrderComparator39.add((java.lang.Object) obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        fixedOrderComparator46.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        java.lang.Object obj64 = defaultedMap50.put((java.lang.Object) defaultedMap55, (java.lang.Object) defaultedMap60);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        boolean b71 = defaultedMap68.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) predicate72);
        java.lang.Object obj74 = defaultedMap60.get((java.lang.Object) predicate72);
        boolean b75 = fixedOrderComparator46.add((java.lang.Object) defaultedMap60);
        defaultedMap20.putAll((java.util.Map) defaultedMap60);
        int i77 = fixedOrderComparator9.compare((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap20);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1L + "'", obj35.equals(1L));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 1L + "'", obj74.equals(1L));
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(i77 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        java.util.Collection collection7 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) defaultedMap20, (java.lang.Object) defaultedMap25);
        java.lang.String str30 = defaultedMap20.toString();
        java.util.Set set31 = defaultedMap20.keySet();
        java.lang.Object obj33 = defaultedMap20.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.Object obj49 = defaultedMap35.put((java.lang.Object) defaultedMap40, (java.lang.Object) defaultedMap45);
        java.lang.Object obj50 = defaultedMap20.get((java.lang.Object) defaultedMap35);
        boolean b52 = defaultedMap20.equals((java.lang.Object) 100.0f);
        java.lang.Object obj53 = defaultedMap3.put((java.lang.Object) defaultedMap11, (java.lang.Object) b52);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1L + "'", obj50.equals(1L));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        java.util.Set set17 = defaultedMap6.keySet();
        java.util.Collection collection18 = defaultedMap6.values();
        int i19 = defaultedMap6.size();
        boolean b20 = defaultedMap6.isEmpty();
        java.util.Set set21 = defaultedMap6.keySet();
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        boolean b9 = fixedOrderComparator2.isLocked();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        boolean b12 = fixedOrderComparator9.isLocked();
        int i13 = fixedOrderComparator9.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        java.util.Set set17 = defaultedMap6.keySet();
        java.util.Collection collection18 = defaultedMap6.values();
        int i19 = defaultedMap6.size();
        boolean b20 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) (-1.0f));
        java.util.Collection collection28 = defaultedMap24.values();
        java.lang.Object obj29 = defaultedMap6.get((java.lang.Object) defaultedMap24);
        java.util.Collection collection30 = defaultedMap6.values();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1L + "'", obj29.equals(1L));
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap2.putAll((java.util.Map) defaultedMap4);
        boolean b7 = defaultedMap4.containsKey((java.lang.Object) (-1.0f));
        int i8 = defaultedMap4.size();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b12 = fixedOrderComparator11.isLocked();
        int i13 = fixedOrderComparator11.getUnknownObjectBehavior();
        boolean b14 = defaultedMap4.equals((java.lang.Object) fixedOrderComparator11);
        int i15 = fixedOrderComparator11.getUnknownObjectBehavior();
        int i16 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj22 = new java.lang.Object();
        boolean b23 = defaultedMap18.containsKey(obj22);
        boolean b25 = defaultedMap18.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        boolean b33 = defaultedMap30.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate26, predicate34);
        boolean b37 = defaultedMap18.isEmpty();
        try {
            boolean b38 = fixedOrderComparator0.addAsEqual((java.lang.Object) fixedOrderComparator11, (java.lang.Object) defaultedMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate7);
        defaultedMap3.clear();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        boolean b14 = fixedOrderComparator12.add((java.lang.Object) predicateUtils13);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b18 = fixedOrderComparator12.add((java.lang.Object) obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array16);
        fixedOrderComparator19.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj37 = defaultedMap23.put((java.lang.Object) defaultedMap28, (java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) predicate45);
        java.lang.Object obj47 = defaultedMap33.get((java.lang.Object) predicate45);
        boolean b48 = fixedOrderComparator19.add((java.lang.Object) defaultedMap33);
        defaultedMap3.putAll((java.util.Map) defaultedMap33);
        java.util.Collection collection50 = defaultedMap33.values();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 1L + "'", obj47.equals(1L));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        java.util.Collection collection7 = defaultedMap3.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b11 = defaultedMap9.isEmpty();
        java.util.Set set12 = defaultedMap9.entrySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) defaultedMap9);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.String str16 = defaultedMap6.toString();
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator17);
        boolean b19 = defaultedMap18.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj25 = new java.lang.Object();
        boolean b26 = defaultedMap21.containsKey(obj25);
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj37 = new java.lang.Object();
        boolean b38 = defaultedMap33.containsKey(obj37);
        boolean b40 = defaultedMap33.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate30, predicate41);
        boolean b45 = defaultedMap6.containsValue((java.lang.Object) predicate41);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b9 = defaultedMap1.equals((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj32 = defaultedMap17.get((java.lang.Object) defaultedMap28);
        java.util.Collection collection33 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.lang.Object obj39 = new java.lang.Object();
        boolean b40 = defaultedMap35.containsKey(obj39);
        boolean b42 = defaultedMap35.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate43, predicate44);
        try {
            boolean b46 = fixedOrderComparator10.addAsEqual((java.lang.Object) defaultedMap17, (java.lang.Object) predicate43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1L + "'", obj32.equals(1L));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        boolean b9 = fixedOrderComparator7.add((java.lang.Object) predicateUtils8);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i15 = fixedOrderComparator14.getUnknownObjectBehavior();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) fixedOrderComparator14, (java.lang.Object) '4');
        boolean b19 = fixedOrderComparator14.add((java.lang.Object) "");
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = fixedOrderComparator14.add((java.lang.Object) predicate20);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        boolean b4 = fixedOrderComparator2.add((java.lang.Object) predicateUtils3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator2.add((java.lang.Object) obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i10 = fixedOrderComparator9.getUnknownObjectBehavior();
        boolean b11 = fixedOrderComparator9.isLocked();
        boolean b13 = fixedOrderComparator9.add((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (-1.0f));
        int i7 = defaultedMap3.size();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator10.isLocked();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator10);
        boolean b14 = fixedOrderComparator10.isLocked();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) predicateUtils19);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b24 = fixedOrderComparator18.add((java.lang.Object) obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        int i26 = fixedOrderComparator25.getUnknownObjectBehavior();
        java.lang.Object obj27 = defaultedMap11.get((java.lang.Object) fixedOrderComparator25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap31.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) predicate35);
        int i37 = defaultedMap31.size();
        java.util.Set set38 = defaultedMap31.keySet();
        java.util.Set set39 = defaultedMap31.keySet();
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap11.put((java.lang.Object) defaultedMap31, obj40);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1L + "'", obj27.equals(1L));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        boolean b2 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        boolean b20 = fixedOrderComparator18.add((java.lang.Object) predicateUtils19);
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) fixedOrderComparator18);
        boolean b22 = fixedOrderComparator18.isLocked();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b30 = defaultedMap27.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate31);
        int i33 = defaultedMap27.size();
        java.util.Set set34 = defaultedMap27.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        java.lang.Object obj50 = defaultedMap36.put((java.lang.Object) defaultedMap41, (java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        java.lang.Object obj56 = defaultedMap41.get((java.lang.Object) defaultedMap52);
        java.util.Collection collection57 = defaultedMap41.values();
        java.lang.Object obj58 = defaultedMap27.get((java.lang.Object) defaultedMap41);
        try {
            int i59 = fixedOrderComparator18.compare((java.lang.Object) (short) 1, (java.lang.Object) defaultedMap27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1L + "'", obj56.equals(1L));
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 1L + "'", obj58.equals(1L));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj27 = new java.lang.Object();
        boolean b28 = defaultedMap23.containsKey(obj27);
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        boolean b38 = defaultedMap35.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate39);
        boolean b42 = defaultedMap6.containsKey((java.lang.Object) defaultedMap23);
        java.lang.String str43 = defaultedMap23.toString();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = defaultedMap1.containsKey(obj5);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate17);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate17);
        boolean b20 = defaultedMap1.isEmpty();
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1L + "'", obj22.equals(1L));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) defaultedMap17);
        java.util.Collection collection22 = defaultedMap6.values();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        boolean b27 = fixedOrderComparator25.add((java.lang.Object) predicateUtils26);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b31 = fixedOrderComparator25.add((java.lang.Object) obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array29);
        fixedOrderComparator32.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        java.lang.Object obj50 = defaultedMap36.put((java.lang.Object) defaultedMap41, (java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        boolean b57 = defaultedMap54.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) predicate58);
        java.lang.Object obj60 = defaultedMap46.get((java.lang.Object) predicate58);
        boolean b61 = fixedOrderComparator32.add((java.lang.Object) defaultedMap46);
        defaultedMap6.putAll((java.util.Map) defaultedMap46);
        collections.Transformer transformer63 = null;
        try {
            java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, transformer63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1L + "'", obj60.equals(1L));
        org.junit.Assert.assertTrue(b61 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b4 = fixedOrderComparator3.isLocked();
        int i5 = fixedOrderComparator3.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj19 = defaultedMap5.put((java.lang.Object) defaultedMap10, (java.lang.Object) defaultedMap15);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        boolean b24 = fixedOrderComparator22.add((java.lang.Object) predicateUtils23);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) fixedOrderComparator22);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        boolean b31 = fixedOrderComparator29.add((java.lang.Object) predicateUtils30);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b35 = fixedOrderComparator29.add((java.lang.Object) obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array33);
        fixedOrderComparator36.setUnknownObjectBehavior(0);
        boolean b39 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        boolean b46 = defaultedMap43.containsKey((java.lang.Object) (-1.0f));
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicate47);
        java.lang.Object[] obj_array50 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.PredicateUtils predicateUtils52 = new collections.PredicateUtils();
        boolean b53 = fixedOrderComparator51.add((java.lang.Object) predicateUtils52);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { false };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        boolean b57 = fixedOrderComparator51.add((java.lang.Object) obj_array55);
        java.lang.Object obj58 = defaultedMap43.get((java.lang.Object) fixedOrderComparator51);
        boolean b59 = fixedOrderComparator36.add((java.lang.Object) fixedOrderComparator51);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1L + "'", obj25.equals(1L));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 1L + "'", obj58.equals(1L));
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = defaultedMap1.containsKey(obj5);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj13 = new java.lang.Object();
        boolean b14 = defaultedMap9.containsKey(obj13);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 10L);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate18);
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) defaultedMap27, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj42 = defaultedMap27.get((java.lang.Object) defaultedMap38);
        java.lang.Object obj44 = defaultedMap38.remove((java.lang.Object) 'a');
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) defaultedMap38);
        java.util.Set set46 = defaultedMap38.entrySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1L + "'", obj42.equals(1L));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set46);
    }
}

