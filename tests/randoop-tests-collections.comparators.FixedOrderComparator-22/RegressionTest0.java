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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            int i3 = fixedOrderComparator0.compare((java.lang.Object) (byte) 100, (java.lang.Object) (short) -1);
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
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object obj1 = null;
        try {
            int i3 = fixedOrderComparator0.compare(obj1, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
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
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj14 = null;
        try {
            boolean b15 = fixedOrderComparator6.addAsEqual((java.lang.Object) obj_array12, obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj_array12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object[] obj_array0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_BEFORE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) map6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        defaultedMap1.putAll(map12);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate16, predicate18);
        try {
            boolean b20 = fixedOrderComparator6.addAsEqual((java.lang.Object) 10.0d, (java.lang.Object) predicate16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 100 + "'", obj6.equals((short) 100));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        java.lang.String str2 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        boolean b12 = defaultedMap6.containsKey((java.lang.Object) map11);
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) map11);
        boolean b15 = defaultedMap3.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        defaultedMap17.clear();
        boolean b23 = defaultedMap17.containsValue((java.lang.Object) "");
        int i24 = defaultedMap17.size();
        try {
            int i25 = fixedOrderComparator0.compare((java.lang.Object) '#', (java.lang.Object) defaultedMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 100 + "'", obj13.equals((short) 100));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) (-1));
        java.lang.Object obj10 = new java.lang.Object();
        try {
            int i11 = fixedOrderComparator6.compare((java.lang.Object) 100.0d, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b22 = fixedOrderComparator20.add((java.lang.Object) (-1));
        boolean b23 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator20);
        boolean b24 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate3, predicate4);
        defaultedMap2.clear();
        boolean b8 = defaultedMap2.containsValue((java.lang.Object) "");
        int i9 = defaultedMap2.size();
        java.util.Set set10 = defaultedMap2.entrySet();
        java.lang.Object obj12 = defaultedMap2.remove((java.lang.Object) "{}");
        try {
            boolean b14 = fixedOrderComparator0.addAsEqual((java.lang.Object) "{}", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) (-1));
        try {
            boolean b11 = fixedOrderComparator6.addAsEqual((java.lang.Object) 1.0f, (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        int i25 = fixedOrderComparator16.compare((java.lang.Object) predicate22, (java.lang.Object) 10L);
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator16);
        int i27 = fixedOrderComparator16.getUnknownObjectBehavior();
        try {
            fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) (short) 1);
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 100 + "'", obj6.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 100 + "'", obj13.equals((short) 100));
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) (-1));
        int i9 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        defaultedMap11.clear();
        boolean b17 = defaultedMap11.containsValue((java.lang.Object) "");
        int i18 = defaultedMap11.size();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        fixedOrderComparator26.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        int i35 = fixedOrderComparator26.compare((java.lang.Object) predicate32, (java.lang.Object) 10L);
        java.lang.Object obj36 = defaultedMap11.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator26);
        int i37 = fixedOrderComparator26.getUnknownObjectBehavior();
        boolean b38 = fixedOrderComparator26.isLocked();
        try {
            int i40 = fixedOrderComparator6.compare((java.lang.Object) fixedOrderComparator26, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap3.clear();
        boolean b5 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        java.lang.Object[] obj_array8 = new java.lang.Object[] { predicate4, 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { predicate12, 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        try {
            int i18 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator9, (java.lang.Object) fixedOrderComparator17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(obj_array16);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        boolean b17 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        boolean b17 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        int i25 = fixedOrderComparator16.compare((java.lang.Object) predicate22, (java.lang.Object) 10L);
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator16);
        int i27 = fixedOrderComparator16.getUnknownObjectBehavior();
        try {
            fixedOrderComparator16.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.entrySet();
        int i10 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) map17);
        defaultedMap1.putAll(map17);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate(map17, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        java.util.Set set12 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.entrySet();
        int i10 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate18);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.entrySet();
        java.lang.String str10 = defaultedMap1.toString();
        boolean b11 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate3, predicate4);
        java.lang.Object obj7 = defaultedMap2.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) (short) 1);
        boolean b15 = defaultedMap2.equals((java.lang.Object) defaultedMap9);
        java.lang.Object obj17 = defaultedMap2.remove((java.lang.Object) "{}");
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate(map0, obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) 100 + "'", obj7.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 100 + "'", obj14.equals((short) 100));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        defaultedMap9.clear();
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) "");
        int i16 = defaultedMap9.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        fixedOrderComparator24.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        int i33 = fixedOrderComparator24.compare((java.lang.Object) predicate30, (java.lang.Object) 10L);
        java.lang.Object obj34 = defaultedMap9.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator24);
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) fixedOrderComparator24);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate44);
        boolean b46 = defaultedMap40.containsKey((java.lang.Object) map45);
        java.lang.Object obj47 = defaultedMap37.get((java.lang.Object) map45);
        boolean b48 = defaultedMap1.equals((java.lang.Object) map45);
        collections.Transformer transformer49 = null;
        try {
            java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 100 + "'", obj35.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 100 + "'", obj47.equals((short) 100));
        org.junit.Assert.assertTrue(b48 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        defaultedMap3.clear();
        boolean b9 = defaultedMap3.containsValue((java.lang.Object) "");
        int i10 = defaultedMap3.size();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        fixedOrderComparator18.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        int i27 = fixedOrderComparator18.compare((java.lang.Object) predicate24, (java.lang.Object) 10L);
        java.lang.Object obj28 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator18);
        int i29 = defaultedMap3.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i29 == 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 100 + "'", obj6.equals((short) 100));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap11.clear();
        boolean b13 = defaultedMap9.equals((java.lang.Object) defaultedMap11);
        boolean b14 = defaultedMap11.isEmpty();
        try {
            boolean b16 = fixedOrderComparator7.addAsEqual((java.lang.Object) b14, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        boolean b9 = fixedOrderComparator6.isLocked();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        defaultedMap21.clear();
        boolean b27 = defaultedMap21.containsValue((java.lang.Object) "");
        boolean b28 = fixedOrderComparator17.add((java.lang.Object) defaultedMap21);
        try {
            boolean b29 = fixedOrderComparator6.addAsEqual((java.lang.Object) obj_array15, (java.lang.Object) b28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        defaultedMap20.clear();
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) "");
        int i27 = defaultedMap20.size();
        java.util.Set set28 = defaultedMap20.entrySet();
        int i29 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate33, predicate37);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) map40);
        java.lang.Object obj42 = defaultedMap4.get((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 100 + "'", obj42.equals((short) 100));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        boolean b17 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        int i19 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        defaultedMap21.clear();
        boolean b27 = defaultedMap21.containsValue((java.lang.Object) "");
        int i28 = defaultedMap21.size();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator36.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        int i45 = fixedOrderComparator36.compare((java.lang.Object) predicate42, (java.lang.Object) 10L);
        java.lang.Object obj46 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator36);
        java.lang.Object obj47 = defaultedMap13.get((java.lang.Object) fixedOrderComparator36);
        java.lang.Object obj49 = null;
        int i50 = fixedOrderComparator36.compare((java.lang.Object) (-1.0d), obj49);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 100 + "'", obj47.equals((short) 100));
        org.junit.Assert.assertTrue(i50 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { predicate2, 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        defaultedMap9.clear();
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) "");
        int i16 = defaultedMap9.size();
        java.util.Set set17 = defaultedMap9.entrySet();
        int i18 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate22, predicate26);
        java.lang.Object obj30 = null;
        try {
            boolean b31 = fixedOrderComparator7.addAsEqual((java.lang.Object) predicate22, obj30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        boolean b15 = defaultedMap9.containsKey((java.lang.Object) map14);
        java.lang.Object obj16 = defaultedMap6.get((java.lang.Object) map14);
        boolean b18 = defaultedMap6.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        boolean b29 = defaultedMap23.containsKey((java.lang.Object) map28);
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) map28);
        defaultedMap6.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) 100.0d, (java.lang.Object) defaultedMap6);
        boolean b33 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) 100 + "'", obj16.equals((short) 100));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 100 + "'", obj30.equals((short) 100));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap3.clear();
        boolean b5 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        boolean b17 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        boolean b19 = defaultedMap13.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        int i12 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b20 = defaultedMap14.containsKey((java.lang.Object) map19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        defaultedMap14.putAll(map25);
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) map25);
        java.lang.String str28 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        int i12 = defaultedMap1.size();
        java.util.Collection collection13 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        int i15 = fixedOrderComparator6.compare((java.lang.Object) predicate12, (java.lang.Object) 10L);
        int i16 = fixedOrderComparator6.getUnknownObjectBehavior();
        boolean b17 = fixedOrderComparator6.isLocked();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap4.clear();
        int i6 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) map17);
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) map17);
        boolean b21 = defaultedMap9.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) map31);
        java.lang.Object obj33 = defaultedMap23.get((java.lang.Object) map31);
        defaultedMap9.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj35 = defaultedMap4.put((java.lang.Object) 100.0d, (java.lang.Object) defaultedMap9);
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 100 + "'", obj19.equals((short) 100));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) 100 + "'", obj33.equals((short) 100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object[] obj_array6 = new java.lang.Object[] { predicate2, 1 };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.lang.Object obj13 = null;
        try {
            boolean b14 = fixedOrderComparator7.addAsEqual((java.lang.Object) map12, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) "");
        int i20 = defaultedMap13.size();
        java.util.Set set21 = defaultedMap13.entrySet();
        int i22 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        boolean b30 = defaultedMap24.containsKey((java.lang.Object) map29);
        defaultedMap13.putAll(map29);
        boolean b32 = defaultedMap1.containsKey((java.lang.Object) map29);
        java.util.Set set33 = defaultedMap1.keySet();
        java.util.Set set34 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        boolean b17 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        int i19 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        defaultedMap21.clear();
        boolean b27 = defaultedMap21.containsValue((java.lang.Object) "");
        int i28 = defaultedMap21.size();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator36.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        int i45 = fixedOrderComparator36.compare((java.lang.Object) predicate42, (java.lang.Object) 10L);
        java.lang.Object obj46 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator36);
        java.lang.Object obj47 = defaultedMap13.get((java.lang.Object) fixedOrderComparator36);
        java.lang.String str48 = defaultedMap13.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 100 + "'", obj47.equals((short) 100));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate18, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap25.clear();
        boolean b27 = defaultedMap23.equals((java.lang.Object) defaultedMap25);
        java.lang.Object obj28 = defaultedMap11.get((java.lang.Object) defaultedMap23);
        int i29 = defaultedMap23.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        defaultedMap31.clear();
        boolean b37 = defaultedMap31.containsValue((java.lang.Object) "");
        int i38 = defaultedMap31.size();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        fixedOrderComparator46.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        int i55 = fixedOrderComparator46.compare((java.lang.Object) predicate52, (java.lang.Object) 10L);
        java.lang.Object obj56 = defaultedMap31.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator46);
        java.lang.Object obj57 = defaultedMap23.get((java.lang.Object) fixedOrderComparator46);
        try {
            int i59 = fixedOrderComparator9.compare((java.lang.Object) fixedOrderComparator46, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 100 + "'", obj28.equals((short) 100));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (short) 100 + "'", obj57.equals((short) 100));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        boolean b17 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        int i19 = defaultedMap13.size();
        int i20 = defaultedMap13.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        int i12 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b20 = defaultedMap14.containsKey((java.lang.Object) map19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        defaultedMap14.putAll(map25);
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) map25);
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator28);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap29);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap13);
        int i19 = defaultedMap13.size();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) "");
        int i20 = defaultedMap13.size();
        java.util.Set set21 = defaultedMap13.entrySet();
        java.lang.Object obj22 = defaultedMap4.get((java.lang.Object) set21);
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array28);
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array28);
        boolean b33 = defaultedMap4.containsValue((java.lang.Object) obj_array28);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 100 + "'", obj22.equals((short) 100));
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        int i25 = fixedOrderComparator16.compare((java.lang.Object) predicate22, (java.lang.Object) 10L);
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator16);
        int i27 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        int i33 = defaultedMap29.size();
        int i34 = defaultedMap29.size();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap36.clear();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        defaultedMap39.clear();
        boolean b45 = defaultedMap39.containsValue((java.lang.Object) "");
        int i46 = defaultedMap39.size();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        fixedOrderComparator54.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        int i63 = fixedOrderComparator54.compare((java.lang.Object) predicate60, (java.lang.Object) 10L);
        java.lang.Object obj64 = defaultedMap39.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator54);
        int i65 = fixedOrderComparator54.getUnknownObjectBehavior();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) fixedOrderComparator54);
        boolean b67 = defaultedMap29.equals((java.lang.Object) defaultedMap36);
        boolean b68 = defaultedMap1.containsKey((java.lang.Object) defaultedMap29);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap16.containsKey((java.lang.Object) map21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        defaultedMap16.putAll(map27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate(map27, predicate29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate30, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate30);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 100 + "'", obj14.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        int i11 = defaultedMap4.size();
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) "");
        boolean b20 = fixedOrderComparator9.add((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        defaultedMap22.clear();
        boolean b27 = defaultedMap13.equals((java.lang.Object) defaultedMap22);
        boolean b28 = fixedOrderComparator6.add((java.lang.Object) b27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap32.clear();
        boolean b34 = defaultedMap30.equals((java.lang.Object) defaultedMap32);
        boolean b35 = defaultedMap32.isEmpty();
        boolean b36 = fixedOrderComparator6.add((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        boolean b47 = defaultedMap41.containsKey((java.lang.Object) map46);
        java.lang.Object obj48 = defaultedMap38.get((java.lang.Object) map46);
        boolean b50 = defaultedMap38.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap52.clear();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        boolean b61 = defaultedMap55.containsKey((java.lang.Object) map60);
        java.lang.Object obj62 = defaultedMap52.get((java.lang.Object) map60);
        defaultedMap38.putAll((java.util.Map) defaultedMap52);
        int i65 = fixedOrderComparator6.compare((java.lang.Object) defaultedMap52, (java.lang.Object) 10.0d);
        int i66 = fixedOrderComparator6.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 100 + "'", obj48.equals((short) 100));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (short) 100 + "'", obj62.equals((short) 100));
        org.junit.Assert.assertTrue(i65 == 1);
        org.junit.Assert.assertTrue(i66 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        defaultedMap16.clear();
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) "");
        int i23 = defaultedMap16.size();
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate35, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap40.clear();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        boolean b49 = defaultedMap43.containsKey((java.lang.Object) map48);
        java.lang.Object obj50 = defaultedMap40.get((java.lang.Object) map48);
        int i51 = defaultedMap40.size();
        java.util.Collection collection52 = defaultedMap40.values();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { '4', obj14, defaultedMap16, fixedOrderComparator24, predicate35, defaultedMap40 };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        boolean b55 = fixedOrderComparator6.add((java.lang.Object) fixedOrderComparator54);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 100 + "'", obj14.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (short) 100 + "'", obj50.equals((short) 100));
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(b55 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        int i25 = fixedOrderComparator16.compare((java.lang.Object) predicate22, (java.lang.Object) 10L);
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator16);
        int i27 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        defaultedMap29.clear();
        boolean b35 = defaultedMap29.containsValue((java.lang.Object) "");
        int i36 = defaultedMap29.size();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        fixedOrderComparator44.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        int i53 = fixedOrderComparator44.compare((java.lang.Object) predicate50, (java.lang.Object) 10L);
        java.lang.Object obj54 = defaultedMap29.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator44);
        int i55 = defaultedMap29.size();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        boolean b63 = defaultedMap57.containsKey((java.lang.Object) map62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        defaultedMap57.putAll(map68);
        java.lang.Object obj70 = defaultedMap1.put((java.lang.Object) i55, (java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap72.clear();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate78, predicate79);
        boolean b81 = defaultedMap75.containsKey((java.lang.Object) map80);
        java.lang.Object obj82 = defaultedMap72.get((java.lang.Object) map80);
        int i83 = defaultedMap72.size();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate86, predicate87);
        java.lang.Object obj90 = defaultedMap85.get((java.lang.Object) 1);
        java.lang.Object obj91 = defaultedMap72.get((java.lang.Object) 1);
        java.lang.Object obj93 = defaultedMap1.put((java.lang.Object) defaultedMap72, (java.lang.Object) "{}");
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(i55 == 1);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) 100 + "'", obj82.equals((short) 100));
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + (short) 100 + "'", obj90.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + (short) 100 + "'", obj91.equals((short) 100));
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        boolean b13 = defaultedMap1.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) map23);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) map23);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        int i25 = fixedOrderComparator16.compare((java.lang.Object) predicate22, (java.lang.Object) 10L);
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator16);
        try {
            fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) "");
        boolean b20 = fixedOrderComparator9.add((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        defaultedMap22.clear();
        boolean b27 = defaultedMap13.equals((java.lang.Object) defaultedMap22);
        boolean b28 = fixedOrderComparator6.add((java.lang.Object) b27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap32.clear();
        boolean b34 = defaultedMap30.equals((java.lang.Object) defaultedMap32);
        boolean b35 = defaultedMap32.isEmpty();
        boolean b36 = fixedOrderComparator6.add((java.lang.Object) defaultedMap32);
        int i37 = defaultedMap32.size();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) "");
        int i20 = defaultedMap13.size();
        java.util.Set set21 = defaultedMap13.entrySet();
        java.lang.Object obj22 = defaultedMap4.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap4.remove((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 100 + "'", obj22.equals((short) 100));
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        boolean b17 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.Object obj20 = defaultedMap13.get((java.lang.Object) (short) 1);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap3.clear();
        boolean b5 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap7.clear();
        int i9 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        boolean b21 = defaultedMap15.containsKey((java.lang.Object) map20);
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) map20);
        boolean b24 = defaultedMap12.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        boolean b35 = defaultedMap29.containsKey((java.lang.Object) map34);
        java.lang.Object obj36 = defaultedMap26.get((java.lang.Object) map34);
        defaultedMap12.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj38 = defaultedMap7.put((java.lang.Object) 100.0d, (java.lang.Object) defaultedMap12);
        boolean b40 = defaultedMap7.containsValue((java.lang.Object) (byte) 10);
        boolean b41 = defaultedMap3.containsValue((java.lang.Object) b40);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 100 + "'", obj22.equals((short) 100));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 100 + "'", obj36.equals((short) 100));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        boolean b17 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        int i19 = defaultedMap13.size();
        java.util.Set set20 = defaultedMap13.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        defaultedMap11.clear();
        boolean b17 = defaultedMap11.containsValue((java.lang.Object) "");
        int i18 = defaultedMap11.size();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        fixedOrderComparator26.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        int i35 = fixedOrderComparator26.compare((java.lang.Object) predicate32, (java.lang.Object) 10L);
        java.lang.Object obj36 = defaultedMap11.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator26);
        int i37 = fixedOrderComparator26.getUnknownObjectBehavior();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) fixedOrderComparator26);
        boolean b39 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap8.get(obj40);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 100 + "'", obj41.equals((short) 100));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        int i11 = defaultedMap4.size();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        fixedOrderComparator19.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        int i28 = fixedOrderComparator19.compare((java.lang.Object) predicate25, (java.lang.Object) 10L);
        java.lang.Object obj29 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator19);
        int i30 = fixedOrderComparator19.getUnknownObjectBehavior();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator19);
        int i32 = fixedOrderComparator19.getUnknownObjectBehavior();
        try {
            fixedOrderComparator19.setUnknownObjectBehavior((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        int i25 = fixedOrderComparator16.compare((java.lang.Object) predicate22, (java.lang.Object) 10L);
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator16);
        int i27 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        defaultedMap29.clear();
        boolean b35 = defaultedMap29.containsValue((java.lang.Object) "");
        int i36 = defaultedMap29.size();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        fixedOrderComparator44.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        int i53 = fixedOrderComparator44.compare((java.lang.Object) predicate50, (java.lang.Object) 10L);
        java.lang.Object obj54 = defaultedMap29.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator44);
        int i55 = defaultedMap29.size();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        boolean b63 = defaultedMap57.containsKey((java.lang.Object) map62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        defaultedMap57.putAll(map68);
        java.lang.Object obj70 = defaultedMap1.put((java.lang.Object) i55, (java.lang.Object) defaultedMap57);
        collections.Factory factory71 = null;
        try {
            java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(i55 == 1);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) (-1));
        int i9 = fixedOrderComparator6.getUnknownObjectBehavior();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        defaultedMap24.clear();
        boolean b30 = defaultedMap24.containsValue((java.lang.Object) "");
        int i31 = defaultedMap24.size();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        fixedOrderComparator39.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        int i48 = fixedOrderComparator39.compare((java.lang.Object) predicate45, (java.lang.Object) 10L);
        java.lang.Object obj49 = defaultedMap24.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator39);
        int i50 = fixedOrderComparator39.getUnknownObjectBehavior();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) fixedOrderComparator39);
        try {
            int i52 = fixedOrderComparator6.compare((java.lang.Object) fixedOrderComparator19, (java.lang.Object) defaultedMap21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.entrySet();
        int i10 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        boolean b21 = defaultedMap15.containsKey((java.lang.Object) map20);
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) map20);
        boolean b24 = defaultedMap12.containsValue((java.lang.Object) 100.0d);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap12);
        boolean b27 = defaultedMap12.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 100 + "'", obj22.equals((short) 100));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) map23);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) map23);
        boolean b27 = defaultedMap15.containsValue((java.lang.Object) 100.0d);
        int i28 = defaultedMap15.size();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj30 = defaultedMap15.get((java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set33 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap32.get((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set44 = defaultedMap43.keySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        java.lang.Object obj50 = defaultedMap43.get((java.lang.Object) predicate47);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate54);
        defaultedMap52.clear();
        boolean b58 = defaultedMap52.containsValue((java.lang.Object) "");
        int i59 = defaultedMap52.size();
        java.util.Set set60 = defaultedMap52.entrySet();
        java.lang.String str61 = defaultedMap52.toString();
        boolean b62 = defaultedMap52.isEmpty();
        java.lang.Object[] obj_array63 = new java.lang.Object[] { obj30, predicate36, (short) 100, defaultedMap43, b62 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        java.lang.Object obj65 = defaultedMap1.get((java.lang.Object) obj_array63);
        collections.Factory factory66 = null;
        try {
            java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 100 + "'", obj30.equals((short) 100));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + '4' + "'", obj39.equals('4'));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + '4' + "'", obj50.equals('4'));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (short) 100 + "'", obj65.equals((short) 100));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) map6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        defaultedMap1.putAll(map12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate(map12, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        defaultedMap18.clear();
        boolean b24 = defaultedMap18.containsValue((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        defaultedMap26.clear();
        boolean b32 = defaultedMap26.containsValue((java.lang.Object) "");
        int i33 = defaultedMap26.size();
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        fixedOrderComparator41.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        int i50 = fixedOrderComparator41.compare((java.lang.Object) predicate47, (java.lang.Object) 10L);
        java.lang.Object obj51 = defaultedMap26.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator41);
        java.lang.Object obj52 = defaultedMap18.get((java.lang.Object) fixedOrderComparator41);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        boolean b63 = defaultedMap57.containsKey((java.lang.Object) map62);
        java.lang.Object obj64 = defaultedMap54.get((java.lang.Object) map62);
        boolean b65 = defaultedMap18.equals((java.lang.Object) map62);
        java.util.Map map66 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) b65);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 100 + "'", obj52.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 100 + "'", obj64.equals((short) 100));
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        int i25 = fixedOrderComparator16.compare((java.lang.Object) predicate22, (java.lang.Object) 10L);
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator16);
        java.lang.Object obj27 = null;
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj27);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) "");
        boolean b20 = fixedOrderComparator9.add((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        defaultedMap22.clear();
        boolean b27 = defaultedMap13.equals((java.lang.Object) defaultedMap22);
        boolean b28 = fixedOrderComparator6.add((java.lang.Object) b27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap32.clear();
        boolean b34 = defaultedMap30.equals((java.lang.Object) defaultedMap32);
        boolean b35 = defaultedMap32.isEmpty();
        boolean b36 = fixedOrderComparator6.add((java.lang.Object) defaultedMap32);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator37);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap38);
        java.lang.Object obj41 = defaultedMap38.remove((java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) "");
        int i20 = defaultedMap13.size();
        java.util.Set set21 = defaultedMap13.entrySet();
        java.lang.Object obj22 = defaultedMap4.get((java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap27.clear();
        boolean b29 = defaultedMap25.equals((java.lang.Object) defaultedMap27);
        boolean b30 = defaultedMap27.isEmpty();
        java.lang.Object obj31 = defaultedMap4.put((java.lang.Object) false, (java.lang.Object) b30);
        boolean b33 = defaultedMap4.containsValue((java.lang.Object) 10.0d);
        collections.Transformer transformer34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 100 + "'", obj22.equals((short) 100));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) map17);
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) map17);
        boolean b21 = defaultedMap9.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) map31);
        java.lang.Object obj33 = defaultedMap23.get((java.lang.Object) map31);
        defaultedMap9.putAll((java.util.Map) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 100 + "'", obj19.equals((short) 100));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) 100 + "'", obj33.equals((short) 100));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        int i11 = defaultedMap4.size();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        fixedOrderComparator19.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        int i28 = fixedOrderComparator19.compare((java.lang.Object) predicate25, (java.lang.Object) 10L);
        java.lang.Object obj29 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator19);
        int i30 = fixedOrderComparator19.getUnknownObjectBehavior();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator19);
        int i32 = fixedOrderComparator19.getUnknownObjectBehavior();
        try {
            fixedOrderComparator19.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        boolean b13 = defaultedMap1.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) map23);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) map23);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        boolean b37 = defaultedMap31.containsKey((java.lang.Object) map36);
        java.lang.Object obj38 = defaultedMap28.get((java.lang.Object) map36);
        int i39 = defaultedMap28.size();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        java.lang.Object obj46 = defaultedMap41.get((java.lang.Object) 1);
        java.lang.Object obj47 = defaultedMap28.get((java.lang.Object) 1);
        java.lang.Object obj48 = defaultedMap1.get(obj47);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 100 + "'", obj38.equals((short) 100));
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 100 + "'", obj46.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 100 + "'", obj47.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 100 + "'", obj48.equals((short) 100));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        boolean b17 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator19.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        defaultedMap23.clear();
        boolean b29 = defaultedMap23.containsValue((java.lang.Object) "");
        boolean b30 = fixedOrderComparator19.add((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        defaultedMap32.clear();
        boolean b38 = defaultedMap32.containsValue((java.lang.Object) "");
        int i39 = defaultedMap32.size();
        java.util.Set set40 = defaultedMap32.entrySet();
        java.lang.Object obj41 = defaultedMap23.get((java.lang.Object) set40);
        boolean b42 = defaultedMap1.containsKey((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) 100 + "'", obj41.equals((short) 100));
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 100 + "'", obj6.equals((short) 100));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) map18);
        java.lang.Object obj20 = defaultedMap10.get((java.lang.Object) map18);
        int i21 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        java.lang.Object obj28 = defaultedMap23.get((java.lang.Object) 1);
        java.lang.Object obj29 = defaultedMap10.get((java.lang.Object) 1);
        java.util.Collection collection30 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        java.lang.Object obj37 = defaultedMap32.get((java.lang.Object) 1);
        defaultedMap32.clear();
        try {
            boolean b39 = fixedOrderComparator8.addAsEqual((java.lang.Object) collection30, (java.lang.Object) defaultedMap32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 100 + "'", obj28.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 100 + "'", obj29.equals((short) 100));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 100 + "'", obj37.equals((short) 100));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        java.util.Set set6 = defaultedMap1.keySet();
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        boolean b16 = defaultedMap10.containsKey((java.lang.Object) map15);
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        fixedOrderComparator23.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator26.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        defaultedMap30.clear();
        boolean b36 = defaultedMap30.containsValue((java.lang.Object) "");
        boolean b37 = fixedOrderComparator26.add((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        defaultedMap39.clear();
        boolean b44 = defaultedMap30.equals((java.lang.Object) defaultedMap39);
        boolean b45 = fixedOrderComparator23.add((java.lang.Object) b44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap49.clear();
        boolean b51 = defaultedMap47.equals((java.lang.Object) defaultedMap49);
        boolean b52 = defaultedMap49.isEmpty();
        boolean b53 = fixedOrderComparator23.add((java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap55.clear();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        boolean b64 = defaultedMap58.containsKey((java.lang.Object) map63);
        java.lang.Object obj65 = defaultedMap55.get((java.lang.Object) map63);
        boolean b67 = defaultedMap55.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap69.clear();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        boolean b78 = defaultedMap72.containsKey((java.lang.Object) map77);
        java.lang.Object obj79 = defaultedMap69.get((java.lang.Object) map77);
        defaultedMap55.putAll((java.util.Map) defaultedMap69);
        int i82 = fixedOrderComparator23.compare((java.lang.Object) defaultedMap69, (java.lang.Object) 10.0d);
        java.lang.Object obj83 = defaultedMap10.get((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj84 = defaultedMap1.put(obj8, obj83);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (short) 100 + "'", obj65.equals((short) 100));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + (short) 100 + "'", obj79.equals((short) 100));
        org.junit.Assert.assertTrue(i82 == 1);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + (short) 100 + "'", obj83.equals((short) 100));
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        boolean b17 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        int i19 = defaultedMap13.size();
        java.util.Set set20 = defaultedMap13.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) "");
        int i20 = defaultedMap13.size();
        java.util.Set set21 = defaultedMap13.entrySet();
        java.lang.Object obj22 = defaultedMap4.get((java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap27.clear();
        boolean b29 = defaultedMap25.equals((java.lang.Object) defaultedMap27);
        boolean b30 = defaultedMap27.isEmpty();
        java.lang.Object obj31 = defaultedMap4.put((java.lang.Object) false, (java.lang.Object) b30);
        boolean b33 = defaultedMap4.containsValue((java.lang.Object) 10.0d);
        java.util.Collection collection34 = defaultedMap4.values();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 100 + "'", obj22.equals((short) 100));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(collection34);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        int i11 = defaultedMap4.size();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        fixedOrderComparator19.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        int i28 = fixedOrderComparator19.compare((java.lang.Object) predicate25, (java.lang.Object) 10L);
        java.lang.Object obj29 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator19);
        int i30 = fixedOrderComparator19.getUnknownObjectBehavior();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator19);
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) "");
        boolean b20 = fixedOrderComparator9.add((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        defaultedMap22.clear();
        boolean b27 = defaultedMap13.equals((java.lang.Object) defaultedMap22);
        boolean b28 = fixedOrderComparator6.add((java.lang.Object) b27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap32.clear();
        boolean b34 = defaultedMap30.equals((java.lang.Object) defaultedMap32);
        boolean b35 = defaultedMap32.isEmpty();
        boolean b36 = fixedOrderComparator6.add((java.lang.Object) defaultedMap32);
        fixedOrderComparator6.setUnknownObjectBehavior(0);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap3.clear();
        boolean b5 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        int i6 = defaultedMap3.size();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap3.clear();
        boolean b5 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.lang.String str6 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap8.clear();
        int i10 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap16.containsKey((java.lang.Object) map21);
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) map21);
        boolean b25 = defaultedMap13.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        boolean b36 = defaultedMap30.containsKey((java.lang.Object) map35);
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) map35);
        defaultedMap13.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj39 = defaultedMap8.put((java.lang.Object) 100.0d, (java.lang.Object) defaultedMap13);
        boolean b40 = defaultedMap3.containsValue((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 100 + "'", obj23.equals((short) 100));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 100 + "'", obj37.equals((short) 100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        boolean b17 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        boolean b29 = defaultedMap23.containsKey((java.lang.Object) map28);
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) map28);
        int i31 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        boolean b39 = defaultedMap33.containsKey((java.lang.Object) map38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        defaultedMap33.putAll(map44);
        boolean b46 = defaultedMap20.containsValue((java.lang.Object) map44);
        defaultedMap20.clear();
        java.lang.Object obj48 = defaultedMap1.remove((java.lang.Object) defaultedMap20);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 100 + "'", obj30.equals((short) 100));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) "");
        int i20 = defaultedMap13.size();
        java.util.Set set21 = defaultedMap13.entrySet();
        java.lang.Object obj22 = defaultedMap4.get((java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap27.clear();
        boolean b29 = defaultedMap25.equals((java.lang.Object) defaultedMap27);
        boolean b30 = defaultedMap27.isEmpty();
        java.lang.Object obj31 = defaultedMap4.put((java.lang.Object) false, (java.lang.Object) b30);
        boolean b33 = defaultedMap4.containsValue((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        defaultedMap35.clear();
        boolean b41 = defaultedMap35.containsValue((java.lang.Object) "");
        int i42 = defaultedMap35.size();
        java.util.Set set43 = defaultedMap35.entrySet();
        java.lang.String str44 = defaultedMap35.toString();
        java.lang.String str45 = defaultedMap35.toString();
        java.lang.Object obj46 = defaultedMap4.get((java.lang.Object) str45);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 100 + "'", obj22.equals((short) 100));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 100 + "'", obj46.equals((short) 100));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap13);
        int i19 = defaultedMap4.size();
        java.util.Set set20 = defaultedMap4.entrySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.entrySet();
        java.lang.String str10 = defaultedMap1.toString();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b19 = fixedOrderComparator17.add((java.lang.Object) (-1));
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap22.clear();
        int i24 = defaultedMap22.size();
        defaultedMap22.clear();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        fixedOrderComparator32.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        defaultedMap39.clear();
        boolean b45 = defaultedMap39.containsValue((java.lang.Object) "");
        boolean b46 = fixedOrderComparator35.add((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        defaultedMap48.clear();
        boolean b53 = defaultedMap39.equals((java.lang.Object) defaultedMap48);
        boolean b54 = fixedOrderComparator32.add((java.lang.Object) b53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap58.clear();
        boolean b60 = defaultedMap56.equals((java.lang.Object) defaultedMap58);
        boolean b61 = defaultedMap58.isEmpty();
        boolean b62 = fixedOrderComparator32.add((java.lang.Object) defaultedMap58);
        boolean b63 = defaultedMap22.containsKey((java.lang.Object) defaultedMap58);
        java.util.Collection collection64 = defaultedMap58.values();
        try {
            boolean b66 = fixedOrderComparator17.addAsEqual((java.lang.Object) collection64, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(collection64);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        defaultedMap9.clear();
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) "");
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator16.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        defaultedMap20.clear();
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) "");
        boolean b27 = fixedOrderComparator16.add((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        defaultedMap29.clear();
        boolean b35 = defaultedMap29.containsValue((java.lang.Object) "");
        int i36 = defaultedMap29.size();
        java.util.Set set37 = defaultedMap29.entrySet();
        java.lang.Object obj38 = defaultedMap20.get((java.lang.Object) set37);
        java.lang.Object obj39 = defaultedMap9.get((java.lang.Object) defaultedMap20);
        boolean b40 = fixedOrderComparator7.add((java.lang.Object) defaultedMap20);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 100 + "'", obj38.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 100 + "'", obj39.equals((short) 100));
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) "");
        int i20 = defaultedMap13.size();
        java.util.Set set21 = defaultedMap13.entrySet();
        int i22 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        boolean b30 = defaultedMap24.containsKey((java.lang.Object) map29);
        defaultedMap13.putAll(map29);
        boolean b32 = defaultedMap1.containsKey((java.lang.Object) map29);
        java.util.Set set33 = defaultedMap1.keySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        defaultedMap38.clear();
        boolean b44 = defaultedMap38.containsValue((java.lang.Object) "");
        boolean b45 = fixedOrderComparator34.add((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        defaultedMap47.clear();
        boolean b52 = defaultedMap38.equals((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate61, predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap68.clear();
        boolean b70 = defaultedMap66.equals((java.lang.Object) defaultedMap68);
        java.lang.Object obj71 = defaultedMap54.get((java.lang.Object) defaultedMap66);
        java.lang.Object obj72 = defaultedMap1.put((java.lang.Object) defaultedMap38, (java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap74.clear();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate80, predicate81);
        boolean b83 = defaultedMap77.containsKey((java.lang.Object) map82);
        java.lang.Object obj84 = defaultedMap74.get((java.lang.Object) map82);
        int i85 = defaultedMap74.size();
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap87, predicate88, predicate89);
        java.lang.Object obj92 = defaultedMap87.get((java.lang.Object) 1);
        java.lang.Object obj93 = defaultedMap74.get((java.lang.Object) 1);
        defaultedMap54.putAll((java.util.Map) defaultedMap74);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 100 + "'", obj71.equals((short) 100));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + (short) 100 + "'", obj84.equals((short) 100));
        org.junit.Assert.assertTrue(i85 == 0);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + (short) 100 + "'", obj92.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + (short) 100 + "'", obj93.equals((short) 100));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        defaultedMap12.clear();
        boolean b18 = defaultedMap12.containsValue((java.lang.Object) "");
        boolean b19 = fixedOrderComparator8.add((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        defaultedMap21.clear();
        boolean b27 = defaultedMap21.containsValue((java.lang.Object) "");
        int i28 = defaultedMap21.size();
        java.util.Set set29 = defaultedMap21.entrySet();
        java.lang.Object obj30 = defaultedMap12.get((java.lang.Object) set29);
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        java.util.Collection collection32 = defaultedMap12.values();
        java.lang.Object obj34 = defaultedMap12.get((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 100 + "'", obj30.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 100 + "'", obj31.equals((short) 100));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 100 + "'", obj34.equals((short) 100));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) map23);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) map23);
        boolean b27 = defaultedMap15.containsValue((java.lang.Object) 100.0d);
        int i28 = defaultedMap15.size();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj30 = defaultedMap15.get((java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set33 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap32.get((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set44 = defaultedMap43.keySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        java.lang.Object obj50 = defaultedMap43.get((java.lang.Object) predicate47);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate54);
        defaultedMap52.clear();
        boolean b58 = defaultedMap52.containsValue((java.lang.Object) "");
        int i59 = defaultedMap52.size();
        java.util.Set set60 = defaultedMap52.entrySet();
        java.lang.String str61 = defaultedMap52.toString();
        boolean b62 = defaultedMap52.isEmpty();
        java.lang.Object[] obj_array63 = new java.lang.Object[] { obj30, predicate36, (short) 100, defaultedMap43, b62 };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        java.lang.Object obj65 = defaultedMap1.get((java.lang.Object) obj_array63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        boolean b73 = defaultedMap67.containsKey((java.lang.Object) map72);
        defaultedMap1.putAll(map72);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 100 + "'", obj25.equals((short) 100));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 100 + "'", obj30.equals((short) 100));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + '4' + "'", obj39.equals('4'));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + '4' + "'", obj50.equals('4'));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (short) 100 + "'", obj65.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) "");
        int i20 = defaultedMap13.size();
        java.util.Set set21 = defaultedMap13.entrySet();
        java.lang.Object obj22 = defaultedMap4.get((java.lang.Object) set21);
        java.lang.Object obj24 = defaultedMap4.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        boolean b32 = defaultedMap26.containsKey((java.lang.Object) map31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        defaultedMap26.putAll(map37);
        defaultedMap26.clear();
        java.lang.Object obj40 = defaultedMap4.remove((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap42.clear();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        boolean b51 = defaultedMap45.containsKey((java.lang.Object) map50);
        java.lang.Object obj52 = defaultedMap42.get((java.lang.Object) map50);
        boolean b54 = defaultedMap42.equals((java.lang.Object) '#');
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 10);
        defaultedMap4.putAll(map56);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 100 + "'", obj22.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 100 + "'", obj24.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 100 + "'", obj52.equals((short) 100));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.entrySet();
        java.lang.String str10 = defaultedMap1.toString();
        java.lang.String str11 = defaultedMap1.toString();
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        boolean b17 = defaultedMap13.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        int i19 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        defaultedMap21.clear();
        boolean b27 = defaultedMap21.containsValue((java.lang.Object) "");
        int i28 = defaultedMap21.size();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        fixedOrderComparator36.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        int i45 = fixedOrderComparator36.compare((java.lang.Object) predicate42, (java.lang.Object) 10L);
        java.lang.Object obj46 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator36);
        java.lang.Object obj47 = defaultedMap13.get((java.lang.Object) fixedOrderComparator36);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator48.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate54);
        defaultedMap52.clear();
        boolean b58 = defaultedMap52.containsValue((java.lang.Object) "");
        boolean b59 = fixedOrderComparator48.add((java.lang.Object) defaultedMap52);
        boolean b60 = fixedOrderComparator48.isLocked();
        boolean b61 = defaultedMap13.containsValue((java.lang.Object) b60);
        boolean b62 = defaultedMap13.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 100 + "'", obj47.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b10 = fixedOrderComparator9.isLocked();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.entrySet();
        java.lang.String str10 = defaultedMap1.toString();
        java.lang.String str11 = defaultedMap1.toString();
        int i12 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array5);
        org.junit.Assert.assertNotNull(obj_array5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap3.clear();
        boolean b5 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap3.clear();
        boolean b5 = defaultedMap1.equals((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        int i11 = defaultedMap7.size();
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b20 = defaultedMap14.containsKey((java.lang.Object) map19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        defaultedMap14.putAll(map25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map25, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate(map41, predicate44, predicate49);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate27, predicate44);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set56 = defaultedMap55.keySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        java.lang.Object obj62 = defaultedMap55.get((java.lang.Object) predicate59);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate65, predicate66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate71, predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate(map53, predicate59, predicate73);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate80, predicate81);
        boolean b83 = defaultedMap77.containsKey((java.lang.Object) map82);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate86, predicate87);
        defaultedMap77.putAll(map88);
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate(map88, predicate90, predicate91);
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate73, predicate90);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + '4' + "'", obj62.equals('4'));
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map93);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Set set2 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) (short) 1);
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        java.util.Collection collection15 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 100 + "'", obj6.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 100 + "'", obj13.equals((short) 100));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.entrySet();
        int i10 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) map21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        int i25 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        defaultedMap27.clear();
        java.util.Set set32 = defaultedMap27.keySet();
        int i33 = defaultedMap27.size();
        java.lang.Object obj34 = defaultedMap22.put((java.lang.Object) i25, (java.lang.Object) i33);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        fixedOrderComparator6.setUnknownObjectBehavior((int) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator9.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) "");
        boolean b20 = fixedOrderComparator9.add((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        defaultedMap22.clear();
        boolean b27 = defaultedMap13.equals((java.lang.Object) defaultedMap22);
        boolean b28 = fixedOrderComparator6.add((java.lang.Object) b27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap32.clear();
        boolean b34 = defaultedMap30.equals((java.lang.Object) defaultedMap32);
        boolean b35 = defaultedMap32.isEmpty();
        boolean b36 = fixedOrderComparator6.add((java.lang.Object) defaultedMap32);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator37);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b42 = defaultedMap32.containsKey((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) 'a');
        java.lang.Object obj14 = null;
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator15.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        defaultedMap19.clear();
        boolean b25 = defaultedMap19.containsValue((java.lang.Object) "");
        boolean b26 = fixedOrderComparator15.add((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        defaultedMap28.clear();
        boolean b34 = defaultedMap28.containsValue((java.lang.Object) "");
        int i35 = defaultedMap28.size();
        java.util.Set set36 = defaultedMap28.entrySet();
        java.lang.Object obj37 = defaultedMap19.get((java.lang.Object) set36);
        java.lang.Object obj39 = defaultedMap19.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        boolean b47 = defaultedMap41.containsKey((java.lang.Object) map46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        defaultedMap41.putAll(map52);
        defaultedMap41.clear();
        java.lang.Object obj55 = defaultedMap19.remove((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set58 = defaultedMap57.keySet();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        java.lang.Object obj64 = defaultedMap57.get((java.lang.Object) predicate61);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap67.clear();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate73, predicate74);
        boolean b76 = defaultedMap70.containsKey((java.lang.Object) map75);
        java.lang.Object obj77 = defaultedMap67.get((java.lang.Object) map75);
        boolean b79 = defaultedMap67.equals((java.lang.Object) '#');
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) 10);
        java.lang.Object obj82 = defaultedMap19.get((java.lang.Object) map81);
        java.lang.Object obj83 = defaultedMap1.put(obj14, (java.lang.Object) defaultedMap19);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 100 + "'", obj37.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 100 + "'", obj39.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + '4' + "'", obj64.equals('4'));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) 100 + "'", obj77.equals((short) 100));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) 100 + "'", obj82.equals((short) 100));
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator8.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        defaultedMap12.clear();
        boolean b18 = defaultedMap12.containsValue((java.lang.Object) "");
        boolean b19 = fixedOrderComparator8.add((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        defaultedMap21.clear();
        boolean b27 = defaultedMap21.containsValue((java.lang.Object) "");
        int i28 = defaultedMap21.size();
        java.util.Set set29 = defaultedMap21.entrySet();
        java.lang.Object obj30 = defaultedMap12.get((java.lang.Object) set29);
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 100 + "'", obj30.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) 100 + "'", obj31.equals((short) 100));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        int i9 = defaultedMap5.size();
        int i10 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        defaultedMap12.putAll(map23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map23, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate36, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate(map39, predicate42, predicate47);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate25, predicate42);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set54 = defaultedMap53.keySet();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate58);
        java.lang.Object obj60 = defaultedMap53.get((java.lang.Object) predicate57);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate68, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate69, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate(map51, predicate57, predicate71);
        java.lang.Object obj74 = defaultedMap1.get((java.lang.Object) predicate71);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate79, predicate80);
        boolean b82 = defaultedMap76.containsKey((java.lang.Object) map81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate85, predicate86);
        defaultedMap76.putAll(map87);
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate(map87, predicate89, predicate90);
        boolean b92 = defaultedMap1.containsKey((java.lang.Object) predicate89);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + '4' + "'", obj60.equals('4'));
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (short) 100 + "'", obj74.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator0.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        defaultedMap4.clear();
        boolean b10 = defaultedMap4.containsValue((java.lang.Object) "");
        boolean b11 = fixedOrderComparator0.add((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        defaultedMap13.clear();
        boolean b18 = defaultedMap4.equals((java.lang.Object) defaultedMap13);
        int i19 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) i19);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        boolean b8 = fixedOrderComparator6.add((java.lang.Object) (-1));
        int i9 = fixedOrderComparator6.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        defaultedMap14.clear();
        boolean b20 = defaultedMap14.containsValue((java.lang.Object) "");
        boolean b21 = fixedOrderComparator10.add((java.lang.Object) defaultedMap14);
        boolean b22 = fixedOrderComparator10.isLocked();
        boolean b23 = fixedOrderComparator6.add((java.lang.Object) b22);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        boolean b14 = defaultedMap8.containsKey((java.lang.Object) map13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        defaultedMap8.putAll(map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map19, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate32, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate(map35, predicate38, predicate43);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate21, predicate38);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set50 = defaultedMap49.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate54);
        java.lang.Object obj56 = defaultedMap49.get((java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate65, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate(map47, predicate53, predicate67);
        collections.Factory factory70 = null;
        try {
            java.util.Map map71 = collections.map.DefaultedMap.decorate(map69, factory70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + '4' + "'", obj56.equals('4'));
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.entrySet();
        int i10 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        boolean b21 = defaultedMap15.containsKey((java.lang.Object) map20);
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) map20);
        boolean b24 = defaultedMap12.containsValue((java.lang.Object) 100.0d);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap12);
        java.util.Set set26 = defaultedMap1.entrySet();
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        boolean b39 = defaultedMap33.containsKey((java.lang.Object) map38);
        java.lang.Object obj40 = defaultedMap30.get((java.lang.Object) map38);
        boolean b42 = defaultedMap30.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap44.clear();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        boolean b53 = defaultedMap47.containsKey((java.lang.Object) map52);
        java.lang.Object obj54 = defaultedMap44.get((java.lang.Object) map52);
        defaultedMap30.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) defaultedMap30);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 100 + "'", obj22.equals((short) 100));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 100 + "'", obj28.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 100 + "'", obj40.equals((short) 100));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (short) 100 + "'", obj54.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) 100 + "'", obj56.equals((short) 100));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        boolean b14 = defaultedMap8.containsKey((java.lang.Object) map13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        defaultedMap8.putAll(map19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map19, predicate21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate22, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        defaultedMap27.clear();
        boolean b33 = defaultedMap27.containsValue((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        defaultedMap35.clear();
        boolean b41 = defaultedMap35.containsValue((java.lang.Object) "");
        int i42 = defaultedMap35.size();
        java.lang.Object[] obj_array49 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        fixedOrderComparator50.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        int i59 = fixedOrderComparator50.compare((java.lang.Object) predicate56, (java.lang.Object) 10L);
        java.lang.Object obj60 = defaultedMap35.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator50);
        java.lang.Object obj61 = defaultedMap27.get((java.lang.Object) fixedOrderComparator50);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        fixedOrderComparator68.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate73, predicate74);
        int i77 = fixedOrderComparator68.compare((java.lang.Object) predicate74, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i80 = fixedOrderComparator50.compare((java.lang.Object) 10L, (java.lang.Object) false);
        java.lang.Object obj81 = defaultedMap1.get((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 100 + "'", obj6.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (short) 100 + "'", obj61.equals((short) 100));
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + (short) 100 + "'", obj81.equals((short) 100));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        int i8 = defaultedMap1.size();
        java.util.Set set9 = defaultedMap1.entrySet();
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate19, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap26.clear();
        boolean b28 = defaultedMap24.equals((java.lang.Object) defaultedMap26);
        java.lang.Object obj29 = defaultedMap12.get((java.lang.Object) defaultedMap24);
        int i30 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        defaultedMap32.clear();
        boolean b38 = defaultedMap32.containsValue((java.lang.Object) "");
        int i39 = defaultedMap32.size();
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        fixedOrderComparator47.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        int i56 = fixedOrderComparator47.compare((java.lang.Object) predicate53, (java.lang.Object) 10L);
        java.lang.Object obj57 = defaultedMap32.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator47);
        java.lang.Object obj58 = defaultedMap24.get((java.lang.Object) fixedOrderComparator47);
        boolean b59 = defaultedMap1.containsKey((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 100 + "'", obj29.equals((short) 100));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (short) 100 + "'", obj58.equals((short) 100));
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        int i14 = defaultedMap1.size();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b27 = defaultedMap21.containsKey((java.lang.Object) map26);
        java.lang.Object obj28 = defaultedMap18.get((java.lang.Object) map26);
        boolean b30 = defaultedMap18.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap32.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        boolean b41 = defaultedMap35.containsKey((java.lang.Object) map40);
        java.lang.Object obj42 = defaultedMap32.get((java.lang.Object) map40);
        defaultedMap18.putAll((java.util.Map) defaultedMap32);
        java.util.Set set44 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) set44);
        boolean b46 = defaultedMap1.containsKey((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.lang.Object obj53 = defaultedMap48.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        boolean b61 = defaultedMap55.containsKey((java.lang.Object) map60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        defaultedMap55.putAll(map66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate(map66, predicate68, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate69, predicate71);
        boolean b73 = defaultedMap45.containsValue((java.lang.Object) predicate69);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) 100 + "'", obj16.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 100 + "'", obj28.equals((short) 100));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 100 + "'", obj42.equals((short) 100));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 100 + "'", obj53.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b22 = fixedOrderComparator20.add((java.lang.Object) (-1));
        boolean b23 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap25.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        boolean b34 = defaultedMap28.containsKey((java.lang.Object) map33);
        java.lang.Object obj35 = defaultedMap25.get((java.lang.Object) map33);
        boolean b37 = defaultedMap25.equals((java.lang.Object) '#');
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 10);
        boolean b40 = defaultedMap1.containsValue((java.lang.Object) map39);
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        defaultedMap45.clear();
        boolean b51 = defaultedMap45.containsValue((java.lang.Object) "");
        boolean b52 = fixedOrderComparator41.add((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        defaultedMap54.clear();
        boolean b60 = defaultedMap54.containsValue((java.lang.Object) "");
        int i61 = defaultedMap54.size();
        java.util.Set set62 = defaultedMap54.entrySet();
        java.lang.Object obj63 = defaultedMap45.get((java.lang.Object) set62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        java.lang.Object obj70 = defaultedMap65.get((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate73, predicate74);
        java.lang.Object obj77 = defaultedMap72.get((java.lang.Object) (short) 1);
        boolean b78 = defaultedMap65.equals((java.lang.Object) defaultedMap72);
        java.lang.Object obj80 = defaultedMap65.remove((java.lang.Object) "{}");
        defaultedMap45.putAll((java.util.Map) defaultedMap65);
        boolean b82 = defaultedMap1.containsKey((java.lang.Object) defaultedMap45);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 100 + "'", obj35.equals((short) 100));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (short) 100 + "'", obj63.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (short) 100 + "'", obj70.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) 100 + "'", obj77.equals((short) 100));
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b82 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) map9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) map9);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        int i14 = defaultedMap1.size();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b27 = defaultedMap21.containsKey((java.lang.Object) map26);
        java.lang.Object obj28 = defaultedMap18.get((java.lang.Object) map26);
        boolean b30 = defaultedMap18.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap32.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        boolean b41 = defaultedMap35.containsKey((java.lang.Object) map40);
        java.lang.Object obj42 = defaultedMap32.get((java.lang.Object) map40);
        defaultedMap18.putAll((java.util.Map) defaultedMap32);
        java.util.Set set44 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) set44);
        boolean b46 = defaultedMap1.containsKey((java.lang.Object) defaultedMap45);
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap1.get(obj47);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) 100 + "'", obj16.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 100 + "'", obj28.equals((short) 100));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 100 + "'", obj42.equals((short) 100));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 100 + "'", obj48.equals((short) 100));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) predicate5);
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '4' + "'", obj8.equals('4'));
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        defaultedMap1.clear();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        defaultedMap9.clear();
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) "");
        int i16 = defaultedMap9.size();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 0, (-1L), (byte) 10, 2, (short) 10 };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        fixedOrderComparator24.setUnknownObjectBehavior((int) (byte) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        int i33 = fixedOrderComparator24.compare((java.lang.Object) predicate30, (java.lang.Object) 10L);
        java.lang.Object obj34 = defaultedMap9.put((java.lang.Object) (-1), (java.lang.Object) fixedOrderComparator24);
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) fixedOrderComparator24);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate44);
        boolean b46 = defaultedMap40.containsKey((java.lang.Object) map45);
        java.lang.Object obj47 = defaultedMap37.get((java.lang.Object) map45);
        boolean b48 = defaultedMap1.equals((java.lang.Object) map45);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap50.clear();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        boolean b59 = defaultedMap53.containsKey((java.lang.Object) map58);
        java.lang.Object obj60 = defaultedMap50.get((java.lang.Object) map58);
        boolean b62 = defaultedMap50.containsValue((java.lang.Object) 100.0d);
        int i63 = defaultedMap50.size();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj65 = defaultedMap50.get((java.lang.Object) predicate64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap67.clear();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate73, predicate74);
        boolean b76 = defaultedMap70.containsKey((java.lang.Object) map75);
        java.lang.Object obj77 = defaultedMap67.get((java.lang.Object) map75);
        boolean b79 = defaultedMap67.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap81.clear();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap86, predicate87, predicate88);
        boolean b90 = defaultedMap84.containsKey((java.lang.Object) map89);
        java.lang.Object obj91 = defaultedMap81.get((java.lang.Object) map89);
        defaultedMap67.putAll((java.util.Map) defaultedMap81);
        java.util.Set set93 = defaultedMap67.entrySet();
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) set93);
        boolean b95 = defaultedMap50.containsKey((java.lang.Object) defaultedMap94);
        java.lang.Object obj96 = defaultedMap1.get((java.lang.Object) defaultedMap50);
        boolean b97 = defaultedMap50.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 100 + "'", obj35.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 100 + "'", obj47.equals((short) 100));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) 100 + "'", obj60.equals((short) 100));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (short) 100 + "'", obj65.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) 100 + "'", obj77.equals((short) 100));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + (short) 100 + "'", obj91.equals((short) 100));
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + (short) 100 + "'", obj96.equals((short) 100));
        org.junit.Assert.assertTrue(b97 == true);
    }
}

