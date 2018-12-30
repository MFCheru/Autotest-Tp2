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
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object obj2 = null;
        try {
            int i4 = fixedOrderComparator0.compare(obj2, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        try {
            boolean b4 = fixedOrderComparator0.addAsEqual((java.lang.Object) (-1L), (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
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
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        try {
            int i6 = fixedOrderComparator1.compare(obj2, (java.lang.Object) defaultedMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj2 = null;
        try {
            int i3 = fixedOrderComparator0.compare((java.lang.Object) (-1), obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            int i3 = fixedOrderComparator0.compare((java.lang.Object) 0L, (java.lang.Object) false);
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
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        java.util.Map map5 = null;
        try {
            defaultedMap2.putAll(map5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
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
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        boolean b6 = defaultedMap2.containsValue((java.lang.Object) (byte) -1);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap5.get(obj6);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) 10L);
        java.lang.Object obj12 = null;
        try {
            int i13 = fixedOrderComparator1.compare((java.lang.Object) defaultedMap5, obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (-1L));
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate(map9, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (-1L));
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate10, predicate11);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (-1L));
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate10, predicate11);
        boolean b14 = defaultedMap2.equals((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Set set8 = defaultedMap2.keySet();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (-1L));
        java.lang.Object obj11 = defaultedMap2.get((java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) (byte) 1);
        int i10 = defaultedMap2.size();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap2.get((java.lang.Object) 10L);
        boolean b10 = defaultedMap2.containsKey((java.lang.Object) "{}");
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) true);
        defaultedMap9.clear();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10L);
        java.util.Set set15 = defaultedMap9.keySet();
        java.util.Set set16 = defaultedMap9.keySet();
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap2.get(obj18);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Set set8 = defaultedMap2.keySet();
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap11.get(obj12);
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate16, predicate17);
        java.util.Collection collection19 = defaultedMap11.values();
        java.lang.Object obj20 = defaultedMap2.get((java.lang.Object) collection19);
        boolean b21 = defaultedMap2.isEmpty();
        java.util.Set set22 = defaultedMap2.keySet();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection7 = defaultedMap2.values();
        int i8 = defaultedMap2.size();
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) true);
        defaultedMap11.clear();
        boolean b16 = defaultedMap11.containsKey((java.lang.Object) 10L);
        java.util.Set set17 = defaultedMap11.keySet();
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap20.get(obj21);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        java.util.Collection collection28 = defaultedMap20.values();
        java.lang.Object obj29 = defaultedMap11.get((java.lang.Object) collection28);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) defaultedMap11);
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap9.get(obj10);
        boolean b12 = defaultedMap2.containsValue(obj11);
        java.lang.Object[] obj_array13 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap15.get(obj16);
        boolean b19 = defaultedMap15.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection20 = defaultedMap15.values();
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) true);
        defaultedMap23.clear();
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 10L);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (-1L));
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate32);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate32);
        java.lang.Object[] obj_array35 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator36);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) true);
        defaultedMap37.clear();
        boolean b42 = defaultedMap37.containsKey((java.lang.Object) 10L);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (-1L));
        collections.Predicate predicate45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate32, predicate46);
        collections.Factory factory49 = null;
        try {
            java.util.Map map50 = collections.map.DefaultedMap.decorate(map48, factory49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Map map0 = null;
        java.lang.Object[] obj_array1 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator2);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap3.get(obj4);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap3.values();
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) collection11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        boolean b6 = defaultedMap2.containsValue((java.lang.Object) (byte) -1);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        java.util.Collection collection8 = defaultedMap2.values();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj13 = defaultedMap2.remove((java.lang.Object) fixedOrderComparator11);
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator15);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap16.get(obj17);
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap23.get(obj24);
        boolean b26 = defaultedMap16.containsValue(obj25);
        java.util.Set set27 = defaultedMap16.keySet();
        java.lang.Object[] obj_array28 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator29);
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap30.get(obj31);
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj36 = defaultedMap30.get((java.lang.Object) 10L);
        try {
            int i37 = fixedOrderComparator11.compare((java.lang.Object) set27, (java.lang.Object) defaultedMap30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Set set8 = defaultedMap2.keySet();
        java.util.Set set9 = defaultedMap2.keySet();
        java.lang.Object obj11 = defaultedMap2.remove((java.lang.Object) 0.0f);
        int i12 = defaultedMap2.size();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) true);
        defaultedMap9.clear();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10L);
        java.util.Set set15 = defaultedMap9.keySet();
        java.util.Set set16 = defaultedMap9.keySet();
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) true);
        defaultedMap20.clear();
        boolean b25 = defaultedMap20.containsKey((java.lang.Object) 10L);
        java.lang.Object obj27 = defaultedMap20.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set30 = defaultedMap29.keySet();
        java.lang.Object[] obj_array31 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) true);
        defaultedMap33.clear();
        boolean b38 = defaultedMap33.containsKey((java.lang.Object) 10L);
        java.util.Set set39 = defaultedMap33.keySet();
        java.util.Set set40 = defaultedMap33.keySet();
        java.lang.Object obj42 = defaultedMap33.remove((java.lang.Object) 0.0f);
        defaultedMap29.putAll((java.util.Map) defaultedMap33);
        defaultedMap20.putAll((java.util.Map) defaultedMap33);
        defaultedMap2.putAll((java.util.Map) defaultedMap33);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        boolean b7 = defaultedMap2.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) predicate16);
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj21 = defaultedMap10.remove((java.lang.Object) fixedOrderComparator19);
        fixedOrderComparator19.setUnknownObjectBehavior(0);
        boolean b24 = defaultedMap2.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        try {
            fixedOrderComparator1.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator3.isLocked();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) b5);
        int i7 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.get(obj11);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap9.get(obj10);
        boolean b12 = defaultedMap2.containsValue(obj11);
        java.lang.Object[] obj_array13 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap15.get(obj16);
        boolean b19 = defaultedMap15.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection20 = defaultedMap15.values();
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) true);
        defaultedMap23.clear();
        boolean b28 = defaultedMap23.containsKey((java.lang.Object) 10L);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) (-1L));
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate32);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) predicate32);
        java.lang.Object[] obj_array35 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator36);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) true);
        defaultedMap37.clear();
        boolean b42 = defaultedMap37.containsKey((java.lang.Object) 10L);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (-1L));
        collections.Predicate predicate45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate32, predicate46);
        boolean b49 = defaultedMap2.isEmpty();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        java.lang.String str10 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i13 = defaultedMap12.size();
        boolean b14 = defaultedMap2.containsValue((java.lang.Object) defaultedMap12);
        int i15 = defaultedMap12.size();
        java.util.Set set16 = defaultedMap12.entrySet();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        java.lang.String str10 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i13 = defaultedMap12.size();
        boolean b14 = defaultedMap2.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object[] obj_array15 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) true);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj24 = defaultedMap17.get((java.lang.Object) predicate23);
        boolean b26 = defaultedMap17.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap29.get(obj30);
        boolean b33 = defaultedMap29.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array34 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator35);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) true);
        defaultedMap36.clear();
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) 10L);
        java.util.Set set42 = defaultedMap36.keySet();
        java.util.Set set43 = defaultedMap36.keySet();
        defaultedMap29.putAll((java.util.Map) defaultedMap36);
        java.util.Collection collection45 = defaultedMap36.values();
        java.lang.Object[] obj_array46 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator47);
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap48.get(obj49);
        boolean b52 = defaultedMap48.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate53 = null;
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        java.lang.Object obj56 = defaultedMap17.put((java.lang.Object) collection45, (java.lang.Object) map55);
        boolean b57 = defaultedMap2.containsKey((java.lang.Object) map55);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap2.get((java.lang.Object) 10L);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj10 = defaultedMap2.get((java.lang.Object) predicate9);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj13 = defaultedMap2.remove((java.lang.Object) fixedOrderComparator11);
        fixedOrderComparator11.setUnknownObjectBehavior(0);
        boolean b16 = fixedOrderComparator11.isLocked();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i2 = defaultedMap1.size();
        java.lang.Object[] obj_array3 = new java.lang.Object[] { i2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator7);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap8.get(obj9);
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array13 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap15.get(obj16);
        boolean b18 = defaultedMap8.containsValue(obj17);
        java.lang.Object[] obj_array19 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator20);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap21.get(obj22);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection26 = defaultedMap21.values();
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) true);
        defaultedMap29.clear();
        boolean b34 = defaultedMap29.containsKey((java.lang.Object) 10L);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (-1L));
        collections.Predicate predicate37 = null;
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate37, predicate38);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) predicate38);
        java.lang.Object[] obj_array41 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator42);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) true);
        defaultedMap43.clear();
        boolean b48 = defaultedMap43.containsKey((java.lang.Object) 10L);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) (-1L));
        collections.Predicate predicate51 = null;
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate38, predicate52);
        java.lang.Object[] obj_array55 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator56);
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap57.get(obj58);
        boolean b61 = defaultedMap57.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate62 = null;
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate62, predicate63);
        java.lang.Object[] obj_array65 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator66);
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap67.get(obj68);
        boolean b71 = defaultedMap67.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate72 = null;
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate72, predicate73);
        java.util.Collection collection75 = defaultedMap67.values();
        java.lang.Object obj76 = defaultedMap57.get((java.lang.Object) defaultedMap67);
        try {
            int i77 = fixedOrderComparator4.compare((java.lang.Object) predicate38, obj76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(obj76);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        java.lang.String str10 = defaultedMap2.toString();
        java.util.Set set11 = defaultedMap2.keySet();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        java.lang.String str10 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i13 = defaultedMap12.size();
        boolean b14 = defaultedMap2.containsValue((java.lang.Object) defaultedMap12);
        int i15 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection18 = defaultedMap17.values();
        defaultedMap12.putAll((java.util.Map) defaultedMap17);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap2.get((java.lang.Object) 10L);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap2.remove(obj9);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        boolean b6 = defaultedMap2.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set7 = defaultedMap2.keySet();
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.get(obj11);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate15, predicate16);
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap20.get(obj21);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection25 = defaultedMap20.values();
        int i26 = defaultedMap20.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj29 = defaultedMap20.get((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array30 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) true);
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set37 = defaultedMap32.keySet();
        boolean b38 = defaultedMap20.containsKey((java.lang.Object) set37);
        java.lang.Object obj39 = defaultedMap2.get((java.lang.Object) defaultedMap20);
        int i40 = defaultedMap20.size();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue(i40 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i2 = defaultedMap1.size();
        java.lang.Object[] obj_array3 = new java.lang.Object[] { i2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object obj5 = null;
        boolean b6 = fixedOrderComparator4.add(obj5);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator3.isLocked();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) b5);
        int i7 = fixedOrderComparator0.getUnknownObjectBehavior();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        java.lang.String str10 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i13 = defaultedMap12.size();
        boolean b14 = defaultedMap2.containsValue((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set17 = defaultedMap16.keySet();
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) true);
        defaultedMap20.clear();
        boolean b25 = defaultedMap20.containsKey((java.lang.Object) 10L);
        java.util.Set set26 = defaultedMap20.keySet();
        java.util.Set set27 = defaultedMap20.keySet();
        java.lang.Object obj29 = defaultedMap20.remove((java.lang.Object) 0.0f);
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        java.util.Set set31 = defaultedMap20.entrySet();
        java.lang.Object[] obj_array32 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) true);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj41 = defaultedMap34.get((java.lang.Object) predicate40);
        boolean b43 = defaultedMap34.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array44 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator45);
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap46.get(obj47);
        boolean b50 = defaultedMap46.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate51 = null;
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate51, predicate52);
        java.lang.Object[] obj_array54 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator55);
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap56.get(obj57);
        boolean b60 = defaultedMap56.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate61 = null;
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate61, predicate62);
        java.util.Collection collection64 = defaultedMap56.values();
        java.lang.Object obj65 = defaultedMap46.get((java.lang.Object) defaultedMap56);
        defaultedMap34.putAll((java.util.Map) defaultedMap56);
        java.lang.Object obj68 = defaultedMap34.get((java.lang.Object) 100L);
        java.lang.Object obj69 = defaultedMap20.remove((java.lang.Object) defaultedMap34);
        defaultedMap2.putAll((java.util.Map) defaultedMap34);
        java.util.Set set71 = defaultedMap34.keySet();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set71);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate(map7, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate7, predicate8);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap12.get(obj13);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        java.util.Collection collection20 = defaultedMap12.values();
        java.lang.Object obj21 = defaultedMap2.get((java.lang.Object) defaultedMap12);
        java.util.Set set22 = defaultedMap2.keySet();
        java.util.Set set23 = defaultedMap2.keySet();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        java.lang.String str10 = defaultedMap2.toString();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) 'a');
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 100.0d);
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) true);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap19.get((java.lang.Object) predicate25);
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) true);
        defaultedMap29.clear();
        boolean b34 = defaultedMap29.containsKey((java.lang.Object) 10L);
        java.util.Set set35 = defaultedMap29.keySet();
        java.lang.Object[] obj_array36 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap38.get(obj39);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Collection collection46 = defaultedMap38.values();
        java.lang.Object obj47 = defaultedMap29.get((java.lang.Object) collection46);
        boolean b48 = defaultedMap29.isEmpty();
        java.util.Set set49 = defaultedMap29.keySet();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { predicate25, defaultedMap29, false };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        boolean b53 = defaultedMap1.containsValue((java.lang.Object) obj_array51);
        java.lang.Object[] obj_array54 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator55);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) true);
        defaultedMap56.clear();
        boolean b61 = defaultedMap56.containsKey((java.lang.Object) 10L);
        java.lang.Object[] obj_array62 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator63);
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap64.get(obj65);
        boolean b68 = defaultedMap64.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj70 = defaultedMap64.get((java.lang.Object) 10L);
        defaultedMap64.clear();
        java.lang.Object[] obj_array72 = new java.lang.Object[] { defaultedMap56, defaultedMap64 };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        java.lang.Object obj74 = defaultedMap1.get((java.lang.Object) fixedOrderComparator73);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 1.0f + "'", obj74.equals(1.0f));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        boolean b11 = defaultedMap2.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array12 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap14.get((java.lang.Object) predicate20);
        java.lang.String str22 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i25 = defaultedMap24.size();
        boolean b26 = defaultedMap14.containsValue((java.lang.Object) defaultedMap24);
        boolean b27 = defaultedMap2.equals((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i2 = defaultedMap1.size();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap5.get(obj6);
        boolean b9 = defaultedMap5.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) true);
        defaultedMap12.clear();
        boolean b17 = defaultedMap12.containsKey((java.lang.Object) 10L);
        java.util.Set set18 = defaultedMap12.keySet();
        java.util.Set set19 = defaultedMap12.keySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap5.get(obj21);
        java.lang.Object[] obj_array23 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) true);
        defaultedMap25.clear();
        boolean b30 = defaultedMap25.containsKey((java.lang.Object) 10L);
        java.lang.Object obj31 = defaultedMap5.get((java.lang.Object) defaultedMap25);
        java.lang.Object[] obj_array32 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) true);
        boolean b38 = defaultedMap34.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set39 = defaultedMap34.keySet();
        boolean b40 = defaultedMap34.isEmpty();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) b40);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        boolean b10 = defaultedMap2.containsKey((java.lang.Object) fixedOrderComparator8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i13 = defaultedMap12.size();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { i13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b17 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator16);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) true);
        defaultedMap9.clear();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10L);
        java.util.Set set15 = defaultedMap9.keySet();
        java.util.Set set16 = defaultedMap9.keySet();
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap2.get(obj18);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) true);
        defaultedMap22.clear();
        boolean b27 = defaultedMap22.containsKey((java.lang.Object) 10L);
        java.lang.Object obj28 = defaultedMap2.get((java.lang.Object) defaultedMap22);
        java.lang.Object[] obj_array29 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator30);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap31.get(obj32);
        boolean b35 = defaultedMap31.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection36 = defaultedMap31.values();
        defaultedMap2.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj38 = null;
        boolean b39 = defaultedMap2.containsValue(obj38);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Set set8 = defaultedMap2.keySet();
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap11.get(obj12);
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate16, predicate17);
        java.util.Collection collection19 = defaultedMap11.values();
        java.lang.Object obj20 = defaultedMap2.get((java.lang.Object) collection19);
        java.lang.String str21 = defaultedMap2.toString();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i2 = defaultedMap1.size();
        java.lang.Object[] obj_array3 = new java.lang.Object[] { i2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i6 = fixedOrderComparator5.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection7 = defaultedMap2.values();
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) true);
        defaultedMap10.clear();
        boolean b15 = defaultedMap10.containsKey((java.lang.Object) 10L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (-1L));
        collections.Predicate predicate18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate19);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) predicate19);
        java.lang.Object[] obj_array22 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) true);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj31 = defaultedMap24.get((java.lang.Object) predicate30);
        java.lang.String str32 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i35 = defaultedMap34.size();
        boolean b36 = defaultedMap24.containsValue((java.lang.Object) defaultedMap34);
        boolean b37 = defaultedMap2.containsKey((java.lang.Object) defaultedMap24);
        int i38 = defaultedMap24.size();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap2);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        java.util.Set set5 = defaultedMap2.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set8 = defaultedMap7.keySet();
        boolean b9 = defaultedMap2.equals((java.lang.Object) defaultedMap7);
        java.util.Collection collection10 = defaultedMap2.values();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        boolean b3 = fixedOrderComparator1.add((java.lang.Object) 10L);
        int i4 = fixedOrderComparator1.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) true);
        defaultedMap9.clear();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10L);
        java.util.Set set15 = defaultedMap9.keySet();
        java.util.Set set16 = defaultedMap9.keySet();
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap2.get(obj18);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) true);
        defaultedMap22.clear();
        boolean b27 = defaultedMap22.containsKey((java.lang.Object) 10L);
        java.lang.Object obj28 = defaultedMap2.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap22.get(obj29);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.get(obj11);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) 10L);
        defaultedMap10.clear();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { defaultedMap2, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array18);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj_array18);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj13 = defaultedMap2.remove((java.lang.Object) fixedOrderComparator11);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Set set8 = defaultedMap2.keySet();
        java.util.Set set9 = defaultedMap2.keySet();
        java.util.Set set10 = defaultedMap2.entrySet();
        java.lang.Object[] obj_array11 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) true);
        defaultedMap13.clear();
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 10L);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) (-1L));
        defaultedMap2.putAll(map20);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) 'a');
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 100.0d);
        java.util.Collection collection17 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.get(obj11);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) 10L);
        defaultedMap10.clear();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { defaultedMap2, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        boolean b21 = fixedOrderComparator19.add((java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate7, predicate8);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap12.get(obj13);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        java.util.Collection collection20 = defaultedMap12.values();
        java.lang.Object obj21 = defaultedMap2.get((java.lang.Object) defaultedMap12);
        java.util.Set set22 = defaultedMap2.keySet();
        java.lang.Object obj24 = defaultedMap2.remove((java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (-1L));
        defaultedMap2.clear();
        java.lang.Object[] obj_array11 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) true);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap13.get((java.lang.Object) predicate19);
        java.lang.String str21 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i24 = defaultedMap23.size();
        boolean b25 = defaultedMap13.containsValue((java.lang.Object) defaultedMap23);
        boolean b26 = defaultedMap2.equals((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        boolean b10 = defaultedMap2.containsKey((java.lang.Object) fixedOrderComparator8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i13 = defaultedMap12.size();
        java.lang.String str14 = defaultedMap12.toString();
        try {
            boolean b16 = fixedOrderComparator8.addAsEqual((java.lang.Object) defaultedMap12, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) true);
        defaultedMap9.clear();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10L);
        java.util.Set set15 = defaultedMap9.keySet();
        java.util.Set set16 = defaultedMap9.keySet();
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        defaultedMap2.clear();
        java.lang.Object[] obj_array19 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator20);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap21.get(obj22);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) true);
        defaultedMap28.clear();
        boolean b33 = defaultedMap28.containsKey((java.lang.Object) 10L);
        java.util.Set set34 = defaultedMap28.keySet();
        java.util.Set set35 = defaultedMap28.keySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap21.get(obj37);
        java.lang.Object[] obj_array39 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator40);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) true);
        defaultedMap41.clear();
        boolean b46 = defaultedMap41.containsKey((java.lang.Object) 10L);
        java.lang.Object obj47 = defaultedMap21.get((java.lang.Object) defaultedMap41);
        java.lang.Object[] obj_array48 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) true);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate53, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj57 = defaultedMap50.get((java.lang.Object) predicate56);
        boolean b59 = defaultedMap50.containsKey((java.lang.Object) 'a');
        java.lang.Object obj60 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.Object obj61 = defaultedMap2.remove((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) true);
        defaultedMap9.clear();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10L);
        java.util.Set set15 = defaultedMap9.keySet();
        java.util.Set set16 = defaultedMap9.keySet();
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap2.get(obj18);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap22.get(obj23);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator28);
        boolean b30 = defaultedMap22.containsKey((java.lang.Object) fixedOrderComparator28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) fixedOrderComparator28);
        collections.Factory factory32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (-1L));
        defaultedMap2.clear();
        java.util.Set set11 = defaultedMap2.keySet();
        java.util.Set set12 = defaultedMap2.entrySet();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate7, predicate8);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap12.get(obj13);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        java.util.Collection collection20 = defaultedMap12.values();
        java.lang.Object obj21 = defaultedMap2.get((java.lang.Object) defaultedMap12);
        java.util.Set set22 = defaultedMap2.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set25 = defaultedMap24.keySet();
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) true);
        defaultedMap28.clear();
        boolean b33 = defaultedMap28.containsKey((java.lang.Object) 10L);
        java.util.Set set34 = defaultedMap28.keySet();
        java.util.Set set35 = defaultedMap28.keySet();
        java.lang.Object obj37 = defaultedMap28.remove((java.lang.Object) 0.0f);
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        java.util.Set set39 = defaultedMap28.entrySet();
        boolean b40 = defaultedMap2.containsKey((java.lang.Object) defaultedMap28);
        java.lang.Object[] obj_array41 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator42);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) true);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate46, predicate47);
        java.lang.Object[] obj_array49 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator50);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) true);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate54, predicate55);
        java.util.Map map57 = collections.map.DefaultedMap.decorate(map48, (java.lang.Object) predicate55);
        boolean b58 = defaultedMap28.containsKey((java.lang.Object) map57);
        java.lang.String str59 = defaultedMap28.toString();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Set set8 = defaultedMap2.keySet();
        java.util.Set set9 = defaultedMap2.keySet();
        java.util.Set set10 = defaultedMap2.entrySet();
        java.util.Set set11 = defaultedMap2.keySet();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        boolean b6 = defaultedMap2.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set7 = defaultedMap2.keySet();
        boolean b8 = defaultedMap2.isEmpty();
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) true);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) predicate17);
        boolean b20 = defaultedMap11.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array21 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) true);
        java.util.Set set26 = defaultedMap23.entrySet();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap11.put((java.lang.Object) set26, obj27);
        java.lang.Object obj29 = defaultedMap2.get((java.lang.Object) set26);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Set set8 = defaultedMap2.keySet();
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap11.get(obj12);
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate16, predicate17);
        java.util.Collection collection19 = defaultedMap11.values();
        java.lang.Object obj20 = defaultedMap2.get((java.lang.Object) collection19);
        boolean b21 = defaultedMap2.isEmpty();
        java.lang.Object[] obj_array22 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) true);
        java.util.Set set27 = defaultedMap24.entrySet();
        boolean b28 = defaultedMap2.equals((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        java.util.Set set5 = defaultedMap2.entrySet();
        defaultedMap2.clear();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) true);
        defaultedMap12.clear();
        boolean b17 = defaultedMap12.containsKey((java.lang.Object) 10L);
        java.util.Set set18 = defaultedMap12.keySet();
        java.lang.Object[] obj_array19 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator20);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap21.get(obj22);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate26, predicate27);
        java.util.Collection collection29 = defaultedMap21.values();
        java.lang.Object obj30 = defaultedMap12.get((java.lang.Object) collection29);
        boolean b31 = defaultedMap12.isEmpty();
        java.util.Set set32 = defaultedMap12.keySet();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { predicate8, defaultedMap12, false };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i37 = fixedOrderComparator36.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i37 == 2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i2 = defaultedMap1.size();
        java.lang.Object[] obj_array3 = new java.lang.Object[] { i2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b5 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) true);
        defaultedMap8.clear();
        boolean b13 = defaultedMap8.containsKey((java.lang.Object) 10L);
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator15);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap16.get(obj17);
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) 10L);
        defaultedMap16.clear();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { defaultedMap8, defaultedMap16 };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        int i28 = fixedOrderComparator27.getUnknownObjectBehavior();
        boolean b29 = fixedOrderComparator27.isLocked();
        int i30 = fixedOrderComparator27.getUnknownObjectBehavior();
        try {
            int i31 = fixedOrderComparator4.compare((java.lang.Object) obj_array24, (java.lang.Object) fixedOrderComparator27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        int i2 = fixedOrderComparator1.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(i2 == 2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i2 = defaultedMap1.size();
        java.lang.Object[] obj_array3 = new java.lang.Object[] { i2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        java.lang.Object[] obj_array6 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) true);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap8.get((java.lang.Object) predicate14);
        boolean b17 = defaultedMap8.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) true);
        java.util.Set set23 = defaultedMap20.entrySet();
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap8.put((java.lang.Object) set23, obj24);
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) true);
        defaultedMap28.clear();
        boolean b33 = defaultedMap28.containsKey((java.lang.Object) 10L);
        java.util.Set set34 = defaultedMap28.keySet();
        java.lang.Object[] obj_array35 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator36);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap37.get(obj38);
        boolean b41 = defaultedMap37.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate42, predicate43);
        java.util.Collection collection45 = defaultedMap37.values();
        java.lang.Object obj46 = defaultedMap28.get((java.lang.Object) collection45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set49 = defaultedMap48.keySet();
        java.lang.Object obj50 = defaultedMap28.get((java.lang.Object) set49);
        java.util.Collection collection51 = defaultedMap28.values();
        try {
            boolean b52 = fixedOrderComparator4.addAsEqual((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) 'a');
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection7 = defaultedMap2.values();
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) true);
        defaultedMap10.clear();
        boolean b15 = defaultedMap10.containsKey((java.lang.Object) 10L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (-1L));
        collections.Predicate predicate18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate19);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) predicate19);
        java.lang.Object[] obj_array22 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap24.get(obj25);
        boolean b28 = defaultedMap24.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array29 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator30);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) true);
        defaultedMap31.clear();
        boolean b36 = defaultedMap31.containsKey((java.lang.Object) 10L);
        java.util.Set set37 = defaultedMap31.keySet();
        java.util.Set set38 = defaultedMap31.keySet();
        defaultedMap24.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap24.get(obj40);
        java.lang.Object[] obj_array42 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator43);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) true);
        defaultedMap44.clear();
        boolean b49 = defaultedMap44.containsKey((java.lang.Object) 10L);
        java.lang.Object obj50 = defaultedMap24.get((java.lang.Object) defaultedMap44);
        java.lang.Object[] obj_array51 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator52);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) true);
        boolean b57 = defaultedMap53.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set58 = defaultedMap53.keySet();
        boolean b59 = defaultedMap53.isEmpty();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) b59);
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = defaultedMap2.put((java.lang.Object) map60, obj61);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) map60);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection7 = defaultedMap2.values();
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) true);
        defaultedMap10.clear();
        boolean b15 = defaultedMap10.containsKey((java.lang.Object) 10L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (-1L));
        collections.Predicate predicate18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate19);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) predicate19);
        java.lang.Object[] obj_array22 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) true);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj31 = defaultedMap24.get((java.lang.Object) predicate30);
        java.lang.String str32 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i35 = defaultedMap34.size();
        boolean b36 = defaultedMap24.containsValue((java.lang.Object) defaultedMap34);
        boolean b37 = defaultedMap2.containsKey((java.lang.Object) defaultedMap24);
        boolean b39 = defaultedMap24.containsValue((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        boolean b11 = defaultedMap2.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array12 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator13);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap14.get(obj15);
        boolean b18 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate19, predicate20);
        java.lang.Object[] obj_array22 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap24.get(obj25);
        boolean b28 = defaultedMap24.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate30);
        java.util.Collection collection32 = defaultedMap24.values();
        java.lang.Object obj33 = defaultedMap14.get((java.lang.Object) defaultedMap24);
        defaultedMap2.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj36 = defaultedMap2.get((java.lang.Object) 100L);
        java.lang.Object[] obj_array37 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator38);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) true);
        defaultedMap39.clear();
        boolean b44 = defaultedMap39.containsKey((java.lang.Object) 10L);
        java.util.Set set45 = defaultedMap39.keySet();
        java.lang.Object[] obj_array46 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator47);
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap48.get(obj49);
        boolean b52 = defaultedMap48.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate53 = null;
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        java.util.Collection collection56 = defaultedMap48.values();
        java.lang.Object obj57 = defaultedMap39.get((java.lang.Object) collection56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set60 = defaultedMap59.keySet();
        java.lang.Object obj61 = defaultedMap39.get((java.lang.Object) set60);
        java.lang.Object obj62 = defaultedMap2.get(obj61);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) 'a');
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 100.0d);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Set set8 = defaultedMap2.keySet();
        java.util.Set set9 = defaultedMap2.keySet();
        java.lang.Object obj11 = defaultedMap2.remove((java.lang.Object) 0.0f);
        java.util.Set set12 = defaultedMap2.entrySet();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        boolean b10 = defaultedMap2.containsKey((java.lang.Object) fixedOrderComparator8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set13 = defaultedMap12.keySet();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) true);
        defaultedMap16.clear();
        boolean b21 = defaultedMap16.containsKey((java.lang.Object) 10L);
        java.util.Set set22 = defaultedMap16.keySet();
        java.util.Set set23 = defaultedMap16.keySet();
        java.lang.Object obj25 = defaultedMap16.remove((java.lang.Object) 0.0f);
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        boolean b27 = defaultedMap2.equals((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate7, predicate8);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap12.get(obj13);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        java.util.Collection collection20 = defaultedMap12.values();
        java.lang.Object obj21 = defaultedMap2.get((java.lang.Object) defaultedMap12);
        java.util.Set set22 = defaultedMap2.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set25 = defaultedMap24.keySet();
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) true);
        defaultedMap28.clear();
        boolean b33 = defaultedMap28.containsKey((java.lang.Object) 10L);
        java.util.Set set34 = defaultedMap28.keySet();
        java.util.Set set35 = defaultedMap28.keySet();
        java.lang.Object obj37 = defaultedMap28.remove((java.lang.Object) 0.0f);
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        java.util.Set set39 = defaultedMap28.entrySet();
        boolean b40 = defaultedMap2.containsKey((java.lang.Object) defaultedMap28);
        java.util.Set set41 = defaultedMap28.entrySet();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) 'a');
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 100.0d);
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) true);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap19.get((java.lang.Object) predicate25);
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) true);
        defaultedMap29.clear();
        boolean b34 = defaultedMap29.containsKey((java.lang.Object) 10L);
        java.util.Set set35 = defaultedMap29.keySet();
        java.lang.Object[] obj_array36 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap38.get(obj39);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Collection collection46 = defaultedMap38.values();
        java.lang.Object obj47 = defaultedMap29.get((java.lang.Object) collection46);
        boolean b48 = defaultedMap29.isEmpty();
        java.util.Set set49 = defaultedMap29.keySet();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { predicate25, defaultedMap29, false };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        boolean b53 = defaultedMap1.containsValue((java.lang.Object) obj_array51);
        java.util.Set set54 = defaultedMap1.entrySet();
        int i55 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(i55 == 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.get(obj11);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) 10L);
        defaultedMap10.clear();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { defaultedMap2, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap22.get(obj23);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj28 = defaultedMap22.get((java.lang.Object) 10L);
        defaultedMap22.clear();
        java.lang.Object[] obj_array30 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) true);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj39 = defaultedMap32.get((java.lang.Object) predicate38);
        boolean b41 = defaultedMap32.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array42 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator43);
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap44.get(obj45);
        boolean b48 = defaultedMap44.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate49, predicate50);
        java.lang.Object[] obj_array52 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator53);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap54.get(obj55);
        boolean b58 = defaultedMap54.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate59 = null;
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate59, predicate60);
        java.util.Collection collection62 = defaultedMap54.values();
        java.lang.Object obj63 = defaultedMap44.get((java.lang.Object) defaultedMap54);
        defaultedMap32.putAll((java.util.Map) defaultedMap54);
        int i65 = fixedOrderComparator19.compare((java.lang.Object) defaultedMap22, (java.lang.Object) defaultedMap54);
        java.lang.Object obj66 = null;
        java.lang.Object[] obj_array67 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator68);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) true);
        defaultedMap69.clear();
        boolean b74 = defaultedMap69.containsKey((java.lang.Object) 10L);
        java.util.Set set75 = defaultedMap69.keySet();
        java.lang.Object[] obj_array76 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array76);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator77);
        java.lang.Object obj79 = null;
        java.lang.Object obj80 = defaultedMap78.get(obj79);
        boolean b82 = defaultedMap78.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate83 = null;
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate83, predicate84);
        java.util.Collection collection86 = defaultedMap78.values();
        java.lang.Object obj87 = defaultedMap69.get((java.lang.Object) collection86);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set90 = defaultedMap89.keySet();
        java.lang.Object obj91 = defaultedMap69.get((java.lang.Object) set90);
        try {
            int i92 = fixedOrderComparator19.compare(obj66, (java.lang.Object) defaultedMap69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(obj_array76);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNotNull(obj87);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertNotNull(obj91);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        boolean b11 = defaultedMap2.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array12 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator13);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap14.get(obj15);
        boolean b18 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate19, predicate20);
        java.lang.Object[] obj_array22 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap24.get(obj25);
        boolean b28 = defaultedMap24.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate30);
        java.util.Collection collection32 = defaultedMap24.values();
        java.lang.Object obj33 = defaultedMap14.get((java.lang.Object) defaultedMap24);
        defaultedMap2.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection35 = defaultedMap24.values();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate7, predicate8);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap12.get(obj13);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection17 = defaultedMap12.values();
        int i18 = defaultedMap12.size();
        defaultedMap2.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) true);
        boolean b28 = defaultedMap24.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set29 = defaultedMap24.keySet();
        boolean b30 = defaultedMap12.containsKey((java.lang.Object) set29);
        java.lang.Object[] obj_array31 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) true);
        defaultedMap33.clear();
        boolean b38 = defaultedMap33.containsKey((java.lang.Object) 10L);
        java.util.Set set39 = defaultedMap33.keySet();
        java.lang.Object[] obj_array40 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator41);
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap42.get(obj43);
        boolean b46 = defaultedMap42.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate47 = null;
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate47, predicate48);
        java.util.Collection collection50 = defaultedMap42.values();
        java.lang.Object obj51 = defaultedMap33.get((java.lang.Object) collection50);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) collection50);
        java.util.Set set53 = defaultedMap12.keySet();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(set53);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator3.isLocked();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) b5);
        int i7 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object[] obj_array19 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator20);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) true);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj28 = defaultedMap21.get((java.lang.Object) predicate27);
        boolean b30 = defaultedMap21.containsKey((java.lang.Object) 'a');
        java.lang.Object obj32 = defaultedMap17.put((java.lang.Object) defaultedMap21, (java.lang.Object) 100.0d);
        java.lang.Object[] obj_array33 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) true);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj42 = defaultedMap35.get((java.lang.Object) predicate41);
        java.lang.Object[] obj_array43 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator44);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) true);
        defaultedMap45.clear();
        boolean b50 = defaultedMap45.containsKey((java.lang.Object) 10L);
        java.util.Set set51 = defaultedMap45.keySet();
        java.lang.Object[] obj_array52 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator53);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap54.get(obj55);
        boolean b58 = defaultedMap54.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate59 = null;
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate59, predicate60);
        java.util.Collection collection62 = defaultedMap54.values();
        java.lang.Object obj63 = defaultedMap45.get((java.lang.Object) collection62);
        boolean b64 = defaultedMap45.isEmpty();
        java.util.Set set65 = defaultedMap45.keySet();
        java.lang.Object[] obj_array67 = new java.lang.Object[] { predicate41, defaultedMap45, false };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        boolean b69 = defaultedMap17.containsValue((java.lang.Object) obj_array67);
        java.util.Set set70 = defaultedMap17.entrySet();
        try {
            int i71 = fixedOrderComparator0.compare((java.lang.Object) predicate14, (java.lang.Object) set70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(set70);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) 'a');
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 100.0d);
        java.util.Set set17 = defaultedMap5.entrySet();
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap20.get(obj21);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array25 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator26);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) true);
        defaultedMap27.clear();
        boolean b32 = defaultedMap27.containsKey((java.lang.Object) 10L);
        java.util.Set set33 = defaultedMap27.keySet();
        java.util.Set set34 = defaultedMap27.keySet();
        defaultedMap20.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap20.get(obj36);
        java.lang.Object[] obj_array38 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator39);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) true);
        defaultedMap40.clear();
        boolean b45 = defaultedMap40.containsKey((java.lang.Object) 10L);
        java.lang.Object obj46 = defaultedMap20.get((java.lang.Object) defaultedMap40);
        java.lang.Object[] obj_array47 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator48);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) true);
        boolean b53 = defaultedMap49.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set54 = defaultedMap49.keySet();
        boolean b55 = defaultedMap49.isEmpty();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) b55);
        defaultedMap5.putAll(map56);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.get(obj11);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) 10.0d);
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) 10L);
        defaultedMap10.clear();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { defaultedMap2, defaultedMap10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) true);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap22.get((java.lang.Object) predicate28);
        boolean b31 = defaultedMap22.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array32 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) true);
        java.util.Set set37 = defaultedMap34.entrySet();
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap22.put((java.lang.Object) set37, obj38);
        java.lang.Object[] obj_array40 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) true);
        defaultedMap42.clear();
        boolean b47 = defaultedMap42.containsKey((java.lang.Object) 10L);
        java.util.Set set48 = defaultedMap42.keySet();
        java.lang.Object[] obj_array49 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator50);
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap51.get(obj52);
        boolean b55 = defaultedMap51.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate56 = null;
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate56, predicate57);
        java.util.Collection collection59 = defaultedMap51.values();
        java.lang.Object obj60 = defaultedMap42.get((java.lang.Object) collection59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set63 = defaultedMap62.keySet();
        java.lang.Object obj64 = defaultedMap42.get((java.lang.Object) set63);
        java.util.Collection collection65 = defaultedMap42.values();
        try {
            int i66 = fixedOrderComparator19.compare((java.lang.Object) defaultedMap22, (java.lang.Object) collection65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(collection65);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) 'a');
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 100.0d);
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) true);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap19.get((java.lang.Object) predicate25);
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) true);
        defaultedMap29.clear();
        boolean b34 = defaultedMap29.containsKey((java.lang.Object) 10L);
        java.util.Set set35 = defaultedMap29.keySet();
        java.lang.Object[] obj_array36 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap38.get(obj39);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Collection collection46 = defaultedMap38.values();
        java.lang.Object obj47 = defaultedMap29.get((java.lang.Object) collection46);
        boolean b48 = defaultedMap29.isEmpty();
        java.util.Set set49 = defaultedMap29.keySet();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { predicate25, defaultedMap29, false };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        boolean b53 = defaultedMap1.containsValue((java.lang.Object) obj_array51);
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array51);
        int i55 = fixedOrderComparator54.getUnknownObjectBehavior();
        try {
            fixedOrderComparator54.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i55 == 2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate7, predicate8);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap12.get(obj13);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection17 = defaultedMap12.values();
        int i18 = defaultedMap12.size();
        defaultedMap2.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) (short) 0);
        java.lang.Object[] obj_array22 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) true);
        boolean b28 = defaultedMap24.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set29 = defaultedMap24.keySet();
        boolean b30 = defaultedMap12.containsKey((java.lang.Object) set29);
        java.lang.Object[] obj_array31 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) true);
        defaultedMap33.clear();
        boolean b38 = defaultedMap33.containsKey((java.lang.Object) 10L);
        java.util.Set set39 = defaultedMap33.keySet();
        java.lang.Object[] obj_array40 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator41);
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap42.get(obj43);
        boolean b46 = defaultedMap42.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate47 = null;
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate47, predicate48);
        java.util.Collection collection50 = defaultedMap42.values();
        java.lang.Object obj51 = defaultedMap33.get((java.lang.Object) collection50);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) collection50);
        defaultedMap12.clear();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Set set8 = defaultedMap2.keySet();
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap11.get(obj12);
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate16, predicate17);
        java.util.Collection collection19 = defaultedMap11.values();
        java.lang.Object obj20 = defaultedMap2.get((java.lang.Object) collection19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set23 = defaultedMap22.keySet();
        java.lang.Object obj24 = defaultedMap2.get((java.lang.Object) set23);
        defaultedMap2.clear();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) (byte) 1);
        java.util.Set set10 = defaultedMap2.entrySet();
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate7, predicate8);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap12.get(obj13);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        java.util.Collection collection20 = defaultedMap12.values();
        java.lang.Object obj21 = defaultedMap2.get((java.lang.Object) defaultedMap12);
        java.util.Set set22 = defaultedMap2.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set25 = defaultedMap24.keySet();
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) true);
        defaultedMap28.clear();
        boolean b33 = defaultedMap28.containsKey((java.lang.Object) 10L);
        java.util.Set set34 = defaultedMap28.keySet();
        java.util.Set set35 = defaultedMap28.keySet();
        java.lang.Object obj37 = defaultedMap28.remove((java.lang.Object) 0.0f);
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        java.util.Set set39 = defaultedMap28.entrySet();
        boolean b40 = defaultedMap2.containsKey((java.lang.Object) defaultedMap28);
        java.lang.Object[] obj_array41 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator42);
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap43.get(obj44);
        boolean b47 = defaultedMap43.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array48 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator49);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) true);
        defaultedMap50.clear();
        boolean b55 = defaultedMap50.containsKey((java.lang.Object) 10L);
        java.util.Set set56 = defaultedMap50.keySet();
        java.util.Set set57 = defaultedMap50.keySet();
        defaultedMap43.putAll((java.util.Map) defaultedMap50);
        java.util.Set set59 = defaultedMap50.keySet();
        java.lang.Object obj60 = defaultedMap28.get((java.lang.Object) set59);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(obj60);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (-1L));
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate10, predicate11);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 0);
        java.lang.Object[] obj_array5 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) true);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj14 = defaultedMap7.get((java.lang.Object) predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) true);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap20.get((java.lang.Object) predicate26);
        boolean b29 = defaultedMap20.containsKey((java.lang.Object) 'a');
        java.lang.Object obj31 = defaultedMap16.put((java.lang.Object) defaultedMap20, (java.lang.Object) 100.0d);
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        java.lang.Object[] obj_array33 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator34);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap35.get(obj36);
        boolean b39 = defaultedMap35.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array40 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) true);
        defaultedMap42.clear();
        boolean b47 = defaultedMap42.containsKey((java.lang.Object) 10L);
        java.util.Set set48 = defaultedMap42.keySet();
        java.util.Set set49 = defaultedMap42.keySet();
        defaultedMap35.putAll((java.util.Map) defaultedMap42);
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap35.get(obj51);
        java.lang.Object[] obj_array53 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator54);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) true);
        defaultedMap55.clear();
        boolean b60 = defaultedMap55.containsKey((java.lang.Object) 10L);
        java.lang.Object obj61 = defaultedMap35.get((java.lang.Object) defaultedMap55);
        boolean b62 = defaultedMap16.equals(obj61);
        java.lang.Object[] obj_array63 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator64);
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = defaultedMap65.get(obj66);
        boolean b69 = defaultedMap65.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array70 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator71);
        boolean b73 = defaultedMap65.containsKey((java.lang.Object) fixedOrderComparator71);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i76 = defaultedMap75.size();
        java.lang.Object[] obj_array77 = new java.lang.Object[] { i76 };
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array77);
        boolean b79 = defaultedMap65.containsValue((java.lang.Object) fixedOrderComparator78);
        defaultedMap16.putAll((java.util.Map) defaultedMap65);
        java.lang.Object obj81 = null;
        try {
            boolean b82 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap65, obj81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertNotNull(obj_array77);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) true);
        defaultedMap5.clear();
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) 10L);
        java.util.Set set11 = defaultedMap5.keySet();
        java.util.Set set12 = defaultedMap5.keySet();
        java.lang.Object obj14 = defaultedMap5.remove((java.lang.Object) 0.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set16 = defaultedMap5.entrySet();
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) true);
        defaultedMap19.clear();
        boolean b24 = defaultedMap19.containsKey((java.lang.Object) 10L);
        java.lang.Object obj26 = defaultedMap19.get((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set29 = defaultedMap28.keySet();
        java.lang.Object[] obj_array30 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) true);
        defaultedMap32.clear();
        boolean b37 = defaultedMap32.containsKey((java.lang.Object) 10L);
        java.util.Set set38 = defaultedMap32.keySet();
        java.util.Set set39 = defaultedMap32.keySet();
        java.lang.Object obj41 = defaultedMap32.remove((java.lang.Object) 0.0f);
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        defaultedMap19.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        java.lang.Object obj45 = defaultedMap5.get((java.lang.Object) defaultedMap44);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) (byte) 1);
        java.util.Set set10 = defaultedMap2.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection13 = defaultedMap12.values();
        java.lang.Object[] obj_array14 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj23 = defaultedMap16.get((java.lang.Object) predicate22);
        boolean b25 = defaultedMap16.containsKey((java.lang.Object) 'a');
        java.lang.Object obj27 = defaultedMap12.put((java.lang.Object) defaultedMap16, (java.lang.Object) 100.0d);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate28, predicate29);
        defaultedMap2.putAll((java.util.Map) defaultedMap12);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection7 = defaultedMap2.values();
        int i8 = defaultedMap2.size();
        java.lang.Object[] obj_array9 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) true);
        defaultedMap11.clear();
        boolean b16 = defaultedMap11.containsKey((java.lang.Object) 10L);
        java.util.Set set17 = defaultedMap11.keySet();
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap20.get(obj21);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        java.util.Collection collection28 = defaultedMap20.values();
        java.lang.Object obj29 = defaultedMap11.get((java.lang.Object) collection28);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) defaultedMap11);
        java.lang.Object[] obj_array31 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) true);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap33.get((java.lang.Object) predicate39);
        boolean b42 = defaultedMap33.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array43 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator44);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) true);
        java.util.Set set48 = defaultedMap45.entrySet();
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap33.put((java.lang.Object) set48, obj49);
        boolean b51 = defaultedMap2.containsKey(obj49);
        java.lang.Object[] obj_array52 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator53);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) true);
        boolean b58 = defaultedMap54.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set59 = defaultedMap54.keySet();
        defaultedMap54.clear();
        boolean b61 = defaultedMap2.containsValue((java.lang.Object) defaultedMap54);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) true);
        defaultedMap9.clear();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10L);
        java.util.Set set15 = defaultedMap9.keySet();
        java.util.Set set16 = defaultedMap9.keySet();
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap2.get(obj18);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap22.get(obj23);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator28);
        boolean b30 = defaultedMap22.containsKey((java.lang.Object) fixedOrderComparator28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) fixedOrderComparator28);
        defaultedMap2.clear();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        java.lang.String str10 = defaultedMap2.toString();
        java.lang.Object[] obj_array11 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap13.get(obj14);
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap20.get(obj21);
        boolean b23 = defaultedMap13.containsValue(obj22);
        java.lang.Object[] obj_array24 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator25);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap26.get(obj27);
        boolean b30 = defaultedMap26.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection31 = defaultedMap26.values();
        java.lang.Object[] obj_array32 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) true);
        defaultedMap34.clear();
        boolean b39 = defaultedMap34.containsKey((java.lang.Object) 10L);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) (-1L));
        collections.Predicate predicate42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate42, predicate43);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) predicate43);
        java.lang.Object[] obj_array46 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator47);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) true);
        defaultedMap48.clear();
        boolean b53 = defaultedMap48.containsKey((java.lang.Object) 10L);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) (-1L));
        collections.Predicate predicate56 = null;
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate43, predicate57);
        java.lang.Object[] obj_array60 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator61);
        java.lang.Object obj63 = null;
        java.lang.Object obj64 = defaultedMap62.get(obj63);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object[] obj_array66 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator67);
        java.lang.Object obj69 = null;
        java.lang.Object obj70 = defaultedMap68.get(obj69);
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection73 = defaultedMap68.values();
        java.lang.Object[] obj_array74 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator75);
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) true);
        defaultedMap76.clear();
        boolean b81 = defaultedMap76.containsKey((java.lang.Object) 10L);
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) (-1L));
        collections.Predicate predicate84 = null;
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate84, predicate85);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) predicate85);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate65, predicate85);
        java.lang.Object[] obj_array89 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array89);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator90);
        java.lang.Object obj93 = defaultedMap91.remove((java.lang.Object) true);
        collections.Predicate predicate94 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate95 = collections.PredicateUtils.truePredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap91, predicate94, predicate95);
        java.util.Map map97 = collections.map.PredicatedMap.decorate(map59, predicate85, predicate95);
        boolean b98 = defaultedMap2.equals((java.lang.Object) predicate85);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(obj_array89);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertTrue(b98 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) true);
        defaultedMap9.clear();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) 10L);
        java.util.Set set15 = defaultedMap9.keySet();
        java.util.Set set16 = defaultedMap9.keySet();
        defaultedMap2.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap2.get(obj18);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap22.get(obj23);
        boolean b26 = defaultedMap22.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator28);
        boolean b30 = defaultedMap22.containsKey((java.lang.Object) fixedOrderComparator28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) fixedOrderComparator28);
        int i32 = fixedOrderComparator28.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(i32 == 2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection7 = defaultedMap2.values();
        java.lang.Object[] obj_array8 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) true);
        defaultedMap10.clear();
        boolean b15 = defaultedMap10.containsKey((java.lang.Object) 10L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (-1L));
        collections.Predicate predicate18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate19);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) predicate19);
        java.lang.Object[] obj_array22 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) true);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj31 = defaultedMap24.get((java.lang.Object) predicate30);
        java.lang.String str32 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i35 = defaultedMap34.size();
        boolean b36 = defaultedMap24.containsValue((java.lang.Object) defaultedMap34);
        boolean b37 = defaultedMap2.containsKey((java.lang.Object) defaultedMap24);
        collections.Transformer transformer38 = null;
        try {
            java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, transformer38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) 'a');
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 100.0d);
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) true);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap19.get((java.lang.Object) predicate25);
        java.lang.Object[] obj_array27 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) true);
        defaultedMap29.clear();
        boolean b34 = defaultedMap29.containsKey((java.lang.Object) 10L);
        java.util.Set set35 = defaultedMap29.keySet();
        java.lang.Object[] obj_array36 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap38.get(obj39);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Collection collection46 = defaultedMap38.values();
        java.lang.Object obj47 = defaultedMap29.get((java.lang.Object) collection46);
        boolean b48 = defaultedMap29.isEmpty();
        java.util.Set set49 = defaultedMap29.keySet();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { predicate25, defaultedMap29, false };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        boolean b53 = defaultedMap1.containsValue((java.lang.Object) obj_array51);
        java.util.Set set54 = defaultedMap1.entrySet();
        java.lang.Object[] obj_array55 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator56);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) true);
        defaultedMap57.clear();
        boolean b62 = defaultedMap57.containsKey((java.lang.Object) 10L);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) (-1L));
        collections.Predicate predicate65 = null;
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate65, predicate66);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map67);
        collections.Factory factory69 = null;
        try {
            java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object[] obj_array13 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) true);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) predicate21);
        boolean b24 = defaultedMap15.containsKey((java.lang.Object) 'a');
        java.lang.Object obj26 = defaultedMap11.put((java.lang.Object) defaultedMap15, (java.lang.Object) 100.0d);
        defaultedMap2.putAll((java.util.Map) defaultedMap11);
        java.util.Set set28 = defaultedMap11.entrySet();
        java.lang.Object[] obj_array29 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator30);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap31.get(obj32);
        boolean b35 = defaultedMap31.containsKey((java.lang.Object) 10.0d);
        java.util.Collection collection36 = defaultedMap31.values();
        java.lang.Object[] obj_array37 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator38);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) true);
        boolean b43 = defaultedMap39.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set44 = defaultedMap39.keySet();
        java.lang.Object obj45 = defaultedMap11.put((java.lang.Object) defaultedMap31, (java.lang.Object) defaultedMap39);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100.0d + "'", obj45.equals(100.0d));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        defaultedMap2.clear();
        boolean b7 = defaultedMap2.containsKey((java.lang.Object) 10L);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (-1L));
        defaultedMap2.clear();
        java.lang.Object[] obj_array11 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) true);
        defaultedMap13.clear();
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) 10L);
        java.util.Set set19 = defaultedMap13.keySet();
        java.util.Set set20 = defaultedMap13.keySet();
        java.lang.Object obj22 = defaultedMap13.remove((java.lang.Object) 0.0f);
        java.lang.Object[] obj_array23 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) true);
        defaultedMap25.clear();
        boolean b30 = defaultedMap25.containsKey((java.lang.Object) 10L);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (-1L));
        java.lang.Object obj33 = defaultedMap13.get((java.lang.Object) (-1L));
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, obj33);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj13 = defaultedMap2.remove((java.lang.Object) fixedOrderComparator11);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i2 = defaultedMap1.size();
        java.lang.Object[] obj_array3 = new java.lang.Object[] { i2 };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        int i6 = fixedOrderComparator4.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) true);
        defaultedMap5.clear();
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) 10L);
        java.util.Set set11 = defaultedMap5.keySet();
        java.util.Set set12 = defaultedMap5.keySet();
        java.lang.Object obj14 = defaultedMap5.remove((java.lang.Object) 0.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set16 = defaultedMap5.entrySet();
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) true);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap19.get((java.lang.Object) predicate25);
        boolean b28 = defaultedMap19.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array29 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator30);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap31.get(obj32);
        boolean b35 = defaultedMap31.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate36, predicate37);
        java.lang.Object[] obj_array39 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator40);
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = defaultedMap41.get(obj42);
        boolean b45 = defaultedMap41.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate46 = null;
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate47);
        java.util.Collection collection49 = defaultedMap41.values();
        java.lang.Object obj50 = defaultedMap31.get((java.lang.Object) defaultedMap41);
        defaultedMap19.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj53 = defaultedMap19.get((java.lang.Object) 100L);
        java.lang.Object obj54 = defaultedMap5.remove((java.lang.Object) defaultedMap19);
        int i55 = defaultedMap19.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(i55 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        boolean b6 = defaultedMap2.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set7 = defaultedMap2.keySet();
        defaultedMap2.clear();
        java.lang.String str9 = defaultedMap2.toString();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        java.lang.Object[] obj_array2 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array2);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) true);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj11 = defaultedMap4.get((java.lang.Object) predicate10);
        java.lang.Object[] obj_array12 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator13);
        java.lang.Object obj15 = defaultedMap4.remove((java.lang.Object) fixedOrderComparator13);
        fixedOrderComparator13.setUnknownObjectBehavior(0);
        boolean b18 = fixedOrderComparator1.add((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        boolean b11 = defaultedMap2.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array12 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator13);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap14.get(obj15);
        boolean b18 = defaultedMap14.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array19 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator20);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) true);
        defaultedMap21.clear();
        boolean b26 = defaultedMap21.containsKey((java.lang.Object) 10L);
        java.util.Set set27 = defaultedMap21.keySet();
        java.util.Set set28 = defaultedMap21.keySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection30 = defaultedMap21.values();
        java.lang.Object[] obj_array31 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator32);
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap33.get(obj34);
        boolean b37 = defaultedMap33.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate38, predicate39);
        java.lang.Object obj41 = defaultedMap2.put((java.lang.Object) collection30, (java.lang.Object) map40);
        java.lang.String str42 = defaultedMap2.toString();
        java.lang.String str43 = defaultedMap2.toString();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{[]={}}" + "'", str42.equals("{[]={}}"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{[]={}}" + "'", str43.equals("{[]={}}"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        boolean b10 = defaultedMap2.containsKey((java.lang.Object) fixedOrderComparator8);
        java.lang.Object[] obj_array11 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) true);
        boolean b17 = defaultedMap13.containsValue((java.lang.Object) (byte) -1);
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap20.get(obj21);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        java.util.Collection collection28 = defaultedMap20.values();
        java.lang.Object obj29 = defaultedMap13.get((java.lang.Object) defaultedMap20);
        boolean b30 = defaultedMap2.containsValue((java.lang.Object) defaultedMap20);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        boolean b3 = fixedOrderComparator1.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        boolean b6 = fixedOrderComparator4.isLocked();
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap9.get(obj10);
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate14, predicate15);
        java.lang.Object[] obj_array17 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator18);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap19.get(obj20);
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        java.util.Collection collection27 = defaultedMap19.values();
        java.lang.Object obj28 = defaultedMap9.get((java.lang.Object) defaultedMap19);
        java.util.Set set29 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set32 = defaultedMap31.keySet();
        java.lang.Object[] obj_array33 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) true);
        defaultedMap35.clear();
        boolean b40 = defaultedMap35.containsKey((java.lang.Object) 10L);
        java.util.Set set41 = defaultedMap35.keySet();
        java.util.Set set42 = defaultedMap35.keySet();
        java.lang.Object obj44 = defaultedMap35.remove((java.lang.Object) 0.0f);
        defaultedMap31.putAll((java.util.Map) defaultedMap35);
        java.util.Set set46 = defaultedMap35.entrySet();
        boolean b47 = defaultedMap9.containsKey((java.lang.Object) defaultedMap35);
        java.util.Set set48 = defaultedMap9.entrySet();
        try {
            int i49 = fixedOrderComparator1.compare((java.lang.Object) b6, (java.lang.Object) defaultedMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array0);
        org.junit.Assert.assertNotNull(obj_array0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap2.get((java.lang.Object) predicate8);
        java.lang.String str10 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i13 = defaultedMap12.size();
        boolean b14 = defaultedMap2.containsValue((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Set set17 = defaultedMap16.keySet();
        java.lang.Object[] obj_array18 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) true);
        defaultedMap20.clear();
        boolean b25 = defaultedMap20.containsKey((java.lang.Object) 10L);
        java.util.Set set26 = defaultedMap20.keySet();
        java.util.Set set27 = defaultedMap20.keySet();
        java.lang.Object obj29 = defaultedMap20.remove((java.lang.Object) 0.0f);
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        java.util.Set set31 = defaultedMap20.entrySet();
        java.lang.Object[] obj_array32 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) true);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj41 = defaultedMap34.get((java.lang.Object) predicate40);
        boolean b43 = defaultedMap34.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array44 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator45);
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap46.get(obj47);
        boolean b50 = defaultedMap46.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate51 = null;
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate51, predicate52);
        java.lang.Object[] obj_array54 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator55);
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap56.get(obj57);
        boolean b60 = defaultedMap56.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate61 = null;
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate61, predicate62);
        java.util.Collection collection64 = defaultedMap56.values();
        java.lang.Object obj65 = defaultedMap46.get((java.lang.Object) defaultedMap56);
        defaultedMap34.putAll((java.util.Map) defaultedMap56);
        java.lang.Object obj68 = defaultedMap34.get((java.lang.Object) 100L);
        java.lang.Object obj69 = defaultedMap20.remove((java.lang.Object) defaultedMap34);
        defaultedMap2.putAll((java.util.Map) defaultedMap34);
        int i71 = defaultedMap34.size();
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(i71 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) predicate11);
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) 'a');
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) 100.0d);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate18);
        java.lang.Object[] obj_array20 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) true);
        java.util.Set set25 = defaultedMap22.entrySet();
        java.lang.Object[] obj_array26 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator27);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap28.get(obj29);
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array33 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) true);
        defaultedMap35.clear();
        boolean b40 = defaultedMap35.containsKey((java.lang.Object) 10L);
        java.util.Set set41 = defaultedMap35.keySet();
        java.util.Set set42 = defaultedMap35.keySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap35);
        java.lang.Object[] obj_array44 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator45 = new collections.comparators.FixedOrderComparator(obj_array44);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator45);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) true);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj53 = defaultedMap46.get((java.lang.Object) predicate52);
        boolean b55 = defaultedMap46.containsKey((java.lang.Object) 'a');
        java.lang.Object[] obj_array56 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator57);
        java.lang.Object obj59 = null;
        java.lang.Object obj60 = defaultedMap58.get(obj59);
        boolean b62 = defaultedMap58.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array63 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator64);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) true);
        defaultedMap65.clear();
        boolean b70 = defaultedMap65.containsKey((java.lang.Object) 10L);
        java.util.Set set71 = defaultedMap65.keySet();
        java.util.Set set72 = defaultedMap65.keySet();
        defaultedMap58.putAll((java.util.Map) defaultedMap65);
        java.util.Collection collection74 = defaultedMap65.values();
        java.lang.Object[] obj_array75 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array75);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator76);
        java.lang.Object obj78 = null;
        java.lang.Object obj79 = defaultedMap77.get(obj78);
        boolean b81 = defaultedMap77.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate82 = null;
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate82, predicate83);
        java.lang.Object obj85 = defaultedMap46.put((java.lang.Object) collection74, (java.lang.Object) map84);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) defaultedMap46);
        java.lang.Object obj87 = defaultedMap1.put((java.lang.Object) set25, (java.lang.Object) map86);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNotNull(obj_array75);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator8);
        boolean b10 = defaultedMap2.containsKey((java.lang.Object) fixedOrderComparator8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        int i13 = defaultedMap12.size();
        java.lang.Object[] obj_array14 = new java.lang.Object[] { i13 };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        boolean b16 = defaultedMap2.containsValue((java.lang.Object) fixedOrderComparator15);
        fixedOrderComparator15.setUnknownObjectBehavior(2);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.Object[] obj_array0 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator1);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap2.get(obj3);
        boolean b6 = defaultedMap2.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate7, predicate8);
        java.lang.Object[] obj_array10 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator11);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap12.get(obj13);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        java.util.Collection collection20 = defaultedMap12.values();
        java.lang.Object obj21 = defaultedMap2.get((java.lang.Object) defaultedMap12);
        boolean b22 = defaultedMap12.isEmpty();
        java.lang.Object[] obj_array23 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator24);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap25.get(obj26);
        boolean b29 = defaultedMap25.containsKey((java.lang.Object) 10.0d);
        collections.Predicate predicate30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate30, predicate31);
        java.lang.Object[] obj_array33 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) true);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate38, predicate39);
        java.lang.Object[] obj_array41 = new java.lang.Object[] {};
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator42);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) true);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate46, predicate47);
        java.util.Map map49 = collections.map.DefaultedMap.decorate(map40, (java.lang.Object) predicate47);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate30, predicate47);
        org.junit.Assert.assertNotNull(obj_array0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
    }
}

