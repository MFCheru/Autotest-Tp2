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
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
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
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        try {
            boolean b7 = fixedOrderComparator4.addAsEqual((java.lang.Object) 'a', (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        try {
            int i7 = fixedOrderComparator4.compare((java.lang.Object) 1.0f, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.Map map0 = null;
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) (byte) 100);
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) b7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue(b7 == true);
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
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) "hi!");
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        try {
            int i13 = fixedOrderComparator4.compare((java.lang.Object) (-1L), (java.lang.Object) defaultedMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertNotNull(obj_array10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.util.Collection collection13 = defaultedMap12.values();
        try {
            int i15 = fixedOrderComparator4.compare((java.lang.Object) collection13, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        int i7 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.util.Set set7 = defaultedMap5.entrySet();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap11.containsKey((java.lang.Object) defaultedMap18);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator27);
        java.lang.String str29 = defaultedMap28.toString();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        boolean b39 = defaultedMap35.isEmpty();
        java.util.Set set40 = defaultedMap35.entrySet();
        java.lang.Object obj41 = defaultedMap28.get((java.lang.Object) set40);
        java.lang.Object obj42 = defaultedMap18.get(obj41);
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) map51);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        int i58 = fixedOrderComparator57.getUnknownObjectBehavior();
        java.lang.Object obj59 = defaultedMap52.remove((java.lang.Object) i58);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator64);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        boolean b69 = defaultedMap65.isEmpty();
        java.util.Collection collection70 = defaultedMap65.values();
        boolean b71 = defaultedMap52.containsKey((java.lang.Object) collection70);
        try {
            boolean b72 = fixedOrderComparator4.addAsEqual((java.lang.Object) defaultedMap18, (java.lang.Object) defaultedMap52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue(i58 == 2);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (byte) 100);
        boolean b7 = fixedOrderComparator4.isLocked();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        int i6 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) "hi!");
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.util.Collection collection13 = defaultedMap12.values();
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) collection13);
        boolean b15 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) map8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 10);
        java.util.Set set12 = defaultedMap9.entrySet();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        int i11 = defaultedMap5.size();
        boolean b12 = defaultedMap5.isEmpty();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) true);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b12 = fixedOrderComparator4.add((java.lang.Object) obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        int i6 = fixedOrderComparator4.getUnknownObjectBehavior();
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = fixedOrderComparator10.add((java.lang.Object) true);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b18 = fixedOrderComparator10.add((java.lang.Object) obj_array16);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator23);
        java.lang.String str25 = defaultedMap24.toString();
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        boolean b35 = defaultedMap31.isEmpty();
        java.util.Set set36 = defaultedMap31.entrySet();
        java.lang.Object obj37 = defaultedMap24.get((java.lang.Object) set36);
        try {
            int i38 = fixedOrderComparator4.compare((java.lang.Object) b18, (java.lang.Object) defaultedMap24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.String str7 = defaultedMap5.toString();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (byte) 100);
        int i7 = fixedOrderComparator4.getUnknownObjectBehavior();
        boolean b8 = fixedOrderComparator4.isLocked();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj26 = defaultedMap5.put((java.lang.Object) defaultedMap22, (java.lang.Object) 0.0d);
        boolean b28 = defaultedMap5.equals((java.lang.Object) (-1.0f));
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        boolean b38 = defaultedMap34.isEmpty();
        java.util.Set set39 = defaultedMap34.entrySet();
        boolean b40 = defaultedMap34.isEmpty();
        java.util.Collection collection41 = defaultedMap34.values();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) collection41);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        boolean b11 = defaultedMap5.isEmpty();
        java.util.Collection collection12 = defaultedMap5.values();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.lang.String str23 = defaultedMap22.toString();
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        boolean b33 = defaultedMap29.isEmpty();
        java.util.Set set34 = defaultedMap29.entrySet();
        java.lang.Object obj35 = defaultedMap22.get((java.lang.Object) set34);
        java.lang.Object obj36 = defaultedMap12.get(obj35);
        int i37 = defaultedMap12.size();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap5.equals(obj8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) fixedOrderComparator14);
        defaultedMap5.clear();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b27 = defaultedMap23.isEmpty();
        java.util.Collection collection28 = defaultedMap23.values();
        java.lang.Object obj29 = defaultedMap5.get((java.lang.Object) defaultedMap23);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) map38);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        boolean b49 = defaultedMap45.isEmpty();
        collections.PredicateUtils predicateUtils50 = new collections.PredicateUtils();
        boolean b51 = defaultedMap45.containsKey((java.lang.Object) predicateUtils50);
        java.util.Map map52 = collections.map.DefaultedMap.decorate(map38, (java.lang.Object) predicateUtils50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) predicateUtils50);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Collection collection10 = defaultedMap5.values();
        java.util.Set set11 = defaultedMap5.entrySet();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) true);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b12 = fixedOrderComparator4.add((java.lang.Object) obj_array10);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b18 = fixedOrderComparator17.isLocked();
        int i19 = fixedOrderComparator17.getUnknownObjectBehavior();
        java.lang.Object obj20 = null;
        try {
            boolean b21 = fixedOrderComparator4.addAsEqual((java.lang.Object) i19, obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Collection collection10 = defaultedMap5.values();
        boolean b11 = defaultedMap5.isEmpty();
        java.lang.Object obj13 = defaultedMap5.remove((java.lang.Object) 2);
        boolean b14 = defaultedMap5.isEmpty();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b20 = fixedOrderComparator19.isLocked();
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) fixedOrderComparator19);
        int i22 = fixedOrderComparator19.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) map8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        int i15 = fixedOrderComparator14.getUnknownObjectBehavior();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) i15);
        java.util.Collection collection17 = defaultedMap9.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) fixedOrderComparator18);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        int i6 = fixedOrderComparator4.getUnknownObjectBehavior();
        fixedOrderComparator4.setUnknownObjectBehavior(1);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap5.equals(obj8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) fixedOrderComparator14);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator22);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        boolean b34 = defaultedMap23.containsKey((java.lang.Object) defaultedMap30);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator39);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 2);
        defaultedMap30.putAll((java.util.Map) defaultedMap40);
        try {
            boolean b44 = fixedOrderComparator14.addAsEqual((java.lang.Object) 0L, (java.lang.Object) defaultedMap40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        boolean b15 = defaultedMap11.isEmpty();
        java.util.Set set16 = defaultedMap11.entrySet();
        boolean b17 = fixedOrderComparator4.add((java.lang.Object) set16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b27 = defaultedMap23.isEmpty();
        java.util.Set set28 = defaultedMap23.entrySet();
        boolean b29 = defaultedMap23.isEmpty();
        java.util.Collection collection30 = defaultedMap23.values();
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        boolean b32 = defaultedMap23.containsValue((java.lang.Object) predicateUtils31);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator37);
        java.util.Collection collection39 = defaultedMap38.values();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        boolean b49 = defaultedMap38.containsKey((java.lang.Object) defaultedMap45);
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        boolean b55 = fixedOrderComparator54.isLocked();
        int i56 = fixedOrderComparator54.getUnknownObjectBehavior();
        java.lang.Object obj57 = defaultedMap38.get((java.lang.Object) fixedOrderComparator54);
        java.util.Set set58 = defaultedMap38.entrySet();
        try {
            boolean b59 = fixedOrderComparator4.addAsEqual((java.lang.Object) defaultedMap23, (java.lang.Object) set58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i56 == 2);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(set58);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap11.containsKey((java.lang.Object) defaultedMap18);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator27);
        java.lang.String str29 = defaultedMap28.toString();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        boolean b39 = defaultedMap35.isEmpty();
        java.util.Set set40 = defaultedMap35.entrySet();
        java.lang.Object obj41 = defaultedMap28.get((java.lang.Object) set40);
        java.lang.Object obj42 = defaultedMap18.get(obj41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap18);
        java.lang.String str44 = defaultedMap18.toString();
        java.lang.Object obj46 = defaultedMap18.get((java.lang.Object) 0.0f);
        boolean b47 = fixedOrderComparator4.add((java.lang.Object) 0.0f);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue(b47 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap5.equals(obj8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) fixedOrderComparator14);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap22.isEmpty();
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap22.equals(obj25);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator31);
        boolean b33 = defaultedMap22.containsValue((java.lang.Object) fixedOrderComparator31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator39);
        java.util.Collection collection41 = defaultedMap40.values();
        boolean b42 = defaultedMap40.isEmpty();
        try {
            int i43 = fixedOrderComparator14.compare((java.lang.Object) defaultedMap34, (java.lang.Object) defaultedMap40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b42 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator15);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 2);
        try {
            boolean b19 = fixedOrderComparator4.addAsEqual((java.lang.Object) fixedOrderComparator10, (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        int i23 = fixedOrderComparator21.getUnknownObjectBehavior();
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) fixedOrderComparator21);
        boolean b26 = defaultedMap5.containsKey((java.lang.Object) (-1.0d));
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        boolean b36 = defaultedMap32.isEmpty();
        java.util.Collection collection37 = defaultedMap32.values();
        boolean b38 = defaultedMap5.containsKey((java.lang.Object) defaultedMap32);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.lang.String str12 = defaultedMap11.toString();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap18.isEmpty();
        java.util.Set set23 = defaultedMap18.entrySet();
        java.lang.Object obj24 = defaultedMap11.get((java.lang.Object) set23);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator29);
        java.util.Collection collection31 = defaultedMap30.values();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        boolean b41 = defaultedMap30.containsKey((java.lang.Object) defaultedMap37);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator46);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 2);
        defaultedMap37.putAll((java.util.Map) defaultedMap47);
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) map59);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator65);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate67, predicate68);
        boolean b70 = defaultedMap66.isEmpty();
        collections.PredicateUtils predicateUtils71 = new collections.PredicateUtils();
        boolean b72 = defaultedMap66.containsKey((java.lang.Object) predicateUtils71);
        java.util.Map map73 = collections.map.DefaultedMap.decorate(map59, (java.lang.Object) predicateUtils71);
        java.lang.Object obj74 = defaultedMap37.get((java.lang.Object) map59);
        try {
            int i75 = fixedOrderComparator4.compare((java.lang.Object) set23, (java.lang.Object) defaultedMap37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(obj74);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap5.equals(obj8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) fixedOrderComparator14);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap22.isEmpty();
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap22.equals(obj25);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator31);
        java.lang.String str33 = defaultedMap32.toString();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator38);
        java.util.Collection collection40 = defaultedMap39.values();
        java.lang.Object obj41 = defaultedMap32.get((java.lang.Object) collection40);
        try {
            int i42 = fixedOrderComparator14.compare(obj25, obj41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        fixedOrderComparator4.setUnknownObjectBehavior((int) (short) 1);
        int i10 = fixedOrderComparator4.compare((java.lang.Object) 100.0d, (java.lang.Object) 1.0d);
        int i11 = fixedOrderComparator4.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) map8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 10);
        java.lang.String str12 = defaultedMap9.toString();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator17);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b20 = defaultedMap18.isEmpty();
        java.lang.Object obj21 = null;
        boolean b22 = defaultedMap18.equals(obj21);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator27);
        boolean b29 = defaultedMap18.containsValue((java.lang.Object) fixedOrderComparator27);
        defaultedMap18.clear();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        boolean b40 = defaultedMap36.isEmpty();
        java.util.Collection collection41 = defaultedMap36.values();
        java.lang.Object obj42 = defaultedMap18.get((java.lang.Object) defaultedMap36);
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator47);
        java.lang.String str49 = defaultedMap48.toString();
        java.lang.Object obj50 = defaultedMap36.get((java.lang.Object) defaultedMap48);
        java.lang.Object obj51 = defaultedMap9.get((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) (byte) 100);
        int i7 = fixedOrderComparator4.getUnknownObjectBehavior();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        java.util.Collection collection14 = defaultedMap13.values();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        boolean b24 = defaultedMap13.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator29);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj34 = defaultedMap13.put((java.lang.Object) defaultedMap30, (java.lang.Object) 0.0d);
        boolean b35 = fixedOrderComparator4.add((java.lang.Object) defaultedMap30);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        int i11 = defaultedMap5.size();
        java.lang.String str12 = defaultedMap5.toString();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        int i23 = fixedOrderComparator21.getUnknownObjectBehavior();
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) fixedOrderComparator21);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        boolean b34 = defaultedMap30.isEmpty();
        java.util.Collection collection35 = defaultedMap30.values();
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        boolean b41 = defaultedMap30.equals((java.lang.Object) fixedOrderComparator40);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator46);
        java.util.Collection collection48 = defaultedMap47.values();
        java.lang.Object[] obj_array52 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        boolean b58 = defaultedMap47.containsKey((java.lang.Object) defaultedMap54);
        java.lang.Object[] obj_array62 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator63);
        java.lang.String str65 = defaultedMap64.toString();
        java.lang.Object[] obj_array69 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator70);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate72, predicate73);
        boolean b75 = defaultedMap71.isEmpty();
        java.util.Set set76 = defaultedMap71.entrySet();
        java.lang.Object obj77 = defaultedMap64.get((java.lang.Object) set76);
        java.lang.Object obj78 = defaultedMap54.get(obj77);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap54);
        java.lang.String str80 = defaultedMap54.toString();
        java.lang.Object obj82 = defaultedMap54.get((java.lang.Object) 0.0f);
        try {
            boolean b83 = fixedOrderComparator21.addAsEqual((java.lang.Object) fixedOrderComparator40, obj82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertNotNull(obj82);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = fixedOrderComparator4.add((java.lang.Object) obj_array9);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 2);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) 10.0f);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        boolean b21 = defaultedMap17.isEmpty();
        java.util.Set set22 = defaultedMap17.entrySet();
        boolean b23 = defaultedMap17.isEmpty();
        java.util.Collection collection24 = defaultedMap17.values();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = null;
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate25, predicate26);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate26, predicate35);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Collection collection10 = defaultedMap5.values();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b16 = defaultedMap5.equals((java.lang.Object) fixedOrderComparator15);
        int i17 = fixedOrderComparator15.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        boolean b17 = defaultedMap13.isEmpty();
        java.util.Collection collection18 = defaultedMap13.values();
        boolean b19 = defaultedMap13.isEmpty();
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) 2);
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        boolean b11 = defaultedMap5.isEmpty();
        java.util.Collection collection12 = defaultedMap5.values();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap18.isEmpty();
        java.util.Collection collection23 = defaultedMap18.values();
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        int i29 = fixedOrderComparator28.getUnknownObjectBehavior();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        boolean b39 = defaultedMap35.isEmpty();
        java.util.Set set40 = defaultedMap35.entrySet();
        boolean b41 = fixedOrderComparator28.add((java.lang.Object) set40);
        boolean b42 = defaultedMap18.equals((java.lang.Object) set40);
        java.util.Collection collection43 = defaultedMap18.values();
        java.lang.Object obj44 = defaultedMap5.remove((java.lang.Object) collection43);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(i29 == 2);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        boolean b11 = defaultedMap5.isEmpty();
        java.util.Collection collection12 = defaultedMap5.values();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap18.isEmpty();
        java.util.Set set23 = defaultedMap18.entrySet();
        int i24 = defaultedMap18.size();
        boolean b25 = defaultedMap18.isEmpty();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap18.remove(obj26);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.lang.String str34 = defaultedMap33.toString();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator39);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj42 = defaultedMap33.get((java.lang.Object) collection41);
        defaultedMap18.putAll((java.util.Map) defaultedMap33);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator48);
        java.lang.String str50 = defaultedMap49.toString();
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator55);
        java.util.Collection collection57 = defaultedMap56.values();
        java.lang.Object obj58 = defaultedMap49.get((java.lang.Object) collection57);
        java.lang.Object obj59 = defaultedMap5.put((java.lang.Object) defaultedMap18, (java.lang.Object) collection57);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator64);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        boolean b69 = defaultedMap18.containsValue((java.lang.Object) predicate66);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        boolean b11 = defaultedMap5.isEmpty();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator16);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        boolean b28 = defaultedMap17.containsKey((java.lang.Object) defaultedMap24);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator33);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 2);
        defaultedMap24.putAll((java.util.Map) defaultedMap34);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) map46);
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator52);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate54, predicate55);
        boolean b57 = defaultedMap53.isEmpty();
        collections.PredicateUtils predicateUtils58 = new collections.PredicateUtils();
        boolean b59 = defaultedMap53.containsKey((java.lang.Object) predicateUtils58);
        java.util.Map map60 = collections.map.DefaultedMap.decorate(map46, (java.lang.Object) predicateUtils58);
        java.lang.Object obj61 = defaultedMap24.get((java.lang.Object) map46);
        boolean b62 = defaultedMap5.containsValue(obj61);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 2);
        defaultedMap12.putAll((java.util.Map) defaultedMap22);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        boolean b11 = defaultedMap5.isEmpty();
        java.util.Collection collection12 = defaultedMap5.values();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap18.isEmpty();
        java.util.Set set23 = defaultedMap18.entrySet();
        int i24 = defaultedMap18.size();
        boolean b25 = defaultedMap18.isEmpty();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap18.remove(obj26);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.lang.String str34 = defaultedMap33.toString();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator39);
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj42 = defaultedMap33.get((java.lang.Object) collection41);
        defaultedMap18.putAll((java.util.Map) defaultedMap33);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator48);
        java.lang.String str50 = defaultedMap49.toString();
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator55);
        java.util.Collection collection57 = defaultedMap56.values();
        java.lang.Object obj58 = defaultedMap49.get((java.lang.Object) collection57);
        java.lang.Object obj59 = defaultedMap5.put((java.lang.Object) defaultedMap18, (java.lang.Object) collection57);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator64);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        boolean b69 = defaultedMap65.isEmpty();
        java.util.Set set70 = defaultedMap65.entrySet();
        boolean b71 = defaultedMap65.isEmpty();
        java.util.Collection collection72 = defaultedMap65.values();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate74 = null;
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate73, predicate74);
        java.lang.Object[] obj_array79 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array79);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator80);
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate82, predicate83);
        boolean b85 = defaultedMap81.isEmpty();
        java.util.Set set86 = defaultedMap81.entrySet();
        int i87 = defaultedMap81.size();
        boolean b88 = defaultedMap81.isEmpty();
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate89, predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate73, predicate90);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(obj_array79);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue(i87 == 0);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.util.Collection collection12 = defaultedMap11.values();
        boolean b13 = defaultedMap11.isEmpty();
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap11.equals(obj14);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator20);
        boolean b22 = defaultedMap11.containsValue((java.lang.Object) fixedOrderComparator20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap11);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator28);
        java.util.Collection collection30 = defaultedMap29.values();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        boolean b40 = defaultedMap29.containsKey((java.lang.Object) defaultedMap36);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator45);
        java.lang.Object obj48 = defaultedMap46.get((java.lang.Object) 2);
        defaultedMap36.putAll((java.util.Map) defaultedMap46);
        java.lang.Object obj50 = defaultedMap23.get((java.lang.Object) defaultedMap46);
        java.util.Set set51 = defaultedMap23.keySet();
        java.lang.Object obj52 = null;
        try {
            int i53 = fixedOrderComparator4.compare((java.lang.Object) defaultedMap23, obj52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b26 = defaultedMap22.isEmpty();
        java.util.Set set27 = defaultedMap22.entrySet();
        int i28 = defaultedMap22.size();
        boolean b29 = defaultedMap22.isEmpty();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator34);
        java.util.Collection collection36 = defaultedMap35.values();
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate44);
        boolean b46 = defaultedMap35.containsKey((java.lang.Object) defaultedMap42);
        java.util.Set set47 = defaultedMap35.entrySet();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap35);
        java.util.Set set49 = defaultedMap35.keySet();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator54);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        boolean b59 = defaultedMap55.isEmpty();
        collections.PredicateUtils predicateUtils60 = new collections.PredicateUtils();
        boolean b61 = defaultedMap55.containsKey((java.lang.Object) predicateUtils60);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array66 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator67);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate70);
        boolean b72 = defaultedMap68.isEmpty();
        java.util.Set set73 = defaultedMap68.entrySet();
        int i74 = defaultedMap68.size();
        boolean b75 = defaultedMap68.isEmpty();
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate76, predicate77);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate62, predicate77);
        boolean b80 = defaultedMap35.equals((java.lang.Object) predicate77);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) b80);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = fixedOrderComparator4.add((java.lang.Object) fixedOrderComparator11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b22 = fixedOrderComparator20.add((java.lang.Object) true);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b28 = fixedOrderComparator20.add((java.lang.Object) obj_array26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) b28);
        try {
            int i31 = fixedOrderComparator4.compare((java.lang.Object) map29, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) map8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        int i15 = fixedOrderComparator14.getUnknownObjectBehavior();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) i15);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b26 = defaultedMap22.isEmpty();
        java.util.Collection collection27 = defaultedMap22.values();
        boolean b28 = defaultedMap9.containsKey((java.lang.Object) collection27);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        boolean b38 = defaultedMap34.isEmpty();
        java.util.Set set39 = defaultedMap34.entrySet();
        int i40 = defaultedMap34.size();
        boolean b41 = defaultedMap34.isEmpty();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate42, predicate43);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate42, predicate51);
        java.util.Set set55 = defaultedMap9.keySet();
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator60);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate62, predicate63);
        boolean b65 = defaultedMap61.isEmpty();
        java.util.Set set66 = defaultedMap61.entrySet();
        int i67 = defaultedMap61.size();
        boolean b68 = defaultedMap61.isEmpty();
        java.lang.Object obj69 = null;
        java.lang.Object obj70 = defaultedMap61.remove(obj69);
        boolean b71 = defaultedMap9.containsValue(obj70);
        java.lang.Object[] obj_array75 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array75);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator76);
        java.util.Collection collection78 = defaultedMap77.values();
        boolean b79 = defaultedMap77.isEmpty();
        java.lang.Object obj80 = null;
        boolean b81 = defaultedMap77.equals(obj80);
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) b81);
        collections.Factory factory83 = null;
        try {
            java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(obj_array75);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        fixedOrderComparator4.setUnknownObjectBehavior((int) (short) 1);
        int i10 = fixedOrderComparator4.compare((java.lang.Object) 100.0d, (java.lang.Object) 1.0d);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator15);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b27 = defaultedMap16.containsKey((java.lang.Object) defaultedMap23);
        java.util.Set set28 = defaultedMap16.entrySet();
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        boolean b34 = fixedOrderComparator33.isLocked();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b41 = fixedOrderComparator33.add((java.lang.Object) fixedOrderComparator40);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator46);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        boolean b51 = defaultedMap47.isEmpty();
        collections.PredicateUtils predicateUtils52 = new collections.PredicateUtils();
        boolean b53 = defaultedMap47.containsKey((java.lang.Object) predicateUtils52);
        java.lang.Object[] obj_array57 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        boolean b63 = defaultedMap59.isEmpty();
        collections.PredicateUtils predicateUtils64 = new collections.PredicateUtils();
        boolean b65 = defaultedMap59.containsKey((java.lang.Object) predicateUtils64);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicateUtils64);
        java.lang.String str67 = defaultedMap47.toString();
        boolean b68 = fixedOrderComparator33.add((java.lang.Object) defaultedMap47);
        int i69 = fixedOrderComparator4.compare((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap47);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(i69 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) map8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        int i15 = fixedOrderComparator14.getUnknownObjectBehavior();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) i15);
        java.util.Collection collection17 = defaultedMap9.values();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b27 = defaultedMap23.isEmpty();
        java.util.Set set28 = defaultedMap23.entrySet();
        int i29 = defaultedMap23.size();
        boolean b30 = defaultedMap23.isEmpty();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator35);
        java.util.Collection collection37 = defaultedMap36.values();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        boolean b47 = defaultedMap36.containsKey((java.lang.Object) defaultedMap43);
        java.util.Set set48 = defaultedMap36.entrySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) defaultedMap36);
        boolean b50 = defaultedMap9.containsKey((java.lang.Object) map49);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj26 = defaultedMap5.put((java.lang.Object) defaultedMap22, (java.lang.Object) 0.0d);
        java.util.Collection collection27 = defaultedMap22.values();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        boolean b17 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.String str6 = defaultedMap5.toString();
        int i7 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) map16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) i23);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator29);
        java.util.Collection collection31 = defaultedMap30.values();
        boolean b32 = defaultedMap30.isEmpty();
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap30.equals(obj33);
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator39);
        boolean b41 = defaultedMap30.containsValue((java.lang.Object) fixedOrderComparator39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap30);
        java.lang.Object obj43 = defaultedMap17.get((java.lang.Object) defaultedMap42);
        java.lang.Object obj44 = defaultedMap5.get(obj43);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        int i23 = fixedOrderComparator21.getUnknownObjectBehavior();
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) fixedOrderComparator21);
        boolean b26 = defaultedMap5.containsKey((java.lang.Object) (-1.0d));
        java.util.Collection collection27 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap5.equals(obj8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) fixedOrderComparator14);
        defaultedMap5.clear();
        java.util.Collection collection18 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.util.Collection collection2 = defaultedMap1.values();
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        boolean b7 = fixedOrderComparator4.add((java.lang.Object) 1L);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        java.util.Collection collection14 = defaultedMap13.values();
        boolean b15 = defaultedMap13.isEmpty();
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap13.equals(obj16);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator22);
        boolean b24 = defaultedMap13.containsValue((java.lang.Object) fixedOrderComparator22);
        defaultedMap13.clear();
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        boolean b35 = defaultedMap31.isEmpty();
        java.util.Collection collection36 = defaultedMap31.values();
        java.lang.Object obj37 = defaultedMap13.get((java.lang.Object) defaultedMap31);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator42);
        java.lang.String str44 = defaultedMap43.toString();
        java.lang.Object obj45 = defaultedMap31.get((java.lang.Object) defaultedMap43);
        boolean b46 = fixedOrderComparator4.add(obj45);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Collection collection10 = defaultedMap5.values();
        boolean b11 = defaultedMap5.isEmpty();
        java.lang.Object obj13 = defaultedMap5.remove((java.lang.Object) 2);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator18);
        boolean b20 = defaultedMap5.equals((java.lang.Object) fixedOrderComparator18);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) predicateUtils10);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        boolean b21 = defaultedMap17.isEmpty();
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        boolean b23 = defaultedMap17.containsKey((java.lang.Object) predicateUtils22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) predicateUtils22);
        java.lang.String str25 = defaultedMap5.toString();
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        boolean b35 = defaultedMap31.isEmpty();
        java.util.Set set36 = defaultedMap31.entrySet();
        int i37 = defaultedMap31.size();
        boolean b38 = defaultedMap31.isEmpty();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate39, predicate40);
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator46);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        boolean b51 = defaultedMap47.isEmpty();
        collections.PredicateUtils predicateUtils52 = new collections.PredicateUtils();
        boolean b53 = defaultedMap47.containsKey((java.lang.Object) predicateUtils52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array58 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        boolean b64 = defaultedMap60.isEmpty();
        java.util.Set set65 = defaultedMap60.entrySet();
        int i66 = defaultedMap60.size();
        boolean b67 = defaultedMap60.isEmpty();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate68, predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate54, predicate69);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate40, predicate69);
        int i73 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(i73 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) map10);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator16);
        try {
            boolean b18 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap11, (java.lang.Object) fixedOrderComparator16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(obj_array15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap5.equals(obj8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) fixedOrderComparator14);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) map25);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        int i32 = fixedOrderComparator31.getUnknownObjectBehavior();
        java.lang.Object obj33 = defaultedMap26.remove((java.lang.Object) i32);
        java.util.Collection collection34 = defaultedMap26.values();
        boolean b35 = defaultedMap5.containsValue((java.lang.Object) collection34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) collection34);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(i32 == 2);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) map8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        int i15 = fixedOrderComparator14.getUnknownObjectBehavior();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) i15);
        java.util.Collection collection17 = defaultedMap9.values();
        collections.Factory factory18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b6 = fixedOrderComparator4.add((java.lang.Object) true);
        int i7 = fixedOrderComparator4.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 2);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        boolean b12 = defaultedMap8.isEmpty();
        java.util.Collection collection13 = defaultedMap8.values();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        boolean b29 = defaultedMap25.isEmpty();
        java.util.Set set30 = defaultedMap25.entrySet();
        boolean b31 = fixedOrderComparator18.add((java.lang.Object) set30);
        boolean b32 = defaultedMap8.equals((java.lang.Object) set30);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) map41);
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        int i48 = fixedOrderComparator47.getUnknownObjectBehavior();
        java.lang.Object obj49 = defaultedMap42.remove((java.lang.Object) i48);
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator54);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        boolean b59 = defaultedMap55.isEmpty();
        java.util.Collection collection60 = defaultedMap55.values();
        boolean b61 = defaultedMap42.containsKey((java.lang.Object) collection60);
        java.lang.Object[] obj_array65 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate68, predicate69);
        boolean b71 = defaultedMap67.isEmpty();
        java.util.Set set72 = defaultedMap67.entrySet();
        int i73 = defaultedMap67.size();
        boolean b74 = defaultedMap67.isEmpty();
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate75, predicate76);
        java.lang.Object[] obj_array81 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator82 = new collections.comparators.FixedOrderComparator(obj_array81);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator82);
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap83, predicate84, predicate85);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate75, predicate84);
        java.lang.Object obj88 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap42);
        defaultedMap42.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(i48 == 2);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(obj_array81);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 2);
        defaultedMap12.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection26 = defaultedMap12.values();
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        boolean b36 = defaultedMap32.isEmpty();
        java.util.Set set37 = defaultedMap32.entrySet();
        int i38 = defaultedMap32.size();
        boolean b39 = defaultedMap32.isEmpty();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate40, predicate41);
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        boolean b52 = defaultedMap48.isEmpty();
        java.util.Set set53 = defaultedMap48.entrySet();
        int i54 = defaultedMap48.size();
        boolean b55 = defaultedMap48.isEmpty();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate40, predicate57);
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator64);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        boolean b69 = defaultedMap65.isEmpty();
        collections.PredicateUtils predicateUtils70 = new collections.PredicateUtils();
        boolean b71 = defaultedMap65.containsKey((java.lang.Object) predicateUtils70);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array76 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator77);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate79, predicate80);
        boolean b82 = defaultedMap78.isEmpty();
        java.util.Set set83 = defaultedMap78.entrySet();
        int i84 = defaultedMap78.size();
        boolean b85 = defaultedMap78.isEmpty();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate86, predicate87);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate72, predicate87);
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) map89);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap12.isEmpty();
        java.util.Set set17 = defaultedMap12.entrySet();
        int i18 = defaultedMap12.size();
        boolean b19 = defaultedMap12.isEmpty();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator24);
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        boolean b36 = defaultedMap25.containsKey((java.lang.Object) defaultedMap32);
        java.util.Set set37 = defaultedMap25.entrySet();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap25);
        boolean b39 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.util.Set set17 = defaultedMap5.entrySet();
        java.util.Collection collection18 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = fixedOrderComparator4.add((java.lang.Object) fixedOrderComparator11);
        boolean b13 = fixedOrderComparator11.isLocked();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        int i23 = fixedOrderComparator21.getUnknownObjectBehavior();
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) fixedOrderComparator21);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b30 = fixedOrderComparator29.isLocked();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b37 = fixedOrderComparator29.add((java.lang.Object) fixedOrderComparator36);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        boolean b47 = defaultedMap43.isEmpty();
        collections.PredicateUtils predicateUtils48 = new collections.PredicateUtils();
        boolean b49 = defaultedMap43.containsKey((java.lang.Object) predicateUtils48);
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator54);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        boolean b59 = defaultedMap55.isEmpty();
        collections.PredicateUtils predicateUtils60 = new collections.PredicateUtils();
        boolean b61 = defaultedMap55.containsKey((java.lang.Object) predicateUtils60);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) predicateUtils60);
        java.lang.String str63 = defaultedMap43.toString();
        boolean b64 = fixedOrderComparator29.add((java.lang.Object) defaultedMap43);
        java.lang.Object[] obj_array68 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator69);
        java.util.Collection collection71 = defaultedMap70.values();
        java.lang.Object[] obj_array75 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array75);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator76);
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate78, predicate79);
        boolean b81 = defaultedMap70.containsKey((java.lang.Object) defaultedMap77);
        boolean b82 = defaultedMap77.isEmpty();
        java.util.Set set83 = defaultedMap77.keySet();
        try {
            boolean b84 = fixedOrderComparator21.addAsEqual((java.lang.Object) fixedOrderComparator29, (java.lang.Object) defaultedMap77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(obj_array75);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(set83);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate(map8, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        int i11 = defaultedMap5.size();
        boolean b12 = defaultedMap5.isEmpty();
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj26 = defaultedMap5.put((java.lang.Object) defaultedMap22, (java.lang.Object) 0.0d);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator31);
        java.util.Collection collection33 = defaultedMap32.values();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        boolean b43 = defaultedMap32.containsKey((java.lang.Object) defaultedMap39);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator48);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 2);
        defaultedMap39.putAll((java.util.Map) defaultedMap49);
        java.util.Collection collection53 = defaultedMap39.values();
        java.lang.Object[] obj_array57 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        boolean b63 = defaultedMap59.isEmpty();
        java.util.Set set64 = defaultedMap59.entrySet();
        int i65 = defaultedMap59.size();
        boolean b66 = defaultedMap59.isEmpty();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate67, predicate68);
        java.lang.Object[] obj_array73 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array73);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator74);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate76, predicate77);
        boolean b79 = defaultedMap75.isEmpty();
        java.util.Set set80 = defaultedMap75.entrySet();
        int i81 = defaultedMap75.size();
        boolean b82 = defaultedMap75.isEmpty();
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate83, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate67, predicate84);
        java.lang.Object obj87 = defaultedMap5.remove((java.lang.Object) map86);
        defaultedMap5.clear();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(obj_array73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + 0.0d + "'", obj87.equals(0.0d));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) map8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        int i15 = fixedOrderComparator14.getUnknownObjectBehavior();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) i15);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b26 = defaultedMap22.isEmpty();
        java.util.Collection collection27 = defaultedMap22.values();
        boolean b28 = defaultedMap9.containsKey((java.lang.Object) collection27);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        boolean b38 = defaultedMap34.isEmpty();
        java.util.Set set39 = defaultedMap34.entrySet();
        int i40 = defaultedMap34.size();
        boolean b41 = defaultedMap34.isEmpty();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate42, predicate43);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate42, predicate51);
        java.util.Set set55 = defaultedMap9.keySet();
        collections.Factory factory56 = null;
        try {
            java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(set55);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap5.equals(obj8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) fixedOrderComparator14);
        int i17 = fixedOrderComparator14.getUnknownObjectBehavior();
        fixedOrderComparator14.setUnknownObjectBehavior(0);
        try {
            fixedOrderComparator14.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap5.equals(obj8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) fixedOrderComparator14);
        defaultedMap5.clear();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b27 = defaultedMap23.isEmpty();
        java.util.Collection collection28 = defaultedMap23.values();
        java.lang.Object obj29 = defaultedMap5.get((java.lang.Object) defaultedMap23);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator34);
        java.lang.String str36 = defaultedMap35.toString();
        java.lang.Object obj37 = defaultedMap23.get((java.lang.Object) defaultedMap35);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        boolean b47 = defaultedMap43.isEmpty();
        collections.PredicateUtils predicateUtils48 = new collections.PredicateUtils();
        boolean b49 = defaultedMap43.containsKey((java.lang.Object) predicateUtils48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate58);
        boolean b60 = defaultedMap56.isEmpty();
        java.util.Set set61 = defaultedMap56.entrySet();
        int i62 = defaultedMap56.size();
        boolean b63 = defaultedMap56.isEmpty();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate50, predicate65);
        java.lang.Object[] obj_array71 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array71);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator72);
        java.lang.Object obj75 = defaultedMap73.get((java.lang.Object) 2);
        java.lang.Object obj77 = defaultedMap73.get((java.lang.Object) ' ');
        boolean b79 = defaultedMap73.containsKey((java.lang.Object) 10.0f);
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        boolean b81 = defaultedMap73.containsKey((java.lang.Object) predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate65, predicate80);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(obj_array71);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        int i11 = defaultedMap5.size();
        boolean b12 = defaultedMap5.isEmpty();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.util.Set set22 = defaultedMap18.keySet();
        java.lang.Object obj23 = defaultedMap5.get((java.lang.Object) defaultedMap18);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = fixedOrderComparator21.isLocked();
        int i23 = fixedOrderComparator21.getUnknownObjectBehavior();
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) fixedOrderComparator21);
        boolean b25 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        int i11 = defaultedMap5.size();
        boolean b12 = defaultedMap5.isEmpty();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap5.remove(obj13);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.String str21 = defaultedMap20.toString();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator26);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj29 = defaultedMap20.get((java.lang.Object) collection28);
        defaultedMap5.putAll((java.util.Map) defaultedMap20);
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) map39);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        int i46 = fixedOrderComparator45.getUnknownObjectBehavior();
        java.lang.Object obj47 = defaultedMap40.remove((java.lang.Object) i46);
        java.util.Collection collection48 = defaultedMap40.values();
        java.lang.Object obj49 = defaultedMap20.remove((java.lang.Object) collection48);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue(i46 == 2);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap5.equals(obj8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) fixedOrderComparator14);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) map25);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        int i32 = fixedOrderComparator31.getUnknownObjectBehavior();
        java.lang.Object obj33 = defaultedMap26.remove((java.lang.Object) i32);
        java.util.Collection collection34 = defaultedMap26.values();
        boolean b35 = defaultedMap5.containsValue((java.lang.Object) collection34);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator40);
        java.util.Collection collection42 = defaultedMap41.values();
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        boolean b52 = defaultedMap41.containsKey((java.lang.Object) defaultedMap48);
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator57);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) 2);
        defaultedMap48.putAll((java.util.Map) defaultedMap58);
        java.util.Collection collection62 = defaultedMap48.values();
        boolean b63 = defaultedMap5.equals((java.lang.Object) collection62);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(i32 == 2);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.lang.String str23 = defaultedMap22.toString();
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        boolean b33 = defaultedMap29.isEmpty();
        java.util.Set set34 = defaultedMap29.entrySet();
        java.lang.Object obj35 = defaultedMap22.get((java.lang.Object) set34);
        java.lang.Object obj36 = defaultedMap12.get(obj35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        java.lang.String str38 = defaultedMap12.toString();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        java.lang.Object obj45 = defaultedMap12.get((java.lang.Object) fixedOrderComparator44);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) map8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        int i15 = fixedOrderComparator14.getUnknownObjectBehavior();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) i15);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b26 = defaultedMap22.isEmpty();
        java.util.Collection collection27 = defaultedMap22.values();
        boolean b28 = defaultedMap9.containsKey((java.lang.Object) collection27);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        boolean b38 = defaultedMap34.isEmpty();
        java.util.Set set39 = defaultedMap34.entrySet();
        int i40 = defaultedMap34.size();
        boolean b41 = defaultedMap34.isEmpty();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate42, predicate43);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate42, predicate51);
        java.util.Set set55 = defaultedMap9.keySet();
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator60);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate62, predicate63);
        boolean b65 = defaultedMap61.isEmpty();
        java.util.Set set66 = defaultedMap61.entrySet();
        int i67 = defaultedMap61.size();
        boolean b68 = defaultedMap61.isEmpty();
        java.lang.Object obj69 = null;
        java.lang.Object obj70 = defaultedMap61.remove(obj69);
        boolean b71 = defaultedMap9.containsValue(obj70);
        java.util.Set set72 = defaultedMap9.keySet();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(set72);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        int i11 = defaultedMap5.size();
        boolean b12 = defaultedMap5.isEmpty();
        int i13 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        int i11 = defaultedMap5.size();
        boolean b12 = defaultedMap5.isEmpty();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap5.remove(obj13);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.String str21 = defaultedMap20.toString();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator26);
        java.util.Collection collection28 = defaultedMap27.values();
        java.lang.Object obj29 = defaultedMap20.get((java.lang.Object) collection28);
        defaultedMap5.putAll((java.util.Map) defaultedMap20);
        defaultedMap20.clear();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap5.equals(obj8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        boolean b16 = defaultedMap5.containsValue((java.lang.Object) fixedOrderComparator14);
        defaultedMap5.clear();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b27 = defaultedMap23.isEmpty();
        java.util.Collection collection28 = defaultedMap23.values();
        java.lang.Object obj29 = defaultedMap5.get((java.lang.Object) defaultedMap23);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator34);
        java.util.Collection collection36 = defaultedMap35.values();
        boolean b37 = defaultedMap35.isEmpty();
        java.lang.Object obj38 = null;
        boolean b39 = defaultedMap35.equals(obj38);
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator44);
        boolean b46 = defaultedMap35.containsValue((java.lang.Object) fixedOrderComparator44);
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator51);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) map55);
        java.lang.Object[] obj_array60 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        int i62 = fixedOrderComparator61.getUnknownObjectBehavior();
        java.lang.Object obj63 = defaultedMap56.remove((java.lang.Object) i62);
        java.util.Collection collection64 = defaultedMap56.values();
        boolean b65 = defaultedMap35.containsValue((java.lang.Object) collection64);
        boolean b66 = defaultedMap5.containsValue((java.lang.Object) b65);
        java.util.Set set67 = defaultedMap5.keySet();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(i62 == 2);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(set67);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b12 = fixedOrderComparator4.add((java.lang.Object) fixedOrderComparator11);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap18.isEmpty();
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) predicateUtils23);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        boolean b34 = defaultedMap30.isEmpty();
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        boolean b36 = defaultedMap30.containsKey((java.lang.Object) predicateUtils35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) predicateUtils35);
        java.lang.String str38 = defaultedMap18.toString();
        boolean b39 = fixedOrderComparator4.add((java.lang.Object) defaultedMap18);
        boolean b40 = fixedOrderComparator4.isLocked();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap7.containsKey((java.lang.Object) defaultedMap14);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b24 = fixedOrderComparator23.isLocked();
        int i25 = fixedOrderComparator23.getUnknownObjectBehavior();
        java.lang.Object obj26 = defaultedMap7.get((java.lang.Object) fixedOrderComparator23);
        java.util.Set set27 = defaultedMap7.entrySet();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) map36);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        int i43 = fixedOrderComparator42.getUnknownObjectBehavior();
        java.lang.Object obj44 = defaultedMap37.remove((java.lang.Object) i43);
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        boolean b54 = defaultedMap50.isEmpty();
        java.util.Collection collection55 = defaultedMap50.values();
        boolean b56 = defaultedMap37.containsKey((java.lang.Object) collection55);
        java.lang.Object[] obj_array60 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator61);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        boolean b66 = defaultedMap62.isEmpty();
        java.util.Set set67 = defaultedMap62.entrySet();
        int i68 = defaultedMap62.size();
        boolean b69 = defaultedMap62.isEmpty();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate70, predicate71);
        java.lang.Object[] obj_array76 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator77);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate79, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate70, predicate79);
        try {
            int i83 = fixedOrderComparator0.compare((java.lang.Object) set27, (java.lang.Object) defaultedMap37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(i43 == 2);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) map8);
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        int i15 = fixedOrderComparator14.getUnknownObjectBehavior();
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) i15);
        java.util.Collection collection17 = defaultedMap9.values();
        java.util.Set set18 = defaultedMap9.entrySet();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator6);
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap7.containsKey((java.lang.Object) defaultedMap14);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 2);
        defaultedMap14.putAll((java.util.Map) defaultedMap24);
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) map36);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 1L, 100.0f, 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        boolean b47 = defaultedMap43.isEmpty();
        collections.PredicateUtils predicateUtils48 = new collections.PredicateUtils();
        boolean b49 = defaultedMap43.containsKey((java.lang.Object) predicateUtils48);
        java.util.Map map50 = collections.map.DefaultedMap.decorate(map36, (java.lang.Object) predicateUtils48);
        java.lang.Object obj51 = defaultedMap14.get((java.lang.Object) map36);
        boolean b52 = fixedOrderComparator0.add(obj51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        boolean b54 = fixedOrderComparator0.add((java.lang.Object) predicate53);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b54 == true);
    }
}

