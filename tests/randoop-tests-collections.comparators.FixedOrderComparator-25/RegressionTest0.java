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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
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
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + true + "'", obj11.equals(true));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        try {
            boolean b4 = fixedOrderComparator1.addAsEqual((java.lang.Object) "", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Map map2 = null;
        try {
            defaultedMap1.putAll(map2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.util.Set set6 = defaultedMap1.keySet();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection8 = defaultedMap3.values();
        java.util.Set set9 = defaultedMap3.keySet();
        try {
            int i11 = fixedOrderComparator1.compare((java.lang.Object) set9, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) (-1));
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + true + "'", obj7.equals(true));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection33 = defaultedMap28.values();
        defaultedMap19.putAll((java.util.Map) defaultedMap28);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.Transformer transformer36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 0);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        int i6 = defaultedMap1.size();
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) (short) -1, (java.lang.Object) obj_array8);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        try {
            fixedOrderComparator2.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set13 = defaultedMap1.keySet();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { set13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap17.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        java.util.Collection collection25 = defaultedMap17.values();
        java.lang.Object obj28 = defaultedMap17.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set29 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b33 = defaultedMap31.equals((java.lang.Object) (short) 10);
        try {
            boolean b34 = fixedOrderComparator15.addAsEqual((java.lang.Object) defaultedMap17, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 2);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) 2);
        java.lang.String str26 = defaultedMap21.toString();
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b30 = defaultedMap21.equals((java.lang.Object) fixedOrderComparator29);
        try {
            boolean b31 = fixedOrderComparator9.addAsEqual((java.lang.Object) map19, (java.lang.Object) fixedOrderComparator29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true + "'", obj16.equals(true));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + true + "'", obj25.equals(true));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        java.lang.Object obj26 = new java.lang.Object();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection43 = defaultedMap38.values();
        defaultedMap29.putAll((java.util.Map) defaultedMap38);
        defaultedMap18.putAll((java.util.Map) defaultedMap29);
        defaultedMap10.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) 2);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        boolean b56 = defaultedMap29.containsValue((java.lang.Object) predicate54);
        java.lang.String str57 = defaultedMap29.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + true + "'", obj52.equals(true));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection33 = defaultedMap28.values();
        defaultedMap19.putAll((java.util.Map) defaultedMap28);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap1.get(obj36);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + true + "'", obj37.equals(true));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (short) 10);
        boolean b10 = defaultedMap6.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        try {
            int i14 = fixedOrderComparator2.compare((java.lang.Object) obj_array3, (java.lang.Object) predicate11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) 2);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) 2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true + "'", obj14.equals(true));
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (short) 10);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 2);
        java.lang.String str10 = defaultedMap5.toString();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        try {
            boolean b12 = fixedOrderComparator3.addAsEqual((java.lang.Object) str10, (java.lang.Object) fixedOrderComparator11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set13 = defaultedMap1.keySet();
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection24 = defaultedMap19.values();
        defaultedMap19.clear();
        java.lang.Object obj26 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        java.util.Set set27 = defaultedMap19.entrySet();
        collections.Transformer transformer28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, transformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + true + "'", obj11.equals(true));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b17 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        java.util.Set set18 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap20.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap20.containsValue((java.lang.Object) (-1.0d));
        defaultedMap7.putAll((java.util.Map) defaultedMap20);
        collections.Transformer transformer36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, transformer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection24 = defaultedMap19.values();
        defaultedMap19.clear();
        java.lang.Object obj26 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        java.util.Set set27 = defaultedMap19.entrySet();
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        boolean b17 = defaultedMap3.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array19);
        try {
            int i22 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap3, (java.lang.Object) fixedOrderComparator21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj_array19);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.lang.Object obj9 = new java.lang.Object();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection26 = defaultedMap21.values();
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.Transformer transformer29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) (byte) 1);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + true + "'", obj11.equals(true));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        java.util.Collection collection35 = defaultedMap27.values();
        java.lang.Object obj37 = defaultedMap21.put((java.lang.Object) defaultedMap27, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        collections.Factory factory39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection24 = defaultedMap19.values();
        defaultedMap19.clear();
        java.lang.Object obj26 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b33 = defaultedMap31.equals((java.lang.Object) (short) 10);
        boolean b35 = defaultedMap31.equals((java.lang.Object) (-1.0d));
        java.util.Set set36 = defaultedMap31.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (short) 10);
        boolean b48 = defaultedMap44.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate49, predicate50);
        java.util.Collection collection52 = defaultedMap44.values();
        java.lang.Object obj54 = defaultedMap38.put((java.lang.Object) defaultedMap44, (java.lang.Object) 1.0f);
        java.lang.Object obj55 = defaultedMap31.get((java.lang.Object) defaultedMap44);
        java.lang.Object obj56 = defaultedMap28.remove((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b60 = defaultedMap58.equals((java.lang.Object) (short) 10);
        java.lang.Object obj62 = defaultedMap58.get((java.lang.Object) 2);
        java.lang.String str63 = defaultedMap58.toString();
        java.lang.Object[] obj_array64 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array64);
        boolean b67 = defaultedMap58.equals((java.lang.Object) fixedOrderComparator66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b71 = defaultedMap69.equals((java.lang.Object) (short) 10);
        boolean b73 = defaultedMap69.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b77 = defaultedMap75.equals((java.lang.Object) (short) 10);
        boolean b79 = defaultedMap75.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate80, predicate81);
        java.util.Collection collection83 = defaultedMap75.values();
        java.lang.Object obj85 = defaultedMap69.put((java.lang.Object) defaultedMap75, (java.lang.Object) 1.0f);
        defaultedMap58.putAll((java.util.Map) defaultedMap75);
        boolean b88 = defaultedMap58.containsKey((java.lang.Object) ' ');
        java.lang.Object obj89 = defaultedMap19.put((java.lang.Object) defaultedMap28, (java.lang.Object) defaultedMap58);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + true + "'", obj55.equals(true));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + true + "'", obj62.equals(true));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNull(obj89);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap14.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate19, predicate20);
        java.lang.Object obj22 = new java.lang.Object();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, obj22);
        boolean b24 = defaultedMap8.equals(obj22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        java.lang.Object obj27 = defaultedMap8.remove((java.lang.Object) 2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + true + "'", obj12.equals(true));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap3.values();
        java.lang.Object obj14 = defaultedMap3.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set15 = defaultedMap3.keySet();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { set15 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b18 = fixedOrderComparator1.add((java.lang.Object) fixedOrderComparator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap20.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection34 = defaultedMap29.values();
        defaultedMap20.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b39 = defaultedMap37.equals((java.lang.Object) (short) 10);
        boolean b41 = defaultedMap37.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate42, predicate43);
        java.lang.Object obj45 = new java.lang.Object();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap48.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b59 = defaultedMap57.equals((java.lang.Object) (short) 10);
        boolean b61 = defaultedMap57.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection62 = defaultedMap57.values();
        defaultedMap48.putAll((java.util.Map) defaultedMap57);
        defaultedMap37.putAll((java.util.Map) defaultedMap48);
        defaultedMap29.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b69 = defaultedMap67.equals((java.lang.Object) (short) 10);
        java.lang.Object obj71 = defaultedMap67.get((java.lang.Object) 2);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate72, predicate73);
        boolean b75 = defaultedMap48.containsValue((java.lang.Object) predicate73);
        java.lang.Object obj76 = null;
        try {
            boolean b77 = fixedOrderComparator17.addAsEqual((java.lang.Object) predicate73, obj76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + true + "'", obj71.equals(true));
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (-1.0d));
        java.util.Set set13 = defaultedMap8.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) (short) 1);
        boolean b13 = defaultedMap8.isEmpty();
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) b13);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        java.lang.String str6 = defaultedMap1.toString();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (short) 10);
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        java.util.Set set10 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b24 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        try {
            boolean b25 = fixedOrderComparator3.addAsEqual((java.lang.Object) defaultedMap5, (java.lang.Object) b24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap14.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate19, predicate20);
        java.lang.Object obj22 = new java.lang.Object();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, obj22);
        boolean b24 = defaultedMap8.equals(obj22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b35 = defaultedMap33.equals((java.lang.Object) (short) 10);
        boolean b37 = defaultedMap33.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b39 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj40 = defaultedMap8.get((java.lang.Object) b39);
        int i41 = defaultedMap8.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + true + "'", obj12.equals(true));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + true + "'", obj40.equals(true));
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap14.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate19, predicate20);
        java.lang.Object obj22 = new java.lang.Object();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, obj22);
        boolean b24 = defaultedMap8.equals(obj22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b35 = defaultedMap33.equals((java.lang.Object) (short) 10);
        boolean b37 = defaultedMap33.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b39 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj40 = defaultedMap8.get((java.lang.Object) b39);
        boolean b41 = defaultedMap8.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + true + "'", obj12.equals(true));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + true + "'", obj40.equals(true));
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        java.lang.String str5 = defaultedMap2.toString();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 0);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1.0d));
        boolean b24 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection25 = defaultedMap10.values();
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (short) 10);
        boolean b36 = defaultedMap32.containsKey((java.lang.Object) (byte) 1);
        int i37 = defaultedMap32.size();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b41 = defaultedMap39.equals((java.lang.Object) (short) 10);
        boolean b43 = defaultedMap39.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap39.remove((java.lang.Object) (short) 0);
        boolean b47 = defaultedMap39.containsValue((java.lang.Object) 10.0f);
        try {
            int i48 = fixedOrderComparator30.compare((java.lang.Object) defaultedMap32, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection17 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection33 = defaultedMap28.values();
        defaultedMap19.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap36.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate41, predicate42);
        java.lang.Object obj44 = new java.lang.Object();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, obj44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b49 = defaultedMap47.equals((java.lang.Object) (short) 10);
        boolean b51 = defaultedMap47.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate52, predicate53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b58 = defaultedMap56.equals((java.lang.Object) (short) 10);
        boolean b60 = defaultedMap56.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection61 = defaultedMap56.values();
        defaultedMap47.putAll((java.util.Map) defaultedMap56);
        defaultedMap36.putAll((java.util.Map) defaultedMap47);
        defaultedMap28.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b68 = defaultedMap66.equals((java.lang.Object) (short) 10);
        boolean b70 = defaultedMap66.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate71, predicate72);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) defaultedMap66);
        java.lang.Object obj75 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) defaultedMap47);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.lang.Object obj9 = new java.lang.Object();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection26 = defaultedMap21.values();
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        java.lang.Object[] obj_array29 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        boolean b31 = fixedOrderComparator30.isLocked();
        boolean b32 = defaultedMap12.equals((java.lang.Object) b31);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        try {
            fixedOrderComparator2.setUnknownObjectBehavior((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap14.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate19, predicate20);
        java.util.Collection collection22 = defaultedMap14.values();
        java.lang.Object obj24 = defaultedMap8.put((java.lang.Object) defaultedMap14, (java.lang.Object) 1.0f);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + true + "'", obj25.equals(true));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (byte) 1);
        int i8 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap16.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, obj24);
        boolean b26 = defaultedMap10.equals(obj24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) 2);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap38.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b49 = defaultedMap47.equals((java.lang.Object) (short) 10);
        boolean b51 = defaultedMap47.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection52 = defaultedMap47.values();
        defaultedMap38.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b57 = defaultedMap55.equals((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap55.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate60, predicate61);
        java.lang.Object obj63 = new java.lang.Object();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, obj63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b68 = defaultedMap66.equals((java.lang.Object) (short) 10);
        boolean b70 = defaultedMap66.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate71, predicate72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b77 = defaultedMap75.equals((java.lang.Object) (short) 10);
        boolean b79 = defaultedMap75.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection80 = defaultedMap75.values();
        defaultedMap66.putAll((java.util.Map) defaultedMap75);
        defaultedMap55.putAll((java.util.Map) defaultedMap66);
        defaultedMap47.putAll((java.util.Map) defaultedMap66);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b87 = defaultedMap85.equals((java.lang.Object) (short) 10);
        java.lang.Object obj89 = defaultedMap85.get((java.lang.Object) 2);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate90, predicate91);
        boolean b93 = defaultedMap66.containsValue((java.lang.Object) predicate91);
        java.util.Map map94 = collections.map.PredicatedMap.decorate(map27, predicate35, predicate91);
        collections.Predicate predicate95 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate35, predicate95);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + true + "'", obj14.equals(true));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + true + "'", obj33.equals(true));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + true + "'", obj89.equals(true));
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        java.lang.Object obj26 = new java.lang.Object();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection43 = defaultedMap38.values();
        defaultedMap29.putAll((java.util.Map) defaultedMap38);
        defaultedMap18.putAll((java.util.Map) defaultedMap29);
        defaultedMap10.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap48.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj54 = defaultedMap48.remove((java.lang.Object) (short) 0);
        boolean b56 = defaultedMap48.containsValue((java.lang.Object) 10.0f);
        java.lang.Object obj57 = defaultedMap10.remove((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.lang.String str8 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        defaultedMap1.clear();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set13 = defaultedMap1.keySet();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { set13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap17.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        java.lang.Object obj25 = new java.lang.Object();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap28.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b39 = defaultedMap37.equals((java.lang.Object) (short) 10);
        boolean b41 = defaultedMap37.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection42 = defaultedMap37.values();
        defaultedMap28.putAll((java.util.Map) defaultedMap37);
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj46 = defaultedMap17.get((java.lang.Object) predicate45);
        boolean b47 = fixedOrderComparator15.add(obj46);
        boolean b49 = fixedOrderComparator15.add((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + true + "'", obj46.equals(true));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection16 = defaultedMap1.values();
        java.util.Set set17 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b7 = defaultedMap5.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate14, predicate15);
        java.lang.Object obj17 = new java.lang.Object();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj17);
        try {
            boolean b19 = fixedOrderComparator3.addAsEqual((java.lang.Object) 100.0f, (java.lang.Object) map18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (-1.0d));
        java.util.Set set13 = defaultedMap8.entrySet();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.util.Set set6 = defaultedMap1.entrySet();
        int i7 = defaultedMap1.size();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        java.util.Set set9 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap17.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        java.util.Collection collection25 = defaultedMap17.values();
        java.lang.Object obj27 = defaultedMap11.put((java.lang.Object) defaultedMap17, (java.lang.Object) 1.0f);
        java.lang.Object obj28 = defaultedMap4.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b33 = defaultedMap31.equals((java.lang.Object) (short) 10);
        boolean b35 = defaultedMap31.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap40.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection45 = defaultedMap40.values();
        defaultedMap31.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap48.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        java.lang.Object obj56 = new java.lang.Object();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, obj56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b61 = defaultedMap59.equals((java.lang.Object) (short) 10);
        boolean b63 = defaultedMap59.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b70 = defaultedMap68.equals((java.lang.Object) (short) 10);
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection73 = defaultedMap68.values();
        defaultedMap59.putAll((java.util.Map) defaultedMap68);
        defaultedMap48.putAll((java.util.Map) defaultedMap59);
        defaultedMap40.putAll((java.util.Map) defaultedMap59);
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj78 = defaultedMap4.put((java.lang.Object) defaultedMap59, (java.lang.Object) predicate77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b84 = defaultedMap82.equals((java.lang.Object) (short) 10);
        boolean b86 = defaultedMap82.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj87 = defaultedMap80.remove((java.lang.Object) (byte) 1);
        boolean b88 = defaultedMap59.equals(obj87);
        collections.Transformer transformer89 = null;
        try {
            java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, transformer89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(b88 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set13 = defaultedMap1.keySet();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { set13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap17.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        java.lang.Object obj25 = new java.lang.Object();
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap28.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b39 = defaultedMap37.equals((java.lang.Object) (short) 10);
        boolean b41 = defaultedMap37.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection42 = defaultedMap37.values();
        defaultedMap28.putAll((java.util.Map) defaultedMap37);
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj46 = defaultedMap17.get((java.lang.Object) predicate45);
        boolean b47 = fixedOrderComparator15.add(obj46);
        int i48 = fixedOrderComparator15.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + true + "'", obj46.equals(true));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(i48 == 2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (short) 10);
        boolean b17 = defaultedMap13.equals((java.lang.Object) (-1.0d));
        java.util.Set set18 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b28 = defaultedMap26.equals((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap26.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        java.util.Collection collection34 = defaultedMap26.values();
        java.lang.Object obj36 = defaultedMap20.put((java.lang.Object) defaultedMap26, (java.lang.Object) 1.0f);
        java.lang.Object obj37 = defaultedMap13.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj38 = defaultedMap10.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap40.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b51 = defaultedMap49.equals((java.lang.Object) (short) 10);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection54 = defaultedMap49.values();
        defaultedMap40.putAll((java.util.Map) defaultedMap49);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b59 = defaultedMap57.equals((java.lang.Object) (short) 10);
        boolean b61 = defaultedMap57.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate62, predicate63);
        java.lang.Object obj65 = new java.lang.Object();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, obj65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b70 = defaultedMap68.equals((java.lang.Object) (short) 10);
        boolean b72 = defaultedMap68.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate73, predicate74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b79 = defaultedMap77.equals((java.lang.Object) (short) 10);
        boolean b81 = defaultedMap77.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection82 = defaultedMap77.values();
        defaultedMap68.putAll((java.util.Map) defaultedMap77);
        defaultedMap57.putAll((java.util.Map) defaultedMap68);
        defaultedMap49.putAll((java.util.Map) defaultedMap68);
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj87 = defaultedMap13.put((java.lang.Object) defaultedMap68, (java.lang.Object) predicate86);
        java.lang.Object obj88 = defaultedMap1.get((java.lang.Object) defaultedMap68);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + true + "'", obj37.equals(true));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + true + "'", obj88.equals(true));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (-1.0d));
        java.util.Set set13 = defaultedMap8.entrySet();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap16.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap36.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection41 = defaultedMap36.values();
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        defaultedMap16.putAll((java.util.Map) defaultedMap27);
        java.lang.String str44 = defaultedMap27.toString();
        defaultedMap8.putAll((java.util.Map) defaultedMap27);
        boolean b46 = defaultedMap8.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        java.util.Collection collection26 = defaultedMap18.values();
        java.lang.Object obj28 = defaultedMap12.put((java.lang.Object) defaultedMap18, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b33 = defaultedMap31.equals((java.lang.Object) (short) 10);
        boolean b35 = defaultedMap31.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap40.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection45 = defaultedMap40.values();
        defaultedMap31.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b51 = defaultedMap49.equals((java.lang.Object) (short) 10);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection54 = defaultedMap49.values();
        defaultedMap49.clear();
        java.lang.Object obj56 = defaultedMap31.put(obj47, (java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b60 = defaultedMap58.equals((java.lang.Object) (short) 10);
        boolean b62 = defaultedMap58.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        java.lang.Object obj66 = new java.lang.Object();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, obj66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b71 = defaultedMap69.equals((java.lang.Object) (short) 10);
        boolean b73 = defaultedMap69.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate74, predicate75);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b80 = defaultedMap78.equals((java.lang.Object) (short) 10);
        boolean b82 = defaultedMap78.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection83 = defaultedMap78.values();
        defaultedMap69.putAll((java.util.Map) defaultedMap78);
        defaultedMap58.putAll((java.util.Map) defaultedMap69);
        java.util.Set set86 = defaultedMap58.keySet();
        boolean b87 = defaultedMap31.containsValue((java.lang.Object) defaultedMap58);
        java.lang.Object obj88 = defaultedMap1.remove((java.lang.Object) defaultedMap58);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        java.util.Set set18 = defaultedMap1.entrySet();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) 1L);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set13 = defaultedMap1.keySet();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { set13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        int i16 = fixedOrderComparator15.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection23 = defaultedMap18.values();
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b28 = defaultedMap26.equals((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap26.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (short) 10);
        boolean b36 = defaultedMap32.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate37, predicate38);
        java.util.Collection collection40 = defaultedMap32.values();
        java.lang.Object obj42 = defaultedMap26.put((java.lang.Object) defaultedMap32, (java.lang.Object) 1.0f);
        defaultedMap18.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b47 = defaultedMap45.equals((java.lang.Object) (short) 10);
        boolean b49 = defaultedMap45.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj51 = defaultedMap45.remove((java.lang.Object) (short) 0);
        try {
            int i52 = fixedOrderComparator15.compare((java.lang.Object) defaultedMap32, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (-1.0d));
        java.util.Set set13 = defaultedMap8.entrySet();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap16.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap36.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection41 = defaultedMap36.values();
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        defaultedMap16.putAll((java.util.Map) defaultedMap27);
        java.lang.String str44 = defaultedMap27.toString();
        defaultedMap8.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        java.lang.String str47 = defaultedMap8.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap11.equals((java.lang.Object) (-1.0d));
        java.lang.String str16 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        java.util.Set set23 = defaultedMap18.entrySet();
        boolean b24 = defaultedMap11.containsKey((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b28 = defaultedMap26.equals((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap26.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        java.util.Collection collection34 = defaultedMap26.values();
        java.lang.Object obj37 = defaultedMap26.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set38 = defaultedMap26.keySet();
        java.lang.Object[] obj_array39 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array39);
        fixedOrderComparator42.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap46);
        java.lang.Object obj48 = defaultedMap26.put((java.lang.Object) fixedOrderComparator42, (java.lang.Object) defaultedMap46);
        boolean b49 = defaultedMap18.equals((java.lang.Object) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set13 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) 100);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Set set7 = defaultedMap1.keySet();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set13 = defaultedMap1.keySet();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator17.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap21);
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) fixedOrderComparator17, (java.lang.Object) defaultedMap21);
        defaultedMap21.clear();
        java.util.Set set25 = defaultedMap21.entrySet();
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (-1.0d));
        java.util.Set set13 = defaultedMap8.entrySet();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap16.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap36.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection41 = defaultedMap36.values();
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        defaultedMap16.putAll((java.util.Map) defaultedMap27);
        java.lang.String str44 = defaultedMap27.toString();
        defaultedMap8.putAll((java.util.Map) defaultedMap27);
        defaultedMap27.clear();
        java.lang.Object obj48 = defaultedMap27.remove((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection33 = defaultedMap28.values();
        defaultedMap19.putAll((java.util.Map) defaultedMap28);
        defaultedMap1.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b39 = defaultedMap37.equals((java.lang.Object) (short) 10);
        boolean b41 = defaultedMap37.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b45 = defaultedMap43.equals((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap43.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate48, predicate49);
        java.util.Collection collection51 = defaultedMap43.values();
        java.lang.Object obj53 = defaultedMap37.put((java.lang.Object) defaultedMap43, (java.lang.Object) 1.0f);
        boolean b55 = defaultedMap37.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b59 = defaultedMap57.equals((java.lang.Object) (short) 10);
        boolean b61 = defaultedMap57.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b65 = defaultedMap63.equals((java.lang.Object) (short) 10);
        boolean b67 = defaultedMap63.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate68, predicate69);
        java.util.Collection collection71 = defaultedMap63.values();
        java.lang.Object obj73 = defaultedMap57.put((java.lang.Object) defaultedMap63, (java.lang.Object) 1.0f);
        defaultedMap37.putAll((java.util.Map) defaultedMap63);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b78 = defaultedMap76.equals((java.lang.Object) (short) 10);
        boolean b80 = defaultedMap76.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate81, predicate82);
        java.util.Collection collection84 = defaultedMap76.values();
        java.lang.Object obj85 = defaultedMap37.get((java.lang.Object) defaultedMap76);
        boolean b86 = defaultedMap19.containsKey(obj85);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + 1.0f + "'", obj85.equals(1.0f));
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 0);
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (short) 10);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 2);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate10, predicate11);
        boolean b13 = fixedOrderComparator3.add((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Set set16 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap10.remove((java.lang.Object) defaultedMap18);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        boolean b18 = defaultedMap1.equals((java.lang.Object) ' ');
        int i19 = defaultedMap1.size();
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap14.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate19, predicate20);
        java.util.Collection collection22 = defaultedMap14.values();
        java.lang.Object obj24 = defaultedMap8.put((java.lang.Object) defaultedMap14, (java.lang.Object) 1.0f);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap36.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection41 = defaultedMap36.values();
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (short) 10);
        boolean b48 = defaultedMap44.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate49, predicate50);
        java.lang.Object obj52 = new java.lang.Object();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, obj52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b57 = defaultedMap55.equals((java.lang.Object) (short) 10);
        boolean b59 = defaultedMap55.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate60, predicate61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b66 = defaultedMap64.equals((java.lang.Object) (short) 10);
        boolean b68 = defaultedMap64.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection69 = defaultedMap64.values();
        defaultedMap55.putAll((java.util.Map) defaultedMap64);
        defaultedMap44.putAll((java.util.Map) defaultedMap55);
        defaultedMap36.putAll((java.util.Map) defaultedMap55);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b76 = defaultedMap74.equals((java.lang.Object) (short) 10);
        java.lang.Object obj78 = defaultedMap74.get((java.lang.Object) 2);
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate79, predicate80);
        boolean b82 = defaultedMap55.containsValue((java.lang.Object) predicate80);
        boolean b83 = defaultedMap14.equals((java.lang.Object) predicate80);
        collections.Factory factory84 = null;
        try {
            java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, factory84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + true + "'", obj25.equals(true));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + true + "'", obj78.equals(true));
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        java.lang.Object obj26 = new java.lang.Object();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection43 = defaultedMap38.values();
        defaultedMap29.putAll((java.util.Map) defaultedMap38);
        defaultedMap18.putAll((java.util.Map) defaultedMap29);
        defaultedMap10.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) 2);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        boolean b56 = defaultedMap29.containsValue((java.lang.Object) predicate54);
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap29.get(obj57);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + true + "'", obj52.equals(true));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + true + "'", obj58.equals(true));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        java.util.Collection collection35 = defaultedMap27.values();
        java.lang.Object obj37 = defaultedMap21.put((java.lang.Object) defaultedMap27, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        int i39 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i39 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.lang.Object obj9 = new java.lang.Object();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        defaultedMap26.putAll((java.util.Map) defaultedMap29);
        boolean b31 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b35 = defaultedMap33.equals((java.lang.Object) (short) 10);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) 2);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b44 = defaultedMap42.equals((java.lang.Object) (short) 10);
        boolean b46 = defaultedMap42.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate47, predicate48);
        java.lang.Object obj50 = new java.lang.Object();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, obj50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b55 = defaultedMap53.equals((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap53.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b64 = defaultedMap62.equals((java.lang.Object) (short) 10);
        boolean b66 = defaultedMap62.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection67 = defaultedMap62.values();
        defaultedMap53.putAll((java.util.Map) defaultedMap62);
        defaultedMap42.putAll((java.util.Map) defaultedMap53);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj71 = defaultedMap42.get((java.lang.Object) predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate38, predicate70);
        java.util.Map map73 = collections.map.PredicatedMap.decorate(map10, predicate17, predicate38);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + true + "'", obj37.equals(true));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + true + "'", obj71.equals(true));
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        try {
            fixedOrderComparator3.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        java.util.Set set18 = defaultedMap1.entrySet();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap1.remove(obj19);
        java.lang.Object obj21 = null;
        boolean b22 = defaultedMap1.containsKey(obj21);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator9);
        boolean b12 = fixedOrderComparator9.add((java.lang.Object) ' ');
        boolean b13 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap16.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap16.remove((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap16.containsValue((java.lang.Object) 10.0f);
        java.util.Collection collection25 = defaultedMap16.values();
        try {
            int i26 = fixedOrderComparator9.compare((java.lang.Object) "{}", (java.lang.Object) collection25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (short) 10);
        boolean b17 = defaultedMap13.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection27 = defaultedMap22.values();
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap30.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate35, predicate36);
        java.lang.Object obj38 = new java.lang.Object();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (short) 10);
        boolean b45 = defaultedMap41.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b52 = defaultedMap50.equals((java.lang.Object) (short) 10);
        boolean b54 = defaultedMap50.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection55 = defaultedMap50.values();
        defaultedMap41.putAll((java.util.Map) defaultedMap50);
        defaultedMap30.putAll((java.util.Map) defaultedMap41);
        defaultedMap22.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b62 = defaultedMap60.equals((java.lang.Object) (short) 10);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) 2);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate65, predicate66);
        boolean b68 = defaultedMap41.containsValue((java.lang.Object) predicate66);
        java.lang.Object obj69 = defaultedMap1.put((java.lang.Object) obj_array10, (java.lang.Object) b68);
        collections.Factory factory70 = null;
        try {
            java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + true + "'", obj64.equals(true));
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.util.Collection collection23 = defaultedMap15.values();
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) defaultedMap15, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.lang.String str27 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) 2);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap30.put((java.lang.Object) "", obj36);
        java.lang.Object obj38 = defaultedMap15.put((java.lang.Object) 100L, obj37);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + true + "'", obj34.equals(true));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set13 = defaultedMap1.keySet();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator17.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap21);
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) fixedOrderComparator17, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b27 = defaultedMap25.equals((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap25.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection30 = defaultedMap25.values();
        boolean b31 = defaultedMap1.equals((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        java.lang.String str12 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap14.equals((java.lang.Object) (-1.0d));
        java.util.Set set19 = defaultedMap14.entrySet();
        boolean b20 = defaultedMap7.containsKey((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap22.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate27, predicate28);
        java.lang.Object obj30 = new java.lang.Object();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b35 = defaultedMap33.equals((java.lang.Object) (short) 10);
        boolean b37 = defaultedMap33.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b44 = defaultedMap42.equals((java.lang.Object) (short) 10);
        boolean b46 = defaultedMap42.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection47 = defaultedMap42.values();
        defaultedMap33.putAll((java.util.Map) defaultedMap42);
        defaultedMap22.putAll((java.util.Map) defaultedMap33);
        java.lang.String str50 = defaultedMap33.toString();
        defaultedMap14.putAll((java.util.Map) defaultedMap33);
        java.lang.Object obj52 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + true + "'", obj52.equals(true));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator2.add(obj4);
        boolean b6 = fixedOrderComparator2.isLocked();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.lang.Object obj23 = new java.lang.Object();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b28 = defaultedMap26.equals((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap26.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b37 = defaultedMap35.equals((java.lang.Object) (short) 10);
        boolean b39 = defaultedMap35.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection40 = defaultedMap35.values();
        defaultedMap26.putAll((java.util.Map) defaultedMap35);
        defaultedMap15.putAll((java.util.Map) defaultedMap26);
        java.lang.String str43 = defaultedMap26.toString();
        boolean b44 = defaultedMap1.containsValue((java.lang.Object) str43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b48 = defaultedMap46.equals((java.lang.Object) (short) 10);
        java.lang.Object obj50 = defaultedMap46.get((java.lang.Object) 2);
        java.lang.String str51 = defaultedMap46.toString();
        java.lang.Object[] obj_array52 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array52);
        boolean b55 = defaultedMap46.equals((java.lang.Object) fixedOrderComparator54);
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) defaultedMap46);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + true + "'", obj50.equals(true));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + false + "'", obj56.equals(false));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        java.lang.Object obj26 = new java.lang.Object();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection43 = defaultedMap38.values();
        defaultedMap29.putAll((java.util.Map) defaultedMap38);
        defaultedMap18.putAll((java.util.Map) defaultedMap29);
        defaultedMap10.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap48.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap48);
        java.util.Collection collection57 = defaultedMap29.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(collection57);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) false);
        boolean b14 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (-1.0d));
        java.util.Set set13 = defaultedMap8.entrySet();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap16.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) (-1));
        defaultedMap8.putAll((java.util.Map) defaultedMap16);
        java.lang.String str24 = defaultedMap8.toString();
        boolean b25 = defaultedMap8.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + true + "'", obj22.equals(true));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        try {
            fixedOrderComparator1.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) 'a');
        java.util.Set set20 = defaultedMap1.entrySet();
        java.util.Set set21 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b25 = defaultedMap23.equals((java.lang.Object) (short) 10);
        boolean b27 = defaultedMap23.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate28, predicate29);
        java.util.Collection collection31 = defaultedMap23.values();
        java.lang.Object obj34 = defaultedMap23.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set35 = defaultedMap23.keySet();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { set35 };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b41 = defaultedMap39.equals((java.lang.Object) (short) 10);
        boolean b43 = defaultedMap39.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate44, predicate45);
        java.lang.Object obj47 = new java.lang.Object();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b52 = defaultedMap50.equals((java.lang.Object) (short) 10);
        boolean b54 = defaultedMap50.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b61 = defaultedMap59.equals((java.lang.Object) (short) 10);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection64 = defaultedMap59.values();
        defaultedMap50.putAll((java.util.Map) defaultedMap59);
        defaultedMap39.putAll((java.util.Map) defaultedMap50);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj68 = defaultedMap39.get((java.lang.Object) predicate67);
        boolean b69 = fixedOrderComparator37.add(obj68);
        boolean b70 = defaultedMap1.containsValue((java.lang.Object) b69);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + true + "'", obj68.equals(true));
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.lang.Object obj9 = new java.lang.Object();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection26 = defaultedMap21.values();
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) predicate29);
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap1.get(obj31);
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + true + "'", obj30.equals(true));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + true + "'", obj32.equals(true));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection17 = defaultedMap12.values();
        defaultedMap3.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap20.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        java.lang.Object obj28 = new java.lang.Object();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b33 = defaultedMap31.equals((java.lang.Object) (short) 10);
        boolean b35 = defaultedMap31.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap40.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection45 = defaultedMap40.values();
        defaultedMap31.putAll((java.util.Map) defaultedMap40);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        defaultedMap12.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b52 = defaultedMap50.equals((java.lang.Object) (short) 10);
        java.lang.Object obj54 = defaultedMap50.get((java.lang.Object) 2);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate55, predicate56);
        boolean b58 = defaultedMap31.containsValue((java.lang.Object) predicate56);
        try {
            java.util.Map map59 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + true + "'", obj54.equals(true));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection13 = defaultedMap8.values();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap22.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate27, predicate28);
        java.util.Collection collection30 = defaultedMap22.values();
        java.lang.Object obj32 = defaultedMap16.put((java.lang.Object) defaultedMap22, (java.lang.Object) 1.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap8.get(obj34);
        boolean b36 = defaultedMap8.isEmpty();
        java.lang.Object obj38 = defaultedMap8.get((java.lang.Object) 10.0d);
        java.lang.String str39 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (short) 10);
        boolean b45 = defaultedMap41.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection46 = defaultedMap41.values();
        boolean b47 = defaultedMap8.containsKey((java.lang.Object) defaultedMap41);
        boolean b48 = defaultedMap1.containsKey((java.lang.Object) b47);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + true + "'", obj35.equals(true));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + true + "'", obj38.equals(true));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap14.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate19, predicate20);
        java.lang.Object obj22 = new java.lang.Object();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, obj22);
        boolean b24 = defaultedMap8.equals(obj22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) fixedOrderComparator28);
        java.util.Collection collection30 = defaultedMap8.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + true + "'", obj12.equals(true));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.util.Collection collection23 = defaultedMap15.values();
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) defaultedMap15, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap1.get(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap30.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate35, predicate36);
        java.util.Collection collection38 = defaultedMap30.values();
        java.lang.Object obj41 = defaultedMap30.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set42 = defaultedMap30.keySet();
        java.lang.Object[] obj_array43 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array43);
        fixedOrderComparator46.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap50);
        java.lang.Object obj52 = defaultedMap30.put((java.lang.Object) fixedOrderComparator46, (java.lang.Object) defaultedMap50);
        java.lang.Object obj53 = defaultedMap1.remove(obj52);
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + true + "'", obj55.equals(true));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object obj3 = null;
        boolean b4 = fixedOrderComparator0.add(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap24.equals((java.lang.Object) (-1.0d));
        boolean b29 = defaultedMap15.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection30 = defaultedMap15.values();
        java.lang.Object[] obj_array31 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj34 = defaultedMap6.put((java.lang.Object) defaultedMap15, (java.lang.Object) obj_array31);
        java.util.Collection collection35 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b39 = defaultedMap37.equals((java.lang.Object) (short) 10);
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) 2);
        java.lang.String str42 = defaultedMap37.toString();
        java.lang.Object[] obj_array43 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array43);
        boolean b46 = defaultedMap37.equals((java.lang.Object) fixedOrderComparator45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap48.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b56 = defaultedMap54.equals((java.lang.Object) (short) 10);
        boolean b58 = defaultedMap54.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate59, predicate60);
        java.util.Collection collection62 = defaultedMap54.values();
        java.lang.Object obj64 = defaultedMap48.put((java.lang.Object) defaultedMap54, (java.lang.Object) 1.0f);
        defaultedMap37.putAll((java.util.Map) defaultedMap54);
        boolean b67 = defaultedMap37.containsKey((java.lang.Object) ' ');
        java.util.Set set68 = defaultedMap37.entrySet();
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) set68);
        boolean b70 = fixedOrderComparator0.add((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + true + "'", obj41.equals(true));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) set7);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        int i10 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        java.lang.Object obj20 = new java.lang.Object();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b25 = defaultedMap23.equals((java.lang.Object) (short) 10);
        boolean b27 = defaultedMap23.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate28, predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (short) 10);
        boolean b36 = defaultedMap32.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection37 = defaultedMap32.values();
        defaultedMap23.putAll((java.util.Map) defaultedMap32);
        defaultedMap12.putAll((java.util.Map) defaultedMap23);
        java.lang.String str40 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b44 = defaultedMap42.equals((java.lang.Object) (short) 10);
        boolean b46 = defaultedMap42.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap48.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        java.util.Collection collection56 = defaultedMap48.values();
        java.lang.Object obj58 = defaultedMap42.put((java.lang.Object) defaultedMap48, (java.lang.Object) 1.0f);
        java.util.Set set59 = defaultedMap42.entrySet();
        java.lang.Object obj60 = defaultedMap23.get((java.lang.Object) defaultedMap42);
        java.lang.Object obj61 = defaultedMap1.remove((java.lang.Object) defaultedMap23);
        java.lang.String str62 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + true + "'", obj60.equals(true));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (short) 10);
        boolean b17 = defaultedMap13.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection27 = defaultedMap22.values();
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap30.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate35, predicate36);
        java.lang.Object obj38 = new java.lang.Object();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (short) 10);
        boolean b45 = defaultedMap41.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b52 = defaultedMap50.equals((java.lang.Object) (short) 10);
        boolean b54 = defaultedMap50.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection55 = defaultedMap50.values();
        defaultedMap41.putAll((java.util.Map) defaultedMap50);
        defaultedMap30.putAll((java.util.Map) defaultedMap41);
        defaultedMap22.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b62 = defaultedMap60.equals((java.lang.Object) (short) 10);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) 2);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate65, predicate66);
        boolean b68 = defaultedMap41.containsValue((java.lang.Object) predicate66);
        java.lang.Object obj69 = defaultedMap1.put((java.lang.Object) obj_array10, (java.lang.Object) b68);
        boolean b70 = defaultedMap1.isEmpty();
        boolean b71 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b75 = defaultedMap73.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b79 = defaultedMap77.equals((java.lang.Object) (short) 10);
        boolean b81 = defaultedMap77.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b85 = defaultedMap83.equals((java.lang.Object) (short) 10);
        boolean b87 = defaultedMap83.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b89 = defaultedMap77.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj90 = defaultedMap73.remove((java.lang.Object) b89);
        defaultedMap1.putAll((java.util.Map) defaultedMap73);
        java.util.Set set92 = defaultedMap1.entrySet();
        int i93 = defaultedMap1.size();
        java.util.Set set94 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + true + "'", obj64.equals(true));
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertTrue(i93 == 1);
        org.junit.Assert.assertNotNull(set94);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (short) 10);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap3.remove((java.lang.Object) (byte) 1);
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        int i12 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        int i3 = fixedOrderComparator2.getUnknownObjectBehavior();
        fixedOrderComparator2.setUnknownObjectBehavior((int) (byte) 1);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i3 == 2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        defaultedMap1.clear();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b14 = fixedOrderComparator13.isLocked();
        boolean b15 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator13);
        int i16 = fixedOrderComparator13.getUnknownObjectBehavior();
        int i17 = fixedOrderComparator13.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue(i17 == 2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.util.Collection collection23 = defaultedMap15.values();
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) defaultedMap15, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap1.get(obj27);
        boolean b29 = defaultedMap1.isEmpty();
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set32 = defaultedMap1.entrySet();
        java.util.Set set33 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b37 = defaultedMap35.equals((java.lang.Object) (short) 10);
        boolean b39 = defaultedMap35.equals((java.lang.Object) (-1.0d));
        java.util.Set set40 = defaultedMap35.entrySet();
        boolean b41 = defaultedMap1.equals((java.lang.Object) defaultedMap35);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + true + "'", obj31.equals(true));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (-1.0d));
        java.util.Set set13 = defaultedMap8.entrySet();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap16.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap36.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection41 = defaultedMap36.values();
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        defaultedMap16.putAll((java.util.Map) defaultedMap27);
        java.lang.String str44 = defaultedMap27.toString();
        defaultedMap8.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap48.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        java.util.Collection collection56 = defaultedMap48.values();
        defaultedMap48.clear();
        java.lang.Object[] obj_array59 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator60 = new collections.comparators.FixedOrderComparator(obj_array59);
        boolean b61 = fixedOrderComparator60.isLocked();
        boolean b62 = defaultedMap48.equals((java.lang.Object) fixedOrderComparator60);
        java.lang.Object obj63 = defaultedMap46.get((java.lang.Object) fixedOrderComparator60);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        defaultedMap1.clear();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b14 = fixedOrderComparator13.isLocked();
        boolean b15 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator13);
        try {
            fixedOrderComparator13.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        java.util.Set set9 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap17.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        java.util.Collection collection25 = defaultedMap17.values();
        java.lang.Object obj27 = defaultedMap11.put((java.lang.Object) defaultedMap17, (java.lang.Object) 1.0f);
        java.lang.Object obj28 = defaultedMap4.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        java.util.Set set30 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set13 = defaultedMap1.keySet();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator17.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap21);
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) fixedOrderComparator17, (java.lang.Object) defaultedMap21);
        boolean b24 = defaultedMap21.isEmpty();
        java.util.Set set25 = defaultedMap21.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        boolean b13 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1.0d));
        boolean b24 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection25 = defaultedMap10.values();
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) obj_array26);
        java.util.Collection collection30 = defaultedMap1.values();
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.containsValue(obj3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1.0d));
        boolean b24 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection25 = defaultedMap10.values();
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) obj_array26);
        java.util.Collection collection30 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (short) 10);
        boolean b36 = defaultedMap32.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate37, predicate38);
        java.util.Collection collection40 = defaultedMap32.values();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap32);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1.0d));
        boolean b24 = defaultedMap10.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection25 = defaultedMap10.values();
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) obj_array26);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        java.util.Collection collection26 = defaultedMap18.values();
        java.lang.Object obj28 = defaultedMap12.put((java.lang.Object) defaultedMap18, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b35 = defaultedMap33.equals((java.lang.Object) (short) 10);
        boolean b37 = defaultedMap33.equals((java.lang.Object) (-1.0d));
        java.util.Set set38 = defaultedMap33.keySet();
        java.lang.String str39 = defaultedMap33.toString();
        java.lang.Object obj40 = defaultedMap1.remove((java.lang.Object) defaultedMap33);
        collections.Factory factory41 = null;
        try {
            java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        boolean b3 = fixedOrderComparator2.isLocked();
        java.lang.Object obj4 = null;
        boolean b5 = fixedOrderComparator2.add(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection21 = defaultedMap16.values();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap24.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate30);
        java.lang.Object obj32 = new java.lang.Object();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, obj32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b37 = defaultedMap35.equals((java.lang.Object) (short) 10);
        boolean b39 = defaultedMap35.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (short) 10);
        boolean b48 = defaultedMap44.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection49 = defaultedMap44.values();
        defaultedMap35.putAll((java.util.Map) defaultedMap44);
        defaultedMap24.putAll((java.util.Map) defaultedMap35);
        defaultedMap16.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b58 = defaultedMap56.equals((java.lang.Object) (short) 10);
        boolean b60 = defaultedMap56.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj61 = defaultedMap54.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b65 = defaultedMap63.equals((java.lang.Object) (short) 10);
        boolean b67 = defaultedMap63.equals((java.lang.Object) (-1.0d));
        java.util.Set set68 = defaultedMap63.entrySet();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b72 = defaultedMap70.equals((java.lang.Object) (short) 10);
        boolean b74 = defaultedMap70.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate75, predicate76);
        java.util.Collection collection78 = defaultedMap70.values();
        java.lang.Object obj81 = defaultedMap70.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set82 = defaultedMap70.keySet();
        java.lang.Object[] obj_array83 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array83);
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array83);
        collections.comparators.FixedOrderComparator fixedOrderComparator86 = new collections.comparators.FixedOrderComparator(obj_array83);
        fixedOrderComparator86.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap90);
        java.lang.Object obj92 = defaultedMap70.put((java.lang.Object) fixedOrderComparator86, (java.lang.Object) defaultedMap90);
        defaultedMap90.clear();
        boolean b94 = defaultedMap63.equals((java.lang.Object) defaultedMap90);
        defaultedMap54.putAll((java.util.Map) defaultedMap63);
        try {
            boolean b96 = fixedOrderComparator2.addAsEqual((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(obj_array83);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue(b94 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator9);
        boolean b12 = fixedOrderComparator9.add((java.lang.Object) ' ');
        boolean b13 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        java.util.Set set20 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap28.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate34);
        java.util.Collection collection36 = defaultedMap28.values();
        java.lang.Object obj38 = defaultedMap22.put((java.lang.Object) defaultedMap28, (java.lang.Object) 1.0f);
        java.lang.Object obj39 = defaultedMap15.get((java.lang.Object) defaultedMap28);
        boolean b40 = fixedOrderComparator9.add((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b44 = defaultedMap42.equals((java.lang.Object) (short) 10);
        boolean b46 = defaultedMap42.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate47, predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b53 = defaultedMap51.equals((java.lang.Object) (short) 10);
        boolean b55 = defaultedMap51.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection56 = defaultedMap51.values();
        defaultedMap42.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b61 = defaultedMap59.equals((java.lang.Object) (short) 10);
        boolean b63 = defaultedMap59.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        java.lang.Object obj67 = new java.lang.Object();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, obj67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b72 = defaultedMap70.equals((java.lang.Object) (short) 10);
        boolean b74 = defaultedMap70.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate75, predicate76);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b81 = defaultedMap79.equals((java.lang.Object) (short) 10);
        boolean b83 = defaultedMap79.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection84 = defaultedMap79.values();
        defaultedMap70.putAll((java.util.Map) defaultedMap79);
        defaultedMap59.putAll((java.util.Map) defaultedMap70);
        defaultedMap51.putAll((java.util.Map) defaultedMap70);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b91 = defaultedMap89.equals((java.lang.Object) (short) 10);
        boolean b93 = defaultedMap89.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate95 = collections.PredicateUtils.truePredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap89, predicate94, predicate95);
        java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) defaultedMap89);
        boolean b98 = defaultedMap28.equals((java.lang.Object) map97);
        java.util.Set set99 = defaultedMap28.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + true + "'", obj39.equals(true));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertTrue(b98 == true);
        org.junit.Assert.assertNotNull(set99);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        defaultedMap9.putAll((java.util.Map) defaultedMap12);
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) 2);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b27 = defaultedMap25.equals((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap25.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate30, predicate31);
        java.lang.Object obj33 = new java.lang.Object();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, obj33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap36.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b47 = defaultedMap45.equals((java.lang.Object) (short) 10);
        boolean b49 = defaultedMap45.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection50 = defaultedMap45.values();
        defaultedMap36.putAll((java.util.Map) defaultedMap45);
        defaultedMap25.putAll((java.util.Map) defaultedMap36);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj54 = defaultedMap25.get((java.lang.Object) predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate21, predicate53);
        boolean b56 = fixedOrderComparator0.add((java.lang.Object) map55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b60 = defaultedMap58.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b64 = defaultedMap62.equals((java.lang.Object) (short) 10);
        boolean b66 = defaultedMap62.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b70 = defaultedMap68.equals((java.lang.Object) (short) 10);
        boolean b72 = defaultedMap68.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b74 = defaultedMap62.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj75 = defaultedMap58.remove((java.lang.Object) b74);
        boolean b76 = fixedOrderComparator0.add((java.lang.Object) b74);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true + "'", obj20.equals(true));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + true + "'", obj54.equals(true));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b76 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        int i3 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i3 == 2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        java.util.Set set9 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap17.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        java.util.Collection collection25 = defaultedMap17.values();
        java.lang.Object obj27 = defaultedMap11.put((java.lang.Object) defaultedMap17, (java.lang.Object) 1.0f);
        java.lang.Object obj28 = defaultedMap4.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b33 = defaultedMap31.equals((java.lang.Object) (short) 10);
        boolean b35 = defaultedMap31.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap40.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection45 = defaultedMap40.values();
        defaultedMap31.putAll((java.util.Map) defaultedMap40);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap48.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        java.lang.Object obj56 = new java.lang.Object();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, obj56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b61 = defaultedMap59.equals((java.lang.Object) (short) 10);
        boolean b63 = defaultedMap59.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b70 = defaultedMap68.equals((java.lang.Object) (short) 10);
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection73 = defaultedMap68.values();
        defaultedMap59.putAll((java.util.Map) defaultedMap68);
        defaultedMap48.putAll((java.util.Map) defaultedMap59);
        defaultedMap40.putAll((java.util.Map) defaultedMap59);
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj78 = defaultedMap4.put((java.lang.Object) defaultedMap59, (java.lang.Object) predicate77);
        collections.Factory factory79 = null;
        try {
            java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.util.Collection collection23 = defaultedMap15.values();
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) defaultedMap15, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        int i27 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        boolean b11 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (short) 10);
        boolean b17 = defaultedMap13.equals((java.lang.Object) (-1.0d));
        java.util.Set set18 = defaultedMap13.keySet();
        boolean b19 = defaultedMap9.equals((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.equals((java.lang.Object) (-1.0d));
        java.util.Set set26 = defaultedMap21.keySet();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.lang.Object[] obj_array28 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b31 = defaultedMap1.containsValue((java.lang.Object) obj_array28);
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1.0f + "'", obj27.equals(1.0f));
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i2 = fixedOrderComparator1.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (short) 10);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 2);
        java.lang.String str9 = defaultedMap4.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b13 = defaultedMap4.equals((java.lang.Object) fixedOrderComparator12);
        boolean b15 = fixedOrderComparator12.add((java.lang.Object) ' ');
        boolean b16 = fixedOrderComparator12.isLocked();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = fixedOrderComparator12.add((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection35 = defaultedMap30.values();
        defaultedMap21.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b41 = defaultedMap39.equals((java.lang.Object) (short) 10);
        boolean b43 = defaultedMap39.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection44 = defaultedMap39.values();
        defaultedMap39.clear();
        java.lang.Object obj46 = defaultedMap21.put(obj37, (java.lang.Object) defaultedMap39);
        try {
            boolean b47 = fixedOrderComparator1.addAsEqual((java.lang.Object) b19, obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + true + "'", obj8.equals(true));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        java.lang.Object obj26 = new java.lang.Object();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection43 = defaultedMap38.values();
        defaultedMap29.putAll((java.util.Map) defaultedMap38);
        defaultedMap18.putAll((java.util.Map) defaultedMap29);
        defaultedMap10.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) 2);
        defaultedMap48.clear();
        boolean b54 = defaultedMap10.containsValue((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + true + "'", obj52.equals(true));
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) false);
        java.util.Collection collection14 = defaultedMap11.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate26);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate(map29, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + true + "'", obj7.equals(true));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.lang.Object obj15 = new java.lang.Object();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, obj15);
        boolean b17 = defaultedMap1.equals(obj15);
        java.util.Set set18 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (short) 10);
        boolean b28 = defaultedMap24.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate30);
        java.util.Collection collection32 = defaultedMap24.values();
        java.lang.Object obj34 = defaultedMap18.put((java.lang.Object) defaultedMap24, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap36.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b47 = defaultedMap45.equals((java.lang.Object) (short) 10);
        boolean b49 = defaultedMap45.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection50 = defaultedMap45.values();
        defaultedMap36.putAll((java.util.Map) defaultedMap45);
        defaultedMap18.putAll((java.util.Map) defaultedMap36);
        boolean b53 = defaultedMap1.containsValue((java.lang.Object) defaultedMap18);
        java.util.Set set54 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.lang.Object obj9 = new java.lang.Object();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection26 = defaultedMap21.values();
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        java.lang.String str29 = defaultedMap12.toString();
        boolean b31 = defaultedMap12.containsValue((java.lang.Object) true);
        defaultedMap12.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        java.util.Collection collection35 = defaultedMap27.values();
        java.lang.Object obj37 = defaultedMap21.put((java.lang.Object) defaultedMap27, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap40.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate45, predicate46);
        java.util.Collection collection48 = defaultedMap40.values();
        java.lang.Object obj49 = defaultedMap1.get((java.lang.Object) defaultedMap40);
        collections.Transformer transformer50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, transformer50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1.0f + "'", obj49.equals(1.0f));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) (byte) 1);
        int i14 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap22.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate27, predicate28);
        java.lang.Object obj30 = new java.lang.Object();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, obj30);
        boolean b32 = defaultedMap16.equals(obj30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap16);
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) fixedOrderComparator36);
        boolean b38 = fixedOrderComparator36.isLocked();
        boolean b39 = defaultedMap1.containsKey((java.lang.Object) fixedOrderComparator36);
        fixedOrderComparator36.setUnknownObjectBehavior(0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + true + "'", obj7.equals(true));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true + "'", obj20.equals(true));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (short) 10);
        boolean b17 = defaultedMap13.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection27 = defaultedMap22.values();
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap30.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate35, predicate36);
        java.lang.Object obj38 = new java.lang.Object();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (short) 10);
        boolean b45 = defaultedMap41.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b52 = defaultedMap50.equals((java.lang.Object) (short) 10);
        boolean b54 = defaultedMap50.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection55 = defaultedMap50.values();
        defaultedMap41.putAll((java.util.Map) defaultedMap50);
        defaultedMap30.putAll((java.util.Map) defaultedMap41);
        defaultedMap22.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b62 = defaultedMap60.equals((java.lang.Object) (short) 10);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) 2);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate65, predicate66);
        boolean b68 = defaultedMap41.containsValue((java.lang.Object) predicate66);
        java.lang.Object obj69 = defaultedMap1.put((java.lang.Object) obj_array10, (java.lang.Object) b68);
        boolean b70 = defaultedMap1.isEmpty();
        boolean b71 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b75 = defaultedMap73.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b79 = defaultedMap77.equals((java.lang.Object) (short) 10);
        boolean b81 = defaultedMap77.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b85 = defaultedMap83.equals((java.lang.Object) (short) 10);
        boolean b87 = defaultedMap83.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b89 = defaultedMap77.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj90 = defaultedMap73.remove((java.lang.Object) b89);
        defaultedMap1.putAll((java.util.Map) defaultedMap73);
        int i92 = defaultedMap73.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + true + "'", obj64.equals(true));
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue(i92 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) (byte) -1);
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        java.util.Set set9 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap17.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        java.util.Collection collection25 = defaultedMap17.values();
        java.lang.Object obj27 = defaultedMap11.put((java.lang.Object) defaultedMap17, (java.lang.Object) 1.0f);
        java.lang.Object obj28 = defaultedMap4.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (short) 10);
        boolean b36 = defaultedMap32.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj38 = defaultedMap32.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b41 = defaultedMap32.equals((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b45 = defaultedMap43.equals((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap43.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate48, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b54 = defaultedMap52.equals((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap52.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate48, predicate57);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate57, predicate61);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + true + "'", obj38.equals(true));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set3 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.lang.Object obj9 = new java.lang.Object();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection26 = defaultedMap21.values();
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator();
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator29);
        fixedOrderComparator29.setUnknownObjectBehavior((int) (short) 0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.util.Collection collection23 = defaultedMap15.values();
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) defaultedMap15, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap1.get(obj27);
        boolean b29 = defaultedMap1.isEmpty();
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj32 = null;
        boolean b33 = defaultedMap1.equals(obj32);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + true + "'", obj31.equals(true));
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        java.lang.Object obj26 = new java.lang.Object();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection43 = defaultedMap38.values();
        defaultedMap29.putAll((java.util.Map) defaultedMap38);
        defaultedMap18.putAll((java.util.Map) defaultedMap29);
        defaultedMap10.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap48.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b60 = defaultedMap58.equals((java.lang.Object) (short) 10);
        boolean b62 = defaultedMap58.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj64 = defaultedMap58.remove((java.lang.Object) (short) 0);
        boolean b66 = defaultedMap58.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj70 = defaultedMap58.put((java.lang.Object) defaultedMap68, (java.lang.Object) false);
        boolean b71 = defaultedMap48.containsKey((java.lang.Object) defaultedMap68);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) b71);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b16 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        java.lang.Object obj26 = new java.lang.Object();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj26);
        boolean b28 = defaultedMap4.containsKey(obj26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap30.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate35, predicate36);
        java.lang.Object obj38 = new java.lang.Object();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (short) 10);
        boolean b45 = defaultedMap41.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b52 = defaultedMap50.equals((java.lang.Object) (short) 10);
        boolean b54 = defaultedMap50.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection55 = defaultedMap50.values();
        defaultedMap41.putAll((java.util.Map) defaultedMap50);
        defaultedMap30.putAll((java.util.Map) defaultedMap41);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj59 = defaultedMap30.get((java.lang.Object) predicate58);
        try {
            boolean b60 = fixedOrderComparator2.addAsEqual((java.lang.Object) defaultedMap4, obj59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + true + "'", obj59.equals(true));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator9);
        boolean b12 = fixedOrderComparator9.add((java.lang.Object) ' ');
        fixedOrderComparator9.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap8.values();
        java.lang.Object obj19 = defaultedMap8.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set20 = defaultedMap8.keySet();
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        fixedOrderComparator24.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap28);
        java.lang.Object obj30 = defaultedMap8.put((java.lang.Object) fixedOrderComparator24, (java.lang.Object) defaultedMap28);
        defaultedMap28.clear();
        boolean b32 = defaultedMap1.equals((java.lang.Object) defaultedMap28);
        java.util.Collection collection33 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set13 = defaultedMap1.keySet();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { set13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (short) 10);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 2);
        java.lang.String str22 = defaultedMap17.toString();
        java.lang.Object[] obj_array23 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b26 = defaultedMap17.equals((java.lang.Object) fixedOrderComparator25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b36 = defaultedMap34.equals((java.lang.Object) (short) 10);
        boolean b38 = defaultedMap34.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate39, predicate40);
        java.util.Collection collection42 = defaultedMap34.values();
        java.lang.Object obj44 = defaultedMap28.put((java.lang.Object) defaultedMap34, (java.lang.Object) 1.0f);
        java.util.Set set45 = defaultedMap34.keySet();
        boolean b46 = defaultedMap34.isEmpty();
        try {
            int i47 = fixedOrderComparator15.compare((java.lang.Object) fixedOrderComparator25, (java.lang.Object) b46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + true + "'", obj21.equals(true));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator3);
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        java.lang.Object obj20 = new java.lang.Object();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b25 = defaultedMap23.equals((java.lang.Object) (short) 10);
        boolean b27 = defaultedMap23.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate28, predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (short) 10);
        boolean b36 = defaultedMap32.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection37 = defaultedMap32.values();
        defaultedMap23.putAll((java.util.Map) defaultedMap32);
        defaultedMap12.putAll((java.util.Map) defaultedMap23);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj41 = defaultedMap12.get((java.lang.Object) predicate40);
        try {
            int i42 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap9, (java.lang.Object) predicate40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + true + "'", obj41.equals(true));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        java.lang.Object obj26 = new java.lang.Object();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection43 = defaultedMap38.values();
        defaultedMap29.putAll((java.util.Map) defaultedMap38);
        defaultedMap18.putAll((java.util.Map) defaultedMap29);
        defaultedMap10.putAll((java.util.Map) defaultedMap29);
        java.lang.String str47 = defaultedMap10.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection24 = defaultedMap19.values();
        defaultedMap19.clear();
        java.lang.Object obj26 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) 2);
        java.lang.String str33 = defaultedMap28.toString();
        java.lang.Object[] obj_array34 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b37 = defaultedMap28.equals((java.lang.Object) fixedOrderComparator36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b41 = defaultedMap39.equals((java.lang.Object) (short) 10);
        boolean b43 = defaultedMap39.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b47 = defaultedMap45.equals((java.lang.Object) (short) 10);
        boolean b49 = defaultedMap45.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate50, predicate51);
        java.util.Collection collection53 = defaultedMap45.values();
        java.lang.Object obj55 = defaultedMap39.put((java.lang.Object) defaultedMap45, (java.lang.Object) 1.0f);
        defaultedMap28.putAll((java.util.Map) defaultedMap45);
        int i57 = defaultedMap45.size();
        java.lang.Object obj58 = defaultedMap19.remove((java.lang.Object) i57);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + true + "'", obj32.equals(true));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection24 = defaultedMap19.values();
        defaultedMap19.clear();
        java.lang.Object obj26 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap28.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate34);
        java.lang.Object obj36 = new java.lang.Object();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, obj36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b41 = defaultedMap39.equals((java.lang.Object) (short) 10);
        boolean b43 = defaultedMap39.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap48.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection53 = defaultedMap48.values();
        defaultedMap39.putAll((java.util.Map) defaultedMap48);
        defaultedMap28.putAll((java.util.Map) defaultedMap39);
        java.util.Set set56 = defaultedMap28.keySet();
        boolean b57 = defaultedMap1.containsValue((java.lang.Object) defaultedMap28);
        boolean b58 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.util.Collection collection23 = defaultedMap15.values();
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) defaultedMap15, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap1.get(obj27);
        boolean b29 = defaultedMap1.isEmpty();
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.String str32 = defaultedMap1.toString();
        java.lang.Object[] obj_array33 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) fixedOrderComparator34);
        boolean b37 = fixedOrderComparator34.isLocked();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + true + "'", obj31.equals(true));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.util.Collection collection23 = defaultedMap15.values();
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) defaultedMap15, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b38 = defaultedMap29.equals((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap40.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b51 = defaultedMap49.equals((java.lang.Object) (short) 10);
        boolean b53 = defaultedMap49.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate45, predicate54);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b61 = defaultedMap59.equals((java.lang.Object) (short) 10);
        boolean b63 = defaultedMap59.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate54, predicate65);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + true + "'", obj35.equals(true));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        boolean b18 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (short) 10);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) 2);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate34, predicate35);
        java.lang.Object obj37 = new java.lang.Object();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap40.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b51 = defaultedMap49.equals((java.lang.Object) (short) 10);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection54 = defaultedMap49.values();
        defaultedMap40.putAll((java.util.Map) defaultedMap49);
        defaultedMap29.putAll((java.util.Map) defaultedMap40);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj58 = defaultedMap29.get((java.lang.Object) predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate25, predicate57);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map59);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + true + "'", obj24.equals(true));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + true + "'", obj58.equals(true));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 10);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap3.values();
        java.lang.Object obj14 = defaultedMap3.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set15 = defaultedMap3.keySet();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { set15 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b18 = fixedOrderComparator1.add((java.lang.Object) fixedOrderComparator17);
        boolean b19 = fixedOrderComparator17.isLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (-1.0d));
        java.util.Set set13 = defaultedMap8.entrySet();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap16.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) (-1));
        defaultedMap8.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        java.util.Collection collection25 = defaultedMap16.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + true + "'", obj22.equals(true));
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        java.util.Set set9 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap17.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        java.util.Collection collection25 = defaultedMap17.values();
        java.lang.Object obj27 = defaultedMap11.put((java.lang.Object) defaultedMap17, (java.lang.Object) 1.0f);
        java.lang.Object obj28 = defaultedMap4.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b33 = defaultedMap31.equals((java.lang.Object) (short) 10);
        boolean b35 = defaultedMap31.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b39 = defaultedMap37.equals((java.lang.Object) (short) 10);
        boolean b41 = defaultedMap37.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate42, predicate43);
        java.util.Collection collection45 = defaultedMap37.values();
        java.lang.Object obj47 = defaultedMap31.put((java.lang.Object) defaultedMap37, (java.lang.Object) 1.0f);
        boolean b49 = defaultedMap31.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b53 = defaultedMap51.equals((java.lang.Object) (short) 10);
        boolean b55 = defaultedMap51.equals((java.lang.Object) (-1.0d));
        java.util.Set set56 = defaultedMap51.keySet();
        java.lang.Object obj57 = defaultedMap31.get((java.lang.Object) defaultedMap51);
        java.lang.Object obj58 = defaultedMap4.get(obj57);
        java.util.Collection collection59 = defaultedMap4.values();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 1.0f + "'", obj57.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + true + "'", obj58.equals(true));
        org.junit.Assert.assertNotNull(collection59);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b4 = fixedOrderComparator1.add((java.lang.Object) (byte) 10);
        boolean b5 = fixedOrderComparator1.isLocked();
        boolean b6 = fixedOrderComparator1.isLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b28 = defaultedMap26.equals((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap26.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        java.util.Collection collection34 = defaultedMap26.values();
        java.lang.Object obj36 = defaultedMap20.put((java.lang.Object) defaultedMap26, (java.lang.Object) 1.0f);
        java.util.Set set37 = defaultedMap26.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b41 = defaultedMap39.equals((java.lang.Object) (short) 10);
        boolean b43 = defaultedMap39.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap48.equals((java.lang.Object) (-1.0d));
        boolean b53 = defaultedMap39.containsValue((java.lang.Object) (-1.0d));
        defaultedMap26.putAll((java.util.Map) defaultedMap39);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap26);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap3.values();
        java.lang.Object obj14 = defaultedMap3.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set15 = defaultedMap3.keySet();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { set15 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b18 = fixedOrderComparator1.add((java.lang.Object) fixedOrderComparator17);
        java.lang.Object obj19 = null;
        boolean b20 = fixedOrderComparator1.add(obj19);
        int i21 = fixedOrderComparator1.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        boolean b18 = defaultedMap1.containsKey(obj17);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        java.util.Set set18 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap20.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap20.containsValue((java.lang.Object) (-1.0d));
        defaultedMap7.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b39 = defaultedMap37.equals((java.lang.Object) (short) 10);
        boolean b41 = defaultedMap37.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate42, predicate43);
        java.util.Collection collection45 = defaultedMap37.values();
        java.lang.Object obj48 = defaultedMap37.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set49 = defaultedMap37.keySet();
        java.lang.Object obj50 = defaultedMap20.get((java.lang.Object) set49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b54 = defaultedMap52.equals((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap52.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b63 = defaultedMap61.equals((java.lang.Object) (short) 10);
        boolean b65 = defaultedMap61.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection66 = defaultedMap61.values();
        defaultedMap52.putAll((java.util.Map) defaultedMap61);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b71 = defaultedMap69.equals((java.lang.Object) (short) 10);
        boolean b73 = defaultedMap69.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate74, predicate75);
        java.lang.Object obj77 = new java.lang.Object();
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, obj77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b82 = defaultedMap80.equals((java.lang.Object) (short) 10);
        boolean b84 = defaultedMap80.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate85, predicate86);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b91 = defaultedMap89.equals((java.lang.Object) (short) 10);
        boolean b93 = defaultedMap89.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection94 = defaultedMap89.values();
        defaultedMap80.putAll((java.util.Map) defaultedMap89);
        defaultedMap69.putAll((java.util.Map) defaultedMap80);
        defaultedMap61.putAll((java.util.Map) defaultedMap80);
        java.lang.Object obj98 = defaultedMap20.get((java.lang.Object) defaultedMap80);
        defaultedMap80.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + true + "'", obj50.equals(true));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertTrue("'" + obj98 + "' != '" + true + "'", obj98.equals(true));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator9);
        boolean b12 = fixedOrderComparator9.add((java.lang.Object) ' ');
        fixedOrderComparator9.setUnknownObjectBehavior((int) (byte) 0);
        try {
            fixedOrderComparator9.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        java.util.Collection collection26 = defaultedMap18.values();
        java.lang.Object obj28 = defaultedMap12.put((java.lang.Object) defaultedMap18, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        java.lang.String str30 = defaultedMap18.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap11.equals((java.lang.Object) (-1.0d));
        java.lang.String str16 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        java.util.Set set23 = defaultedMap18.entrySet();
        boolean b24 = defaultedMap11.containsKey((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b28 = defaultedMap26.equals((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap26.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        java.lang.Object obj34 = new java.lang.Object();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, obj34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b39 = defaultedMap37.equals((java.lang.Object) (short) 10);
        boolean b41 = defaultedMap37.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate42, predicate43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b48 = defaultedMap46.equals((java.lang.Object) (short) 10);
        boolean b50 = defaultedMap46.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection51 = defaultedMap46.values();
        defaultedMap37.putAll((java.util.Map) defaultedMap46);
        defaultedMap26.putAll((java.util.Map) defaultedMap37);
        java.lang.String str54 = defaultedMap37.toString();
        defaultedMap18.putAll((java.util.Map) defaultedMap37);
        java.lang.Object obj56 = defaultedMap1.remove((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection24 = defaultedMap19.values();
        defaultedMap19.clear();
        java.lang.Object obj26 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        java.util.Set set27 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection34 = defaultedMap29.values();
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b39 = defaultedMap37.equals((java.lang.Object) (short) 10);
        boolean b41 = defaultedMap37.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b45 = defaultedMap43.equals((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap43.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate48, predicate49);
        java.util.Collection collection51 = defaultedMap43.values();
        java.lang.Object obj53 = defaultedMap37.put((java.lang.Object) defaultedMap43, (java.lang.Object) 1.0f);
        defaultedMap29.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap29.get(obj55);
        boolean b57 = defaultedMap29.isEmpty();
        java.lang.Object obj59 = defaultedMap29.get((java.lang.Object) 10.0d);
        java.lang.String str60 = defaultedMap29.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + true + "'", obj56.equals(true));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + true + "'", obj59.equals(true));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        java.lang.String str6 = defaultedMap1.toString();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator9);
        boolean b12 = fixedOrderComparator9.add((java.lang.Object) ' ');
        boolean b13 = fixedOrderComparator9.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        java.util.Set set20 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap28.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate33, predicate34);
        java.util.Collection collection36 = defaultedMap28.values();
        java.lang.Object obj38 = defaultedMap22.put((java.lang.Object) defaultedMap28, (java.lang.Object) 1.0f);
        java.lang.Object obj39 = defaultedMap15.get((java.lang.Object) defaultedMap28);
        boolean b40 = fixedOrderComparator9.add((java.lang.Object) defaultedMap28);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b45 = defaultedMap43.equals((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap43.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate48, predicate49);
        try {
            int i51 = fixedOrderComparator9.compare(obj41, (java.lang.Object) predicate49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + true + "'", obj39.equals(true));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        java.util.Set set12 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap14.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap20.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        java.util.Collection collection28 = defaultedMap20.values();
        java.lang.Object obj30 = defaultedMap14.put((java.lang.Object) defaultedMap20, (java.lang.Object) 1.0f);
        java.lang.Object obj31 = defaultedMap7.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj32 = defaultedMap4.remove((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b36 = defaultedMap34.equals((java.lang.Object) (short) 10);
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap40.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate45, predicate46);
        java.util.Collection collection48 = defaultedMap40.values();
        java.lang.Object obj50 = defaultedMap34.put((java.lang.Object) defaultedMap40, (java.lang.Object) 1.0f);
        boolean b52 = defaultedMap34.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b56 = defaultedMap54.equals((java.lang.Object) (short) 10);
        boolean b58 = defaultedMap54.equals((java.lang.Object) (-1.0d));
        java.util.Set set59 = defaultedMap54.keySet();
        java.lang.Object obj60 = defaultedMap34.get((java.lang.Object) defaultedMap54);
        java.lang.Object obj61 = defaultedMap7.get(obj60);
        boolean b62 = fixedOrderComparator0.add(obj60);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + true + "'", obj31.equals(true));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1.0f + "'", obj60.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + true + "'", obj61.equals(true));
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        defaultedMap1.clear();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b14 = fixedOrderComparator13.isLocked();
        boolean b15 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator13);
        int i16 = fixedOrderComparator13.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.equals((java.lang.Object) (-1.0d));
        java.util.Set set26 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b36 = defaultedMap34.equals((java.lang.Object) (short) 10);
        boolean b38 = defaultedMap34.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate39, predicate40);
        java.util.Collection collection42 = defaultedMap34.values();
        java.lang.Object obj44 = defaultedMap28.put((java.lang.Object) defaultedMap34, (java.lang.Object) 1.0f);
        java.lang.Object obj45 = defaultedMap21.get((java.lang.Object) defaultedMap34);
        java.lang.Object obj46 = defaultedMap18.remove((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap48);
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = defaultedMap49.get(obj50);
        try {
            boolean b52 = fixedOrderComparator13.addAsEqual((java.lang.Object) defaultedMap21, obj51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + true + "'", obj45.equals(true));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(obj51);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (short) 10);
        boolean b17 = defaultedMap13.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection27 = defaultedMap22.values();
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap30.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate35, predicate36);
        java.lang.Object obj38 = new java.lang.Object();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (short) 10);
        boolean b45 = defaultedMap41.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b52 = defaultedMap50.equals((java.lang.Object) (short) 10);
        boolean b54 = defaultedMap50.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection55 = defaultedMap50.values();
        defaultedMap41.putAll((java.util.Map) defaultedMap50);
        defaultedMap30.putAll((java.util.Map) defaultedMap41);
        defaultedMap22.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b62 = defaultedMap60.equals((java.lang.Object) (short) 10);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) 2);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate65, predicate66);
        boolean b68 = defaultedMap41.containsValue((java.lang.Object) predicate66);
        java.lang.Object obj69 = defaultedMap1.put((java.lang.Object) obj_array10, (java.lang.Object) b68);
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + true + "'", obj64.equals(true));
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b18 = defaultedMap9.equals((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection25 = defaultedMap20.values();
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b36 = defaultedMap34.equals((java.lang.Object) (short) 10);
        boolean b38 = defaultedMap34.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate39, predicate40);
        java.util.Collection collection42 = defaultedMap34.values();
        java.lang.Object obj44 = defaultedMap28.put((java.lang.Object) defaultedMap34, (java.lang.Object) 1.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = defaultedMap20.get(obj46);
        boolean b48 = defaultedMap20.isEmpty();
        java.lang.Object obj50 = defaultedMap20.get((java.lang.Object) 10.0d);
        boolean b51 = defaultedMap9.containsKey((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b55 = defaultedMap53.equals((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap53.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate58, predicate59);
        java.util.Collection collection61 = defaultedMap53.values();
        java.lang.Object obj64 = defaultedMap53.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set65 = defaultedMap53.keySet();
        java.lang.Object obj66 = defaultedMap20.get((java.lang.Object) defaultedMap53);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap20);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true + "'", obj15.equals(true));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + true + "'", obj47.equals(true));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + true + "'", obj50.equals(true));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + true + "'", obj66.equals(true));
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        java.lang.Object obj26 = new java.lang.Object();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (short) 10);
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection43 = defaultedMap38.values();
        defaultedMap29.putAll((java.util.Map) defaultedMap38);
        defaultedMap18.putAll((java.util.Map) defaultedMap29);
        defaultedMap10.putAll((java.util.Map) defaultedMap29);
        int i47 = defaultedMap29.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(i47 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (short) 10);
        boolean b17 = defaultedMap13.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection27 = defaultedMap22.values();
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap30.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate35, predicate36);
        java.lang.Object obj38 = new java.lang.Object();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (short) 10);
        boolean b45 = defaultedMap41.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b52 = defaultedMap50.equals((java.lang.Object) (short) 10);
        boolean b54 = defaultedMap50.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection55 = defaultedMap50.values();
        defaultedMap41.putAll((java.util.Map) defaultedMap50);
        defaultedMap30.putAll((java.util.Map) defaultedMap41);
        defaultedMap22.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b62 = defaultedMap60.equals((java.lang.Object) (short) 10);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) 2);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate65, predicate66);
        boolean b68 = defaultedMap41.containsValue((java.lang.Object) predicate66);
        java.lang.Object obj69 = defaultedMap1.put((java.lang.Object) obj_array10, (java.lang.Object) b68);
        boolean b70 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + true + "'", obj64.equals(true));
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set13 = defaultedMap1.keySet();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { set13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap17.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) 100.0f);
        try {
            boolean b31 = fixedOrderComparator15.addAsEqual((java.lang.Object) defaultedMap22, (java.lang.Object) b30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap14.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b25 = defaultedMap23.equals((java.lang.Object) (short) 10);
        boolean b27 = defaultedMap23.equals((java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap14.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection29 = defaultedMap14.values();
        java.lang.Object[] obj_array30 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.lang.Object obj33 = defaultedMap5.put((java.lang.Object) defaultedMap14, (java.lang.Object) obj_array30);
        java.util.Collection collection34 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (short) 10);
        java.lang.Object obj40 = defaultedMap36.get((java.lang.Object) 2);
        java.lang.String str41 = defaultedMap36.toString();
        java.lang.Object[] obj_array42 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array42);
        boolean b45 = defaultedMap36.equals((java.lang.Object) fixedOrderComparator44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b49 = defaultedMap47.equals((java.lang.Object) (short) 10);
        boolean b51 = defaultedMap47.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b55 = defaultedMap53.equals((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap53.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate58, predicate59);
        java.util.Collection collection61 = defaultedMap53.values();
        java.lang.Object obj63 = defaultedMap47.put((java.lang.Object) defaultedMap53, (java.lang.Object) 1.0f);
        defaultedMap36.putAll((java.util.Map) defaultedMap53);
        boolean b66 = defaultedMap36.containsKey((java.lang.Object) ' ');
        java.util.Set set67 = defaultedMap36.entrySet();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) set67);
        defaultedMap5.clear();
        java.lang.Object obj70 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + true + "'", obj40.equals(true));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 10.0d + "'", obj70.equals(10.0d));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (-1.0d));
        java.util.Set set13 = defaultedMap8.entrySet();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap16.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) (-1));
        defaultedMap8.putAll((java.util.Map) defaultedMap16);
        java.lang.String str24 = defaultedMap8.toString();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        java.lang.Object obj35 = new java.lang.Object();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap38.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b49 = defaultedMap47.equals((java.lang.Object) (short) 10);
        boolean b51 = defaultedMap47.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection52 = defaultedMap47.values();
        defaultedMap38.putAll((java.util.Map) defaultedMap47);
        defaultedMap27.putAll((java.util.Map) defaultedMap38);
        java.lang.String str55 = defaultedMap38.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b59 = defaultedMap57.equals((java.lang.Object) (short) 10);
        boolean b61 = defaultedMap57.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b65 = defaultedMap63.equals((java.lang.Object) (short) 10);
        boolean b67 = defaultedMap63.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate68, predicate69);
        java.util.Collection collection71 = defaultedMap63.values();
        java.lang.Object obj73 = defaultedMap57.put((java.lang.Object) defaultedMap63, (java.lang.Object) 1.0f);
        java.util.Set set74 = defaultedMap57.entrySet();
        java.lang.Object obj75 = defaultedMap38.get((java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b79 = defaultedMap77.equals((java.lang.Object) (short) 10);
        java.lang.Object obj81 = defaultedMap77.get((java.lang.Object) 2);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate82, predicate83);
        java.lang.Object obj85 = defaultedMap38.remove((java.lang.Object) predicate83);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate25, predicate83);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + true + "'", obj22.equals(true));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + true + "'", obj75.equals(true));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + true + "'", obj81.equals(true));
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object obj3 = null;
        boolean b4 = fixedOrderComparator0.add(obj3);
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 1);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (short) 10);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) 2);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap14.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate19, predicate22);
        boolean b24 = defaultedMap2.containsKey((java.lang.Object) predicate22);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + true + "'", obj10.equals(true));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) 0);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection15 = defaultedMap10.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection24 = defaultedMap19.values();
        defaultedMap19.clear();
        java.lang.Object obj26 = defaultedMap1.put(obj17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (short) 10);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) 2);
        java.lang.String str33 = defaultedMap28.toString();
        java.lang.Object[] obj_array34 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array34);
        boolean b37 = defaultedMap28.equals((java.lang.Object) fixedOrderComparator36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b41 = defaultedMap39.equals((java.lang.Object) (short) 10);
        boolean b43 = defaultedMap39.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b47 = defaultedMap45.equals((java.lang.Object) (short) 10);
        boolean b49 = defaultedMap45.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate50, predicate51);
        java.util.Collection collection53 = defaultedMap45.values();
        java.lang.Object obj55 = defaultedMap39.put((java.lang.Object) defaultedMap45, (java.lang.Object) 1.0f);
        defaultedMap28.putAll((java.util.Map) defaultedMap45);
        boolean b58 = defaultedMap28.containsKey((java.lang.Object) ' ');
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) b58);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + true + "'", obj32.equals(true));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (-1.0d));
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Set set16 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b18 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator17);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + true + "'", obj11.equals(true));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + true + "'", obj13.equals(true));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.util.Collection collection9 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        int i6 = defaultedMap1.size();
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.lang.Object obj9 = new java.lang.Object();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection26 = defaultedMap21.values();
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) predicate29);
        collections.Transformer transformer31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + true + "'", obj30.equals(true));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        java.util.Collection collection35 = defaultedMap27.values();
        java.lang.Object obj37 = defaultedMap21.put((java.lang.Object) defaultedMap27, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap40.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate45, predicate46);
        java.util.Collection collection48 = defaultedMap40.values();
        java.lang.Object obj49 = defaultedMap1.get((java.lang.Object) defaultedMap40);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b54 = defaultedMap52.equals((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap52.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection57 = defaultedMap52.values();
        defaultedMap52.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b62 = defaultedMap60.equals((java.lang.Object) (short) 10);
        boolean b64 = defaultedMap60.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b68 = defaultedMap66.equals((java.lang.Object) (short) 10);
        boolean b70 = defaultedMap66.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate71, predicate72);
        java.util.Collection collection74 = defaultedMap66.values();
        java.lang.Object obj76 = defaultedMap60.put((java.lang.Object) defaultedMap66, (java.lang.Object) 1.0f);
        defaultedMap52.putAll((java.util.Map) defaultedMap66);
        boolean b78 = defaultedMap1.containsKey((java.lang.Object) defaultedMap52);
        java.util.Collection collection79 = defaultedMap52.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1.0f + "'", obj49.equals(1.0f));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(collection79);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (short) 10);
        boolean b17 = defaultedMap13.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (short) 10);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection27 = defaultedMap22.values();
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap30.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate35, predicate36);
        java.lang.Object obj38 = new java.lang.Object();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, obj38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (short) 10);
        boolean b45 = defaultedMap41.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b52 = defaultedMap50.equals((java.lang.Object) (short) 10);
        boolean b54 = defaultedMap50.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection55 = defaultedMap50.values();
        defaultedMap41.putAll((java.util.Map) defaultedMap50);
        defaultedMap30.putAll((java.util.Map) defaultedMap41);
        defaultedMap22.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b62 = defaultedMap60.equals((java.lang.Object) (short) 10);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) 2);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate65, predicate66);
        boolean b68 = defaultedMap41.containsValue((java.lang.Object) predicate66);
        java.lang.Object obj69 = defaultedMap1.put((java.lang.Object) obj_array10, (java.lang.Object) b68);
        boolean b70 = defaultedMap1.isEmpty();
        boolean b71 = defaultedMap1.isEmpty();
        java.lang.Object obj72 = null;
        java.lang.Object obj73 = defaultedMap1.get(obj72);
        boolean b74 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + true + "'", obj64.equals(true));
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 100 + "'", obj73.equals(100));
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (short) 10);
        boolean b22 = defaultedMap18.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection23 = defaultedMap18.values();
        defaultedMap9.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection32 = defaultedMap27.values();
        defaultedMap27.clear();
        java.lang.Object obj34 = defaultedMap9.put(obj25, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        defaultedMap1.putAll((java.util.Map) defaultedMap35);
        java.util.Set set37 = defaultedMap35.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) false);
        defaultedMap11.clear();
        boolean b15 = defaultedMap11.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        java.util.Set set9 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (short) 10);
        boolean b21 = defaultedMap17.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        java.util.Collection collection25 = defaultedMap17.values();
        java.lang.Object obj27 = defaultedMap11.put((java.lang.Object) defaultedMap17, (java.lang.Object) 1.0f);
        java.lang.Object obj28 = defaultedMap4.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b33 = defaultedMap31.equals((java.lang.Object) (short) 10);
        boolean b35 = defaultedMap31.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate36, predicate37);
        java.lang.Object obj39 = new java.lang.Object();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, obj39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b44 = defaultedMap42.equals((java.lang.Object) (short) 10);
        boolean b46 = defaultedMap42.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate47, predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b53 = defaultedMap51.equals((java.lang.Object) (short) 10);
        boolean b55 = defaultedMap51.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection56 = defaultedMap51.values();
        defaultedMap42.putAll((java.util.Map) defaultedMap51);
        defaultedMap31.putAll((java.util.Map) defaultedMap42);
        java.lang.String str59 = defaultedMap42.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b63 = defaultedMap61.equals((java.lang.Object) (short) 10);
        boolean b65 = defaultedMap61.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b69 = defaultedMap67.equals((java.lang.Object) (short) 10);
        boolean b71 = defaultedMap67.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate72, predicate73);
        java.util.Collection collection75 = defaultedMap67.values();
        java.lang.Object obj77 = defaultedMap61.put((java.lang.Object) defaultedMap67, (java.lang.Object) 1.0f);
        java.util.Set set78 = defaultedMap61.entrySet();
        java.lang.Object obj79 = defaultedMap42.get((java.lang.Object) defaultedMap61);
        java.lang.Object obj80 = defaultedMap1.get((java.lang.Object) defaultedMap42);
        java.util.Set set81 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + true + "'", obj79.equals(true));
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (short) 10 + "'", obj80.equals((short) 10));
        org.junit.Assert.assertNotNull(set81);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (short) 10);
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap11.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b17 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) b17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) b17);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 2);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) "", obj7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.lang.Object obj9 = new java.lang.Object();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection26 = defaultedMap21.values();
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (short) 10);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) 2);
        java.lang.String str35 = defaultedMap30.toString();
        java.lang.Object[] obj_array36 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array36);
        boolean b39 = defaultedMap30.equals((java.lang.Object) fixedOrderComparator38);
        boolean b41 = fixedOrderComparator38.add((java.lang.Object) ' ');
        boolean b42 = fixedOrderComparator38.isLocked();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b45 = fixedOrderComparator38.add((java.lang.Object) true);
        boolean b46 = fixedOrderComparator38.isLocked();
        boolean b47 = defaultedMap1.containsKey((java.lang.Object) fixedOrderComparator38);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + true + "'", obj34.equals(true));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b2 = fixedOrderComparator1.isLocked();
        boolean b4 = fixedOrderComparator1.add((java.lang.Object) (byte) 10);
        boolean b5 = fixedOrderComparator1.isLocked();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj18 = defaultedMap7.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set19 = defaultedMap7.keySet();
        boolean b20 = fixedOrderComparator1.add((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.lang.Object obj9 = new java.lang.Object();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        java.util.Collection collection20 = defaultedMap12.values();
        defaultedMap12.clear();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator24.isLocked();
        boolean b26 = defaultedMap12.equals((java.lang.Object) fixedOrderComparator24);
        java.util.Collection collection27 = defaultedMap12.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        java.util.Set set29 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate9, predicate10);
        java.lang.Object obj12 = new java.lang.Object();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.util.Collection collection23 = defaultedMap15.values();
        defaultedMap15.clear();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        boolean b28 = fixedOrderComparator27.isLocked();
        boolean b29 = defaultedMap15.equals((java.lang.Object) fixedOrderComparator27);
        java.util.Collection collection30 = defaultedMap15.values();
        defaultedMap4.putAll((java.util.Map) defaultedMap15);
        boolean b32 = defaultedMap15.isEmpty();
        boolean b33 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b37 = defaultedMap35.equals((java.lang.Object) (short) 10);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) 2);
        java.lang.String str40 = defaultedMap35.toString();
        java.lang.Object[] obj_array41 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b44 = defaultedMap35.equals((java.lang.Object) fixedOrderComparator43);
        boolean b46 = fixedOrderComparator43.add((java.lang.Object) ' ');
        boolean b47 = fixedOrderComparator43.isLocked();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b51 = defaultedMap49.equals((java.lang.Object) (short) 10);
        boolean b53 = defaultedMap49.equals((java.lang.Object) (-1.0d));
        java.util.Set set54 = defaultedMap49.keySet();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b58 = defaultedMap56.equals((java.lang.Object) (short) 10);
        boolean b60 = defaultedMap56.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b64 = defaultedMap62.equals((java.lang.Object) (short) 10);
        boolean b66 = defaultedMap62.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate67, predicate68);
        java.util.Collection collection70 = defaultedMap62.values();
        java.lang.Object obj72 = defaultedMap56.put((java.lang.Object) defaultedMap62, (java.lang.Object) 1.0f);
        java.lang.Object obj73 = defaultedMap49.get((java.lang.Object) defaultedMap62);
        boolean b74 = fixedOrderComparator43.add((java.lang.Object) defaultedMap62);
        try {
            boolean b75 = fixedOrderComparator1.addAsEqual((java.lang.Object) defaultedMap15, (java.lang.Object) fixedOrderComparator43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + true + "'", obj39.equals(true));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + true + "'", obj73.equals(true));
        org.junit.Assert.assertTrue(b74 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set13 = defaultedMap1.keySet();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        fixedOrderComparator17.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap21);
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) fixedOrderComparator17, (java.lang.Object) defaultedMap21);
        boolean b24 = defaultedMap21.isEmpty();
        java.lang.String str25 = defaultedMap21.toString();
        java.lang.String str26 = defaultedMap21.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.lang.Object obj23 = new java.lang.Object();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b28 = defaultedMap26.equals((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap26.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b37 = defaultedMap35.equals((java.lang.Object) (short) 10);
        boolean b39 = defaultedMap35.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection40 = defaultedMap35.values();
        defaultedMap26.putAll((java.util.Map) defaultedMap35);
        defaultedMap15.putAll((java.util.Map) defaultedMap26);
        java.lang.String str43 = defaultedMap26.toString();
        boolean b44 = defaultedMap1.containsValue((java.lang.Object) str43);
        java.util.Set set45 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate13);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) 1.0f);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        java.util.Collection collection35 = defaultedMap27.values();
        java.lang.Object obj37 = defaultedMap21.put((java.lang.Object) defaultedMap27, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap40.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate45, predicate46);
        java.util.Collection collection48 = defaultedMap40.values();
        java.lang.Object obj49 = defaultedMap1.get((java.lang.Object) defaultedMap40);
        java.util.Collection collection50 = defaultedMap40.values();
        java.util.Set set51 = defaultedMap40.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1.0f + "'", obj49.equals(1.0f));
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (short) 10);
        boolean b18 = defaultedMap14.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate19, predicate20);
        java.util.Collection collection22 = defaultedMap14.values();
        java.lang.Object obj24 = defaultedMap8.put((java.lang.Object) defaultedMap14, (java.lang.Object) 1.0f);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) 2);
        java.lang.String str32 = defaultedMap27.toString();
        java.lang.Object[] obj_array33 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b36 = defaultedMap27.equals((java.lang.Object) fixedOrderComparator35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (short) 10);
        boolean b48 = defaultedMap44.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate49, predicate50);
        java.util.Collection collection52 = defaultedMap44.values();
        java.lang.Object obj54 = defaultedMap38.put((java.lang.Object) defaultedMap44, (java.lang.Object) 1.0f);
        defaultedMap27.putAll((java.util.Map) defaultedMap44);
        boolean b57 = defaultedMap27.containsKey((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b61 = defaultedMap59.equals((java.lang.Object) (short) 10);
        boolean b63 = defaultedMap59.equals((java.lang.Object) (-1.0d));
        java.util.Set set64 = defaultedMap59.keySet();
        java.lang.String str65 = defaultedMap59.toString();
        java.lang.Object obj66 = defaultedMap27.remove((java.lang.Object) defaultedMap59);
        java.lang.Object obj67 = defaultedMap14.get(obj66);
        java.util.Set set68 = defaultedMap14.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + true + "'", obj25.equals(true));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + true + "'", obj31.equals(true));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + true + "'", obj67.equals(true));
        org.junit.Assert.assertNotNull(set68);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        defaultedMap1.clear();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        boolean b14 = fixedOrderComparator13.isLocked();
        boolean b15 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator13);
        int i16 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (short) 10);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.util.Collection collection23 = defaultedMap15.values();
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) defaultedMap15, (java.lang.Object) 1.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap1.get(obj27);
        boolean b29 = defaultedMap1.isEmpty();
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.String str32 = defaultedMap1.toString();
        java.lang.Object[] obj_array33 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) fixedOrderComparator34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap38.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.lang.Object obj46 = new java.lang.Object();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, obj46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b51 = defaultedMap49.equals((java.lang.Object) (short) 10);
        boolean b53 = defaultedMap49.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        java.util.Collection collection57 = defaultedMap49.values();
        defaultedMap49.clear();
        java.lang.Object[] obj_array60 = new java.lang.Object[] { 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        boolean b62 = fixedOrderComparator61.isLocked();
        boolean b63 = defaultedMap49.equals((java.lang.Object) fixedOrderComparator61);
        java.util.Collection collection64 = defaultedMap49.values();
        defaultedMap38.putAll((java.util.Map) defaultedMap49);
        boolean b66 = defaultedMap49.isEmpty();
        boolean b67 = defaultedMap49.isEmpty();
        java.lang.Object obj68 = defaultedMap1.get((java.lang.Object) b67);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + true + "'", obj31.equals(true));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + true + "'", obj68.equals(true));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (short) 10);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        defaultedMap9.putAll((java.util.Map) defaultedMap12);
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) 2);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b27 = defaultedMap25.equals((java.lang.Object) (short) 10);
        boolean b29 = defaultedMap25.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate30, predicate31);
        java.lang.Object obj33 = new java.lang.Object();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, obj33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap36.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b47 = defaultedMap45.equals((java.lang.Object) (short) 10);
        boolean b49 = defaultedMap45.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection50 = defaultedMap45.values();
        defaultedMap36.putAll((java.util.Map) defaultedMap45);
        defaultedMap25.putAll((java.util.Map) defaultedMap36);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj54 = defaultedMap25.get((java.lang.Object) predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate21, predicate53);
        boolean b56 = fixedOrderComparator0.add((java.lang.Object) map55);
        collections.Transformer transformer57 = null;
        try {
            java.util.Map map58 = collections.map.DefaultedMap.decorate(map55, transformer57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + true + "'", obj20.equals(true));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + true + "'", obj54.equals(true));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.lang.Object obj9 = new java.lang.Object();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (short) 10);
        boolean b20 = defaultedMap16.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (short) 10);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (short) 10);
        boolean b40 = defaultedMap36.containsKey((java.lang.Object) (byte) 1);
        java.util.Collection collection41 = defaultedMap36.values();
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        defaultedMap16.putAll((java.util.Map) defaultedMap27);
        java.lang.String str44 = defaultedMap27.toString();
        boolean b46 = defaultedMap27.containsValue((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b50 = defaultedMap48.equals((java.lang.Object) (short) 10);
        boolean b52 = defaultedMap48.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b56 = defaultedMap54.equals((java.lang.Object) (short) 10);
        boolean b58 = defaultedMap54.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate59, predicate60);
        java.util.Collection collection62 = defaultedMap54.values();
        java.lang.Object obj64 = defaultedMap48.put((java.lang.Object) defaultedMap54, (java.lang.Object) 1.0f);
        boolean b66 = defaultedMap48.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b70 = defaultedMap68.equals((java.lang.Object) (short) 10);
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b76 = defaultedMap74.equals((java.lang.Object) (short) 10);
        boolean b78 = defaultedMap74.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate79, predicate80);
        java.util.Collection collection82 = defaultedMap74.values();
        java.lang.Object obj84 = defaultedMap68.put((java.lang.Object) defaultedMap74, (java.lang.Object) 1.0f);
        defaultedMap48.putAll((java.util.Map) defaultedMap74);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj87 = defaultedMap27.put((java.lang.Object) defaultedMap74, (java.lang.Object) predicate86);
        boolean b88 = defaultedMap12.containsKey((java.lang.Object) predicate86);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(b88 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b5 = defaultedMap3.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap3.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap3.values();
        java.lang.Object obj14 = defaultedMap3.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set15 = defaultedMap3.keySet();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { set15 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b18 = fixedOrderComparator1.add((java.lang.Object) fixedOrderComparator17);
        int i19 = fixedOrderComparator1.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (short) 10);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) 2);
        java.lang.String str26 = defaultedMap21.toString();
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b30 = defaultedMap21.equals((java.lang.Object) fixedOrderComparator29);
        boolean b32 = fixedOrderComparator29.add((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b36 = defaultedMap34.equals((java.lang.Object) (short) 10);
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (short) 10);
        boolean b44 = defaultedMap40.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate45, predicate46);
        java.util.Collection collection48 = defaultedMap40.values();
        java.lang.Object obj50 = defaultedMap34.put((java.lang.Object) defaultedMap40, (java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b56 = defaultedMap54.equals((java.lang.Object) (short) 10);
        boolean b58 = defaultedMap54.containsKey((java.lang.Object) (byte) 1);
        java.lang.Object obj59 = defaultedMap52.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b63 = defaultedMap61.equals((java.lang.Object) (short) 10);
        boolean b65 = defaultedMap61.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate66, predicate67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b72 = defaultedMap70.equals((java.lang.Object) (short) 10);
        boolean b74 = defaultedMap70.equals((java.lang.Object) (-1.0d));
        boolean b75 = defaultedMap61.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection76 = defaultedMap61.values();
        java.lang.Object[] obj_array77 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator79 = new collections.comparators.FixedOrderComparator(obj_array77);
        java.lang.Object obj80 = defaultedMap52.put((java.lang.Object) defaultedMap61, (java.lang.Object) obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator(obj_array77);
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array77);
        collections.comparators.FixedOrderComparator fixedOrderComparator84 = new collections.comparators.FixedOrderComparator(obj_array77);
        try {
            boolean b85 = fixedOrderComparator1.addAsEqual((java.lang.Object) b32, (java.lang.Object) obj_array77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + true + "'", obj25.equals(true));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNotNull(obj_array77);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap9.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate14, predicate15);
        java.util.Collection collection17 = defaultedMap9.values();
        java.lang.Object obj20 = defaultedMap9.put((java.lang.Object) (byte) -1, (java.lang.Object) 0);
        java.util.Set set21 = defaultedMap9.keySet();
        java.lang.Object[] obj_array22 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator25.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap29);
        java.lang.Object obj31 = defaultedMap9.put((java.lang.Object) fixedOrderComparator25, (java.lang.Object) defaultedMap29);
        java.lang.Object obj32 = defaultedMap1.remove((java.lang.Object) fixedOrderComparator25);
        java.lang.Object[] obj_array33 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator35);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (short) 10);
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (short) 10);
        boolean b15 = defaultedMap11.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b17 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) b17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (short) 10);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b28 = defaultedMap26.equals((java.lang.Object) (short) 10);
        boolean b30 = defaultedMap26.equals((java.lang.Object) (-1.0d));
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        java.util.Collection collection34 = defaultedMap26.values();
        java.lang.Object obj36 = defaultedMap20.put((java.lang.Object) defaultedMap26, (java.lang.Object) 1.0f);
        boolean b38 = defaultedMap20.containsKey((java.lang.Object) 'a');
        boolean b40 = defaultedMap20.containsValue((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + true + "'", obj41.equals(true));
    }
}

