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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
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
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) -1, 10, 1.0f, 0L, 0, (byte) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj11 = null;
        try {
            int i12 = fixedOrderComparator9.compare((java.lang.Object) (-1.0f), obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) -1, 10, 1.0f, 0L, 0, (byte) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b8 = fixedOrderComparator7.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array16);
        try {
            boolean b21 = fixedOrderComparator7.addAsEqual((java.lang.Object) fixedOrderComparator19, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array16);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) obj_array15);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator36.setUnknownObjectBehavior(1);
        boolean b39 = fixedOrderComparator28.add((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator();
        try {
            int i3 = fixedOrderComparator0.compare((java.lang.Object) (-1.0d), (java.lang.Object) fixedOrderComparator2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i13 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate17, predicate18);
        boolean b21 = defaultedMap15.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection22 = defaultedMap15.values();
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = defaultedMap15.remove((java.lang.Object) obj_array29);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) obj_array39);
        defaultedMap7.putAll(map41);
        collections.Factory factory43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate(map41, factory43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        boolean b17 = defaultedMap11.containsValue((java.lang.Object) 10);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator18.setUnknownObjectBehavior((int) (short) 0);
        try {
            boolean b21 = fixedOrderComparator7.addAsEqual((java.lang.Object) 10, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i10 = fixedOrderComparator9.getUnknownObjectBehavior();
        java.lang.Object obj12 = null;
        try {
            boolean b13 = fixedOrderComparator9.addAsEqual((java.lang.Object) 100.0d, obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { "hi!", predicate9, (byte) 1, false, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        int i25 = fixedOrderComparator24.getUnknownObjectBehavior();
        try {
            boolean b26 = fixedOrderComparator7.addAsEqual((java.lang.Object) obj_array13, (java.lang.Object) fixedOrderComparator24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(i25 == 2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) -1, 10, 1.0f, 0L, 0, (byte) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        int i9 = fixedOrderComparator7.getUnknownObjectBehavior();
        boolean b11 = fixedOrderComparator7.add((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        boolean b28 = defaultedMap22.containsValue((java.lang.Object) "hi!");
        java.util.Set set29 = defaultedMap22.keySet();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { fixedOrderComparator37, 0L, 1, predicate40, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b45 = defaultedMap22.containsKey((java.lang.Object) fixedOrderComparator44);
        java.lang.Object[] obj_array52 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array52);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array52);
        int i56 = fixedOrderComparator55.getUnknownObjectBehavior();
        try {
            boolean b57 = fixedOrderComparator20.addAsEqual((java.lang.Object) defaultedMap22, (java.lang.Object) i56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(i56 == 2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        boolean b30 = defaultedMap24.containsValue((java.lang.Object) "hi!");
        java.util.Set set31 = defaultedMap24.keySet();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        fixedOrderComparator39.setUnknownObjectBehavior(1);
        fixedOrderComparator39.setUnknownObjectBehavior(1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set46 = defaultedMap45.keySet();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        boolean b51 = defaultedMap45.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection52 = defaultedMap45.values();
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array59);
        java.lang.Object obj62 = defaultedMap45.remove((java.lang.Object) obj_array59);
        java.lang.Object[] obj_array69 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) obj_array69);
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array69);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set75 = defaultedMap74.keySet();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate76, predicate77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set81 = defaultedMap80.keySet();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate82, predicate83);
        defaultedMap74.putAll((java.util.Map) defaultedMap80);
        java.util.Collection collection86 = defaultedMap80.values();
        java.lang.Object[] obj_array88 = new java.lang.Object[] { set31, 1, obj_array69, defaultedMap80, 0.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array88);
        try {
            int i90 = fixedOrderComparator21.compare((java.lang.Object) false, (java.lang.Object) fixedOrderComparator89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNotNull(obj_array88);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 0L);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array10);
        try {
            boolean b14 = fixedOrderComparator0.addAsEqual((java.lang.Object) (byte) 10, (java.lang.Object) fixedOrderComparator13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(obj_array10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (short) -1, 10, 1.0f, 0L, 0, (byte) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        try {
            int i10 = fixedOrderComparator7.compare((java.lang.Object) 10L, (java.lang.Object) "{}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator21.setUnknownObjectBehavior(2);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        boolean b14 = defaultedMap7.isEmpty();
        defaultedMap7.clear();
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100L + "'", obj17.equals(100L));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap1.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { "hi!", predicate15, (byte) 1, false, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) fixedOrderComparator20, (java.lang.Object) 100.0d);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (short) -1, 10, 1.0f, 0L, 0, (byte) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        int i31 = fixedOrderComparator30.getUnknownObjectBehavior();
        int i32 = fixedOrderComparator30.getUnknownObjectBehavior();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) i32);
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap1.equals(obj34);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertTrue(i32 == 2);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100L + "'", obj10.equals(100L));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        boolean b14 = defaultedMap7.isEmpty();
        defaultedMap7.clear();
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate12);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) obj_array15);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        int i10 = fixedOrderComparator9.getUnknownObjectBehavior();
        fixedOrderComparator9.setUnknownObjectBehavior(2);
        try {
            fixedOrderComparator9.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 0);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        boolean b16 = defaultedMap10.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate21);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) map24);
        boolean b27 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.util.Set set28 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100L + "'", obj25.equals(100L));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10);
        java.util.Collection collection8 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set3 = defaultedMap2.keySet();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate17, predicate18);
        defaultedMap9.putAll((java.util.Map) defaultedMap15);
        int i21 = defaultedMap15.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set24 = defaultedMap23.keySet();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate25, predicate26);
        boolean b29 = defaultedMap23.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection30 = defaultedMap23.values();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array37);
        java.lang.Object obj40 = defaultedMap23.remove((java.lang.Object) obj_array37);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) obj_array47);
        defaultedMap15.putAll(map49);
        try {
            boolean b51 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap7, (java.lang.Object) map49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        boolean b10 = fixedOrderComparator7.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        boolean b14 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) predicate27);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate27);
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate(map31, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate17, predicate18);
        boolean b21 = defaultedMap15.containsValue((java.lang.Object) "hi!");
        java.util.Set set22 = defaultedMap15.keySet();
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) 0.0f);
        boolean b25 = defaultedMap7.equals((java.lang.Object) defaultedMap15);
        java.lang.String str26 = defaultedMap15.toString();
        boolean b28 = defaultedMap15.containsValue((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100L + "'", obj24.equals(100L));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        boolean b16 = defaultedMap10.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate21);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) map24);
        collections.Factory factory26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate(map24, factory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100L + "'", obj25.equals(100L));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i13 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate17, predicate18);
        boolean b21 = defaultedMap15.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection22 = defaultedMap15.values();
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = defaultedMap15.remove((java.lang.Object) obj_array29);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) obj_array39);
        defaultedMap7.putAll(map41);
        boolean b44 = defaultedMap7.equals((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { fixedOrderComparator7, 0L, 1, predicate10, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { fixedOrderComparator22, 0L, 1, predicate25, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array28);
        try {
            int i33 = fixedOrderComparator14.compare((java.lang.Object) obj_array28, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(obj_array28);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { fixedOrderComparator7, 0L, 1, predicate10, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array13);
        boolean b18 = fixedOrderComparator17.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 0L);
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        try {
            boolean b9 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap6, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        boolean b14 = defaultedMap7.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set24 = defaultedMap23.keySet();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate25, predicate26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        java.util.Collection collection29 = defaultedMap23.values();
        boolean b30 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set33 = defaultedMap32.keySet();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        boolean b38 = defaultedMap32.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set41 = defaultedMap40.keySet();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate42, predicate43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) predicate43);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate43);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate43);
        java.util.Collection collection49 = defaultedMap7.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        defaultedMap11.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        defaultedMap24.putAll((java.util.Map) defaultedMap30);
        defaultedMap17.putAll((java.util.Map) defaultedMap30);
        try {
            int i37 = fixedOrderComparator8.compare((java.lang.Object) 1L, (java.lang.Object) defaultedMap30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        defaultedMap14.putAll((java.util.Map) defaultedMap20);
        defaultedMap7.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set29 = defaultedMap28.keySet();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate30, predicate31);
        boolean b34 = defaultedMap28.containsValue((java.lang.Object) "hi!");
        java.util.Set set35 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set38 = defaultedMap37.keySet();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate39, predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set44 = defaultedMap43.keySet();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate45, predicate46);
        defaultedMap37.putAll((java.util.Map) defaultedMap43);
        java.util.Collection collection49 = defaultedMap43.values();
        boolean b50 = defaultedMap43.isEmpty();
        defaultedMap43.clear();
        defaultedMap28.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj54 = defaultedMap7.put((java.lang.Object) defaultedMap43, (java.lang.Object) 0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        boolean b14 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) predicate27);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate35, predicate36);
        boolean b39 = defaultedMap33.containsValue((java.lang.Object) "hi!");
        java.util.Set set40 = defaultedMap33.keySet();
        int i41 = defaultedMap33.size();
        boolean b42 = defaultedMap33.isEmpty();
        java.util.Collection collection43 = defaultedMap33.values();
        defaultedMap7.putAll((java.util.Map) defaultedMap33);
        collections.Transformer transformer45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        boolean b14 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) predicate27);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate35, predicate36);
        boolean b39 = defaultedMap33.containsValue((java.lang.Object) "hi!");
        java.util.Set set40 = defaultedMap33.keySet();
        int i41 = defaultedMap33.size();
        boolean b42 = defaultedMap33.isEmpty();
        java.util.Collection collection43 = defaultedMap33.values();
        defaultedMap7.putAll((java.util.Map) defaultedMap33);
        int i45 = defaultedMap33.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(i45 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        java.util.Set set18 = defaultedMap6.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { "hi!", predicate20, (byte) 1, false, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        java.lang.Object obj27 = defaultedMap6.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) 100.0d);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        int i29 = fixedOrderComparator2.compare(obj27, (java.lang.Object) predicate28);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) i29);
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap1.get(obj31);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100 + "'", obj30.equals(100));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100 + "'", obj32.equals(100));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap1.keySet();
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) "hi!");
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator16.add((java.lang.Object) 0L);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 0);
        boolean b21 = defaultedMap9.containsValue((java.lang.Object) fixedOrderComparator16);
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) b21);
        java.lang.String str23 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        boolean b14 = defaultedMap7.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set24 = defaultedMap23.keySet();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate25, predicate26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        java.util.Collection collection29 = defaultedMap23.values();
        boolean b30 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set33 = defaultedMap32.keySet();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        boolean b38 = defaultedMap32.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set41 = defaultedMap40.keySet();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate42, predicate43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) predicate43);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate43);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate43);
        boolean b49 = defaultedMap7.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.String str9 = defaultedMap1.toString();
        java.util.Set set10 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap1.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { "hi!", predicate15, (byte) 1, false, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) fixedOrderComparator20, (java.lang.Object) 100.0d);
        collections.Factory factory23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        java.util.Set set16 = defaultedMap4.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { "hi!", predicate18, (byte) 1, false, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object obj25 = defaultedMap4.put((java.lang.Object) fixedOrderComparator23, (java.lang.Object) 100.0d);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        int i27 = fixedOrderComparator0.compare(obj25, (java.lang.Object) predicate26);
        int i28 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set38 = defaultedMap37.keySet();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate39, predicate40);
        defaultedMap31.putAll((java.util.Map) defaultedMap37);
        java.util.Set set43 = defaultedMap31.keySet();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { "hi!", predicate45, (byte) 1, false, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        java.lang.Object obj52 = defaultedMap31.put((java.lang.Object) fixedOrderComparator50, (java.lang.Object) 100.0d);
        try {
            boolean b53 = fixedOrderComparator0.addAsEqual((java.lang.Object) (short) 10, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { fixedOrderComparator7, 0L, 1, predicate10, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        try {
            fixedOrderComparator15.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(obj_array13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        boolean b14 = defaultedMap7.isEmpty();
        defaultedMap7.clear();
        java.util.Set set16 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        defaultedMap7.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate17, predicate18);
        defaultedMap9.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection21 = defaultedMap15.values();
        boolean b22 = defaultedMap15.isEmpty();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set26 = defaultedMap25.keySet();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Collection collection37 = defaultedMap31.values();
        boolean b38 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set41 = defaultedMap40.keySet();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate42, predicate43);
        boolean b46 = defaultedMap40.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set49 = defaultedMap48.keySet();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate50, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate51);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) predicate51);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate51);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator57.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set62 = defaultedMap61.keySet();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate63, predicate64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set68 = defaultedMap67.keySet();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate69, predicate70);
        defaultedMap61.putAll((java.util.Map) defaultedMap67);
        java.util.Set set73 = defaultedMap61.keySet();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array79 = new java.lang.Object[] { "hi!", predicate75, (byte) 1, false, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array79);
        java.lang.Object obj82 = defaultedMap61.put((java.lang.Object) fixedOrderComparator80, (java.lang.Object) 100.0d);
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        int i84 = fixedOrderComparator57.compare(obj82, (java.lang.Object) predicate83);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate83);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(obj_array79);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection15 = defaultedMap8.values();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object obj25 = defaultedMap8.remove((java.lang.Object) obj_array22);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap8.get((java.lang.Object) predicate26);
        java.lang.Object obj28 = defaultedMap6.get((java.lang.Object) defaultedMap8);
        boolean b29 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator32.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set43 = defaultedMap42.keySet();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate44, predicate45);
        defaultedMap36.putAll((java.util.Map) defaultedMap42);
        java.util.Set set48 = defaultedMap36.keySet();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array54 = new java.lang.Object[] { "hi!", predicate50, (byte) 1, false, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        java.lang.Object obj57 = defaultedMap36.put((java.lang.Object) fixedOrderComparator55, (java.lang.Object) 100.0d);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        int i59 = fixedOrderComparator32.compare(obj57, (java.lang.Object) predicate58);
        java.lang.Object obj60 = defaultedMap31.get((java.lang.Object) i59);
        java.lang.Object obj61 = defaultedMap8.get(obj60);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100L + "'", obj27.equals(100L));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 100 + "'", obj60.equals(100));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100L + "'", obj61.equals(100L));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        boolean b14 = defaultedMap7.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set24 = defaultedMap23.keySet();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate25, predicate26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        java.util.Collection collection29 = defaultedMap23.values();
        boolean b30 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set33 = defaultedMap32.keySet();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        boolean b38 = defaultedMap32.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set41 = defaultedMap40.keySet();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate42, predicate43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) predicate43);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate43);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate43);
        boolean b50 = defaultedMap7.containsKey((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) map5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        java.util.Set set15 = defaultedMap8.keySet();
        boolean b16 = defaultedMap6.containsKey((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        java.util.Set set16 = defaultedMap4.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { "hi!", predicate18, (byte) 1, false, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object obj25 = defaultedMap4.put((java.lang.Object) fixedOrderComparator23, (java.lang.Object) 100.0d);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        int i27 = fixedOrderComparator0.compare(obj25, (java.lang.Object) predicate26);
        int i28 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i29 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i29 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate17, predicate18);
        boolean b21 = defaultedMap15.containsValue((java.lang.Object) "hi!");
        java.util.Set set22 = defaultedMap15.keySet();
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) 0.0f);
        boolean b25 = defaultedMap7.equals((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        java.lang.Object obj32 = defaultedMap7.get((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100L + "'", obj24.equals(100L));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100L + "'", obj32.equals(100L));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        boolean b14 = defaultedMap7.isEmpty();
        defaultedMap7.clear();
        java.util.Set set16 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        defaultedMap18.putAll((java.util.Map) defaultedMap24);
        java.util.Set set30 = defaultedMap18.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { "hi!", predicate32, (byte) 1, false, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        java.lang.Object obj39 = defaultedMap18.put((java.lang.Object) fixedOrderComparator37, (java.lang.Object) 100.0d);
        boolean b40 = defaultedMap7.containsValue(obj39);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { fixedOrderComparator16, 0L, 1, predicate19, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) fixedOrderComparator23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b24);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set30 = defaultedMap29.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) map33);
        boolean b35 = defaultedMap25.equals((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { fixedOrderComparator7, 0L, 1, predicate10, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        defaultedMap18.putAll((java.util.Map) defaultedMap24);
        java.util.Set set30 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set33 = defaultedMap32.keySet();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set39 = defaultedMap38.keySet();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate40, predicate41);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        java.util.Set set44 = defaultedMap32.entrySet();
        try {
            boolean b45 = fixedOrderComparator16.addAsEqual((java.lang.Object) defaultedMap18, (java.lang.Object) defaultedMap32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) obj_array15);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array25);
        java.lang.String str28 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        boolean b42 = defaultedMap36.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection43 = defaultedMap36.values();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array50);
        java.lang.Object obj53 = defaultedMap36.remove((java.lang.Object) obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array50);
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array50);
        boolean b57 = defaultedMap30.containsValue((java.lang.Object) fixedOrderComparator56);
        boolean b58 = defaultedMap1.containsValue((java.lang.Object) b57);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection22 = defaultedMap16.values();
        boolean b23 = defaultedMap16.isEmpty();
        defaultedMap16.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        boolean b32 = defaultedMap16.equals((java.lang.Object) predicate30);
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        boolean b10 = defaultedMap1.isEmpty();
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set20 = defaultedMap19.keySet();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        java.util.Set set25 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate35, predicate36);
        defaultedMap27.putAll((java.util.Map) defaultedMap33);
        java.util.Collection collection39 = defaultedMap33.values();
        boolean b40 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set43 = defaultedMap42.keySet();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate44, predicate45);
        boolean b48 = defaultedMap42.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set51 = defaultedMap50.keySet();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate52, predicate53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicate53);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) predicate53);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set60 = defaultedMap59.keySet();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate61, predicate62);
        boolean b65 = defaultedMap59.containsValue((java.lang.Object) "hi!");
        java.util.Set set66 = defaultedMap59.keySet();
        int i67 = defaultedMap59.size();
        boolean b68 = defaultedMap59.isEmpty();
        java.util.Collection collection69 = defaultedMap59.values();
        defaultedMap33.putAll((java.util.Map) defaultedMap59);
        defaultedMap13.putAll((java.util.Map) defaultedMap33);
        java.lang.Object obj72 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str73 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 100L + "'", obj72.equals(100L));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        defaultedMap4.putAll((java.util.Map) defaultedMap10);
        java.util.Set set16 = defaultedMap4.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { "hi!", predicate18, (byte) 1, false, 0.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object obj25 = defaultedMap4.put((java.lang.Object) fixedOrderComparator23, (java.lang.Object) 100.0d);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        int i27 = fixedOrderComparator0.compare(obj25, (java.lang.Object) predicate26);
        boolean b28 = fixedOrderComparator0.isLocked();
        java.lang.Object obj29 = null;
        try {
            boolean b30 = fixedOrderComparator0.add(obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection27 = defaultedMap21.values();
        boolean b28 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        boolean b36 = defaultedMap30.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set39 = defaultedMap38.keySet();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) predicate41);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set48 = defaultedMap47.keySet();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate49, predicate50);
        boolean b53 = defaultedMap47.containsValue((java.lang.Object) "hi!");
        java.util.Set set54 = defaultedMap47.keySet();
        int i55 = defaultedMap47.size();
        boolean b56 = defaultedMap47.isEmpty();
        java.util.Collection collection57 = defaultedMap47.values();
        defaultedMap21.putAll((java.util.Map) defaultedMap47);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        java.lang.Object[] obj_array66 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        fixedOrderComparator67.setUnknownObjectBehavior((int) (short) 0);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (short) 0);
        defaultedMap21.clear();
        java.lang.Object[] obj_array78 = new java.lang.Object[] { (short) -1, 10, 1.0f, 0L, 0, (byte) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array78);
        int i80 = fixedOrderComparator79.getUnknownObjectBehavior();
        int i81 = fixedOrderComparator79.getUnknownObjectBehavior();
        java.lang.Object obj82 = defaultedMap21.get((java.lang.Object) i81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str85 = defaultedMap84.toString();
        java.lang.Object obj86 = defaultedMap21.remove((java.lang.Object) str85);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(obj_array78);
        org.junit.Assert.assertTrue(i80 == 2);
        org.junit.Assert.assertTrue(i81 == 2);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 100L + "'", obj82.equals(100L));
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{}" + "'", str85.equals("{}"));
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection22 = defaultedMap16.values();
        boolean b23 = defaultedMap16.isEmpty();
        defaultedMap16.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        boolean b32 = defaultedMap16.equals((java.lang.Object) predicate30);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array46 = new java.lang.Object[] { fixedOrderComparator40, 0L, 1, predicate43, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array46);
        boolean b52 = defaultedMap16.equals((java.lang.Object) fixedOrderComparator51);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i13 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate17, predicate18);
        boolean b21 = defaultedMap15.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection22 = defaultedMap15.values();
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = defaultedMap15.remove((java.lang.Object) obj_array29);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) obj_array39);
        defaultedMap7.putAll(map41);
        java.util.Set set43 = defaultedMap7.entrySet();
        java.util.Set set44 = defaultedMap7.keySet();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array58 = new java.lang.Object[] { fixedOrderComparator52, 0L, 1, predicate55, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array58);
        boolean b61 = defaultedMap7.equals((java.lang.Object) obj_array58);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection22 = defaultedMap16.values();
        boolean b23 = defaultedMap16.isEmpty();
        defaultedMap16.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        boolean b33 = defaultedMap27.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set36 = defaultedMap35.keySet();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate38);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        boolean b44 = defaultedMap27.equals((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { fixedOrderComparator7, 0L, 1, predicate10, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array13);
        try {
            fixedOrderComparator15.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(obj_array13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) true);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate12);
        boolean b17 = defaultedMap1.equals((java.lang.Object) 'a');
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) 10, obj19);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        int i14 = defaultedMap7.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) obj_array15);
        java.lang.String str19 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        boolean b27 = defaultedMap21.containsValue((java.lang.Object) "hi!");
        java.util.Set set28 = defaultedMap21.keySet();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { fixedOrderComparator36, 0L, 1, predicate39, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b44 = defaultedMap21.containsKey((java.lang.Object) fixedOrderComparator43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set47 = defaultedMap46.keySet();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate48, predicate49);
        boolean b52 = defaultedMap46.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set55 = defaultedMap54.keySet();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate56, predicate57);
        boolean b60 = defaultedMap54.containsValue((java.lang.Object) "hi!");
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator();
        boolean b63 = fixedOrderComparator61.add((java.lang.Object) 0L);
        fixedOrderComparator61.setUnknownObjectBehavior((int) (byte) 0);
        boolean b66 = defaultedMap54.containsValue((java.lang.Object) fixedOrderComparator61);
        boolean b67 = defaultedMap46.containsKey((java.lang.Object) b66);
        java.lang.Object obj68 = defaultedMap21.remove((java.lang.Object) defaultedMap46);
        java.lang.Object obj69 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 100L + "'", obj69.equals(100L));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection15 = defaultedMap8.values();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object obj25 = defaultedMap8.remove((java.lang.Object) obj_array22);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap8.get((java.lang.Object) predicate26);
        java.lang.Object obj28 = defaultedMap6.get((java.lang.Object) defaultedMap8);
        boolean b29 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        boolean b37 = defaultedMap31.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection38 = defaultedMap31.values();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array45);
        java.lang.Object obj48 = defaultedMap31.remove((java.lang.Object) obj_array45);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.lang.Object obj59 = defaultedMap8.get((java.lang.Object) obj_array55);
        defaultedMap8.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100L + "'", obj27.equals(100L));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 100L + "'", obj59.equals(100L));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection15 = defaultedMap8.values();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object obj25 = defaultedMap8.remove((java.lang.Object) obj_array22);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap8.get((java.lang.Object) predicate26);
        java.lang.Object obj28 = defaultedMap6.get((java.lang.Object) defaultedMap8);
        boolean b29 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        boolean b37 = defaultedMap31.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection38 = defaultedMap31.values();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array45);
        java.lang.Object obj48 = defaultedMap31.remove((java.lang.Object) obj_array45);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.lang.Object obj59 = defaultedMap8.get((java.lang.Object) obj_array55);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set62 = defaultedMap61.keySet();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate63, predicate64);
        boolean b67 = defaultedMap61.containsValue((java.lang.Object) "hi!");
        java.util.Set set68 = defaultedMap61.keySet();
        java.lang.String str69 = defaultedMap61.toString();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) str69);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100L + "'", obj27.equals(100L));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 100L + "'", obj59.equals(100L));
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set4 = defaultedMap3.keySet();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        boolean b9 = defaultedMap3.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection10 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        boolean b18 = defaultedMap12.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate23);
        java.lang.Object obj27 = defaultedMap3.get((java.lang.Object) map26);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100L + "'", obj27.equals(100L));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1L + "'", obj28.equals(1L));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection22 = defaultedMap16.values();
        boolean b23 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set26 = defaultedMap25.keySet();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate27, predicate28);
        boolean b31 = defaultedMap25.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate35, predicate36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) predicate36);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set43 = defaultedMap42.keySet();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate44, predicate45);
        boolean b48 = defaultedMap42.containsValue((java.lang.Object) "hi!");
        java.util.Set set49 = defaultedMap42.keySet();
        int i50 = defaultedMap42.size();
        boolean b51 = defaultedMap42.isEmpty();
        java.util.Collection collection52 = defaultedMap42.values();
        defaultedMap16.putAll((java.util.Map) defaultedMap42);
        java.lang.Object obj54 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array61 = new java.lang.Object[] { (short) -1, 10, 1.0f, 0L, 0, (byte) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        int i63 = fixedOrderComparator62.getUnknownObjectBehavior();
        int i64 = fixedOrderComparator62.getUnknownObjectBehavior();
        java.lang.Object obj65 = defaultedMap1.get((java.lang.Object) fixedOrderComparator62);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100L + "'", obj54.equals(100L));
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(i63 == 2);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 100L + "'", obj65.equals(100L));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap14.keySet();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        defaultedMap14.putAll((java.util.Map) defaultedMap20);
        defaultedMap7.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set29 = defaultedMap28.keySet();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set35 = defaultedMap34.keySet();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate36, predicate37);
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj41 = defaultedMap28.remove((java.lang.Object) 1.0d);
        boolean b42 = defaultedMap7.containsKey(obj41);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        boolean b13 = defaultedMap7.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        java.lang.Object obj24 = defaultedMap7.remove((java.lang.Object) obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        boolean b36 = defaultedMap30.containsValue((java.lang.Object) "hi!");
        java.util.Set set37 = defaultedMap30.keySet();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { fixedOrderComparator45, 0L, 1, predicate48, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        boolean b53 = defaultedMap30.containsKey((java.lang.Object) fixedOrderComparator52);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) b53);
        java.lang.Object obj56 = defaultedMap54.get((java.lang.Object) (byte) 1);
        boolean b57 = fixedOrderComparator27.add(obj56);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + false + "'", obj56.equals(false));
        org.junit.Assert.assertTrue(b57 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        boolean b9 = defaultedMap7.isEmpty();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i21 = fixedOrderComparator20.getUnknownObjectBehavior();
        fixedOrderComparator20.setUnknownObjectBehavior(2);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) obj_array15);
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) obj_array25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set30 = defaultedMap29.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate31, predicate32);
        boolean b35 = defaultedMap29.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection36 = defaultedMap29.values();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj46 = defaultedMap29.remove((java.lang.Object) obj_array43);
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) obj_array53);
        boolean b56 = defaultedMap1.equals((java.lang.Object) obj_array53);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set59 = defaultedMap58.keySet();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate60, predicate61);
        boolean b64 = defaultedMap58.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection65 = defaultedMap58.values();
        java.lang.Object[] obj_array72 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array72);
        java.lang.Object obj75 = defaultedMap58.remove((java.lang.Object) obj_array72);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj77 = defaultedMap58.get((java.lang.Object) predicate76);
        defaultedMap58.clear();
        java.lang.Object obj79 = defaultedMap1.remove((java.lang.Object) defaultedMap58);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 100L + "'", obj77.equals(100L));
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate17, predicate18);
        defaultedMap9.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection21 = defaultedMap15.values();
        boolean b22 = defaultedMap15.isEmpty();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set26 = defaultedMap25.keySet();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Collection collection37 = defaultedMap31.values();
        boolean b38 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set41 = defaultedMap40.keySet();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate42, predicate43);
        boolean b46 = defaultedMap40.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set49 = defaultedMap48.keySet();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate50, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate51);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) predicate51);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate51);
        java.lang.Object obj57 = defaultedMap1.get((java.lang.Object) predicate23);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100L + "'", obj57.equals(100L));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        boolean b9 = defaultedMap7.isEmpty();
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate17, predicate18);
        boolean b21 = defaultedMap15.containsValue((java.lang.Object) "hi!");
        java.util.Set set22 = defaultedMap15.keySet();
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) 0.0f);
        boolean b25 = defaultedMap7.equals((java.lang.Object) defaultedMap15);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100L + "'", obj24.equals(100L));
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        boolean b14 = defaultedMap7.isEmpty();
        defaultedMap7.clear();
        java.util.Set set16 = defaultedMap7.entrySet();
        java.util.Set set17 = defaultedMap7.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection22 = defaultedMap16.values();
        boolean b23 = defaultedMap16.isEmpty();
        defaultedMap16.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        boolean b33 = defaultedMap27.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set36 = defaultedMap35.keySet();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate38);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set45 = defaultedMap44.keySet();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set51 = defaultedMap50.keySet();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate52, predicate53);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        java.util.Collection collection56 = defaultedMap50.values();
        boolean b57 = defaultedMap50.isEmpty();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set60 = defaultedMap59.keySet();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate61, predicate62);
        boolean b65 = defaultedMap59.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set68 = defaultedMap67.keySet();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate69, predicate70);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) predicate70);
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) predicate70);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) predicate70);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set77 = defaultedMap76.keySet();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate78, predicate79);
        boolean b82 = defaultedMap76.containsValue((java.lang.Object) "hi!");
        java.util.Set set83 = defaultedMap76.keySet();
        int i84 = defaultedMap76.size();
        boolean b85 = defaultedMap76.isEmpty();
        java.util.Collection collection86 = defaultedMap76.values();
        defaultedMap50.putAll((java.util.Map) defaultedMap76);
        java.lang.Object obj88 = defaultedMap1.get((java.lang.Object) defaultedMap50);
        java.lang.Object obj90 = defaultedMap50.remove((java.lang.Object) true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 100L + "'", obj88.equals(100L));
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        boolean b17 = defaultedMap11.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection18 = defaultedMap11.values();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object obj28 = defaultedMap11.remove((java.lang.Object) obj_array25);
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) obj_array35);
        boolean b38 = defaultedMap1.containsKey((java.lang.Object) obj_array35);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate17, predicate18);
        boolean b21 = defaultedMap15.containsValue((java.lang.Object) "hi!");
        java.util.Set set22 = defaultedMap15.keySet();
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) 0.0f);
        boolean b25 = defaultedMap7.equals((java.lang.Object) defaultedMap15);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100L + "'", obj24.equals(100L));
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        boolean b12 = fixedOrderComparator7.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        fixedOrderComparator7.setUnknownObjectBehavior(1);
        boolean b13 = fixedOrderComparator7.add((java.lang.Object) (byte) -1);
        int i14 = fixedOrderComparator7.getUnknownObjectBehavior();
        java.lang.Object obj16 = null;
        int i17 = fixedOrderComparator7.compare((java.lang.Object) 0.0f, obj16);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        boolean b10 = fixedOrderComparator7.isLocked();
        try {
            fixedOrderComparator7.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array6);
        boolean b10 = fixedOrderComparator9.isLocked();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap7.values();
        boolean b14 = defaultedMap7.isEmpty();
        defaultedMap7.clear();
        java.util.Set set16 = defaultedMap7.keySet();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array30 = new java.lang.Object[] { fixedOrderComparator24, 0L, 1, predicate27, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        boolean b32 = defaultedMap7.containsKey((java.lang.Object) obj_array30);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection15 = defaultedMap8.values();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object obj25 = defaultedMap8.remove((java.lang.Object) obj_array22);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap8.get((java.lang.Object) predicate26);
        java.lang.Object obj28 = defaultedMap6.get((java.lang.Object) defaultedMap8);
        boolean b29 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set38 = defaultedMap37.keySet();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate39, predicate40);
        defaultedMap31.putAll((java.util.Map) defaultedMap37);
        int i43 = defaultedMap37.size();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set46 = defaultedMap45.keySet();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        boolean b51 = defaultedMap45.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection52 = defaultedMap45.values();
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array59);
        java.lang.Object obj62 = defaultedMap45.remove((java.lang.Object) obj_array59);
        java.lang.Object[] obj_array69 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) obj_array69);
        defaultedMap37.putAll(map71);
        java.util.Set set73 = defaultedMap37.entrySet();
        java.lang.Object obj74 = defaultedMap8.get((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100L + "'", obj27.equals(100L));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 100L + "'", obj74.equals(100L));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) "hi!");
        java.util.Set set13 = defaultedMap6.keySet();
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array27 = new java.lang.Object[] { fixedOrderComparator21, 0L, 1, predicate24, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b29 = defaultedMap6.containsKey((java.lang.Object) fixedOrderComparator28);
        boolean b30 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator28);
        try {
            fixedOrderComparator28.setUnknownObjectBehavior((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator8.add((java.lang.Object) 0L);
        fixedOrderComparator8.setUnknownObjectBehavior((int) (byte) 0);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator8);
        java.lang.Object[] obj_array20 = new java.lang.Object[] { (short) -1, 10, 1.0f, 0L, 0, (byte) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) obj_array20);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set22 = defaultedMap21.keySet();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection27 = defaultedMap21.values();
        boolean b28 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        boolean b36 = defaultedMap30.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set39 = defaultedMap38.keySet();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) predicate41);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set48 = defaultedMap47.keySet();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate49, predicate50);
        boolean b53 = defaultedMap47.containsValue((java.lang.Object) "hi!");
        java.util.Set set54 = defaultedMap47.keySet();
        int i55 = defaultedMap47.size();
        boolean b56 = defaultedMap47.isEmpty();
        java.util.Collection collection57 = defaultedMap47.values();
        defaultedMap21.putAll((java.util.Map) defaultedMap47);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        java.lang.Object[] obj_array66 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        fixedOrderComparator67.setUnknownObjectBehavior((int) (short) 0);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (short) 0);
        defaultedMap21.clear();
        defaultedMap21.clear();
        collections.Transformer transformer73 = null;
        try {
            java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, transformer73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set4 = defaultedMap3.keySet();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        defaultedMap9.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str31 = defaultedMap30.toString();
        java.util.Set set32 = defaultedMap30.entrySet();
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) defaultedMap22, (java.lang.Object) defaultedMap30);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { fixedOrderComparator16, 0L, 1, predicate19, 1L, (short) 100 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) fixedOrderComparator23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set27 = defaultedMap26.keySet();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        boolean b32 = defaultedMap26.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set35 = defaultedMap34.keySet();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate36, predicate37);
        boolean b40 = defaultedMap34.containsValue((java.lang.Object) "hi!");
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        boolean b43 = fixedOrderComparator41.add((java.lang.Object) 0L);
        fixedOrderComparator41.setUnknownObjectBehavior((int) (byte) 0);
        boolean b46 = defaultedMap34.containsValue((java.lang.Object) fixedOrderComparator41);
        boolean b47 = defaultedMap26.containsKey((java.lang.Object) b46);
        java.lang.Object obj48 = defaultedMap1.remove((java.lang.Object) defaultedMap26);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array55);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) obj_array55);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection22 = defaultedMap16.values();
        boolean b23 = defaultedMap16.isEmpty();
        defaultedMap16.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        boolean b33 = defaultedMap27.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set36 = defaultedMap35.keySet();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate38);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        boolean b43 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set46 = defaultedMap45.keySet();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicate48);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate48, predicate51);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) "hi!");
        java.util.Collection collection23 = defaultedMap16.values();
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 1, (short) 0, (short) -1, 10.0f, 10.0f, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.lang.Object obj33 = defaultedMap16.remove((java.lang.Object) obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set43 = defaultedMap42.keySet();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate44, predicate45);
        defaultedMap36.putAll((java.util.Map) defaultedMap42);
        java.util.Collection collection48 = defaultedMap42.values();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set51 = defaultedMap50.keySet();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate52, predicate53);
        boolean b56 = defaultedMap50.containsValue((java.lang.Object) "hi!");
        java.util.Set set57 = defaultedMap50.keySet();
        java.lang.Object obj59 = defaultedMap50.get((java.lang.Object) 0.0f);
        boolean b60 = defaultedMap42.equals((java.lang.Object) defaultedMap50);
        java.lang.String str61 = defaultedMap50.toString();
        java.lang.Object obj62 = defaultedMap1.put((java.lang.Object) fixedOrderComparator34, (java.lang.Object) defaultedMap50);
        java.lang.String str63 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 100L + "'", obj59.equals(100L));
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        boolean b10 = defaultedMap1.isEmpty();
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set20 = defaultedMap19.keySet();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        java.util.Set set25 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate35, predicate36);
        defaultedMap27.putAll((java.util.Map) defaultedMap33);
        java.util.Collection collection39 = defaultedMap33.values();
        boolean b40 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set43 = defaultedMap42.keySet();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate44, predicate45);
        boolean b48 = defaultedMap42.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set51 = defaultedMap50.keySet();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate52, predicate53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicate53);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) predicate53);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set60 = defaultedMap59.keySet();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate61, predicate62);
        boolean b65 = defaultedMap59.containsValue((java.lang.Object) "hi!");
        java.util.Set set66 = defaultedMap59.keySet();
        int i67 = defaultedMap59.size();
        boolean b68 = defaultedMap59.isEmpty();
        java.util.Collection collection69 = defaultedMap59.values();
        defaultedMap33.putAll((java.util.Map) defaultedMap59);
        defaultedMap13.putAll((java.util.Map) defaultedMap33);
        java.lang.Object obj72 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.util.Set set73 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 100L + "'", obj72.equals(100L));
        org.junit.Assert.assertNotNull(set73);
    }
}

