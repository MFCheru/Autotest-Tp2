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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior(100);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) 'a');
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b9 = defaultedMap3.isEmpty();
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) "hi!");
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 100L);
        try {
            int i14 = fixedOrderComparator0.compare((java.lang.Object) 'a', (java.lang.Object) defaultedMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            boolean b3 = fixedOrderComparator0.addAsEqual((java.lang.Object) (-1), (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) 'a');
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b9 = defaultedMap3.isEmpty();
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) "hi!");
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 100L);
        defaultedMap3.clear();
        try {
            boolean b15 = fixedOrderComparator0.addAsEqual((java.lang.Object) (-1.0f), (java.lang.Object) defaultedMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        java.lang.String str13 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 'a');
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Collection collection15 = defaultedMap9.values();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) collection15);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) 'a');
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        boolean b10 = defaultedMap4.isEmpty();
        java.lang.Object obj12 = defaultedMap4.remove((java.lang.Object) "hi!");
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100L);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        int i16 = fixedOrderComparator15.getUnknownObjectBehavior();
        int i17 = fixedOrderComparator15.getUnknownObjectBehavior();
        try {
            int i18 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap4, (java.lang.Object) fixedOrderComparator15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue(i17 == 2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 'a');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b19 = defaultedMap13.isEmpty();
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) "hi!");
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100L);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 'a');
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + '#' + "'", obj24.equals('#'));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 'a', obj3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        try {
            java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (-1));
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap1.containsKey(obj10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        boolean b4 = defaultedMap2.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 'a');
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        boolean b12 = defaultedMap6.isEmpty();
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) "hi!");
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 100L);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) 'a');
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection25 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 'a');
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection33 = defaultedMap27.values();
        java.lang.Object obj34 = defaultedMap21.get((java.lang.Object) collection33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj37 = defaultedMap21.remove((java.lang.Object) defaultedMap36);
        java.lang.Object obj38 = defaultedMap6.get((java.lang.Object) defaultedMap21);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (byte) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = null;
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate41, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        boolean b45 = defaultedMap6.containsValue((java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) 'a');
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        boolean b53 = defaultedMap47.isEmpty();
        java.lang.Object obj55 = defaultedMap47.remove((java.lang.Object) "hi!");
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 100L);
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) 'a');
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        java.util.Collection collection66 = defaultedMap62.values();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        boolean b72 = defaultedMap70.containsKey((java.lang.Object) 'a');
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        java.util.Collection collection74 = defaultedMap68.values();
        java.lang.Object obj75 = defaultedMap62.get((java.lang.Object) collection74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj78 = defaultedMap62.remove((java.lang.Object) defaultedMap77);
        java.lang.Object obj79 = defaultedMap47.get((java.lang.Object) defaultedMap62);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) (byte) 100);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate83 = null;
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate82, predicate83);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        boolean b86 = defaultedMap47.containsValue((java.lang.Object) predicate85);
        java.lang.Object[] obj_array87 = new java.lang.Object[] { predicate0, defaultedMap2, defaultedMap6, predicate85 };
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array87);
        int i89 = fixedOrderComparator88.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + '#' + "'", obj38.equals('#'));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + '#' + "'", obj79.equals('#'));
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(obj_array87);
        org.junit.Assert.assertTrue(i89 == 2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.add((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 'a');
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection11 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 'a');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Collection collection19 = defaultedMap13.values();
        java.lang.Object obj20 = defaultedMap7.get((java.lang.Object) collection19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = defaultedMap7.remove((java.lang.Object) defaultedMap22);
        boolean b24 = fixedOrderComparator0.add((java.lang.Object) defaultedMap22);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 'a');
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) 100);
        try {
            boolean b32 = fixedOrderComparator0.addAsEqual((java.lang.Object) 1.0d, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (-1));
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 'a');
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Collection collection15 = defaultedMap9.values();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) collection15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = defaultedMap3.remove((java.lang.Object) defaultedMap18);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.equals(obj8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        boolean b4 = defaultedMap2.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 'a');
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        boolean b12 = defaultedMap6.isEmpty();
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) "hi!");
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 100L);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) 'a');
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection25 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 'a');
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection33 = defaultedMap27.values();
        java.lang.Object obj34 = defaultedMap21.get((java.lang.Object) collection33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj37 = defaultedMap21.remove((java.lang.Object) defaultedMap36);
        java.lang.Object obj38 = defaultedMap6.get((java.lang.Object) defaultedMap21);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (byte) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = null;
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate41, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        boolean b45 = defaultedMap6.containsValue((java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) 'a');
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        boolean b53 = defaultedMap47.isEmpty();
        java.lang.Object obj55 = defaultedMap47.remove((java.lang.Object) "hi!");
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 100L);
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) 'a');
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        java.util.Collection collection66 = defaultedMap62.values();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        boolean b72 = defaultedMap70.containsKey((java.lang.Object) 'a');
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        java.util.Collection collection74 = defaultedMap68.values();
        java.lang.Object obj75 = defaultedMap62.get((java.lang.Object) collection74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj78 = defaultedMap62.remove((java.lang.Object) defaultedMap77);
        java.lang.Object obj79 = defaultedMap47.get((java.lang.Object) defaultedMap62);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) (byte) 100);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate83 = null;
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate82, predicate83);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        boolean b86 = defaultedMap47.containsValue((java.lang.Object) predicate85);
        java.lang.Object[] obj_array87 = new java.lang.Object[] { predicate0, defaultedMap2, defaultedMap6, predicate85 };
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array87);
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator();
        int i91 = fixedOrderComparator90.getUnknownObjectBehavior();
        boolean b92 = fixedOrderComparator90.isLocked();
        int i93 = fixedOrderComparator90.getUnknownObjectBehavior();
        try {
            int i94 = fixedOrderComparator88.compare((java.lang.Object) 2, (java.lang.Object) fixedOrderComparator90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + '#' + "'", obj38.equals('#'));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + '#' + "'", obj79.equals('#'));
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(obj_array87);
        org.junit.Assert.assertTrue(i91 == 2);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(i93 == 2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        boolean b4 = defaultedMap2.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 'a');
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        boolean b12 = defaultedMap6.isEmpty();
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) "hi!");
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 100L);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) 'a');
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection25 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 'a');
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection33 = defaultedMap27.values();
        java.lang.Object obj34 = defaultedMap21.get((java.lang.Object) collection33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj37 = defaultedMap21.remove((java.lang.Object) defaultedMap36);
        java.lang.Object obj38 = defaultedMap6.get((java.lang.Object) defaultedMap21);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (byte) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = null;
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate41, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        boolean b45 = defaultedMap6.containsValue((java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) 'a');
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        boolean b53 = defaultedMap47.isEmpty();
        java.lang.Object obj55 = defaultedMap47.remove((java.lang.Object) "hi!");
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 100L);
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) 'a');
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        java.util.Collection collection66 = defaultedMap62.values();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        boolean b72 = defaultedMap70.containsKey((java.lang.Object) 'a');
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        java.util.Collection collection74 = defaultedMap68.values();
        java.lang.Object obj75 = defaultedMap62.get((java.lang.Object) collection74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj78 = defaultedMap62.remove((java.lang.Object) defaultedMap77);
        java.lang.Object obj79 = defaultedMap47.get((java.lang.Object) defaultedMap62);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) (byte) 100);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate83 = null;
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate82, predicate83);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        boolean b86 = defaultedMap47.containsValue((java.lang.Object) predicate85);
        java.lang.Object[] obj_array87 = new java.lang.Object[] { predicate0, defaultedMap2, defaultedMap6, predicate85 };
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array87);
        collections.comparators.FixedOrderComparator fixedOrderComparator89 = new collections.comparators.FixedOrderComparator(obj_array87);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + '#' + "'", obj38.equals('#'));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + '#' + "'", obj79.equals('#'));
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(obj_array87);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) 'a');
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection10 = defaultedMap4.values();
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) collection10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 'a');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b19 = defaultedMap13.isEmpty();
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) "hi!");
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100L);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) 'a');
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        boolean b32 = defaultedMap26.isEmpty();
        java.lang.Object obj34 = defaultedMap26.remove((java.lang.Object) "hi!");
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 100L);
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 'a');
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        java.util.Collection collection45 = defaultedMap41.values();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) 'a');
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        java.util.Collection collection53 = defaultedMap47.values();
        java.lang.Object obj54 = defaultedMap41.get((java.lang.Object) collection53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj57 = defaultedMap41.remove((java.lang.Object) defaultedMap56);
        java.lang.Object obj58 = defaultedMap26.get((java.lang.Object) defaultedMap41);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) (byte) 100);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = null;
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate61, predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate61, predicate64);
        try {
            int i67 = fixedOrderComparator0.compare((java.lang.Object) predicate61, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + '#' + "'", obj58.equals('#'));
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 'a');
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap7.isEmpty();
        java.lang.Object obj15 = defaultedMap7.remove((java.lang.Object) "hi!");
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) 'a');
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b26 = defaultedMap20.isEmpty();
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) "hi!");
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100L);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 'a');
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.util.Collection collection39 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) 'a');
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.util.Collection collection47 = defaultedMap41.values();
        java.lang.Object obj48 = defaultedMap35.get((java.lang.Object) collection47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj51 = defaultedMap35.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj52 = defaultedMap20.get((java.lang.Object) defaultedMap35);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (byte) 100);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = null;
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        boolean b59 = defaultedMap20.containsValue((java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate58, predicate60);
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) true);
        java.util.Set set64 = defaultedMap7.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + '#' + "'", obj52.equals('#'));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 'a');
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Collection collection15 = defaultedMap9.values();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) collection15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = defaultedMap3.remove((java.lang.Object) defaultedMap18);
        int i20 = defaultedMap18.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 'a');
        defaultedMap2.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap2.isEmpty();
        java.lang.Object obj10 = defaultedMap2.remove((java.lang.Object) "hi!");
        java.util.Set set11 = defaultedMap2.entrySet();
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        boolean b35 = defaultedMap1.equals((java.lang.Object) predicateUtils34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) 'a');
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        boolean b43 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.remove((java.lang.Object) "hi!");
        boolean b47 = defaultedMap37.containsValue((java.lang.Object) (byte) 100);
        int i48 = defaultedMap37.size();
        boolean b49 = defaultedMap1.containsKey((java.lang.Object) i48);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) 'a');
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj44 = defaultedMap37.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) 'a');
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        boolean b52 = defaultedMap46.isEmpty();
        java.lang.Object obj54 = defaultedMap46.remove((java.lang.Object) "hi!");
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 100L);
        defaultedMap46.clear();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) 'a');
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        java.util.Collection collection65 = defaultedMap61.values();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) 'a');
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.util.Collection collection73 = defaultedMap67.values();
        java.lang.Object obj74 = defaultedMap61.get((java.lang.Object) collection73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj77 = defaultedMap61.remove((java.lang.Object) defaultedMap76);
        java.lang.Object obj78 = defaultedMap46.get((java.lang.Object) defaultedMap61);
        defaultedMap37.putAll((java.util.Map) defaultedMap61);
        java.lang.Object obj80 = defaultedMap1.remove((java.lang.Object) defaultedMap61);
        collections.Transformer transformer81 = null;
        try {
            java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + '#' + "'", obj44.equals('#'));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + '#' + "'", obj78.equals('#'));
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        java.lang.String str36 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Set set10 = defaultedMap1.entrySet();
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj12 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj14 = defaultedMap1.get(obj12);
        boolean b15 = defaultedMap1.isEmpty();
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + '#' + "'", obj14.equals('#'));
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.add((java.lang.Object) (-1));
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        boolean b7 = fixedOrderComparator4.add((java.lang.Object) (-1));
        boolean b8 = fixedOrderComparator4.isLocked();
        boolean b9 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator4);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 'a');
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap11.isEmpty();
        java.lang.Object obj19 = defaultedMap11.remove((java.lang.Object) "hi!");
        boolean b21 = defaultedMap11.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set22 = defaultedMap11.entrySet();
        java.lang.Object obj23 = defaultedMap3.put((java.lang.Object) 1.0d, (java.lang.Object) set22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        int i25 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b26 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 'a');
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection34 = defaultedMap28.values();
        boolean b35 = fixedOrderComparator24.add((java.lang.Object) collection34);
        java.lang.Object obj36 = defaultedMap3.get((java.lang.Object) fixedOrderComparator24);
        collections.Factory factory37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 'a');
        defaultedMap2.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap2.isEmpty();
        java.lang.Object obj10 = defaultedMap2.remove((java.lang.Object) "hi!");
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 100L);
        defaultedMap2.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 'a');
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection21 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 'a');
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Collection collection29 = defaultedMap23.values();
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) collection29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj33 = defaultedMap17.remove((java.lang.Object) defaultedMap32);
        java.lang.Object obj34 = defaultedMap2.get((java.lang.Object) defaultedMap17);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (byte) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = null;
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) 'a');
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.util.Collection collection48 = defaultedMap42.values();
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) 'a');
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        boolean b60 = defaultedMap54.isEmpty();
        java.lang.Object obj62 = defaultedMap54.remove((java.lang.Object) "hi!");
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 100L);
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) 'a');
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.util.Collection collection73 = defaultedMap69.values();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj76 = null;
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap(obj76);
        boolean b79 = defaultedMap77.containsKey((java.lang.Object) 'a');
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        java.util.Collection collection81 = defaultedMap75.values();
        java.lang.Object obj82 = defaultedMap69.get((java.lang.Object) collection81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj85 = defaultedMap69.remove((java.lang.Object) defaultedMap84);
        java.lang.Object obj86 = defaultedMap54.get((java.lang.Object) defaultedMap69);
        collections.PredicateUtils predicateUtils87 = new collections.PredicateUtils();
        boolean b88 = defaultedMap54.equals((java.lang.Object) predicateUtils87);
        java.lang.Object[] obj_array89 = new java.lang.Object[] { 10, predicate37, 10L, defaultedMap42, defaultedMap50, defaultedMap54 };
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array89);
        collections.comparators.FixedOrderComparator fixedOrderComparator91 = new collections.comparators.FixedOrderComparator(obj_array89);
        boolean b92 = fixedOrderComparator91.isLocked();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + '#' + "'", obj34.equals('#'));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + '#' + "'", obj86.equals('#'));
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(obj_array89);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        boolean b5 = fixedOrderComparator3.isLocked();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) b5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b14 = defaultedMap8.isEmpty();
        java.lang.Object obj16 = defaultedMap8.remove((java.lang.Object) "hi!");
        int i17 = defaultedMap8.size();
        java.lang.Object obj18 = null;
        boolean b19 = defaultedMap8.equals(obj18);
        try {
            boolean b21 = fixedOrderComparator0.addAsEqual(obj18, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 'a');
        defaultedMap2.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap2.isEmpty();
        java.lang.Object obj10 = defaultedMap2.remove((java.lang.Object) "hi!");
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 100L);
        defaultedMap2.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 'a');
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection21 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 'a');
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Collection collection29 = defaultedMap23.values();
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) collection29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj33 = defaultedMap17.remove((java.lang.Object) defaultedMap32);
        java.lang.Object obj34 = defaultedMap2.get((java.lang.Object) defaultedMap17);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (byte) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = null;
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) 'a');
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.util.Collection collection48 = defaultedMap42.values();
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) 'a');
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        boolean b60 = defaultedMap54.isEmpty();
        java.lang.Object obj62 = defaultedMap54.remove((java.lang.Object) "hi!");
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 100L);
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) 'a');
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.util.Collection collection73 = defaultedMap69.values();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj76 = null;
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap(obj76);
        boolean b79 = defaultedMap77.containsKey((java.lang.Object) 'a');
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        java.util.Collection collection81 = defaultedMap75.values();
        java.lang.Object obj82 = defaultedMap69.get((java.lang.Object) collection81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj85 = defaultedMap69.remove((java.lang.Object) defaultedMap84);
        java.lang.Object obj86 = defaultedMap54.get((java.lang.Object) defaultedMap69);
        collections.PredicateUtils predicateUtils87 = new collections.PredicateUtils();
        boolean b88 = defaultedMap54.equals((java.lang.Object) predicateUtils87);
        java.lang.Object[] obj_array89 = new java.lang.Object[] { 10, predicate37, 10L, defaultedMap42, defaultedMap50, defaultedMap54 };
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array89);
        try {
            fixedOrderComparator90.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + '#' + "'", obj34.equals('#'));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + '#' + "'", obj86.equals('#'));
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(obj_array89);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 'a');
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b41 = defaultedMap35.isEmpty();
        java.lang.Object obj43 = defaultedMap35.remove((java.lang.Object) "hi!");
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100L);
        defaultedMap35.clear();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap35);
        java.util.Set set48 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 'a');
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        boolean b56 = defaultedMap50.isEmpty();
        java.lang.Object obj58 = defaultedMap50.remove((java.lang.Object) "hi!");
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 100L);
        defaultedMap50.clear();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) 'a');
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        java.util.Collection collection69 = defaultedMap65.values();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj72 = null;
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) 'a');
        defaultedMap71.putAll((java.util.Map) defaultedMap73);
        java.util.Collection collection77 = defaultedMap71.values();
        java.lang.Object obj78 = defaultedMap65.get((java.lang.Object) collection77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj81 = defaultedMap65.remove((java.lang.Object) defaultedMap80);
        java.lang.Object obj82 = defaultedMap50.get((java.lang.Object) defaultedMap65);
        collections.PredicateUtils predicateUtils83 = new collections.PredicateUtils();
        boolean b84 = defaultedMap50.equals((java.lang.Object) predicateUtils83);
        boolean b85 = defaultedMap1.containsKey((java.lang.Object) defaultedMap50);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + '#' + "'", obj82.equals('#'));
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        boolean b35 = defaultedMap1.equals((java.lang.Object) predicateUtils34);
        java.util.Set set36 = defaultedMap1.entrySet();
        int i37 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) 'a');
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b9 = defaultedMap3.isEmpty();
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) "hi!");
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 100L);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 'a');
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection22 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 'a');
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap18.get((java.lang.Object) collection30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj34 = defaultedMap18.remove((java.lang.Object) defaultedMap33);
        java.lang.Object obj35 = defaultedMap3.get((java.lang.Object) defaultedMap18);
        boolean b36 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        boolean b37 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + '#' + "'", obj35.equals('#'));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 'a');
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Collection collection15 = defaultedMap9.values();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) collection15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = defaultedMap3.remove((java.lang.Object) defaultedMap18);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        boolean b21 = fixedOrderComparator20.isLocked();
        boolean b23 = fixedOrderComparator20.add((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 'a');
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.util.Collection collection31 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 'a');
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.util.Collection collection39 = defaultedMap33.values();
        java.lang.Object obj40 = defaultedMap27.get((java.lang.Object) collection39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj43 = defaultedMap27.remove((java.lang.Object) defaultedMap42);
        boolean b44 = fixedOrderComparator20.add((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) 'a');
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        boolean b52 = defaultedMap46.isEmpty();
        java.lang.Object obj54 = defaultedMap46.remove((java.lang.Object) "hi!");
        boolean b56 = defaultedMap46.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj57 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        java.lang.Object obj59 = defaultedMap46.get(obj57);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) 'a');
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        boolean b67 = defaultedMap61.isEmpty();
        java.lang.Object obj68 = null;
        boolean b69 = defaultedMap61.equals(obj68);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap61);
        java.lang.Object[] obj_array71 = new java.lang.Object[] { defaultedMap3, defaultedMap42, obj57, defaultedMap61 };
        collections.comparators.FixedOrderComparator fixedOrderComparator72 = new collections.comparators.FixedOrderComparator(obj_array71);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + '#' + "'", obj59.equals('#'));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(obj_array71);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set12 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap14.isEmpty();
        java.lang.Object obj22 = defaultedMap14.remove((java.lang.Object) "hi!");
        boolean b24 = defaultedMap14.containsValue((java.lang.Object) (byte) 100);
        int i25 = defaultedMap14.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap3.values();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 'a');
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 'a');
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection24 = defaultedMap18.values();
        java.lang.Object obj25 = defaultedMap12.get((java.lang.Object) collection24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection24);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        boolean b4 = defaultedMap2.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 'a');
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        boolean b12 = defaultedMap6.isEmpty();
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) "hi!");
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 100L);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) 'a');
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection25 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 'a');
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection33 = defaultedMap27.values();
        java.lang.Object obj34 = defaultedMap21.get((java.lang.Object) collection33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj37 = defaultedMap21.remove((java.lang.Object) defaultedMap36);
        java.lang.Object obj38 = defaultedMap6.get((java.lang.Object) defaultedMap21);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (byte) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = null;
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate41, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        boolean b45 = defaultedMap6.containsValue((java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) 'a');
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        boolean b53 = defaultedMap47.isEmpty();
        java.lang.Object obj55 = defaultedMap47.remove((java.lang.Object) "hi!");
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 100L);
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) 'a');
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        java.util.Collection collection66 = defaultedMap62.values();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        boolean b72 = defaultedMap70.containsKey((java.lang.Object) 'a');
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        java.util.Collection collection74 = defaultedMap68.values();
        java.lang.Object obj75 = defaultedMap62.get((java.lang.Object) collection74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj78 = defaultedMap62.remove((java.lang.Object) defaultedMap77);
        java.lang.Object obj79 = defaultedMap47.get((java.lang.Object) defaultedMap62);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) (byte) 100);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate83 = null;
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate82, predicate83);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        boolean b86 = defaultedMap47.containsValue((java.lang.Object) predicate85);
        java.lang.Object[] obj_array87 = new java.lang.Object[] { predicate0, defaultedMap2, defaultedMap6, predicate85 };
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array87);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator88);
        java.util.Map map90 = null;
        try {
            defaultedMap89.putAll(map90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + '#' + "'", obj38.equals('#'));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + '#' + "'", obj79.equals('#'));
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(obj_array87);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 'a');
        defaultedMap2.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap2.isEmpty();
        java.lang.Object obj10 = defaultedMap2.remove((java.lang.Object) "hi!");
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 100L);
        defaultedMap2.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 'a');
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection21 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 'a');
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Collection collection29 = defaultedMap23.values();
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) collection29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj33 = defaultedMap17.remove((java.lang.Object) defaultedMap32);
        java.lang.Object obj34 = defaultedMap2.get((java.lang.Object) defaultedMap17);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (byte) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = null;
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) 'a');
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.util.Collection collection48 = defaultedMap42.values();
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) 'a');
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        boolean b60 = defaultedMap54.isEmpty();
        java.lang.Object obj62 = defaultedMap54.remove((java.lang.Object) "hi!");
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 100L);
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) 'a');
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.util.Collection collection73 = defaultedMap69.values();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj76 = null;
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap(obj76);
        boolean b79 = defaultedMap77.containsKey((java.lang.Object) 'a');
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        java.util.Collection collection81 = defaultedMap75.values();
        java.lang.Object obj82 = defaultedMap69.get((java.lang.Object) collection81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj85 = defaultedMap69.remove((java.lang.Object) defaultedMap84);
        java.lang.Object obj86 = defaultedMap54.get((java.lang.Object) defaultedMap69);
        collections.PredicateUtils predicateUtils87 = new collections.PredicateUtils();
        boolean b88 = defaultedMap54.equals((java.lang.Object) predicateUtils87);
        java.lang.Object[] obj_array89 = new java.lang.Object[] { 10, predicate37, 10L, defaultedMap42, defaultedMap50, defaultedMap54 };
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array89);
        collections.comparators.FixedOrderComparator fixedOrderComparator91 = new collections.comparators.FixedOrderComparator(obj_array89);
        boolean b93 = fixedOrderComparator91.add((java.lang.Object) (-1L));
        boolean b94 = fixedOrderComparator91.isLocked();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + '#' + "'", obj34.equals('#'));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + '#' + "'", obj86.equals('#'));
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(obj_array89);
        org.junit.Assert.assertTrue(b93 == true);
        org.junit.Assert.assertTrue(b94 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 'a');
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap7.isEmpty();
        java.lang.Object obj15 = defaultedMap7.remove((java.lang.Object) "hi!");
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) 'a');
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b26 = defaultedMap20.isEmpty();
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) "hi!");
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100L);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 'a');
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.util.Collection collection39 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) 'a');
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.util.Collection collection47 = defaultedMap41.values();
        java.lang.Object obj48 = defaultedMap35.get((java.lang.Object) collection47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj51 = defaultedMap35.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj52 = defaultedMap20.get((java.lang.Object) defaultedMap35);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (byte) 100);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = null;
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        boolean b59 = defaultedMap20.containsValue((java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate58, predicate60);
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        boolean b69 = defaultedMap67.containsKey((java.lang.Object) 'a');
        defaultedMap65.putAll((java.util.Map) defaultedMap67);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj72 = defaultedMap67.get((java.lang.Object) predicate71);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj76 = null;
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap(obj76);
        boolean b79 = defaultedMap77.containsKey((java.lang.Object) 'a');
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        boolean b81 = defaultedMap75.isEmpty();
        java.lang.Object obj83 = defaultedMap75.remove((java.lang.Object) "hi!");
        boolean b85 = defaultedMap75.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set86 = defaultedMap75.entrySet();
        java.lang.Object obj87 = defaultedMap67.put((java.lang.Object) 1.0d, (java.lang.Object) set86);
        int i88 = defaultedMap67.size();
        boolean b89 = defaultedMap1.containsValue((java.lang.Object) defaultedMap67);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + '#' + "'", obj52.equals('#'));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(i88 == 1);
        org.junit.Assert.assertTrue(b89 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        int i10 = defaultedMap1.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator();
        int i12 = fixedOrderComparator11.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap14.isEmpty();
        java.lang.Object obj22 = defaultedMap14.remove((java.lang.Object) "hi!");
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 100L);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 'a');
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection33 = defaultedMap29.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 'a');
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.util.Collection collection41 = defaultedMap35.values();
        java.lang.Object obj42 = defaultedMap29.get((java.lang.Object) collection41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj45 = defaultedMap29.remove((java.lang.Object) defaultedMap44);
        java.lang.Object obj46 = defaultedMap14.get((java.lang.Object) defaultedMap29);
        boolean b47 = fixedOrderComparator11.add((java.lang.Object) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 'a');
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        boolean b56 = defaultedMap50.isEmpty();
        java.lang.Object obj58 = defaultedMap50.remove((java.lang.Object) "hi!");
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 100L);
        defaultedMap50.clear();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) 'a');
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        java.util.Collection collection69 = defaultedMap65.values();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj72 = null;
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) 'a');
        defaultedMap71.putAll((java.util.Map) defaultedMap73);
        java.util.Collection collection77 = defaultedMap71.values();
        java.lang.Object obj78 = defaultedMap65.get((java.lang.Object) collection77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj81 = defaultedMap65.remove((java.lang.Object) defaultedMap80);
        java.lang.Object obj82 = defaultedMap50.get((java.lang.Object) defaultedMap65);
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) (byte) 100);
        java.lang.Object obj85 = null;
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap(obj85);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap86);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj92 = null;
        java.lang.Object obj93 = defaultedMap90.put((java.lang.Object) 'a', obj92);
        java.lang.Object obj94 = defaultedMap87.put((java.lang.Object) 100, (java.lang.Object) 'a');
        java.lang.Object obj95 = defaultedMap1.put((java.lang.Object) defaultedMap50, (java.lang.Object) defaultedMap87);
        defaultedMap50.clear();
        boolean b97 = defaultedMap50.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + '#' + "'", obj46.equals('#'));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + '#' + "'", obj82.equals('#'));
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertTrue(b97 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b4 = defaultedMap2.equals((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate5, predicate6);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 'a');
        defaultedMap2.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap2.isEmpty();
        java.lang.Object obj10 = defaultedMap2.remove((java.lang.Object) "hi!");
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 100L);
        defaultedMap2.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 'a');
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection21 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 'a');
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Collection collection29 = defaultedMap23.values();
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) collection29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj33 = defaultedMap17.remove((java.lang.Object) defaultedMap32);
        java.lang.Object obj34 = defaultedMap2.get((java.lang.Object) defaultedMap17);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (byte) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = null;
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) 'a');
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.util.Collection collection48 = defaultedMap42.values();
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) 'a');
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        boolean b60 = defaultedMap54.isEmpty();
        java.lang.Object obj62 = defaultedMap54.remove((java.lang.Object) "hi!");
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 100L);
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) 'a');
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.util.Collection collection73 = defaultedMap69.values();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj76 = null;
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap(obj76);
        boolean b79 = defaultedMap77.containsKey((java.lang.Object) 'a');
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        java.util.Collection collection81 = defaultedMap75.values();
        java.lang.Object obj82 = defaultedMap69.get((java.lang.Object) collection81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj85 = defaultedMap69.remove((java.lang.Object) defaultedMap84);
        java.lang.Object obj86 = defaultedMap54.get((java.lang.Object) defaultedMap69);
        collections.PredicateUtils predicateUtils87 = new collections.PredicateUtils();
        boolean b88 = defaultedMap54.equals((java.lang.Object) predicateUtils87);
        java.lang.Object[] obj_array89 = new java.lang.Object[] { 10, predicate37, 10L, defaultedMap42, defaultedMap50, defaultedMap54 };
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array89);
        collections.comparators.FixedOrderComparator fixedOrderComparator91 = new collections.comparators.FixedOrderComparator(obj_array89);
        collections.comparators.FixedOrderComparator fixedOrderComparator92 = new collections.comparators.FixedOrderComparator(obj_array89);
        collections.comparators.FixedOrderComparator fixedOrderComparator93 = new collections.comparators.FixedOrderComparator(obj_array89);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + '#' + "'", obj34.equals('#'));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + '#' + "'", obj86.equals('#'));
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(obj_array89);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 'a');
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap7.isEmpty();
        java.lang.Object obj15 = defaultedMap7.remove((java.lang.Object) "hi!");
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) 'a');
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b26 = defaultedMap20.isEmpty();
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) "hi!");
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100L);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 'a');
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.util.Collection collection39 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) 'a');
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.util.Collection collection47 = defaultedMap41.values();
        java.lang.Object obj48 = defaultedMap35.get((java.lang.Object) collection47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj51 = defaultedMap35.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj52 = defaultedMap20.get((java.lang.Object) defaultedMap35);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (byte) 100);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = null;
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        boolean b59 = defaultedMap20.containsValue((java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate58, predicate60);
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) true);
        collections.Factory factory64 = null;
        try {
            java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + '#' + "'", obj52.equals('#'));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b3 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap1.values();
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 'a');
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap9.isEmpty();
        java.lang.Object obj17 = defaultedMap9.remove((java.lang.Object) "hi!");
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100L);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) 'a');
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection36 = defaultedMap30.values();
        java.lang.Object obj37 = defaultedMap24.get((java.lang.Object) collection36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj40 = defaultedMap24.remove((java.lang.Object) defaultedMap39);
        java.lang.Object obj41 = defaultedMap9.get((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) 'a');
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        boolean b49 = defaultedMap43.isEmpty();
        java.lang.Object obj51 = defaultedMap43.remove((java.lang.Object) "hi!");
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) 100L);
        defaultedMap43.clear();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap43);
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) 'a');
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        boolean b64 = defaultedMap58.isEmpty();
        java.lang.Object obj66 = defaultedMap58.remove((java.lang.Object) "hi!");
        boolean b68 = defaultedMap58.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj69 = defaultedMap1.get((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + '#' + "'", obj41.equals('#'));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + '#' + "'", obj56.equals('#'));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + '#' + "'", obj69.equals('#'));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        boolean b35 = defaultedMap1.equals((java.lang.Object) predicateUtils34);
        java.util.Set set36 = defaultedMap1.entrySet();
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        collections.Transformer transformer39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        int i10 = defaultedMap1.size();
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.equals(obj11);
        java.util.Set set13 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 'a');
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap11.isEmpty();
        java.lang.Object obj19 = defaultedMap11.remove((java.lang.Object) "hi!");
        boolean b21 = defaultedMap11.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set22 = defaultedMap11.entrySet();
        java.lang.Object obj23 = defaultedMap3.put((java.lang.Object) 1.0d, (java.lang.Object) set22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        int i25 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b26 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 'a');
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection34 = defaultedMap28.values();
        boolean b35 = fixedOrderComparator24.add((java.lang.Object) collection34);
        java.lang.Object obj36 = defaultedMap3.get((java.lang.Object) fixedOrderComparator24);
        java.util.Collection collection37 = defaultedMap3.values();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap1.keySet();
        java.util.Set set13 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) 'a');
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        boolean b10 = defaultedMap4.isEmpty();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 'a');
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 'a');
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b24 = defaultedMap18.isEmpty();
        java.lang.Object obj26 = defaultedMap18.remove((java.lang.Object) "hi!");
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 100L);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) 'a');
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b37 = defaultedMap31.isEmpty();
        java.lang.Object obj39 = defaultedMap31.remove((java.lang.Object) "hi!");
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100L);
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) 'a');
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        java.util.Collection collection50 = defaultedMap46.values();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) 'a');
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        java.util.Collection collection58 = defaultedMap52.values();
        java.lang.Object obj59 = defaultedMap46.get((java.lang.Object) collection58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj62 = defaultedMap46.remove((java.lang.Object) defaultedMap61);
        java.lang.Object obj63 = defaultedMap31.get((java.lang.Object) defaultedMap46);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) (byte) 100);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate67 = null;
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate66, predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        boolean b70 = defaultedMap31.containsValue((java.lang.Object) predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate69, predicate71);
        java.lang.Object obj74 = defaultedMap12.put((java.lang.Object) defaultedMap18, (java.lang.Object) true);
        defaultedMap4.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj78 = null;
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap(obj78);
        boolean b81 = defaultedMap79.containsKey((java.lang.Object) 'a');
        defaultedMap77.putAll((java.util.Map) defaultedMap79);
        try {
            boolean b83 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap18, (java.lang.Object) defaultedMap79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + '#' + "'", obj63.equals('#'));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        boolean b35 = defaultedMap1.equals((java.lang.Object) predicateUtils34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) 'a');
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        boolean b43 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.remove((java.lang.Object) "hi!");
        int i46 = defaultedMap37.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        int i48 = fixedOrderComparator47.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 'a');
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        boolean b56 = defaultedMap50.isEmpty();
        java.lang.Object obj58 = defaultedMap50.remove((java.lang.Object) "hi!");
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 100L);
        defaultedMap50.clear();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) 'a');
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        java.util.Collection collection69 = defaultedMap65.values();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj72 = null;
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) 'a');
        defaultedMap71.putAll((java.util.Map) defaultedMap73);
        java.util.Collection collection77 = defaultedMap71.values();
        java.lang.Object obj78 = defaultedMap65.get((java.lang.Object) collection77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj81 = defaultedMap65.remove((java.lang.Object) defaultedMap80);
        java.lang.Object obj82 = defaultedMap50.get((java.lang.Object) defaultedMap65);
        boolean b83 = fixedOrderComparator47.add((java.lang.Object) defaultedMap50);
        defaultedMap37.putAll((java.util.Map) defaultedMap50);
        java.util.Collection collection85 = defaultedMap50.values();
        boolean b86 = defaultedMap1.containsKey((java.lang.Object) collection85);
        java.lang.Object obj88 = defaultedMap1.get((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i48 == 2);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + '#' + "'", obj82.equals('#'));
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + '#' + "'", obj88.equals('#'));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 'a');
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap7.isEmpty();
        java.lang.Object obj15 = defaultedMap7.remove((java.lang.Object) "hi!");
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) 'a');
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b26 = defaultedMap20.isEmpty();
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) "hi!");
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100L);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 'a');
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.util.Collection collection39 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) 'a');
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.util.Collection collection47 = defaultedMap41.values();
        java.lang.Object obj48 = defaultedMap35.get((java.lang.Object) collection47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj51 = defaultedMap35.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj52 = defaultedMap20.get((java.lang.Object) defaultedMap35);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (byte) 100);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = null;
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        boolean b59 = defaultedMap20.containsValue((java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate58, predicate60);
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) true);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        boolean b70 = defaultedMap68.containsKey((java.lang.Object) 'a');
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        boolean b72 = defaultedMap66.isEmpty();
        java.lang.Object obj74 = defaultedMap66.remove((java.lang.Object) "hi!");
        boolean b76 = defaultedMap66.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set77 = defaultedMap66.entrySet();
        boolean b78 = defaultedMap1.containsKey((java.lang.Object) defaultedMap66);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + '#' + "'", obj52.equals('#'));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue(b78 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap14.isEmpty();
        java.lang.Object obj22 = defaultedMap14.remove((java.lang.Object) "hi!");
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 100L);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 'a');
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection33 = defaultedMap29.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 'a');
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.util.Collection collection41 = defaultedMap35.values();
        java.lang.Object obj42 = defaultedMap29.get((java.lang.Object) collection41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj45 = defaultedMap29.remove((java.lang.Object) defaultedMap44);
        java.lang.Object obj46 = defaultedMap14.get((java.lang.Object) defaultedMap29);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (byte) 100);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = null;
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate49, predicate52);
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + '#' + "'", obj46.equals('#'));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + '#' + "'", obj55.equals('#'));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = null;
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        boolean b40 = defaultedMap1.containsValue((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) 'a');
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj49 = defaultedMap44.get((java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) 'a');
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        boolean b58 = defaultedMap52.isEmpty();
        java.lang.Object obj60 = defaultedMap52.remove((java.lang.Object) "hi!");
        boolean b62 = defaultedMap52.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set63 = defaultedMap52.entrySet();
        java.lang.Object obj64 = defaultedMap44.put((java.lang.Object) 1.0d, (java.lang.Object) set63);
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap44.get(obj65);
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 'a');
        java.util.Collection collection7 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        boolean b9 = fixedOrderComparator0.add((java.lang.Object) defaultedMap4);
        int i10 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 'a');
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 'a');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b19 = defaultedMap13.isEmpty();
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap13.equals(obj20);
        java.lang.Object obj22 = defaultedMap7.get(obj20);
        java.lang.Object obj23 = defaultedMap1.get(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 'a');
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b31 = defaultedMap25.isEmpty();
        java.lang.Object obj33 = defaultedMap25.remove((java.lang.Object) "hi!");
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 100L);
        defaultedMap25.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) 'a');
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        boolean b44 = defaultedMap38.isEmpty();
        java.lang.Object obj46 = defaultedMap38.remove((java.lang.Object) "hi!");
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 100L);
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) 'a');
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.util.Collection collection57 = defaultedMap53.values();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) 'a');
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        java.util.Collection collection65 = defaultedMap59.values();
        java.lang.Object obj66 = defaultedMap53.get((java.lang.Object) collection65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj69 = defaultedMap53.remove((java.lang.Object) defaultedMap68);
        java.lang.Object obj70 = defaultedMap38.get((java.lang.Object) defaultedMap53);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) (byte) 100);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = null;
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate73, predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate73, predicate76);
        boolean b78 = defaultedMap1.equals((java.lang.Object) predicate76);
        java.lang.Object obj79 = null;
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap(obj79);
        boolean b82 = defaultedMap80.containsKey((java.lang.Object) 'a');
        java.util.Collection collection83 = defaultedMap80.values();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap80);
        defaultedMap1.putAll((java.util.Map) defaultedMap80);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + '#' + "'", obj70.equals('#'));
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(collection83);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) 0.0d);
        java.util.Collection collection8 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 'a');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b19 = defaultedMap13.isEmpty();
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) "hi!");
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100L);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 'a');
        java.util.Collection collection29 = defaultedMap26.values();
        java.lang.Object obj30 = defaultedMap13.get((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) 'a');
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.util.Collection collection38 = defaultedMap34.values();
        java.util.Set set39 = defaultedMap34.keySet();
        boolean b40 = defaultedMap13.containsValue((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + '#' + "'", obj24.equals('#'));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + '#' + "'", obj30.equals('#'));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 'a');
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap11.isEmpty();
        java.lang.Object obj19 = defaultedMap11.remove((java.lang.Object) "hi!");
        boolean b21 = defaultedMap11.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set22 = defaultedMap11.entrySet();
        java.lang.Object obj23 = defaultedMap3.put((java.lang.Object) 1.0d, (java.lang.Object) set22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        int i25 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b26 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 'a');
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection34 = defaultedMap28.values();
        boolean b35 = fixedOrderComparator24.add((java.lang.Object) collection34);
        java.lang.Object obj36 = defaultedMap3.get((java.lang.Object) fixedOrderComparator24);
        boolean b37 = fixedOrderComparator24.isLocked();
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 'a');
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 'a');
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b21 = defaultedMap15.isEmpty();
        java.lang.Object obj23 = defaultedMap15.remove((java.lang.Object) "hi!");
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 100L);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 'a');
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        boolean b34 = defaultedMap28.isEmpty();
        java.lang.Object obj36 = defaultedMap28.remove((java.lang.Object) "hi!");
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 100L);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) 'a');
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.util.Collection collection47 = defaultedMap43.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 'a');
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        java.util.Collection collection55 = defaultedMap49.values();
        java.lang.Object obj56 = defaultedMap43.get((java.lang.Object) collection55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj59 = defaultedMap43.remove((java.lang.Object) defaultedMap58);
        java.lang.Object obj60 = defaultedMap28.get((java.lang.Object) defaultedMap43);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (byte) 100);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = null;
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        boolean b67 = defaultedMap28.containsValue((java.lang.Object) predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate66, predicate68);
        java.lang.Object obj71 = defaultedMap9.put((java.lang.Object) defaultedMap15, (java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.util.Set set73 = defaultedMap15.entrySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + '#' + "'", obj60.equals('#'));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(set73);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 'a');
        defaultedMap2.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap2.isEmpty();
        java.lang.Object obj10 = defaultedMap2.remove((java.lang.Object) "hi!");
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 100L);
        defaultedMap2.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 'a');
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection21 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 'a');
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Collection collection29 = defaultedMap23.values();
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) collection29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj33 = defaultedMap17.remove((java.lang.Object) defaultedMap32);
        java.lang.Object obj34 = defaultedMap2.get((java.lang.Object) defaultedMap17);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (byte) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = null;
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) 'a');
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.util.Collection collection48 = defaultedMap42.values();
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) 'a');
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        boolean b60 = defaultedMap54.isEmpty();
        java.lang.Object obj62 = defaultedMap54.remove((java.lang.Object) "hi!");
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 100L);
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) 'a');
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.util.Collection collection73 = defaultedMap69.values();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj76 = null;
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap(obj76);
        boolean b79 = defaultedMap77.containsKey((java.lang.Object) 'a');
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        java.util.Collection collection81 = defaultedMap75.values();
        java.lang.Object obj82 = defaultedMap69.get((java.lang.Object) collection81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj85 = defaultedMap69.remove((java.lang.Object) defaultedMap84);
        java.lang.Object obj86 = defaultedMap54.get((java.lang.Object) defaultedMap69);
        collections.PredicateUtils predicateUtils87 = new collections.PredicateUtils();
        boolean b88 = defaultedMap54.equals((java.lang.Object) predicateUtils87);
        java.lang.Object[] obj_array89 = new java.lang.Object[] { 10, predicate37, 10L, defaultedMap42, defaultedMap50, defaultedMap54 };
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array89);
        collections.comparators.FixedOrderComparator fixedOrderComparator91 = new collections.comparators.FixedOrderComparator(obj_array89);
        collections.comparators.FixedOrderComparator fixedOrderComparator92 = new collections.comparators.FixedOrderComparator(obj_array89);
        int i93 = fixedOrderComparator92.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + '#' + "'", obj34.equals('#'));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + '#' + "'", obj86.equals('#'));
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(obj_array89);
        org.junit.Assert.assertTrue(i93 == 2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) predicateUtils9);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        int i5 = fixedOrderComparator4.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 'a');
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap7.isEmpty();
        java.lang.Object obj15 = defaultedMap7.remove((java.lang.Object) "hi!");
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) 'a');
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection26 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 'a');
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection34 = defaultedMap28.values();
        java.lang.Object obj35 = defaultedMap22.get((java.lang.Object) collection34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj38 = defaultedMap22.remove((java.lang.Object) defaultedMap37);
        java.lang.Object obj39 = defaultedMap7.get((java.lang.Object) defaultedMap22);
        boolean b40 = fixedOrderComparator4.add((java.lang.Object) defaultedMap7);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) fixedOrderComparator4);
        collections.Factory factory42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + '#' + "'", obj39.equals('#'));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(i2 == 2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 'a');
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap9.isEmpty();
        java.lang.Object obj17 = defaultedMap9.remove((java.lang.Object) "hi!");
        int i18 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        int i20 = fixedOrderComparator19.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        boolean b28 = defaultedMap22.isEmpty();
        java.lang.Object obj30 = defaultedMap22.remove((java.lang.Object) "hi!");
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100L);
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 'a');
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.util.Collection collection41 = defaultedMap37.values();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) 'a');
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        java.util.Collection collection49 = defaultedMap43.values();
        java.lang.Object obj50 = defaultedMap37.get((java.lang.Object) collection49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj53 = defaultedMap37.remove((java.lang.Object) defaultedMap52);
        java.lang.Object obj54 = defaultedMap22.get((java.lang.Object) defaultedMap37);
        boolean b55 = fixedOrderComparator19.add((java.lang.Object) defaultedMap22);
        defaultedMap9.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj57 = defaultedMap1.get((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) 'a');
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        boolean b65 = defaultedMap1.containsValue((java.lang.Object) defaultedMap59);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + '#' + "'", obj54.equals('#'));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + '#' + "'", obj57.equals('#'));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 'a');
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap11.isEmpty();
        java.lang.Object obj19 = defaultedMap11.remove((java.lang.Object) "hi!");
        boolean b21 = defaultedMap11.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set22 = defaultedMap11.entrySet();
        java.lang.Object obj23 = defaultedMap3.put((java.lang.Object) 1.0d, (java.lang.Object) set22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        int i25 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b26 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 'a');
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection34 = defaultedMap28.values();
        boolean b35 = fixedOrderComparator24.add((java.lang.Object) collection34);
        java.lang.Object obj36 = defaultedMap3.get((java.lang.Object) fixedOrderComparator24);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator37.isLocked();
        int i39 = fixedOrderComparator37.getUnknownObjectBehavior();
        fixedOrderComparator37.setUnknownObjectBehavior((int) (byte) 1);
        boolean b42 = fixedOrderComparator37.isLocked();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) fixedOrderComparator37);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) 'a');
        java.util.Collection collection48 = defaultedMap45.values();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 'a');
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        boolean b56 = defaultedMap50.isEmpty();
        java.lang.Object obj58 = defaultedMap50.remove((java.lang.Object) "hi!");
        boolean b60 = defaultedMap50.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj61 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        java.lang.Object obj63 = defaultedMap50.get(obj61);
        java.lang.Object obj64 = defaultedMap45.remove(obj61);
        boolean b65 = defaultedMap3.equals(obj61);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + '#' + "'", obj63.equals('#'));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b14 = defaultedMap8.isEmpty();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        boolean b20 = defaultedMap16.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        boolean b28 = defaultedMap22.isEmpty();
        java.lang.Object obj30 = defaultedMap22.remove((java.lang.Object) "hi!");
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100L);
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 'a');
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b41 = defaultedMap35.isEmpty();
        java.lang.Object obj43 = defaultedMap35.remove((java.lang.Object) "hi!");
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100L);
        defaultedMap35.clear();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 'a');
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        java.util.Collection collection54 = defaultedMap50.values();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) 'a');
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        java.util.Collection collection62 = defaultedMap56.values();
        java.lang.Object obj63 = defaultedMap50.get((java.lang.Object) collection62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj66 = defaultedMap50.remove((java.lang.Object) defaultedMap65);
        java.lang.Object obj67 = defaultedMap35.get((java.lang.Object) defaultedMap50);
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (byte) 100);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = null;
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate70, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        boolean b74 = defaultedMap35.containsValue((java.lang.Object) predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate73, predicate75);
        java.lang.Object obj78 = defaultedMap16.put((java.lang.Object) defaultedMap22, (java.lang.Object) true);
        defaultedMap8.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj80 = defaultedMap6.get((java.lang.Object) defaultedMap22);
        collections.comparators.FixedOrderComparator fixedOrderComparator81 = new collections.comparators.FixedOrderComparator();
        boolean b82 = defaultedMap22.containsKey((java.lang.Object) fixedOrderComparator81);
        java.lang.Object obj83 = defaultedMap4.get((java.lang.Object) b82);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + '#' + "'", obj67.equals('#'));
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(obj83);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 'a');
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b11 = defaultedMap5.isEmpty();
        java.lang.Object obj13 = defaultedMap5.remove((java.lang.Object) "hi!");
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100L);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 'a');
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection24 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) 'a');
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection32 = defaultedMap26.values();
        java.lang.Object obj33 = defaultedMap20.get((java.lang.Object) collection32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = defaultedMap20.remove((java.lang.Object) defaultedMap35);
        java.lang.Object obj37 = defaultedMap5.get((java.lang.Object) defaultedMap20);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) (byte) 100);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = null;
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        boolean b44 = defaultedMap5.containsValue((java.lang.Object) predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate43);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + '#' + "'", obj37.equals('#'));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 'a');
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b16 = defaultedMap10.isEmpty();
        java.lang.Object obj18 = defaultedMap10.remove((java.lang.Object) "hi!");
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100L);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 'a');
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Collection collection29 = defaultedMap25.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) 'a');
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        java.util.Collection collection37 = defaultedMap31.values();
        java.lang.Object obj38 = defaultedMap25.get((java.lang.Object) collection37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj41 = defaultedMap25.remove((java.lang.Object) defaultedMap40);
        java.lang.Object obj42 = defaultedMap10.get((java.lang.Object) defaultedMap25);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (byte) 100);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = null;
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate45, predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        boolean b49 = defaultedMap10.containsValue((java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) 'a');
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b57 = defaultedMap51.isEmpty();
        java.lang.Object obj59 = defaultedMap51.remove((java.lang.Object) "hi!");
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) 100L);
        defaultedMap51.clear();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        boolean b68 = defaultedMap66.containsKey((java.lang.Object) 'a');
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        java.util.Collection collection70 = defaultedMap66.values();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        boolean b76 = defaultedMap74.containsKey((java.lang.Object) 'a');
        defaultedMap72.putAll((java.util.Map) defaultedMap74);
        java.util.Collection collection78 = defaultedMap72.values();
        java.lang.Object obj79 = defaultedMap66.get((java.lang.Object) collection78);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj82 = defaultedMap66.remove((java.lang.Object) defaultedMap81);
        java.lang.Object obj83 = defaultedMap51.get((java.lang.Object) defaultedMap66);
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (byte) 100);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate87 = null;
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate86, predicate87);
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        boolean b90 = defaultedMap51.containsValue((java.lang.Object) predicate89);
        java.lang.Object[] obj_array91 = new java.lang.Object[] { predicate4, defaultedMap6, defaultedMap10, predicate89 };
        collections.comparators.FixedOrderComparator fixedOrderComparator92 = new collections.comparators.FixedOrderComparator(obj_array91);
        java.lang.Object obj93 = defaultedMap1.remove((java.lang.Object) obj_array91);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + '#' + "'", obj42.equals('#'));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + '#' + "'", obj83.equals('#'));
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(obj_array91);
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        boolean b4 = defaultedMap2.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 'a');
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        boolean b12 = defaultedMap6.isEmpty();
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) "hi!");
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 100L);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) 'a');
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection25 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 'a');
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        java.util.Collection collection33 = defaultedMap27.values();
        java.lang.Object obj34 = defaultedMap21.get((java.lang.Object) collection33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj37 = defaultedMap21.remove((java.lang.Object) defaultedMap36);
        java.lang.Object obj38 = defaultedMap6.get((java.lang.Object) defaultedMap21);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) (byte) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = null;
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate41, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        boolean b45 = defaultedMap6.containsValue((java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) 'a');
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        boolean b53 = defaultedMap47.isEmpty();
        java.lang.Object obj55 = defaultedMap47.remove((java.lang.Object) "hi!");
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 100L);
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) 'a');
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        java.util.Collection collection66 = defaultedMap62.values();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        boolean b72 = defaultedMap70.containsKey((java.lang.Object) 'a');
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        java.util.Collection collection74 = defaultedMap68.values();
        java.lang.Object obj75 = defaultedMap62.get((java.lang.Object) collection74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj78 = defaultedMap62.remove((java.lang.Object) defaultedMap77);
        java.lang.Object obj79 = defaultedMap47.get((java.lang.Object) defaultedMap62);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) (byte) 100);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate83 = null;
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate82, predicate83);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        boolean b86 = defaultedMap47.containsValue((java.lang.Object) predicate85);
        java.lang.Object[] obj_array87 = new java.lang.Object[] { predicate0, defaultedMap2, defaultedMap6, predicate85 };
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array87);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator88);
        try {
            fixedOrderComparator88.setUnknownObjectBehavior((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + '#' + "'", obj38.equals('#'));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + '#' + "'", obj79.equals('#'));
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(obj_array87);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 'a');
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap9.isEmpty();
        java.lang.Object obj17 = defaultedMap9.remove((java.lang.Object) "hi!");
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100L);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) 'a');
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection36 = defaultedMap30.values();
        java.lang.Object obj37 = defaultedMap24.get((java.lang.Object) collection36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj40 = defaultedMap24.remove((java.lang.Object) defaultedMap39);
        java.lang.Object obj41 = defaultedMap9.get((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) 'a');
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        boolean b49 = defaultedMap43.isEmpty();
        java.lang.Object obj51 = defaultedMap43.remove((java.lang.Object) "hi!");
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) 100L);
        defaultedMap43.clear();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap43);
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        defaultedMap9.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + '#' + "'", obj41.equals('#'));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + '#' + "'", obj56.equals('#'));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.util.Set set6 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) 'a');
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj44 = defaultedMap37.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) 'a');
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        boolean b52 = defaultedMap46.isEmpty();
        java.lang.Object obj54 = defaultedMap46.remove((java.lang.Object) "hi!");
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 100L);
        defaultedMap46.clear();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) 'a');
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        java.util.Collection collection65 = defaultedMap61.values();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) 'a');
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.util.Collection collection73 = defaultedMap67.values();
        java.lang.Object obj74 = defaultedMap61.get((java.lang.Object) collection73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj77 = defaultedMap61.remove((java.lang.Object) defaultedMap76);
        java.lang.Object obj78 = defaultedMap46.get((java.lang.Object) defaultedMap61);
        defaultedMap37.putAll((java.util.Map) defaultedMap61);
        java.lang.Object obj80 = defaultedMap1.remove((java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap61);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + '#' + "'", obj44.equals('#'));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + '#' + "'", obj78.equals('#'));
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 'a');
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b24 = defaultedMap18.isEmpty();
        java.lang.Object obj26 = defaultedMap18.remove((java.lang.Object) "hi!");
        boolean b28 = defaultedMap18.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set29 = defaultedMap18.entrySet();
        java.lang.Object obj30 = defaultedMap10.put((java.lang.Object) 1.0d, (java.lang.Object) set29);
        java.lang.Object obj31 = defaultedMap5.get(obj30);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = null;
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) 'a');
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        boolean b46 = defaultedMap40.isEmpty();
        java.lang.Object obj48 = defaultedMap40.remove((java.lang.Object) "hi!");
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) 100L);
        defaultedMap40.clear();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) 'a');
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        java.util.Collection collection59 = defaultedMap55.values();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) 'a');
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        java.util.Collection collection67 = defaultedMap61.values();
        java.lang.Object obj68 = defaultedMap55.get((java.lang.Object) collection67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj71 = defaultedMap55.remove((java.lang.Object) defaultedMap70);
        java.lang.Object obj72 = defaultedMap40.get((java.lang.Object) defaultedMap55);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) (byte) 100);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = null;
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate75, predicate76);
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        boolean b79 = defaultedMap40.containsValue((java.lang.Object) predicate78);
        collections.Predicate predicate80 = null;
        java.util.Map map81 = collections.map.PredicatedMap.decorate(map38, predicate78, predicate80);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + '#' + "'", obj72.equals('#'));
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = null;
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        boolean b40 = defaultedMap1.containsValue((java.lang.Object) predicate39);
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap1.containsValue(obj41);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) 'a');
        java.util.Collection collection47 = defaultedMap44.values();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap44);
        boolean b49 = defaultedMap1.containsKey((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 'a');
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b41 = defaultedMap35.isEmpty();
        java.lang.Object obj43 = defaultedMap35.remove((java.lang.Object) "hi!");
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100L);
        defaultedMap35.clear();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap35);
        int i48 = defaultedMap35.size();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 'a');
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        java.util.Collection collection56 = defaultedMap50.values();
        java.lang.Object obj57 = defaultedMap35.get((java.lang.Object) defaultedMap50);
        java.util.Collection collection58 = defaultedMap35.values();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + '#' + "'", obj57.equals('#'));
        org.junit.Assert.assertNotNull(collection58);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 'a');
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap11.isEmpty();
        java.lang.Object obj19 = defaultedMap11.remove((java.lang.Object) "hi!");
        boolean b21 = defaultedMap11.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set22 = defaultedMap11.entrySet();
        java.lang.Object obj23 = defaultedMap3.put((java.lang.Object) 1.0d, (java.lang.Object) set22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        int i25 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b26 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 'a');
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection34 = defaultedMap28.values();
        boolean b35 = fixedOrderComparator24.add((java.lang.Object) collection34);
        java.lang.Object obj36 = defaultedMap3.get((java.lang.Object) fixedOrderComparator24);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        boolean b38 = fixedOrderComparator37.isLocked();
        int i39 = fixedOrderComparator37.getUnknownObjectBehavior();
        fixedOrderComparator37.setUnknownObjectBehavior((int) (byte) 1);
        boolean b42 = fixedOrderComparator37.isLocked();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) fixedOrderComparator37);
        int i44 = fixedOrderComparator37.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(i44 == 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 'a');
        defaultedMap2.putAll((java.util.Map) defaultedMap4);
        boolean b8 = defaultedMap2.isEmpty();
        java.lang.Object obj10 = defaultedMap2.remove((java.lang.Object) "hi!");
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) 100L);
        defaultedMap2.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 'a');
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection21 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 'a');
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Collection collection29 = defaultedMap23.values();
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) collection29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj33 = defaultedMap17.remove((java.lang.Object) defaultedMap32);
        java.lang.Object obj34 = defaultedMap2.get((java.lang.Object) defaultedMap17);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) (byte) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = null;
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) 'a');
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.util.Collection collection48 = defaultedMap42.values();
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        boolean b58 = defaultedMap56.containsKey((java.lang.Object) 'a');
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        boolean b60 = defaultedMap54.isEmpty();
        java.lang.Object obj62 = defaultedMap54.remove((java.lang.Object) "hi!");
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) 100L);
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) 'a');
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        java.util.Collection collection73 = defaultedMap69.values();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj76 = null;
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap(obj76);
        boolean b79 = defaultedMap77.containsKey((java.lang.Object) 'a');
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        java.util.Collection collection81 = defaultedMap75.values();
        java.lang.Object obj82 = defaultedMap69.get((java.lang.Object) collection81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj85 = defaultedMap69.remove((java.lang.Object) defaultedMap84);
        java.lang.Object obj86 = defaultedMap54.get((java.lang.Object) defaultedMap69);
        collections.PredicateUtils predicateUtils87 = new collections.PredicateUtils();
        boolean b88 = defaultedMap54.equals((java.lang.Object) predicateUtils87);
        java.lang.Object[] obj_array89 = new java.lang.Object[] { 10, predicate37, 10L, defaultedMap42, defaultedMap50, defaultedMap54 };
        collections.comparators.FixedOrderComparator fixedOrderComparator90 = new collections.comparators.FixedOrderComparator(obj_array89);
        boolean b91 = fixedOrderComparator90.isLocked();
        boolean b92 = fixedOrderComparator90.isLocked();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + '#' + "'", obj34.equals('#'));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + '#' + "'", obj86.equals('#'));
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(obj_array89);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set7 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 'a');
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b41 = defaultedMap35.isEmpty();
        java.lang.Object obj43 = defaultedMap35.remove((java.lang.Object) "hi!");
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100L);
        defaultedMap35.clear();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap35);
        java.util.Set set48 = defaultedMap35.keySet();
        defaultedMap35.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        int i10 = defaultedMap1.size();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.remove(obj11);
        int i13 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 'a');
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b14 = defaultedMap8.isEmpty();
        java.lang.Object obj16 = defaultedMap8.remove((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 'a');
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b24 = defaultedMap18.isEmpty();
        java.lang.Object obj26 = defaultedMap18.remove((java.lang.Object) "hi!");
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 100L);
        boolean b29 = defaultedMap8.containsKey((java.lang.Object) map28);
        boolean b30 = defaultedMap1.equals((java.lang.Object) map28);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) 'a');
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection10 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) 'a');
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.util.Collection collection18 = defaultedMap12.values();
        java.lang.Object obj19 = defaultedMap6.get((java.lang.Object) collection18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj22 = defaultedMap6.remove((java.lang.Object) defaultedMap21);
        boolean b23 = fixedOrderComparator0.add(obj22);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) 'a');
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b9 = defaultedMap3.isEmpty();
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) "hi!");
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) 100L);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 'a');
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection22 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 'a');
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap18.get((java.lang.Object) collection30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj34 = defaultedMap18.remove((java.lang.Object) defaultedMap33);
        java.lang.Object obj35 = defaultedMap3.get((java.lang.Object) defaultedMap18);
        boolean b36 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 'a');
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        boolean b45 = defaultedMap39.isEmpty();
        java.lang.Object obj47 = defaultedMap39.remove((java.lang.Object) "hi!");
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 100L);
        defaultedMap39.clear();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) 'a');
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        boolean b58 = defaultedMap52.isEmpty();
        java.lang.Object obj60 = defaultedMap52.remove((java.lang.Object) "hi!");
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 100L);
        defaultedMap52.clear();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        boolean b69 = defaultedMap67.containsKey((java.lang.Object) 'a');
        defaultedMap65.putAll((java.util.Map) defaultedMap67);
        java.util.Collection collection71 = defaultedMap67.values();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj74 = null;
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap(obj74);
        boolean b77 = defaultedMap75.containsKey((java.lang.Object) 'a');
        defaultedMap73.putAll((java.util.Map) defaultedMap75);
        java.util.Collection collection79 = defaultedMap73.values();
        java.lang.Object obj80 = defaultedMap67.get((java.lang.Object) collection79);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj83 = defaultedMap67.remove((java.lang.Object) defaultedMap82);
        java.lang.Object obj84 = defaultedMap52.get((java.lang.Object) defaultedMap67);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) (byte) 100);
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate88 = null;
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate87, predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate87, predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate37, predicate90);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + '#' + "'", obj35.equals('#'));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + '#' + "'", obj84.equals('#'));
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 'a');
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b41 = defaultedMap35.isEmpty();
        java.lang.Object obj43 = defaultedMap35.remove((java.lang.Object) "hi!");
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100L);
        defaultedMap35.clear();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap35);
        java.util.Set set48 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 'a');
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        boolean b56 = defaultedMap50.isEmpty();
        java.lang.Object obj58 = defaultedMap50.remove((java.lang.Object) "hi!");
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 100L);
        defaultedMap50.clear();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) 'a');
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        java.util.Collection collection69 = defaultedMap65.values();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj72 = null;
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) 'a');
        defaultedMap71.putAll((java.util.Map) defaultedMap73);
        java.util.Collection collection77 = defaultedMap71.values();
        java.lang.Object obj78 = defaultedMap65.get((java.lang.Object) collection77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj81 = defaultedMap65.remove((java.lang.Object) defaultedMap80);
        java.lang.Object obj82 = defaultedMap50.get((java.lang.Object) defaultedMap65);
        collections.PredicateUtils predicateUtils83 = new collections.PredicateUtils();
        boolean b84 = defaultedMap50.equals((java.lang.Object) predicateUtils83);
        boolean b85 = defaultedMap1.containsKey((java.lang.Object) defaultedMap50);
        java.lang.Object obj86 = null;
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap(obj86);
        boolean b89 = defaultedMap87.containsKey((java.lang.Object) 'a');
        java.util.Set set90 = defaultedMap87.keySet();
        java.util.Set set91 = defaultedMap87.keySet();
        boolean b92 = defaultedMap50.equals((java.lang.Object) defaultedMap87);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + '#' + "'", obj82.equals('#'));
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertTrue(b92 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.add((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 'a');
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b11 = defaultedMap5.isEmpty();
        java.lang.Object obj13 = defaultedMap5.remove((java.lang.Object) "hi!");
        java.util.Set set14 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 'a');
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.util.Collection collection22 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 'a');
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap18.get((java.lang.Object) collection30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj34 = defaultedMap18.remove((java.lang.Object) defaultedMap33);
        try {
            boolean b35 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) 'a');
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.util.Collection collection10 = defaultedMap4.values();
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) collection10);
        boolean b12 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 'a');
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Collection collection15 = defaultedMap9.values();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) collection15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = defaultedMap3.remove((java.lang.Object) defaultedMap18);
        java.util.Collection collection20 = defaultedMap3.values();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        fixedOrderComparator3.setUnknownObjectBehavior(0);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        int i12 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 'a');
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 'a');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b19 = defaultedMap13.isEmpty();
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap13.equals(obj20);
        java.lang.Object obj22 = defaultedMap7.get(obj20);
        java.lang.Object obj23 = defaultedMap1.get(obj22);
        java.util.Collection collection24 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) 'a');
        defaultedMap2.putAll((java.util.Map) defaultedMap4);
        java.util.Collection collection8 = defaultedMap2.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 'a');
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b16 = defaultedMap10.isEmpty();
        java.lang.Object obj18 = defaultedMap10.remove((java.lang.Object) "hi!");
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100L);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 'a');
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Collection collection29 = defaultedMap25.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) 'a');
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        java.util.Collection collection37 = defaultedMap31.values();
        java.lang.Object obj38 = defaultedMap25.get((java.lang.Object) collection37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj41 = defaultedMap25.remove((java.lang.Object) defaultedMap40);
        java.lang.Object obj42 = defaultedMap10.get((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) 'a');
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        boolean b50 = defaultedMap44.isEmpty();
        java.lang.Object obj52 = defaultedMap44.remove((java.lang.Object) "hi!");
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) 100L);
        defaultedMap44.clear();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap44);
        java.lang.Object obj57 = defaultedMap2.get((java.lang.Object) defaultedMap10);
        try {
            java.util.Map map58 = collections.map.DefaultedMap.decorate(map0, obj57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + '#' + "'", obj42.equals('#'));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + '#' + "'", obj57.equals('#'));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.equals(obj8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 'a');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b19 = defaultedMap13.isEmpty();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) 'a');
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 'a');
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        boolean b33 = defaultedMap27.isEmpty();
        java.lang.Object obj35 = defaultedMap27.remove((java.lang.Object) "hi!");
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 100L);
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) 'a');
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        boolean b46 = defaultedMap40.isEmpty();
        java.lang.Object obj48 = defaultedMap40.remove((java.lang.Object) "hi!");
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) 100L);
        defaultedMap40.clear();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) 'a');
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        java.util.Collection collection59 = defaultedMap55.values();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) 'a');
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        java.util.Collection collection67 = defaultedMap61.values();
        java.lang.Object obj68 = defaultedMap55.get((java.lang.Object) collection67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj71 = defaultedMap55.remove((java.lang.Object) defaultedMap70);
        java.lang.Object obj72 = defaultedMap40.get((java.lang.Object) defaultedMap55);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) (byte) 100);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = null;
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate75, predicate76);
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        boolean b79 = defaultedMap40.containsValue((java.lang.Object) predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate78, predicate80);
        java.lang.Object obj83 = defaultedMap21.put((java.lang.Object) defaultedMap27, (java.lang.Object) true);
        defaultedMap13.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj85 = defaultedMap11.get((java.lang.Object) defaultedMap27);
        java.lang.Object obj86 = defaultedMap1.remove((java.lang.Object) defaultedMap11);
        boolean b88 = defaultedMap11.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + '#' + "'", obj72.equals('#'));
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue(b88 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 'a');
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b41 = defaultedMap35.isEmpty();
        java.lang.Object obj43 = defaultedMap35.remove((java.lang.Object) "hi!");
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100L);
        defaultedMap35.clear();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap35);
        boolean b48 = defaultedMap35.isEmpty();
        java.util.Set set49 = defaultedMap35.keySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 'a');
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Collection collection15 = defaultedMap9.values();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) collection15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = defaultedMap3.remove((java.lang.Object) defaultedMap18);
        java.lang.String str20 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b23 = defaultedMap18.containsValue((java.lang.Object) defaultedMap22);
        int i24 = defaultedMap22.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.add((java.lang.Object) (-1));
        boolean b4 = fixedOrderComparator0.isLocked();
        int i5 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 'a');
        java.util.Collection collection10 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = null;
        try {
            int i13 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap7, obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 2);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 'a');
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap9.isEmpty();
        java.lang.Object obj17 = defaultedMap9.remove((java.lang.Object) "hi!");
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100L);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        boolean b28 = defaultedMap22.isEmpty();
        java.lang.Object obj30 = defaultedMap22.remove((java.lang.Object) "hi!");
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100L);
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 'a');
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.util.Collection collection41 = defaultedMap37.values();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) 'a');
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        java.util.Collection collection49 = defaultedMap43.values();
        java.lang.Object obj50 = defaultedMap37.get((java.lang.Object) collection49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj53 = defaultedMap37.remove((java.lang.Object) defaultedMap52);
        java.lang.Object obj54 = defaultedMap22.get((java.lang.Object) defaultedMap37);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (byte) 100);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = null;
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        boolean b61 = defaultedMap22.containsValue((java.lang.Object) predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate60, predicate62);
        java.lang.Object obj65 = defaultedMap3.put((java.lang.Object) defaultedMap9, (java.lang.Object) true);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        boolean b72 = defaultedMap70.containsKey((java.lang.Object) 'a');
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        boolean b74 = defaultedMap68.isEmpty();
        java.lang.Object obj76 = defaultedMap68.remove((java.lang.Object) "hi!");
        boolean b78 = defaultedMap68.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set79 = defaultedMap68.entrySet();
        boolean b80 = defaultedMap3.containsKey((java.lang.Object) defaultedMap68);
        try {
            boolean b81 = fixedOrderComparator0.addAsEqual((java.lang.Object) 10.0d, (java.lang.Object) b80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + '#' + "'", obj54.equals('#'));
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = null;
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        boolean b40 = defaultedMap1.containsValue((java.lang.Object) predicate39);
        java.util.Set set41 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        boolean b35 = defaultedMap1.equals((java.lang.Object) predicateUtils34);
        java.util.Set set36 = defaultedMap1.entrySet();
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        boolean b39 = defaultedMap1.isEmpty();
        int i40 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i40 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 'a');
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b17 = defaultedMap11.isEmpty();
        java.lang.Object obj19 = defaultedMap11.remove((java.lang.Object) "hi!");
        boolean b21 = defaultedMap11.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set22 = defaultedMap11.entrySet();
        java.lang.Object obj23 = defaultedMap3.put((java.lang.Object) 1.0d, (java.lang.Object) set22);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        int i25 = fixedOrderComparator24.getUnknownObjectBehavior();
        boolean b26 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 'a');
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection34 = defaultedMap28.values();
        boolean b35 = fixedOrderComparator24.add((java.lang.Object) collection34);
        java.lang.Object obj36 = defaultedMap3.get((java.lang.Object) fixedOrderComparator24);
        boolean b37 = fixedOrderComparator24.isLocked();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 'a');
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        boolean b45 = defaultedMap39.isEmpty();
        java.lang.Object obj47 = defaultedMap39.remove((java.lang.Object) "hi!");
        boolean b49 = defaultedMap39.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj50 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj52 = defaultedMap39.get(obj50);
        boolean b53 = defaultedMap39.isEmpty();
        boolean b54 = fixedOrderComparator24.add((java.lang.Object) defaultedMap39);
        java.lang.String str55 = defaultedMap39.toString();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + '#' + "'", obj52.equals('#'));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 'a');
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap7.isEmpty();
        java.lang.Object obj15 = defaultedMap7.remove((java.lang.Object) "hi!");
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) 'a');
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b26 = defaultedMap20.isEmpty();
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) "hi!");
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100L);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 'a');
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.util.Collection collection39 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) 'a');
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.util.Collection collection47 = defaultedMap41.values();
        java.lang.Object obj48 = defaultedMap35.get((java.lang.Object) collection47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj51 = defaultedMap35.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj52 = defaultedMap20.get((java.lang.Object) defaultedMap35);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (byte) 100);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = null;
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        boolean b59 = defaultedMap20.containsValue((java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate58, predicate60);
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) true);
        defaultedMap1.clear();
        int i65 = defaultedMap1.size();
        java.lang.String str66 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + '#' + "'", obj52.equals('#'));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 'a');
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap9.isEmpty();
        java.lang.Object obj17 = defaultedMap9.remove((java.lang.Object) "hi!");
        int i18 = defaultedMap9.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        int i20 = fixedOrderComparator19.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        boolean b28 = defaultedMap22.isEmpty();
        java.lang.Object obj30 = defaultedMap22.remove((java.lang.Object) "hi!");
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100L);
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 'a');
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.util.Collection collection41 = defaultedMap37.values();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) 'a');
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        java.util.Collection collection49 = defaultedMap43.values();
        java.lang.Object obj50 = defaultedMap37.get((java.lang.Object) collection49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj53 = defaultedMap37.remove((java.lang.Object) defaultedMap52);
        java.lang.Object obj54 = defaultedMap22.get((java.lang.Object) defaultedMap37);
        boolean b55 = fixedOrderComparator19.add((java.lang.Object) defaultedMap22);
        defaultedMap9.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj57 = defaultedMap1.get((java.lang.Object) defaultedMap22);
        defaultedMap22.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + '#' + "'", obj54.equals('#'));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + '#' + "'", obj57.equals('#'));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.Map map0 = null;
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        int i2 = fixedOrderComparator1.getUnknownObjectBehavior();
        boolean b3 = fixedOrderComparator1.isLocked();
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) b3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map2 = null;
        try {
            defaultedMap1.putAll(map2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 'a');
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b41 = defaultedMap35.isEmpty();
        java.lang.Object obj43 = defaultedMap35.remove((java.lang.Object) "hi!");
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100L);
        defaultedMap35.clear();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap35);
        collections.Transformer transformer48 = null;
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 'a');
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.util.Collection collection16 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 'a');
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b24 = defaultedMap18.isEmpty();
        java.lang.Object obj26 = defaultedMap18.remove((java.lang.Object) "hi!");
        int i27 = defaultedMap18.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        int i29 = fixedOrderComparator28.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) 'a');
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b37 = defaultedMap31.isEmpty();
        java.lang.Object obj39 = defaultedMap31.remove((java.lang.Object) "hi!");
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100L);
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) 'a');
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        java.util.Collection collection50 = defaultedMap46.values();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) 'a');
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        java.util.Collection collection58 = defaultedMap52.values();
        java.lang.Object obj59 = defaultedMap46.get((java.lang.Object) collection58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj62 = defaultedMap46.remove((java.lang.Object) defaultedMap61);
        java.lang.Object obj63 = defaultedMap31.get((java.lang.Object) defaultedMap46);
        boolean b64 = fixedOrderComparator28.add((java.lang.Object) defaultedMap31);
        defaultedMap18.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj66 = defaultedMap10.get((java.lang.Object) defaultedMap31);
        java.lang.Object obj67 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        java.util.Set set69 = defaultedMap68.keySet();
        java.lang.Object obj70 = defaultedMap10.get((java.lang.Object) set69);
        java.lang.Object obj71 = defaultedMap1.remove((java.lang.Object) set69);
        boolean b72 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i29 == 2);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + '#' + "'", obj63.equals('#'));
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + '#' + "'", obj66.equals('#'));
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + '#' + "'", obj70.equals('#'));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection7 = defaultedMap3.values();
        java.util.Collection collection8 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 'a');
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b16 = defaultedMap10.isEmpty();
        java.lang.Object obj18 = defaultedMap10.remove((java.lang.Object) "hi!");
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100L);
        defaultedMap3.putAll(map20);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        java.util.Collection collection6 = defaultedMap3.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator();
        int i8 = fixedOrderComparator7.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator7);
        java.lang.Object obj10 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        try {
            int i11 = fixedOrderComparator0.compare((java.lang.Object) 0.0f, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap1.keySet();
        java.lang.String str13 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 'a');
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b21 = defaultedMap15.isEmpty();
        java.lang.Object obj23 = defaultedMap15.remove((java.lang.Object) "hi!");
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 100L);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 'a');
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Collection collection34 = defaultedMap30.values();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) 'a');
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        java.util.Collection collection42 = defaultedMap36.values();
        java.lang.Object obj43 = defaultedMap30.get((java.lang.Object) collection42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj46 = defaultedMap30.remove((java.lang.Object) defaultedMap45);
        java.lang.Object obj47 = defaultedMap15.get((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 'a');
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        boolean b55 = defaultedMap49.isEmpty();
        java.lang.Object obj57 = defaultedMap49.remove((java.lang.Object) "hi!");
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 100L);
        defaultedMap49.clear();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap49);
        int i62 = defaultedMap49.size();
        java.lang.Object obj63 = defaultedMap1.get((java.lang.Object) defaultedMap49);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + '#' + "'", obj47.equals('#'));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + '#' + "'", obj63.equals('#'));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 'a');
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 'a');
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b21 = defaultedMap15.isEmpty();
        java.lang.Object obj23 = defaultedMap15.remove((java.lang.Object) "hi!");
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 100L);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 'a');
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        boolean b34 = defaultedMap28.isEmpty();
        java.lang.Object obj36 = defaultedMap28.remove((java.lang.Object) "hi!");
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 100L);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) 'a');
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.util.Collection collection47 = defaultedMap43.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 'a');
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        java.util.Collection collection55 = defaultedMap49.values();
        java.lang.Object obj56 = defaultedMap43.get((java.lang.Object) collection55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj59 = defaultedMap43.remove((java.lang.Object) defaultedMap58);
        java.lang.Object obj60 = defaultedMap28.get((java.lang.Object) defaultedMap43);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (byte) 100);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = null;
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        boolean b67 = defaultedMap28.containsValue((java.lang.Object) predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate66, predicate68);
        java.lang.Object obj71 = defaultedMap9.put((java.lang.Object) defaultedMap15, (java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator();
        boolean b74 = fixedOrderComparator73.isLocked();
        boolean b76 = fixedOrderComparator73.add((java.lang.Object) (-1));
        boolean b78 = fixedOrderComparator73.add((java.lang.Object) (short) 0);
        java.lang.Object obj79 = defaultedMap1.remove((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + '#' + "'", obj60.equals('#'));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 'a');
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 'a');
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b13 = defaultedMap7.isEmpty();
        java.lang.Object obj15 = defaultedMap7.remove((java.lang.Object) "hi!");
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) 'a');
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b26 = defaultedMap20.isEmpty();
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) "hi!");
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100L);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 'a');
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.util.Collection collection39 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) 'a');
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.util.Collection collection47 = defaultedMap41.values();
        java.lang.Object obj48 = defaultedMap35.get((java.lang.Object) collection47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj51 = defaultedMap35.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj52 = defaultedMap20.get((java.lang.Object) defaultedMap35);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (byte) 100);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = null;
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        boolean b59 = defaultedMap20.containsValue((java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate58, predicate60);
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) true);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        boolean b70 = defaultedMap68.containsKey((java.lang.Object) 'a');
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        java.util.Collection collection72 = defaultedMap68.values();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        boolean b78 = defaultedMap76.containsKey((java.lang.Object) 'a');
        defaultedMap74.putAll((java.util.Map) defaultedMap76);
        java.util.Collection collection80 = defaultedMap74.values();
        java.lang.Object obj81 = defaultedMap68.get((java.lang.Object) collection80);
        boolean b82 = defaultedMap1.containsKey(obj81);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + '#' + "'", obj52.equals('#'));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b82 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) 'a');
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) predicate42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) 'a');
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        boolean b52 = defaultedMap46.isEmpty();
        java.lang.Object obj54 = defaultedMap46.remove((java.lang.Object) "hi!");
        boolean b56 = defaultedMap46.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set57 = defaultedMap46.entrySet();
        java.lang.Object obj58 = defaultedMap38.put((java.lang.Object) 1.0d, (java.lang.Object) set57);
        java.lang.Object obj59 = null;
        java.lang.Object obj60 = defaultedMap38.get(obj59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        boolean b66 = defaultedMap64.containsKey((java.lang.Object) 'a');
        defaultedMap62.putAll((java.util.Map) defaultedMap64);
        boolean b68 = defaultedMap62.isEmpty();
        java.lang.Object obj70 = defaultedMap62.remove((java.lang.Object) "hi!");
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) 100L);
        defaultedMap62.clear();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj76 = null;
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap(obj76);
        boolean b79 = defaultedMap77.containsKey((java.lang.Object) 'a');
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        java.util.Collection collection81 = defaultedMap77.values();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj84 = null;
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap(obj84);
        boolean b87 = defaultedMap85.containsKey((java.lang.Object) 'a');
        defaultedMap83.putAll((java.util.Map) defaultedMap85);
        java.util.Collection collection89 = defaultedMap83.values();
        java.lang.Object obj90 = defaultedMap77.get((java.lang.Object) collection89);
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj93 = defaultedMap77.remove((java.lang.Object) defaultedMap92);
        java.lang.Object obj94 = defaultedMap62.get((java.lang.Object) defaultedMap77);
        collections.PredicateUtils predicateUtils95 = new collections.PredicateUtils();
        boolean b96 = defaultedMap62.equals((java.lang.Object) predicateUtils95);
        java.util.Set set97 = defaultedMap62.entrySet();
        java.lang.Object obj98 = defaultedMap38.get((java.lang.Object) set97);
        java.lang.Object obj99 = defaultedMap16.get((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + '#' + "'", obj94.equals('#'));
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertNotNull(set97);
        org.junit.Assert.assertNull(obj98);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b2 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b2 = fixedOrderComparator0.add((java.lang.Object) "");
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        int i4 = fixedOrderComparator3.getUnknownObjectBehavior();
        fixedOrderComparator3.setUnknownObjectBehavior(0);
        boolean b7 = fixedOrderComparator0.add((java.lang.Object) 0);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i4 == 2);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        int i12 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 'a');
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection21 = defaultedMap17.values();
        java.util.Collection collection22 = defaultedMap17.values();
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) collection22);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) 'a');
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b16 = defaultedMap10.isEmpty();
        java.lang.Object obj18 = defaultedMap10.remove((java.lang.Object) "hi!");
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100L);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 'a');
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Collection collection29 = defaultedMap25.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) 'a');
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        java.util.Collection collection37 = defaultedMap31.values();
        java.lang.Object obj38 = defaultedMap25.get((java.lang.Object) collection37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj41 = defaultedMap25.remove((java.lang.Object) defaultedMap40);
        java.lang.Object obj42 = defaultedMap10.get((java.lang.Object) defaultedMap25);
        defaultedMap1.putAll((java.util.Map) defaultedMap25);
        collections.Transformer transformer44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, transformer44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + '#' + "'", obj42.equals('#'));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) "hi!");
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 'a');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 'a');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Collection collection28 = defaultedMap22.values();
        java.lang.Object obj29 = defaultedMap16.get((java.lang.Object) collection28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap16.remove((java.lang.Object) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        boolean b35 = defaultedMap1.equals((java.lang.Object) predicateUtils34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) 'a');
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        boolean b43 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.remove((java.lang.Object) "hi!");
        int i46 = defaultedMap37.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator();
        int i48 = fixedOrderComparator47.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 'a');
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        boolean b56 = defaultedMap50.isEmpty();
        java.lang.Object obj58 = defaultedMap50.remove((java.lang.Object) "hi!");
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 100L);
        defaultedMap50.clear();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) 'a');
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        java.util.Collection collection69 = defaultedMap65.values();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj72 = null;
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) 'a');
        defaultedMap71.putAll((java.util.Map) defaultedMap73);
        java.util.Collection collection77 = defaultedMap71.values();
        java.lang.Object obj78 = defaultedMap65.get((java.lang.Object) collection77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj81 = defaultedMap65.remove((java.lang.Object) defaultedMap80);
        java.lang.Object obj82 = defaultedMap50.get((java.lang.Object) defaultedMap65);
        boolean b83 = fixedOrderComparator47.add((java.lang.Object) defaultedMap50);
        defaultedMap37.putAll((java.util.Map) defaultedMap50);
        java.util.Collection collection85 = defaultedMap50.values();
        boolean b86 = defaultedMap1.containsKey((java.lang.Object) collection85);
        collections.comparators.FixedOrderComparator fixedOrderComparator87 = new collections.comparators.FixedOrderComparator();
        boolean b89 = fixedOrderComparator87.add((java.lang.Object) "");
        java.lang.Object obj90 = defaultedMap1.get((java.lang.Object) "");
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i48 == 2);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + '#' + "'", obj82.equals('#'));
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + '#' + "'", obj90.equals('#'));
    }
}

