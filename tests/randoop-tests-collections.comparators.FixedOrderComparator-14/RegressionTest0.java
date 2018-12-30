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
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
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
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
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
            fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 10);
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
        java.util.List list0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(list0);
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_THROW_EXCEPTION;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        try {
            boolean b4 = fixedOrderComparator0.addAsEqual((java.lang.Object) (byte) -1, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.util.Map map4 = null;
        try {
            defaultedMap1.putAll(map4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        try {
            boolean b4 = fixedOrderComparator0.addAsEqual((java.lang.Object) "", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Map map8 = null;
        try {
            defaultedMap1.putAll(map8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) (short) -1);
        try {
            boolean b10 = fixedOrderComparator0.addAsEqual((java.lang.Object) '#', obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        try {
            boolean b4 = fixedOrderComparator0.addAsEqual((java.lang.Object) fixedOrderComparator2, (java.lang.Object) predicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(predicate3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        try {
            boolean b10 = fixedOrderComparator0.addAsEqual((java.lang.Object) 0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate3 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        boolean b8 = fixedOrderComparator5.add((java.lang.Object) predicateUtils6);
        try {
            fixedOrderComparator5.setUnknownObjectBehavior((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.equals((java.lang.Object) '#');
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) 0);
        boolean b7 = defaultedMap3.equals((java.lang.Object) 1.0d);
        boolean b9 = defaultedMap3.equals((java.lang.Object) 10);
        try {
            boolean b11 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap3, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        boolean b12 = fixedOrderComparator9.add((java.lang.Object) predicateUtils10);
        try {
            int i13 = fixedOrderComparator0.compare((java.lang.Object) (-1.0f), (java.lang.Object) b12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) "");
        boolean b8 = defaultedMap5.isEmpty();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        defaultedMap5.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) obj_array8);
        try {
            boolean b12 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap4, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        boolean b12 = fixedOrderComparator9.add((java.lang.Object) predicateUtils10);
        int i13 = fixedOrderComparator9.getUnknownObjectBehavior();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) fixedOrderComparator9);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) true);
        boolean b22 = defaultedMap17.isEmpty();
        java.util.Set set23 = defaultedMap17.entrySet();
        try {
            boolean b24 = fixedOrderComparator9.addAsEqual((java.lang.Object) predicate15, (java.lang.Object) defaultedMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        boolean b12 = fixedOrderComparator9.add((java.lang.Object) predicateUtils10);
        int i13 = fixedOrderComparator9.getUnknownObjectBehavior();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) fixedOrderComparator9);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap19.equals((java.lang.Object) 10);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) "");
        boolean b26 = defaultedMap23.isEmpty();
        boolean b27 = defaultedMap19.containsValue((java.lang.Object) defaultedMap23);
        try {
            int i28 = fixedOrderComparator9.compare((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        boolean b12 = fixedOrderComparator9.add((java.lang.Object) predicateUtils10);
        int i13 = fixedOrderComparator9.getUnknownObjectBehavior();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) fixedOrderComparator9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        java.lang.String str19 = defaultedMap18.toString();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap18);
        try {
            boolean b22 = fixedOrderComparator9.addAsEqual((java.lang.Object) defaultedMap18, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) obj_array5);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator4);
        try {
            fixedOrderComparator0.setUnknownObjectBehavior((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) 0);
        boolean b7 = defaultedMap3.equals((java.lang.Object) 1.0d);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        boolean b12 = fixedOrderComparator10.isLocked();
        boolean b13 = fixedOrderComparator10.isLocked();
        boolean b14 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        defaultedMap1.clear();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) "");
        boolean b8 = defaultedMap5.isEmpty();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        java.util.Collection collection10 = defaultedMap5.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicate1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) 0);
        boolean b6 = defaultedMap2.equals((java.lang.Object) 1.0d);
        defaultedMap2.clear();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap12.equals((java.lang.Object) 10);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) 100);
        try {
            boolean b17 = fixedOrderComparator0.addAsEqual((java.lang.Object) map10, (java.lang.Object) b16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 0);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) true);
        defaultedMap4.clear();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { defaultedMap4, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj20 = defaultedMap14.get((java.lang.Object) obj_array18);
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator();
        boolean b22 = fixedOrderComparator21.isLocked();
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) b22);
        java.util.Set set24 = defaultedMap14.keySet();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 'a');
        boolean b30 = defaultedMap26.equals((java.lang.Object) (byte) 100);
        java.util.Collection collection31 = defaultedMap26.values();
        java.lang.Object obj32 = defaultedMap14.get((java.lang.Object) collection31);
        try {
            int i33 = fixedOrderComparator2.compare((java.lang.Object) fixedOrderComparator12, (java.lang.Object) collection31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 0);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) true);
        boolean b9 = defaultedMap4.isEmpty();
        java.lang.String str10 = defaultedMap4.toString();
        java.util.Set set11 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 0);
        boolean b19 = defaultedMap15.equals((java.lang.Object) 1.0d);
        defaultedMap15.clear();
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        try {
            int i22 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap4, (java.lang.Object) defaultedMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.PredicateUtils predicateUtils1 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils1);
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) obj_array4);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) '4');
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) true);
        boolean b15 = defaultedMap10.isEmpty();
        java.lang.String str16 = defaultedMap10.toString();
        int i17 = defaultedMap10.size();
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) obj_array20);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) ' ');
        boolean b25 = defaultedMap22.isEmpty();
        java.lang.Object obj26 = defaultedMap10.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap22);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) true);
        boolean b33 = defaultedMap28.isEmpty();
        java.util.Set set34 = defaultedMap28.entrySet();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 10L, defaultedMap2, '4', (byte) 0, set34 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array35);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(obj_array35);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.equals((java.lang.Object) '#');
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator();
        int i6 = fixedOrderComparator5.getUnknownObjectBehavior();
        fixedOrderComparator5.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (byte) 1);
        java.util.Set set10 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap5.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 'a');
        java.util.Set set15 = defaultedMap12.keySet();
        try {
            boolean b16 = fixedOrderComparator0.addAsEqual((java.lang.Object) set10, (java.lang.Object) defaultedMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object[] obj_array0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap5.keySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) set10);
        java.lang.Object obj12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj20 = defaultedMap14.get((java.lang.Object) obj_array18);
        java.lang.Object obj21 = defaultedMap1.put(obj12, (java.lang.Object) defaultedMap14);
        java.util.Set set22 = defaultedMap14.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) (short) -1);
        int i14 = fixedOrderComparator0.compare(obj7, (java.lang.Object) (short) -1);
        int i15 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        int i8 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        int i13 = defaultedMap12.size();
        boolean b15 = defaultedMap12.equals((java.lang.Object) '#');
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        int i17 = fixedOrderComparator16.getUnknownObjectBehavior();
        fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) (byte) 1);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj20);
        boolean b22 = defaultedMap1.containsValue(obj20);
        java.util.Set set23 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) "");
        boolean b8 = defaultedMap5.isEmpty();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) b9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicate11);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Set set9 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate3 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        try {
            boolean b13 = fixedOrderComparator5.addAsEqual((java.lang.Object) set9, (java.lang.Object) fixedOrderComparator12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(obj_array11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0);
        boolean b13 = defaultedMap9.equals((java.lang.Object) 1.0d);
        defaultedMap9.clear();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection20 = defaultedMap19.values();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 0);
        boolean b26 = defaultedMap22.equals((java.lang.Object) 1.0d);
        defaultedMap22.clear();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0);
        boolean b36 = defaultedMap32.equals((java.lang.Object) 1.0d);
        defaultedMap32.clear();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate28, predicate38);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate38);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) 0);
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) true);
        boolean b49 = defaultedMap44.isEmpty();
        java.util.Set set50 = defaultedMap44.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        boolean b52 = fixedOrderComparator51.isLocked();
        int i53 = fixedOrderComparator51.getUnknownObjectBehavior();
        boolean b54 = defaultedMap44.containsValue((java.lang.Object) i53);
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        collections.Transformer transformer56 = null;
        try {
            java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) 0);
        boolean b7 = defaultedMap3.equals((java.lang.Object) 1.0d);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        boolean b12 = fixedOrderComparator10.isLocked();
        boolean b13 = fixedOrderComparator10.isLocked();
        boolean b14 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b18 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator17);
        boolean b19 = fixedOrderComparator10.isLocked();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 0);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) true);
        defaultedMap4.clear();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { defaultedMap4, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.equals((java.lang.Object) 10);
        try {
            int i20 = fixedOrderComparator14.compare((java.lang.Object) 10, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b3 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate3 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        boolean b7 = fixedOrderComparator5.add((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) true);
        defaultedMap11.clear();
        java.util.Map map17 = collections.map.DefaultedMap.decorate(map9, (java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        boolean b15 = defaultedMap11.equals((java.lang.Object) 1.0d);
        defaultedMap11.clear();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) map19);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate3 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        boolean b8 = fixedOrderComparator5.add((java.lang.Object) predicateUtils6);
        boolean b10 = fixedOrderComparator5.add((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 0);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) true);
        defaultedMap4.clear();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { defaultedMap4, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) obj_array11);
        boolean b14 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        boolean b15 = defaultedMap11.equals((java.lang.Object) 1.0d);
        defaultedMap11.clear();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) map19);
        java.util.Set set21 = defaultedMap5.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) true);
        boolean b28 = defaultedMap23.isEmpty();
        java.util.Set set29 = defaultedMap23.entrySet();
        defaultedMap23.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) true);
        boolean b38 = defaultedMap33.isEmpty();
        java.lang.String str39 = defaultedMap33.toString();
        int i40 = defaultedMap33.size();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) obj_array43);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) ' ');
        boolean b48 = defaultedMap45.isEmpty();
        java.lang.Object obj49 = defaultedMap33.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap45);
        java.lang.Object obj50 = defaultedMap23.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap45);
        boolean b51 = defaultedMap5.containsValue((java.lang.Object) defaultedMap45);
        int i52 = defaultedMap45.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 0);
        boolean b12 = defaultedMap8.equals((java.lang.Object) 1.0d);
        defaultedMap8.clear();
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        boolean b17 = fixedOrderComparator15.isLocked();
        boolean b18 = fixedOrderComparator15.isLocked();
        boolean b19 = defaultedMap6.equals((java.lang.Object) fixedOrderComparator15);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        boolean b23 = fixedOrderComparator15.add((java.lang.Object) fixedOrderComparator22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) true);
        boolean b30 = defaultedMap25.isEmpty();
        java.util.Set set31 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        java.lang.String str36 = defaultedMap35.toString();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap35);
        java.lang.Object obj38 = defaultedMap25.remove((java.lang.Object) defaultedMap35);
        try {
            boolean b39 = fixedOrderComparator2.addAsEqual((java.lang.Object) fixedOrderComparator15, (java.lang.Object) defaultedMap35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator4);
        java.lang.Object obj7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) (short) -1);
        int i14 = fixedOrderComparator0.compare(obj7, (java.lang.Object) (short) -1);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) true);
        boolean b21 = defaultedMap16.isEmpty();
        java.util.Set set22 = defaultedMap16.entrySet();
        defaultedMap16.clear();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) true);
        boolean b31 = defaultedMap26.isEmpty();
        java.lang.String str32 = defaultedMap26.toString();
        int i33 = defaultedMap26.size();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) obj_array36);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) ' ');
        boolean b41 = defaultedMap38.isEmpty();
        java.lang.Object obj42 = defaultedMap26.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap38);
        java.lang.Object obj43 = defaultedMap16.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection46 = defaultedMap45.values();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate47);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) 0);
        boolean b52 = defaultedMap48.equals((java.lang.Object) 1.0d);
        defaultedMap48.clear();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate54, predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) predicate57);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) 0);
        boolean b62 = defaultedMap58.equals((java.lang.Object) 1.0d);
        defaultedMap58.clear();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate54, predicate64);
        try {
            boolean b68 = fixedOrderComparator0.addAsEqual((java.lang.Object) (byte) -1, (java.lang.Object) map67);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.isLocked();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) true);
        boolean b14 = defaultedMap9.isEmpty();
        java.util.Set set15 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.lang.String str20 = defaultedMap19.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) defaultedMap19);
        java.lang.Object obj22 = defaultedMap9.remove((java.lang.Object) defaultedMap19);
        try {
            int i23 = fixedOrderComparator0.compare((java.lang.Object) fixedOrderComparator7, obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 0);
        boolean b8 = defaultedMap4.equals((java.lang.Object) 1.0d);
        defaultedMap4.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) true);
        boolean b16 = defaultedMap11.isEmpty();
        java.lang.String str17 = defaultedMap11.toString();
        java.util.Set set18 = defaultedMap11.entrySet();
        boolean b19 = defaultedMap4.equals((java.lang.Object) defaultedMap11);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 'a');
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 0);
        boolean b29 = defaultedMap25.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) 0);
        boolean b35 = defaultedMap31.equals((java.lang.Object) 1.0d);
        defaultedMap31.clear();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate37, predicate38);
        java.lang.Object obj40 = defaultedMap21.put((java.lang.Object) defaultedMap25, (java.lang.Object) map39);
        defaultedMap4.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj42 = defaultedMap2.remove((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) 0);
        boolean b7 = defaultedMap3.equals((java.lang.Object) 1.0d);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        boolean b12 = fixedOrderComparator10.isLocked();
        boolean b13 = fixedOrderComparator10.isLocked();
        boolean b14 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array16);
        try {
            int i20 = fixedOrderComparator10.compare((java.lang.Object) fixedOrderComparator18, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array16);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        defaultedMap1.clear();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.String str12 = defaultedMap11.toString();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap11);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) true);
        boolean b22 = defaultedMap17.isEmpty();
        java.util.Collection collection23 = defaultedMap17.values();
        defaultedMap17.clear();
        java.lang.Object obj25 = defaultedMap1.put(obj15, (java.lang.Object) defaultedMap17);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator4);
        boolean b7 = fixedOrderComparator0.isLocked();
        int i8 = fixedOrderComparator0.getUnknownObjectBehavior();
        boolean b9 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap5.keySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) set10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 0);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 1.0d);
        defaultedMap13.clear();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.util.Set set23 = defaultedMap13.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.equals((java.lang.Object) 10);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) "");
        boolean b12 = defaultedMap9.isEmpty();
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) defaultedMap9);
        try {
            boolean b15 = fixedOrderComparator0.addAsEqual((java.lang.Object) b13, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        int i5 = defaultedMap4.size();
        boolean b7 = defaultedMap4.equals((java.lang.Object) '#');
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        int i9 = fixedOrderComparator8.getUnknownObjectBehavior();
        fixedOrderComparator8.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) (byte) 1);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, obj12);
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) map13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.equals((java.lang.Object) 10);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0);
        boolean b13 = defaultedMap9.equals((java.lang.Object) 1.0d);
        java.util.Set set14 = defaultedMap9.keySet();
        java.lang.Object obj15 = defaultedMap5.remove((java.lang.Object) set14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 0);
        boolean b21 = defaultedMap17.equals((java.lang.Object) 1.0d);
        defaultedMap17.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate23, predicate24);
        java.lang.Object obj26 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils27);
        try {
            boolean b29 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap17, (java.lang.Object) predicateUtils27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        int i9 = defaultedMap8.size();
        boolean b11 = defaultedMap8.equals((java.lang.Object) '#');
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj16 = defaultedMap8.get((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.lang.Object obj18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) true);
        boolean b25 = defaultedMap20.isEmpty();
        java.util.Set set26 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicate29);
        java.lang.String str31 = defaultedMap30.toString();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap30);
        java.lang.Object obj33 = defaultedMap20.remove((java.lang.Object) defaultedMap30);
        java.lang.Object obj34 = defaultedMap1.put(obj18, obj33);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) "");
        boolean b8 = defaultedMap5.isEmpty();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) b9);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator();
        int i2 = fixedOrderComparator1.getUnknownObjectBehavior();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 'a');
        boolean b7 = defaultedMap4.isEmpty();
        java.util.Collection collection8 = defaultedMap4.values();
        try {
            int i9 = fixedOrderComparator0.compare((java.lang.Object) i2, (java.lang.Object) collection8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.equals((java.lang.Object) 10);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0);
        boolean b13 = defaultedMap9.equals((java.lang.Object) 1.0d);
        java.util.Set set14 = defaultedMap9.keySet();
        java.lang.Object obj15 = defaultedMap5.remove((java.lang.Object) set14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 0);
        boolean b21 = defaultedMap17.equals((java.lang.Object) 1.0d);
        defaultedMap17.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate23, predicate24);
        java.lang.Object obj26 = defaultedMap5.get((java.lang.Object) defaultedMap17);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 0);
        boolean b32 = defaultedMap28.equals((java.lang.Object) 1.0d);
        defaultedMap28.clear();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate35, predicate37);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate37);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        java.util.Set set6 = defaultedMap1.keySet();
        boolean b7 = defaultedMap1.isEmpty();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) "");
        boolean b12 = defaultedMap1.containsValue(obj11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 0);
        boolean b18 = defaultedMap14.equals((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.equals((java.lang.Object) 10);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 0);
        boolean b28 = defaultedMap24.equals((java.lang.Object) 1.0d);
        java.util.Set set29 = defaultedMap24.keySet();
        java.lang.Object obj30 = defaultedMap20.remove((java.lang.Object) set29);
        java.lang.Object obj31 = defaultedMap14.remove((java.lang.Object) set29);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 10.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) true);
        boolean b40 = defaultedMap35.isEmpty();
        java.lang.String str41 = defaultedMap35.toString();
        int i42 = defaultedMap35.size();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) obj_array45);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) ' ');
        boolean b50 = defaultedMap47.isEmpty();
        java.lang.Object obj51 = defaultedMap35.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap47);
        java.util.Map map52 = collections.map.DefaultedMap.decorate(map33, (java.lang.Object) defaultedMap47);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) predicate53);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) 0);
        java.lang.Object obj58 = defaultedMap54.remove((java.lang.Object) true);
        boolean b59 = defaultedMap54.isEmpty();
        java.lang.String str60 = defaultedMap54.toString();
        int i61 = defaultedMap54.size();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) predicate64);
        int i66 = defaultedMap65.size();
        boolean b68 = defaultedMap65.equals((java.lang.Object) '#');
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        int i70 = fixedOrderComparator69.getUnknownObjectBehavior();
        fixedOrderComparator69.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj73 = defaultedMap65.get((java.lang.Object) (byte) 1);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, obj73);
        boolean b75 = defaultedMap54.containsValue(obj73);
        boolean b76 = defaultedMap47.containsValue(obj73);
        java.lang.Object obj77 = defaultedMap1.get(obj73);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(i70 == 2);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(obj77);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) 0);
        boolean b7 = defaultedMap3.equals((java.lang.Object) 1.0d);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        boolean b12 = fixedOrderComparator10.isLocked();
        boolean b13 = fixedOrderComparator10.isLocked();
        boolean b14 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 'a');
        boolean b20 = defaultedMap16.equals((java.lang.Object) (byte) 100);
        java.util.Collection collection21 = defaultedMap16.values();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        java.lang.Object obj29 = defaultedMap23.get((java.lang.Object) obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator30.isLocked();
        java.lang.Object obj32 = defaultedMap23.get((java.lang.Object) b31);
        java.util.Set set33 = defaultedMap23.keySet();
        try {
            int i34 = fixedOrderComparator10.compare((java.lang.Object) collection21, (java.lang.Object) defaultedMap23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.equals((java.lang.Object) 10);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        boolean b15 = defaultedMap11.equals((java.lang.Object) 1.0d);
        java.util.Set set16 = defaultedMap11.keySet();
        java.lang.Object obj17 = defaultedMap7.remove((java.lang.Object) set16);
        java.lang.String str18 = defaultedMap7.toString();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 0);
        boolean b24 = defaultedMap20.equals((java.lang.Object) 1.0d);
        java.util.Set set25 = defaultedMap20.keySet();
        boolean b26 = defaultedMap20.isEmpty();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) "");
        boolean b31 = defaultedMap20.containsValue(obj30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        int i34 = defaultedMap33.size();
        boolean b36 = defaultedMap33.equals((java.lang.Object) '#');
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator();
        int i38 = fixedOrderComparator37.getUnknownObjectBehavior();
        fixedOrderComparator37.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap20.containsKey(obj41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) str18, obj41);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
        java.lang.String str2 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        boolean b14 = fixedOrderComparator12.isLocked();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) true);
        defaultedMap16.clear();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { defaultedMap16, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator12.add((java.lang.Object) obj_array23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 100.0d);
        java.util.Set set30 = defaultedMap27.entrySet();
        java.lang.Object obj31 = defaultedMap5.put((java.lang.Object) fixedOrderComparator12, (java.lang.Object) defaultedMap27);
        boolean b32 = fixedOrderComparator0.add((java.lang.Object) defaultedMap27);
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 0);
        boolean b41 = defaultedMap37.equals((java.lang.Object) 1.0d);
        defaultedMap37.clear();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate43, predicate44);
        try {
            int i46 = fixedOrderComparator0.compare((java.lang.Object) obj_array34, (java.lang.Object) defaultedMap37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        defaultedMap1.clear();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.String str12 = defaultedMap11.toString();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap11);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap9.equals(obj15);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        boolean b5 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        java.util.Collection collection6 = defaultedMap1.values();
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        boolean b3 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) obj_array9);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        boolean b14 = fixedOrderComparator12.isLocked();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) true);
        defaultedMap16.clear();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { defaultedMap16, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        boolean b25 = fixedOrderComparator12.add((java.lang.Object) obj_array23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 100.0d);
        java.util.Set set30 = defaultedMap27.entrySet();
        java.lang.Object obj31 = defaultedMap5.put((java.lang.Object) fixedOrderComparator12, (java.lang.Object) defaultedMap27);
        boolean b32 = fixedOrderComparator0.add((java.lang.Object) defaultedMap27);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 'a');
        boolean b38 = defaultedMap34.equals((java.lang.Object) (byte) 100);
        java.util.Collection collection39 = defaultedMap34.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        boolean b41 = fixedOrderComparator40.isLocked();
        boolean b42 = defaultedMap34.equals((java.lang.Object) fixedOrderComparator40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) 0);
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) true);
        defaultedMap44.clear();
        int i50 = defaultedMap44.size();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) predicate53);
        java.lang.String str55 = defaultedMap54.toString();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) defaultedMap54);
        defaultedMap44.putAll((java.util.Map) defaultedMap52);
        try {
            boolean b58 = fixedOrderComparator0.addAsEqual((java.lang.Object) b42, (java.lang.Object) defaultedMap52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        int i8 = defaultedMap1.size();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) true);
        boolean b15 = defaultedMap10.isEmpty();
        java.util.Set set16 = defaultedMap10.entrySet();
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) set16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 'a');
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 0);
        boolean b27 = defaultedMap23.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 0);
        boolean b33 = defaultedMap29.equals((java.lang.Object) 1.0d);
        defaultedMap29.clear();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate35, predicate36);
        java.lang.Object obj38 = defaultedMap19.put((java.lang.Object) defaultedMap23, (java.lang.Object) map37);
        java.util.Set set39 = defaultedMap23.entrySet();
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) set39);
        boolean b41 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        defaultedMap1.clear();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { defaultedMap1, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) "");
        boolean b14 = defaultedMap11.isEmpty();
        boolean b15 = fixedOrderComparator9.add((java.lang.Object) b14);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 1);
        boolean b5 = fixedOrderComparator0.add((java.lang.Object) 0.0f);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 0);
        boolean b11 = defaultedMap7.equals((java.lang.Object) 1.0d);
        defaultedMap7.clear();
        int i13 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection16 = defaultedMap15.values();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 0);
        boolean b22 = defaultedMap18.equals((java.lang.Object) 1.0d);
        defaultedMap18.clear();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 0);
        boolean b32 = defaultedMap28.equals((java.lang.Object) 1.0d);
        defaultedMap28.clear();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate24, predicate34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        try {
            boolean b39 = fixedOrderComparator0.addAsEqual((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) 0);
        boolean b7 = defaultedMap3.equals((java.lang.Object) 1.0d);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        boolean b12 = fixedOrderComparator10.isLocked();
        boolean b13 = fixedOrderComparator10.isLocked();
        boolean b14 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b18 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 'a');
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 0);
        boolean b28 = defaultedMap24.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicate29);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) 0);
        boolean b34 = defaultedMap30.equals((java.lang.Object) 1.0d);
        defaultedMap30.clear();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap20.put((java.lang.Object) defaultedMap24, (java.lang.Object) map38);
        java.util.Set set40 = defaultedMap24.entrySet();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        java.lang.Object obj48 = defaultedMap42.get((java.lang.Object) obj_array46);
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator();
        boolean b50 = fixedOrderComparator49.isLocked();
        java.lang.Object obj51 = defaultedMap42.get((java.lang.Object) b50);
        java.util.Collection collection52 = defaultedMap42.values();
        try {
            boolean b53 = fixedOrderComparator17.addAsEqual((java.lang.Object) set40, (java.lang.Object) defaultedMap42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(collection52);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 'a');
        java.util.Set set7 = defaultedMap4.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) (byte) -1);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        int i12 = defaultedMap11.size();
        boolean b14 = defaultedMap11.equals((java.lang.Object) '#');
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        int i16 = fixedOrderComparator15.getUnknownObjectBehavior();
        fixedOrderComparator15.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj19 = defaultedMap11.get((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap4.get((java.lang.Object) defaultedMap11);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator22.isLocked();
        boolean b24 = fixedOrderComparator22.isLocked();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) true);
        defaultedMap26.clear();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { defaultedMap26, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        boolean b35 = fixedOrderComparator22.add((java.lang.Object) obj_array33);
        java.lang.Object obj36 = defaultedMap1.get((java.lang.Object) obj_array33);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "{}" + "'", obj36.equals("{}"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) true);
        boolean b13 = defaultedMap8.isEmpty();
        java.lang.String str14 = defaultedMap8.toString();
        java.util.Set set15 = defaultedMap8.entrySet();
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) true);
        boolean b23 = defaultedMap18.isEmpty();
        java.util.Set set24 = defaultedMap18.entrySet();
        defaultedMap18.clear();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) true);
        boolean b33 = defaultedMap28.isEmpty();
        java.lang.String str34 = defaultedMap28.toString();
        int i35 = defaultedMap28.size();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) obj_array38);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) ' ');
        boolean b43 = defaultedMap40.isEmpty();
        java.lang.Object obj44 = defaultedMap28.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap40);
        java.lang.Object obj45 = defaultedMap18.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap40);
        boolean b46 = defaultedMap1.containsValue(obj45);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap5.keySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) set10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 0);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 1.0d);
        defaultedMap13.clear();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 0);
        boolean b28 = defaultedMap24.equals((java.lang.Object) 1.0d);
        defaultedMap24.clear();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) 0);
        boolean b40 = defaultedMap36.equals((java.lang.Object) 1.0d);
        java.util.Set set41 = defaultedMap36.keySet();
        boolean b42 = defaultedMap36.isEmpty();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) "");
        boolean b47 = defaultedMap36.containsValue(obj46);
        java.lang.Object obj48 = defaultedMap1.remove((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 0);
        boolean b10 = defaultedMap6.equals((java.lang.Object) 1.0d);
        boolean b12 = defaultedMap6.equals((java.lang.Object) 10);
        boolean b13 = fixedOrderComparator4.add((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap5.keySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) set10);
        java.lang.String str12 = defaultedMap1.toString();
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array4);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array4);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator8.isLocked();
        boolean b10 = fixedOrderComparator8.isLocked();
        boolean b11 = fixedOrderComparator8.isLocked();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) obj_array17);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        boolean b21 = fixedOrderComparator20.isLocked();
        boolean b22 = fixedOrderComparator20.isLocked();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap24.remove((java.lang.Object) true);
        defaultedMap24.clear();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { defaultedMap24, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        boolean b33 = fixedOrderComparator20.add((java.lang.Object) obj_array31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) 100.0d);
        java.util.Set set38 = defaultedMap35.entrySet();
        java.lang.Object obj39 = defaultedMap13.put((java.lang.Object) fixedOrderComparator20, (java.lang.Object) defaultedMap35);
        boolean b40 = fixedOrderComparator8.add((java.lang.Object) defaultedMap35);
        try {
            boolean b41 = fixedOrderComparator2.addAsEqual((java.lang.Object) obj_array4, (java.lang.Object) defaultedMap35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate11 };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils14);
        boolean b16 = fixedOrderComparator13.add((java.lang.Object) predicateUtils14);
        int i17 = fixedOrderComparator13.getUnknownObjectBehavior();
        java.lang.Object obj18 = defaultedMap5.get((java.lang.Object) fixedOrderComparator13);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator13);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.PredicateUtils predicateUtils1 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils1);
        java.lang.Object[] obj_array4 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) obj_array4);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) '4');
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) true);
        boolean b15 = defaultedMap10.isEmpty();
        java.lang.String str16 = defaultedMap10.toString();
        int i17 = defaultedMap10.size();
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) obj_array20);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) ' ');
        boolean b25 = defaultedMap22.isEmpty();
        java.lang.Object obj26 = defaultedMap10.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap22);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) true);
        boolean b33 = defaultedMap28.isEmpty();
        java.util.Set set34 = defaultedMap28.entrySet();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 10L, defaultedMap2, '4', (byte) 0, set34 };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        boolean b37 = fixedOrderComparator36.isLocked();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) true);
        boolean b10 = defaultedMap5.isEmpty();
        java.lang.String str11 = defaultedMap5.toString();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 0);
        boolean b17 = defaultedMap13.equals((java.lang.Object) 1.0d);
        defaultedMap13.clear();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection24 = defaultedMap23.values();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 0);
        boolean b30 = defaultedMap26.equals((java.lang.Object) 1.0d);
        defaultedMap26.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) 0);
        boolean b40 = defaultedMap36.equals((java.lang.Object) 1.0d);
        defaultedMap36.clear();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate42, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate32, predicate42);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate20, predicate42);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate47);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) 0);
        java.lang.Object obj52 = defaultedMap48.remove((java.lang.Object) true);
        defaultedMap48.clear();
        int i54 = defaultedMap48.size();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) predicate57);
        java.lang.String str59 = defaultedMap58.toString();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) defaultedMap58);
        defaultedMap48.putAll((java.util.Map) defaultedMap56);
        try {
            boolean b62 = fixedOrderComparator3.addAsEqual((java.lang.Object) predicate42, (java.lang.Object) defaultedMap56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        int i8 = defaultedMap1.size();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        int i7 = defaultedMap6.size();
        boolean b9 = defaultedMap6.equals((java.lang.Object) '#');
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) (byte) 1);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, obj14);
        boolean b16 = fixedOrderComparator0.add(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj14);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 0);
        boolean b11 = defaultedMap7.equals((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap7.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) set12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 0);
        boolean b19 = defaultedMap15.equals((java.lang.Object) 1.0d);
        defaultedMap15.clear();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap3.get((java.lang.Object) defaultedMap15);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) true);
        boolean b31 = defaultedMap26.isEmpty();
        java.lang.String str32 = defaultedMap26.toString();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 0);
        boolean b38 = defaultedMap34.equals((java.lang.Object) 1.0d);
        defaultedMap34.clear();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection45 = defaultedMap44.values();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 0);
        boolean b51 = defaultedMap47.equals((java.lang.Object) 1.0d);
        defaultedMap47.clear();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate56);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) 0);
        boolean b61 = defaultedMap57.equals((java.lang.Object) 1.0d);
        defaultedMap57.clear();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate53, predicate63);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate41, predicate63);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate41, predicate68);
        java.lang.Object obj71 = defaultedMap1.remove((java.lang.Object) predicate68);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) predicate72);
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array77 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array77);
        java.lang.Object obj79 = defaultedMap73.get((java.lang.Object) obj_array77);
        defaultedMap1.putAll((java.util.Map) defaultedMap73);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(obj_array77);
        org.junit.Assert.assertNotNull(obj79);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate17 };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils20);
        boolean b22 = fixedOrderComparator19.add((java.lang.Object) predicateUtils20);
        int i23 = fixedOrderComparator19.getUnknownObjectBehavior();
        java.lang.Object obj24 = defaultedMap11.get((java.lang.Object) fixedOrderComparator19);
        java.lang.Object[] obj_array26 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) obj_array26);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) '4');
        defaultedMap11.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap33.equals((java.lang.Object) 10);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 0);
        boolean b41 = defaultedMap37.equals((java.lang.Object) 1.0d);
        java.util.Set set42 = defaultedMap37.keySet();
        java.lang.Object obj43 = defaultedMap33.remove((java.lang.Object) set42);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicate44);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) 0);
        boolean b49 = defaultedMap45.equals((java.lang.Object) 1.0d);
        defaultedMap45.clear();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate51, predicate52);
        java.lang.Object obj54 = defaultedMap33.get((java.lang.Object) defaultedMap45);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) predicate55);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) 0);
        boolean b60 = defaultedMap56.equals((java.lang.Object) 1.0d);
        defaultedMap56.clear();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate62, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate63, predicate65);
        boolean b67 = defaultedMap11.containsValue((java.lang.Object) defaultedMap33);
        boolean b68 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "" + "'", obj54.equals(""));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 'a');
        boolean b10 = defaultedMap6.equals((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set13 = defaultedMap12.keySet();
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) set13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 'a');
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 0);
        boolean b24 = defaultedMap20.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 0);
        boolean b30 = defaultedMap26.equals((java.lang.Object) 1.0d);
        defaultedMap26.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate32, predicate33);
        java.lang.Object obj35 = defaultedMap16.put((java.lang.Object) defaultedMap20, (java.lang.Object) map34);
        java.util.Set set36 = defaultedMap20.entrySet();
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) set36);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) -1);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) true);
        boolean b12 = defaultedMap7.isEmpty();
        java.lang.String str13 = defaultedMap7.toString();
        int i14 = defaultedMap7.size();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) true);
        boolean b21 = defaultedMap16.isEmpty();
        java.util.Set set22 = defaultedMap16.entrySet();
        boolean b23 = defaultedMap7.containsKey((java.lang.Object) set22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 'a');
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 0);
        boolean b33 = defaultedMap29.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 0);
        boolean b39 = defaultedMap35.equals((java.lang.Object) 1.0d);
        defaultedMap35.clear();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate41, predicate42);
        java.lang.Object obj44 = defaultedMap25.put((java.lang.Object) defaultedMap29, (java.lang.Object) map43);
        java.util.Set set45 = defaultedMap29.entrySet();
        java.lang.Object obj46 = defaultedMap7.get((java.lang.Object) set45);
        boolean b47 = defaultedMap1.containsValue(obj46);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate3 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 0);
        boolean b11 = defaultedMap7.equals((java.lang.Object) 1.0d);
        defaultedMap7.clear();
        int i13 = defaultedMap7.size();
        try {
            boolean b15 = fixedOrderComparator5.addAsEqual((java.lang.Object) defaultedMap7, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection15 = defaultedMap14.values();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 0);
        boolean b21 = defaultedMap17.equals((java.lang.Object) 1.0d);
        defaultedMap17.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate26);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 0);
        boolean b31 = defaultedMap27.equals((java.lang.Object) 1.0d);
        defaultedMap27.clear();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate23, predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        boolean b38 = defaultedMap10.containsValue((java.lang.Object) defaultedMap37);
        boolean b39 = defaultedMap1.equals((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) set8);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap6.equals((java.lang.Object) 10);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 0);
        boolean b14 = defaultedMap10.equals((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap10.keySet();
        java.lang.Object obj16 = defaultedMap6.remove((java.lang.Object) set15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 0);
        boolean b22 = defaultedMap18.equals((java.lang.Object) 1.0d);
        defaultedMap18.clear();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate25);
        java.lang.Object obj27 = defaultedMap6.get((java.lang.Object) defaultedMap18);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap29.remove((java.lang.Object) true);
        boolean b34 = defaultedMap29.isEmpty();
        java.lang.String str35 = defaultedMap29.toString();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 0);
        boolean b41 = defaultedMap37.equals((java.lang.Object) 1.0d);
        defaultedMap37.clear();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection48 = defaultedMap47.values();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicate49);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) 0);
        boolean b54 = defaultedMap50.equals((java.lang.Object) 1.0d);
        defaultedMap50.clear();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicate59);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) 0);
        boolean b64 = defaultedMap60.equals((java.lang.Object) 1.0d);
        defaultedMap60.clear();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate56, predicate66);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate44, predicate66);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate44, predicate71);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate44);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator8.isLocked();
        boolean b10 = fixedOrderComparator8.isLocked();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) true);
        defaultedMap12.clear();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { defaultedMap12, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b21 = fixedOrderComparator8.add((java.lang.Object) obj_array19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) 100.0d);
        java.util.Set set26 = defaultedMap23.entrySet();
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) fixedOrderComparator8, (java.lang.Object) defaultedMap23);
        int i28 = fixedOrderComparator8.getUnknownObjectBehavior();
        boolean b29 = fixedOrderComparator8.isLocked();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) true);
        defaultedMap31.clear();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { defaultedMap31, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        boolean b40 = fixedOrderComparator8.add((java.lang.Object) fixedOrderComparator39);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection5 = defaultedMap4.values();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 0);
        boolean b11 = defaultedMap7.equals((java.lang.Object) 1.0d);
        defaultedMap7.clear();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 0);
        boolean b21 = defaultedMap17.equals((java.lang.Object) 1.0d);
        defaultedMap17.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate13, predicate23);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 0);
        boolean b32 = defaultedMap28.equals((java.lang.Object) 1.0d);
        defaultedMap28.clear();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate34);
        java.util.Set set38 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        int i8 = defaultedMap1.size();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) true);
        boolean b15 = defaultedMap10.isEmpty();
        java.util.Set set16 = defaultedMap10.entrySet();
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) set16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 'a');
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 0);
        boolean b27 = defaultedMap23.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 0);
        boolean b33 = defaultedMap29.equals((java.lang.Object) 1.0d);
        defaultedMap29.clear();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate35, predicate36);
        java.lang.Object obj38 = defaultedMap19.put((java.lang.Object) defaultedMap23, (java.lang.Object) map37);
        java.util.Set set39 = defaultedMap23.entrySet();
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) set39);
        java.util.Set set41 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator4);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) obj_array12);
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator();
        boolean b16 = fixedOrderComparator15.isLocked();
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) b16);
        java.util.Set set18 = defaultedMap8.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 'a');
        boolean b24 = defaultedMap20.equals((java.lang.Object) (byte) 100);
        java.util.Collection collection25 = defaultedMap20.values();
        java.lang.Object obj26 = defaultedMap8.get((java.lang.Object) collection25);
        boolean b27 = fixedOrderComparator4.add((java.lang.Object) collection25);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap5.keySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) set10);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 0);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) true);
        defaultedMap4.clear();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { defaultedMap4, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) obj_array11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b17 = defaultedMap15.equals((java.lang.Object) 10);
        boolean b19 = defaultedMap15.containsKey((java.lang.Object) 100);
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator();
        int i21 = fixedOrderComparator20.getUnknownObjectBehavior();
        fixedOrderComparator20.setUnknownObjectBehavior((int) (byte) 1);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator();
        boolean b25 = fixedOrderComparator24.isLocked();
        boolean b26 = fixedOrderComparator20.add((java.lang.Object) fixedOrderComparator24);
        boolean b27 = fixedOrderComparator20.isLocked();
        try {
            int i28 = fixedOrderComparator0.compare((java.lang.Object) b19, (java.lang.Object) b27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        java.util.Set set6 = defaultedMap1.keySet();
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) 0.0d);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        boolean b12 = fixedOrderComparator9.add((java.lang.Object) predicateUtils10);
        int i13 = fixedOrderComparator9.getUnknownObjectBehavior();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) fixedOrderComparator9);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) obj_array16);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 0);
        boolean b27 = defaultedMap23.equals((java.lang.Object) 1.0d);
        int i28 = defaultedMap23.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection31 = defaultedMap30.values();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 0);
        boolean b37 = defaultedMap33.equals((java.lang.Object) 1.0d);
        defaultedMap33.clear();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate42);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) 0);
        boolean b47 = defaultedMap43.equals((java.lang.Object) 1.0d);
        defaultedMap43.clear();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate39, predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicate54);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) 0);
        boolean b59 = defaultedMap55.equals((java.lang.Object) 1.0d);
        defaultedMap55.clear();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate39, predicate62);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate62);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap5.keySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) set10);
        java.lang.Object obj12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj20 = defaultedMap14.get((java.lang.Object) obj_array18);
        java.lang.Object obj21 = defaultedMap1.put(obj12, (java.lang.Object) defaultedMap14);
        defaultedMap14.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        boolean b15 = defaultedMap11.equals((java.lang.Object) 1.0d);
        defaultedMap11.clear();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) map19);
        java.util.Set set21 = defaultedMap5.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) true);
        boolean b28 = defaultedMap23.isEmpty();
        java.util.Set set29 = defaultedMap23.entrySet();
        defaultedMap23.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) true);
        boolean b38 = defaultedMap33.isEmpty();
        java.lang.String str39 = defaultedMap33.toString();
        int i40 = defaultedMap33.size();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) obj_array43);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) ' ');
        boolean b48 = defaultedMap45.isEmpty();
        java.lang.Object obj49 = defaultedMap33.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap45);
        java.lang.Object obj50 = defaultedMap23.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap45);
        boolean b51 = defaultedMap5.containsValue((java.lang.Object) defaultedMap45);
        java.util.Collection collection52 = defaultedMap5.values();
        java.lang.String str53 = defaultedMap5.toString();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.equals((java.lang.Object) 10);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        boolean b15 = defaultedMap11.equals((java.lang.Object) 1.0d);
        java.util.Set set16 = defaultedMap11.keySet();
        java.lang.Object obj17 = defaultedMap7.remove((java.lang.Object) set16);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) set16);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 1);
        boolean b4 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) obj_array8);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 0);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate18 };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils21);
        boolean b23 = fixedOrderComparator20.add((java.lang.Object) predicateUtils21);
        int i24 = fixedOrderComparator20.getUnknownObjectBehavior();
        java.lang.Object obj25 = defaultedMap12.get((java.lang.Object) fixedOrderComparator20);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) obj_array27);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) '4');
        defaultedMap12.putAll((java.util.Map) defaultedMap29);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        java.lang.Object obj35 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) predicate33);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        boolean b12 = fixedOrderComparator9.add((java.lang.Object) predicateUtils10);
        int i13 = fixedOrderComparator9.getUnknownObjectBehavior();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) fixedOrderComparator9);
        int i15 = fixedOrderComparator9.getUnknownObjectBehavior();
        boolean b16 = fixedOrderComparator9.isLocked();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) "");
        boolean b13 = defaultedMap10.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj21 = defaultedMap15.get((java.lang.Object) obj_array19);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator22.isLocked();
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) b23);
        java.util.Set set25 = defaultedMap15.keySet();
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) b13, (java.lang.Object) set25);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0);
        boolean b13 = defaultedMap9.equals((java.lang.Object) 1.0d);
        defaultedMap9.clear();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection20 = defaultedMap19.values();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 0);
        boolean b26 = defaultedMap22.equals((java.lang.Object) 1.0d);
        defaultedMap22.clear();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0);
        boolean b36 = defaultedMap32.equals((java.lang.Object) 1.0d);
        defaultedMap32.clear();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate28, predicate38);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate38);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) 0);
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) true);
        boolean b49 = defaultedMap44.isEmpty();
        java.util.Set set50 = defaultedMap44.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        boolean b52 = fixedOrderComparator51.isLocked();
        int i53 = fixedOrderComparator51.getUnknownObjectBehavior();
        boolean b54 = defaultedMap44.containsValue((java.lang.Object) i53);
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        java.util.Collection collection56 = defaultedMap44.values();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection56);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        java.lang.Object obj3 = null;
        try {
            boolean b5 = fixedOrderComparator2.addAsEqual(obj3, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        boolean b15 = defaultedMap11.equals((java.lang.Object) 1.0d);
        defaultedMap11.clear();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) map19);
        java.lang.String str21 = defaultedMap5.toString();
        java.lang.Object obj22 = null;
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator();
        int i24 = fixedOrderComparator23.getUnknownObjectBehavior();
        fixedOrderComparator23.setUnknownObjectBehavior((int) (byte) 1);
        boolean b28 = fixedOrderComparator23.add((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator23);
        java.lang.Object obj30 = defaultedMap5.put(obj22, (java.lang.Object) defaultedMap29);
        collections.Transformer transformer31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) true);
        boolean b13 = defaultedMap8.isEmpty();
        java.lang.String str14 = defaultedMap8.toString();
        java.util.Set set15 = defaultedMap8.entrySet();
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b20 = defaultedMap18.equals((java.lang.Object) 10);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) "");
        boolean b25 = defaultedMap22.isEmpty();
        boolean b26 = defaultedMap18.containsValue((java.lang.Object) defaultedMap22);
        java.util.Set set27 = defaultedMap22.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap22);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) obj_array30);
        java.lang.Object obj33 = defaultedMap22.get((java.lang.Object) obj_array30);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection6 = defaultedMap5.values();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 0);
        boolean b12 = defaultedMap8.equals((java.lang.Object) 1.0d);
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 0);
        boolean b22 = defaultedMap18.equals((java.lang.Object) 1.0d);
        defaultedMap18.clear();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate14, predicate24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) defaultedMap28);
        java.lang.String str30 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 0);
        boolean b11 = defaultedMap7.equals((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap7.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) set12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 0);
        boolean b19 = defaultedMap15.equals((java.lang.Object) 1.0d);
        defaultedMap15.clear();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap3.get((java.lang.Object) defaultedMap15);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) true);
        boolean b31 = defaultedMap26.isEmpty();
        java.lang.String str32 = defaultedMap26.toString();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 0);
        boolean b38 = defaultedMap34.equals((java.lang.Object) 1.0d);
        defaultedMap34.clear();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection45 = defaultedMap44.values();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 0);
        boolean b51 = defaultedMap47.equals((java.lang.Object) 1.0d);
        defaultedMap47.clear();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate56);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) 0);
        boolean b61 = defaultedMap57.equals((java.lang.Object) 1.0d);
        defaultedMap57.clear();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate53, predicate63);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate41, predicate63);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate41, predicate68);
        java.lang.Object obj71 = defaultedMap1.remove((java.lang.Object) predicate68);
        java.lang.Object obj73 = defaultedMap1.get((java.lang.Object) true);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + "" + "'", obj73.equals(""));
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0);
        boolean b13 = defaultedMap9.equals((java.lang.Object) 1.0d);
        defaultedMap9.clear();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection20 = defaultedMap19.values();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 0);
        boolean b26 = defaultedMap22.equals((java.lang.Object) 1.0d);
        defaultedMap22.clear();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0);
        boolean b36 = defaultedMap32.equals((java.lang.Object) 1.0d);
        defaultedMap32.clear();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate28, predicate38);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate38);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) 0);
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) true);
        boolean b49 = defaultedMap44.isEmpty();
        java.util.Set set50 = defaultedMap44.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        boolean b52 = fixedOrderComparator51.isLocked();
        int i53 = fixedOrderComparator51.getUnknownObjectBehavior();
        boolean b54 = defaultedMap44.containsValue((java.lang.Object) i53);
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        collections.Factory factory56 = null;
        try {
            java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        java.util.Collection collection8 = defaultedMap1.values();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) true);
        boolean b15 = defaultedMap10.isEmpty();
        java.util.Set set16 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.lang.String str21 = defaultedMap20.toString();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap20);
        java.lang.Object obj23 = defaultedMap10.remove((java.lang.Object) defaultedMap20);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 0);
        boolean b29 = defaultedMap25.equals((java.lang.Object) 1.0d);
        defaultedMap25.clear();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate32);
        java.util.Set set34 = defaultedMap25.keySet();
        java.lang.Object obj35 = defaultedMap1.put(obj23, (java.lang.Object) defaultedMap25);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator8.isLocked();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) b9);
        java.util.Set set11 = defaultedMap1.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 'a');
        boolean b17 = defaultedMap13.equals((java.lang.Object) (byte) 100);
        java.util.Collection collection18 = defaultedMap13.values();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) collection18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 0);
        boolean b25 = defaultedMap21.equals((java.lang.Object) 1.0d);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array27);
        boolean b30 = defaultedMap21.containsValue((java.lang.Object) obj_array27);
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) b30);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils32);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        int i37 = defaultedMap36.size();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection40 = defaultedMap39.values();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 0);
        boolean b46 = defaultedMap42.equals((java.lang.Object) 1.0d);
        defaultedMap42.clear();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) 0);
        boolean b56 = defaultedMap52.equals((java.lang.Object) 1.0d);
        defaultedMap52.clear();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate58, predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate48, predicate58);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) predicate62);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) 0);
        boolean b67 = defaultedMap63.equals((java.lang.Object) 1.0d);
        defaultedMap63.clear();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate69, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate48, predicate69);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b76 = defaultedMap74.equals((java.lang.Object) 10);
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) predicate77);
        java.lang.Object obj80 = defaultedMap78.get((java.lang.Object) "");
        boolean b81 = defaultedMap78.isEmpty();
        boolean b82 = defaultedMap74.containsValue((java.lang.Object) defaultedMap78);
        java.util.Set set83 = defaultedMap78.keySet();
        defaultedMap78.clear();
        boolean b85 = defaultedMap36.containsValue((java.lang.Object) defaultedMap78);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) predicate88);
        java.lang.String str90 = defaultedMap89.toString();
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap87, (java.lang.Object) defaultedMap89);
        java.util.Collection collection92 = defaultedMap87.values();
        java.lang.Object obj93 = defaultedMap34.put((java.lang.Object) defaultedMap36, (java.lang.Object) defaultedMap87);
        java.lang.Object obj94 = defaultedMap1.get((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "{}" + "'", str90.equals("{}"));
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(obj94);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.equals((java.lang.Object) 10);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) "");
        boolean b15 = defaultedMap12.isEmpty();
        boolean b16 = defaultedMap8.containsValue((java.lang.Object) defaultedMap12);
        java.util.Set set17 = defaultedMap12.keySet();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 0);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) true);
        defaultedMap4.clear();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { defaultedMap4, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) obj_array11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set16 = defaultedMap15.keySet();
        boolean b17 = defaultedMap15.isEmpty();
        boolean b18 = fixedOrderComparator0.add((java.lang.Object) b17);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection5 = defaultedMap4.values();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 0);
        boolean b11 = defaultedMap7.equals((java.lang.Object) 1.0d);
        defaultedMap7.clear();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 0);
        boolean b21 = defaultedMap17.equals((java.lang.Object) 1.0d);
        defaultedMap17.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate13, predicate23);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 0);
        boolean b32 = defaultedMap28.equals((java.lang.Object) 1.0d);
        defaultedMap28.clear();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b41 = defaultedMap39.equals((java.lang.Object) 10);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate42);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) "");
        boolean b46 = defaultedMap43.isEmpty();
        boolean b47 = defaultedMap39.containsValue((java.lang.Object) defaultedMap43);
        java.util.Set set48 = defaultedMap43.keySet();
        defaultedMap43.clear();
        boolean b50 = defaultedMap1.containsValue((java.lang.Object) defaultedMap43);
        java.lang.String str51 = defaultedMap43.toString();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        boolean b4 = defaultedMap1.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) true);
        defaultedMap6.clear();
        int i12 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b16 = defaultedMap14.equals((java.lang.Object) 10);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 0);
        boolean b22 = defaultedMap18.equals((java.lang.Object) 1.0d);
        java.util.Set set23 = defaultedMap18.keySet();
        java.lang.Object obj24 = defaultedMap14.remove((java.lang.Object) set23);
        defaultedMap14.clear();
        java.lang.Object obj26 = defaultedMap6.remove((java.lang.Object) defaultedMap14);
        java.lang.Object obj27 = null;
        collections.PredicateUtils predicateUtils28 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils28);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        int i33 = defaultedMap32.size();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection36 = defaultedMap35.values();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate37);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 0);
        boolean b42 = defaultedMap38.equals((java.lang.Object) 1.0d);
        defaultedMap38.clear();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate47);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) 0);
        boolean b52 = defaultedMap48.equals((java.lang.Object) 1.0d);
        defaultedMap48.clear();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate44, predicate54);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) predicate58);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) 0);
        boolean b63 = defaultedMap59.equals((java.lang.Object) 1.0d);
        defaultedMap59.clear();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate44, predicate65);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b72 = defaultedMap70.equals((java.lang.Object) 10);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) predicate73);
        java.lang.Object obj76 = defaultedMap74.get((java.lang.Object) "");
        boolean b77 = defaultedMap74.isEmpty();
        boolean b78 = defaultedMap70.containsValue((java.lang.Object) defaultedMap74);
        java.util.Set set79 = defaultedMap74.keySet();
        defaultedMap74.clear();
        boolean b81 = defaultedMap32.containsValue((java.lang.Object) defaultedMap74);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) predicate84);
        java.lang.String str86 = defaultedMap85.toString();
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap83, (java.lang.Object) defaultedMap85);
        java.util.Collection collection88 = defaultedMap83.values();
        java.lang.Object obj89 = defaultedMap30.put((java.lang.Object) defaultedMap32, (java.lang.Object) defaultedMap83);
        java.lang.Object obj90 = defaultedMap6.put(obj27, obj89);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "{}" + "'", str86.equals("{}"));
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator8.isLocked();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) b9);
        java.util.Collection collection11 = defaultedMap1.values();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) obj_array13);
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0);
        boolean b13 = defaultedMap9.equals((java.lang.Object) 1.0d);
        defaultedMap9.clear();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection20 = defaultedMap19.values();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 0);
        boolean b26 = defaultedMap22.equals((java.lang.Object) 1.0d);
        defaultedMap22.clear();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0);
        boolean b36 = defaultedMap32.equals((java.lang.Object) 1.0d);
        defaultedMap32.clear();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate38, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate28, predicate38);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate38);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) 0);
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) true);
        boolean b49 = defaultedMap44.isEmpty();
        java.util.Set set50 = defaultedMap44.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator();
        boolean b52 = fixedOrderComparator51.isLocked();
        int i53 = fixedOrderComparator51.getUnknownObjectBehavior();
        boolean b54 = defaultedMap44.containsValue((java.lang.Object) i53);
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        java.lang.String str56 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator8.isLocked();
        boolean b10 = fixedOrderComparator8.isLocked();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) true);
        defaultedMap12.clear();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { defaultedMap12, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b21 = fixedOrderComparator8.add((java.lang.Object) obj_array19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) 100.0d);
        java.util.Set set26 = defaultedMap23.entrySet();
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) fixedOrderComparator8, (java.lang.Object) defaultedMap23);
        int i28 = fixedOrderComparator8.getUnknownObjectBehavior();
        boolean b29 = fixedOrderComparator8.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator();
        boolean b31 = fixedOrderComparator30.isLocked();
        boolean b32 = fixedOrderComparator30.isLocked();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) true);
        defaultedMap34.clear();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { defaultedMap34, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        boolean b43 = fixedOrderComparator30.add((java.lang.Object) obj_array41);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicate44);
        int i46 = defaultedMap45.size();
        boolean b48 = defaultedMap45.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap45);
        try {
            boolean b50 = fixedOrderComparator8.addAsEqual((java.lang.Object) obj_array41, (java.lang.Object) defaultedMap45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.equals((java.lang.Object) 10);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0);
        boolean b13 = defaultedMap9.equals((java.lang.Object) 1.0d);
        java.util.Set set14 = defaultedMap9.keySet();
        java.lang.Object obj15 = defaultedMap5.remove((java.lang.Object) set14);
        java.lang.String str16 = defaultedMap5.toString();
        java.util.Collection collection17 = defaultedMap5.values();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) collection17);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) true);
        boolean b13 = defaultedMap8.isEmpty();
        java.lang.String str14 = defaultedMap8.toString();
        java.util.Set set15 = defaultedMap8.entrySet();
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 'a');
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 0);
        boolean b26 = defaultedMap22.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 0);
        boolean b32 = defaultedMap28.equals((java.lang.Object) 1.0d);
        defaultedMap28.clear();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap18.put((java.lang.Object) defaultedMap22, (java.lang.Object) map36);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        boolean b39 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate3 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        int i6 = fixedOrderComparator5.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue(i6 == 2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) true);
        boolean b13 = defaultedMap8.isEmpty();
        java.lang.String str14 = defaultedMap8.toString();
        java.util.Set set15 = defaultedMap8.entrySet();
        boolean b16 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b20 = defaultedMap18.equals((java.lang.Object) 10);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) "");
        boolean b25 = defaultedMap22.isEmpty();
        boolean b26 = defaultedMap18.containsValue((java.lang.Object) defaultedMap22);
        java.util.Set set27 = defaultedMap22.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap22);
        int i29 = defaultedMap22.size();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) 'a');
        java.util.Set set34 = defaultedMap31.keySet();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) (byte) -1);
        boolean b37 = defaultedMap22.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) 'a');
        boolean b7 = defaultedMap3.equals((java.lang.Object) (byte) 100);
        java.util.Collection collection8 = defaultedMap3.values();
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator();
        boolean b10 = fixedOrderComparator9.isLocked();
        boolean b11 = defaultedMap3.equals((java.lang.Object) fixedOrderComparator9);
        boolean b12 = fixedOrderComparator0.add((java.lang.Object) defaultedMap3);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) obj_array14);
        try {
            int i20 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap18, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array14);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) "");
        boolean b8 = defaultedMap5.isEmpty();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        java.util.Set set10 = defaultedMap5.keySet();
        defaultedMap5.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) true);
        boolean b18 = defaultedMap13.isEmpty();
        java.util.Collection collection19 = defaultedMap13.values();
        java.lang.Object obj20 = defaultedMap5.get((java.lang.Object) defaultedMap13);
        boolean b21 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        java.lang.Object[] obj_array7 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array7);
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array7);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) obj_array7);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array7);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) -1);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 'a');
        java.util.Set set10 = defaultedMap7.keySet();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (byte) -1);
        defaultedMap7.clear();
        java.util.Collection collection14 = defaultedMap7.values();
        boolean b15 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        int i16 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        int i8 = defaultedMap1.size();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b12 = defaultedMap10.equals((java.lang.Object) 10);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 0);
        boolean b18 = defaultedMap14.equals((java.lang.Object) 1.0d);
        java.util.Set set19 = defaultedMap14.keySet();
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) set19);
        java.lang.Object obj21 = defaultedMap1.get(obj20);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap3);
        java.util.Collection collection6 = defaultedMap1.values();
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Collection collection7 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array14 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) obj_array14);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator();
        boolean b18 = fixedOrderComparator17.isLocked();
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) b18);
        java.util.Set set20 = defaultedMap10.keySet();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 'a');
        java.util.Set set25 = defaultedMap22.keySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (byte) -1);
        defaultedMap22.clear();
        java.util.Set set29 = defaultedMap22.entrySet();
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) set20, (java.lang.Object) set29);
        java.util.Set set31 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) obj_array3);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        boolean b15 = defaultedMap11.equals((java.lang.Object) 1.0d);
        defaultedMap11.clear();
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b18 = defaultedMap5.containsValue((java.lang.Object) defaultedMap9);
        java.util.Set set19 = defaultedMap9.keySet();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) obj_array21);
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) defaultedMap25);
        collections.Transformer transformer27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        int i8 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        int i13 = defaultedMap12.size();
        boolean b15 = defaultedMap12.equals((java.lang.Object) '#');
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        int i17 = fixedOrderComparator16.getUnknownObjectBehavior();
        fixedOrderComparator16.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) (byte) 1);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj20);
        boolean b22 = defaultedMap1.containsValue(obj20);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap24.remove((java.lang.Object) true);
        defaultedMap24.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i17 == 2);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        int i8 = defaultedMap1.size();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) true);
        boolean b15 = defaultedMap10.isEmpty();
        java.util.Set set16 = defaultedMap10.entrySet();
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) set16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) true);
        boolean b24 = defaultedMap19.isEmpty();
        java.lang.String str25 = defaultedMap19.toString();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate26);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 0);
        boolean b31 = defaultedMap27.equals((java.lang.Object) 1.0d);
        defaultedMap27.clear();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection38 = defaultedMap37.values();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) 0);
        boolean b44 = defaultedMap40.equals((java.lang.Object) 1.0d);
        defaultedMap40.clear();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicate49);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) 0);
        boolean b54 = defaultedMap50.equals((java.lang.Object) 1.0d);
        defaultedMap50.clear();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate46, predicate56);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate34, predicate56);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) predicate61);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) 0);
        java.lang.Object obj66 = defaultedMap62.remove((java.lang.Object) true);
        boolean b67 = defaultedMap62.isEmpty();
        java.util.Set set68 = defaultedMap62.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator();
        boolean b70 = fixedOrderComparator69.isLocked();
        int i71 = fixedOrderComparator69.getUnknownObjectBehavior();
        boolean b72 = defaultedMap62.containsValue((java.lang.Object) i71);
        defaultedMap19.putAll((java.util.Map) defaultedMap62);
        java.lang.Object obj74 = defaultedMap1.remove((java.lang.Object) defaultedMap62);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i71 == 2);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap5.keySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) set10);
        java.lang.Object obj12 = null;
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj20 = defaultedMap14.get((java.lang.Object) obj_array18);
        java.lang.Object obj21 = defaultedMap1.put(obj12, (java.lang.Object) defaultedMap14);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) true);
        boolean b28 = defaultedMap23.isEmpty();
        java.util.Collection collection29 = defaultedMap23.values();
        defaultedMap23.clear();
        boolean b31 = defaultedMap1.equals((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) obj_array8);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        int i9 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection12 = defaultedMap11.values();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 0);
        boolean b18 = defaultedMap14.equals((java.lang.Object) 1.0d);
        defaultedMap14.clear();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 0);
        boolean b28 = defaultedMap24.equals((java.lang.Object) 1.0d);
        defaultedMap24.clear();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate20, predicate30);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 0);
        boolean b39 = defaultedMap35.equals((java.lang.Object) 1.0d);
        defaultedMap35.clear();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate20, predicate41);
        boolean b45 = defaultedMap1.equals((java.lang.Object) map44);
        java.util.Collection collection46 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str48 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap6.equals((java.lang.Object) 10);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 0);
        boolean b14 = defaultedMap10.equals((java.lang.Object) 1.0d);
        java.util.Set set15 = defaultedMap10.keySet();
        java.lang.Object obj16 = defaultedMap6.remove((java.lang.Object) set15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 0);
        boolean b22 = defaultedMap18.equals((java.lang.Object) 1.0d);
        defaultedMap18.clear();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate25);
        java.lang.Object obj27 = defaultedMap6.get((java.lang.Object) defaultedMap18);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap29.remove((java.lang.Object) true);
        boolean b34 = defaultedMap29.isEmpty();
        java.lang.String str35 = defaultedMap29.toString();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 0);
        boolean b41 = defaultedMap37.equals((java.lang.Object) 1.0d);
        defaultedMap37.clear();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection48 = defaultedMap47.values();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicate49);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) 0);
        boolean b54 = defaultedMap50.equals((java.lang.Object) 1.0d);
        defaultedMap50.clear();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicate59);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) 0);
        boolean b64 = defaultedMap60.equals((java.lang.Object) 1.0d);
        defaultedMap60.clear();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate56, predicate66);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate44, predicate66);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate44, predicate71);
        boolean b74 = fixedOrderComparator4.add((java.lang.Object) predicate71);
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b74 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        fixedOrderComparator2.setUnknownObjectBehavior((int) (short) 0);
        int i5 = fixedOrderComparator2.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        defaultedMap1.clear();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.String str12 = defaultedMap11.toString();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap11);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 0);
        boolean b24 = defaultedMap20.equals((java.lang.Object) 1.0d);
        defaultedMap20.clear();
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj27 = defaultedMap16.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        collections.Factory factory29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 0);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) true);
        defaultedMap4.clear();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { defaultedMap4, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b13 = fixedOrderComparator0.add((java.lang.Object) obj_array11);
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array11);
        boolean b15 = fixedOrderComparator14.isLocked();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        boolean b2 = fixedOrderComparator0.isLocked();
        collections.comparators.FixedOrderComparator fixedOrderComparator3 = new collections.comparators.FixedOrderComparator();
        boolean b4 = fixedOrderComparator3.isLocked();
        boolean b5 = fixedOrderComparator3.isLocked();
        boolean b6 = fixedOrderComparator3.isLocked();
        boolean b7 = fixedOrderComparator0.add((java.lang.Object) b6);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 0);
        boolean b11 = defaultedMap7.equals((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap7.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) set12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 0);
        boolean b19 = defaultedMap15.equals((java.lang.Object) 1.0d);
        defaultedMap15.clear();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap3.get((java.lang.Object) defaultedMap15);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) true);
        boolean b31 = defaultedMap26.isEmpty();
        java.lang.String str32 = defaultedMap26.toString();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 0);
        boolean b38 = defaultedMap34.equals((java.lang.Object) 1.0d);
        defaultedMap34.clear();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection45 = defaultedMap44.values();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 0);
        boolean b51 = defaultedMap47.equals((java.lang.Object) 1.0d);
        defaultedMap47.clear();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate56);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) 0);
        boolean b61 = defaultedMap57.equals((java.lang.Object) 1.0d);
        defaultedMap57.clear();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate53, predicate63);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate41, predicate63);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate41, predicate68);
        java.lang.Object obj71 = defaultedMap1.remove((java.lang.Object) predicate68);
        java.lang.Object obj73 = defaultedMap1.get((java.lang.Object) true);
        java.lang.Object[] obj_array75 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array75);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array75);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array75);
        boolean b79 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator78);
        java.lang.Object obj81 = defaultedMap1.remove((java.lang.Object) 10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + "" + "'", obj73.equals(""));
        org.junit.Assert.assertNotNull(obj_array75);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 1);
        boolean b5 = fixedOrderComparator0.add((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator0);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) true);
        boolean b13 = defaultedMap8.isEmpty();
        java.lang.String str14 = defaultedMap8.toString();
        java.util.Set set15 = defaultedMap8.entrySet();
        boolean b16 = defaultedMap6.containsKey((java.lang.Object) set15);
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.Object[] obj_array1 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator2 = new collections.comparators.FixedOrderComparator(obj_array1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) obj_array1);
        boolean b4 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNotNull(obj_array1);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        boolean b12 = fixedOrderComparator9.add((java.lang.Object) predicateUtils10);
        int i13 = fixedOrderComparator9.getUnknownObjectBehavior();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) fixedOrderComparator9);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 0);
        boolean b11 = defaultedMap7.equals((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap7.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) set12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 0);
        boolean b19 = defaultedMap15.equals((java.lang.Object) 1.0d);
        defaultedMap15.clear();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap3.get((java.lang.Object) defaultedMap15);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) true);
        boolean b31 = defaultedMap26.isEmpty();
        java.lang.String str32 = defaultedMap26.toString();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 0);
        boolean b38 = defaultedMap34.equals((java.lang.Object) 1.0d);
        defaultedMap34.clear();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection45 = defaultedMap44.values();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 0);
        boolean b51 = defaultedMap47.equals((java.lang.Object) 1.0d);
        defaultedMap47.clear();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate56);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) 0);
        boolean b61 = defaultedMap57.equals((java.lang.Object) 1.0d);
        defaultedMap57.clear();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate53, predicate63);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate41, predicate63);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate41, predicate68);
        java.lang.Object obj71 = defaultedMap1.remove((java.lang.Object) predicate68);
        java.lang.Object obj73 = defaultedMap1.get((java.lang.Object) true);
        java.lang.Object[] obj_array75 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator76 = new collections.comparators.FixedOrderComparator(obj_array75);
        collections.comparators.FixedOrderComparator fixedOrderComparator77 = new collections.comparators.FixedOrderComparator(obj_array75);
        collections.comparators.FixedOrderComparator fixedOrderComparator78 = new collections.comparators.FixedOrderComparator(obj_array75);
        boolean b79 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator78);
        collections.Factory factory80 = null;
        try {
            java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + "" + "'", obj73.equals(""));
        org.junit.Assert.assertNotNull(obj_array75);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        java.util.Set set4 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 0);
        boolean b11 = defaultedMap7.equals((java.lang.Object) 1.0d);
        java.util.Set set12 = defaultedMap7.keySet();
        java.lang.Object obj13 = defaultedMap3.remove((java.lang.Object) set12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 0);
        boolean b19 = defaultedMap15.equals((java.lang.Object) 1.0d);
        defaultedMap15.clear();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap3.get((java.lang.Object) defaultedMap15);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) true);
        boolean b31 = defaultedMap26.isEmpty();
        java.lang.String str32 = defaultedMap26.toString();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 0);
        boolean b38 = defaultedMap34.equals((java.lang.Object) 1.0d);
        defaultedMap34.clear();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection45 = defaultedMap44.values();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 0);
        boolean b51 = defaultedMap47.equals((java.lang.Object) 1.0d);
        defaultedMap47.clear();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate56);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) 0);
        boolean b61 = defaultedMap57.equals((java.lang.Object) 1.0d);
        defaultedMap57.clear();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate53, predicate63);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate41, predicate63);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate41, predicate68);
        java.lang.Object obj71 = defaultedMap1.remove((java.lang.Object) predicate68);
        boolean b72 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        java.util.Set set10 = defaultedMap5.keySet();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) set10);
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        boolean b13 = fixedOrderComparator12.isLocked();
        int i14 = fixedOrderComparator12.getUnknownObjectBehavior();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) i14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 0);
        boolean b23 = defaultedMap19.equals((java.lang.Object) 1.0d);
        defaultedMap19.clear();
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator();
        boolean b27 = fixedOrderComparator26.isLocked();
        boolean b28 = fixedOrderComparator26.isLocked();
        boolean b29 = fixedOrderComparator26.isLocked();
        boolean b30 = defaultedMap17.equals((java.lang.Object) fixedOrderComparator26);
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap17);
        java.lang.Object obj33 = defaultedMap17.get((java.lang.Object) (-1));
        collections.Factory factory34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, factory34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        boolean b15 = defaultedMap11.equals((java.lang.Object) 1.0d);
        defaultedMap11.clear();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) map19);
        java.util.Set set21 = defaultedMap5.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) true);
        boolean b28 = defaultedMap23.isEmpty();
        java.util.Set set29 = defaultedMap23.entrySet();
        defaultedMap23.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) true);
        boolean b38 = defaultedMap33.isEmpty();
        java.lang.String str39 = defaultedMap33.toString();
        int i40 = defaultedMap33.size();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) obj_array43);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) ' ');
        boolean b48 = defaultedMap45.isEmpty();
        java.lang.Object obj49 = defaultedMap33.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap45);
        java.lang.Object obj50 = defaultedMap23.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap45);
        boolean b51 = defaultedMap5.containsValue((java.lang.Object) defaultedMap45);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate52);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) 0);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array60 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate59 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.PredicateUtils predicateUtils62 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils62);
        boolean b64 = fixedOrderComparator61.add((java.lang.Object) predicateUtils62);
        int i65 = fixedOrderComparator61.getUnknownObjectBehavior();
        java.lang.Object obj66 = defaultedMap53.get((java.lang.Object) fixedOrderComparator61);
        boolean b67 = defaultedMap5.containsKey((java.lang.Object) fixedOrderComparator61);
        int i68 = defaultedMap5.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(i68 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.lang.String str7 = defaultedMap6.toString();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap6);
        java.util.Collection collection9 = defaultedMap4.values();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj17 = defaultedMap11.get((java.lang.Object) obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator();
        boolean b19 = fixedOrderComparator18.isLocked();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) b19);
        java.util.Set set21 = defaultedMap11.keySet();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 'a');
        boolean b27 = defaultedMap23.equals((java.lang.Object) (byte) 100);
        java.util.Collection collection28 = defaultedMap23.values();
        java.lang.Object obj29 = defaultedMap11.get((java.lang.Object) collection28);
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) defaultedMap4, (java.lang.Object) defaultedMap11);
        java.util.Collection collection31 = defaultedMap4.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        boolean b7 = defaultedMap1.equals((java.lang.Object) 10);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        boolean b15 = defaultedMap11.equals((java.lang.Object) 1.0d);
        defaultedMap11.clear();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) map19);
        java.util.Set set21 = defaultedMap5.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) true);
        boolean b28 = defaultedMap23.isEmpty();
        java.util.Set set29 = defaultedMap23.entrySet();
        defaultedMap23.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) true);
        boolean b38 = defaultedMap33.isEmpty();
        java.lang.String str39 = defaultedMap33.toString();
        int i40 = defaultedMap33.size();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) obj_array43);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) ' ');
        boolean b48 = defaultedMap45.isEmpty();
        java.lang.Object obj49 = defaultedMap33.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap45);
        java.lang.Object obj50 = defaultedMap23.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap45);
        boolean b51 = defaultedMap5.containsValue((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicate54);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) 0);
        boolean b59 = defaultedMap55.equals((java.lang.Object) 1.0d);
        defaultedMap55.clear();
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator();
        boolean b63 = fixedOrderComparator62.isLocked();
        boolean b64 = fixedOrderComparator62.isLocked();
        boolean b65 = fixedOrderComparator62.isLocked();
        boolean b66 = defaultedMap53.equals((java.lang.Object) fixedOrderComparator62);
        java.lang.Object[] obj_array68 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        boolean b70 = fixedOrderComparator62.add((java.lang.Object) fixedOrderComparator69);
        int i71 = fixedOrderComparator62.getUnknownObjectBehavior();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) i71);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(i71 == 2);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        fixedOrderComparator0.setUnknownObjectBehavior((int) (byte) 1);
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator();
        boolean b5 = fixedOrderComparator4.isLocked();
        boolean b6 = fixedOrderComparator0.add((java.lang.Object) fixedOrderComparator4);
        boolean b7 = fixedOrderComparator0.isLocked();
        boolean b8 = fixedOrderComparator0.isLocked();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 'a');
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 0);
        boolean b18 = defaultedMap14.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 0);
        boolean b24 = defaultedMap20.equals((java.lang.Object) 1.0d);
        defaultedMap20.clear();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate26, predicate27);
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap14, (java.lang.Object) map28);
        java.util.Set set30 = defaultedMap14.entrySet();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) true);
        boolean b37 = defaultedMap32.isEmpty();
        java.util.Set set38 = defaultedMap32.entrySet();
        defaultedMap32.clear();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap42.remove((java.lang.Object) true);
        boolean b47 = defaultedMap42.isEmpty();
        java.lang.String str48 = defaultedMap42.toString();
        int i49 = defaultedMap42.size();
        java.lang.Object[] obj_array52 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) obj_array52);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) ' ');
        boolean b57 = defaultedMap54.isEmpty();
        java.lang.Object obj58 = defaultedMap42.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap54);
        java.lang.Object obj59 = defaultedMap32.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap54);
        boolean b60 = defaultedMap14.containsValue((java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b64 = defaultedMap62.equals((java.lang.Object) 10);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicate65);
        java.lang.Object obj68 = defaultedMap66.remove((java.lang.Object) 0);
        boolean b70 = defaultedMap66.equals((java.lang.Object) 1.0d);
        java.util.Set set71 = defaultedMap66.keySet();
        java.lang.Object obj72 = defaultedMap62.remove((java.lang.Object) set71);
        java.lang.String str73 = defaultedMap62.toString();
        java.util.Collection collection74 = defaultedMap62.values();
        int i75 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap14, (java.lang.Object) collection74);
        int i76 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertTrue(i76 == 1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection6 = defaultedMap5.values();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 0);
        boolean b12 = defaultedMap8.equals((java.lang.Object) 1.0d);
        defaultedMap8.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 0);
        boolean b22 = defaultedMap18.equals((java.lang.Object) 1.0d);
        defaultedMap18.clear();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate14, predicate24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) defaultedMap28);
        java.lang.String str30 = defaultedMap28.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) 0);
        boolean b7 = defaultedMap3.equals((java.lang.Object) 1.0d);
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator();
        boolean b11 = fixedOrderComparator10.isLocked();
        boolean b12 = fixedOrderComparator10.isLocked();
        boolean b13 = fixedOrderComparator10.isLocked();
        boolean b14 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator10);
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        boolean b18 = fixedOrderComparator10.add((java.lang.Object) fixedOrderComparator17);
        int i19 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) 1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate3 };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils6);
        boolean b8 = fixedOrderComparator5.add((java.lang.Object) predicateUtils6);
        boolean b9 = fixedOrderComparator5.isLocked();
        boolean b10 = fixedOrderComparator5.isLocked();
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = fixedOrderComparator8.isLocked();
        boolean b10 = fixedOrderComparator8.isLocked();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) true);
        defaultedMap12.clear();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { defaultedMap12, 1.0f };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        boolean b21 = fixedOrderComparator8.add((java.lang.Object) obj_array19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) 100.0d);
        java.util.Set set26 = defaultedMap23.entrySet();
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) fixedOrderComparator8, (java.lang.Object) defaultedMap23);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "");
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        java.util.Set set6 = defaultedMap1.keySet();
        boolean b7 = defaultedMap1.isEmpty();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) "");
        boolean b12 = defaultedMap1.containsValue(obj11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set14 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        int i8 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b12 = defaultedMap10.equals((java.lang.Object) 10);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 0);
        boolean b18 = defaultedMap14.equals((java.lang.Object) 1.0d);
        java.util.Set set19 = defaultedMap14.keySet();
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) set19);
        java.lang.Object obj21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 0);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        java.lang.Object obj29 = defaultedMap23.get((java.lang.Object) obj_array27);
        java.lang.Object obj30 = defaultedMap10.put(obj21, (java.lang.Object) defaultedMap23);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 0);
        boolean b36 = defaultedMap32.equals((java.lang.Object) 1.0d);
        java.util.Set set37 = defaultedMap32.keySet();
        boolean b38 = defaultedMap32.isEmpty();
        boolean b39 = defaultedMap32.isEmpty();
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator();
        int i41 = fixedOrderComparator40.getUnknownObjectBehavior();
        fixedOrderComparator40.setUnknownObjectBehavior((int) (byte) 1);
        boolean b45 = fixedOrderComparator40.add((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator40);
        java.lang.Object obj47 = defaultedMap10.put((java.lang.Object) b39, (java.lang.Object) fixedOrderComparator40);
        java.lang.Object obj48 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i41 == 2);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        int i7 = defaultedMap1.size();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) true);
        defaultedMap9.clear();
        int i15 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.equals((java.lang.Object) 10);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 0);
        boolean b25 = defaultedMap21.equals((java.lang.Object) 1.0d);
        java.util.Set set26 = defaultedMap21.keySet();
        java.lang.Object obj27 = defaultedMap17.remove((java.lang.Object) set26);
        defaultedMap17.clear();
        java.lang.Object obj29 = defaultedMap9.remove((java.lang.Object) defaultedMap17);
        java.util.Collection collection30 = defaultedMap9.values();
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 0);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        boolean b15 = defaultedMap11.equals((java.lang.Object) 1.0d);
        defaultedMap11.clear();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) map19);
        java.util.Set set21 = defaultedMap5.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) true);
        boolean b28 = defaultedMap23.isEmpty();
        java.util.Set set29 = defaultedMap23.entrySet();
        defaultedMap23.clear();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) true);
        boolean b38 = defaultedMap33.isEmpty();
        java.lang.String str39 = defaultedMap33.toString();
        int i40 = defaultedMap33.size();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) obj_array43);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) ' ');
        boolean b48 = defaultedMap45.isEmpty();
        java.lang.Object obj49 = defaultedMap33.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap45);
        java.lang.Object obj50 = defaultedMap23.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap45);
        boolean b51 = defaultedMap5.containsValue((java.lang.Object) defaultedMap45);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate52);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) 0);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array60 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate59 };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.PredicateUtils predicateUtils62 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils62);
        boolean b64 = fixedOrderComparator61.add((java.lang.Object) predicateUtils62);
        int i65 = fixedOrderComparator61.getUnknownObjectBehavior();
        java.lang.Object obj66 = defaultedMap53.get((java.lang.Object) fixedOrderComparator61);
        boolean b67 = defaultedMap5.containsKey((java.lang.Object) fixedOrderComparator61);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b71 = defaultedMap69.containsValue((java.lang.Object) 100.0d);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) predicate72);
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) 0);
        java.lang.Object obj77 = defaultedMap73.remove((java.lang.Object) true);
        defaultedMap73.clear();
        int i79 = defaultedMap73.size();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) predicate82);
        java.lang.String str84 = defaultedMap83.toString();
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) defaultedMap83);
        defaultedMap73.putAll((java.util.Map) defaultedMap81);
        java.lang.Object obj87 = defaultedMap5.put((java.lang.Object) 100.0d, (java.lang.Object) defaultedMap73);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "{}" + "'", str84.equals("{}"));
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 1.0d);
        defaultedMap1.clear();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) true);
        defaultedMap11.clear();
        int i17 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap21);
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicate29);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) 0);
        boolean b34 = defaultedMap30.equals((java.lang.Object) 1.0d);
        defaultedMap30.clear();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj37 = defaultedMap26.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj38 = defaultedMap11.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj39 = defaultedMap1.remove((java.lang.Object) defaultedMap11);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate40);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) 'a');
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicate44);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) 0);
        boolean b49 = defaultedMap45.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) predicate50);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) 0);
        boolean b55 = defaultedMap51.equals((java.lang.Object) 1.0d);
        defaultedMap51.clear();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate57, predicate58);
        java.lang.Object obj60 = defaultedMap41.put((java.lang.Object) defaultedMap45, (java.lang.Object) map59);
        java.lang.String str61 = defaultedMap45.toString();
        java.lang.Object obj62 = null;
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator();
        int i64 = fixedOrderComparator63.getUnknownObjectBehavior();
        fixedOrderComparator63.setUnknownObjectBehavior((int) (byte) 1);
        boolean b68 = fixedOrderComparator63.add((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator63);
        java.lang.Object obj70 = defaultedMap45.put(obj62, (java.lang.Object) defaultedMap69);
        boolean b71 = defaultedMap11.equals((java.lang.Object) defaultedMap45);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 0);
        boolean b8 = defaultedMap4.equals((java.lang.Object) 1.0d);
        defaultedMap4.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 0);
        boolean b18 = defaultedMap14.equals((java.lang.Object) 1.0d);
        defaultedMap14.clear();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate20, predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate20);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 'a');
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 0);
        boolean b33 = defaultedMap29.equals((java.lang.Object) 1.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 0);
        boolean b39 = defaultedMap35.equals((java.lang.Object) 1.0d);
        defaultedMap35.clear();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate41, predicate42);
        java.lang.Object obj44 = defaultedMap25.put((java.lang.Object) defaultedMap29, (java.lang.Object) map43);
        java.util.Set set45 = defaultedMap29.entrySet();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap47.remove((java.lang.Object) true);
        boolean b52 = defaultedMap47.isEmpty();
        java.util.Set set53 = defaultedMap47.entrySet();
        defaultedMap47.clear();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate56);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap57.remove((java.lang.Object) true);
        boolean b62 = defaultedMap57.isEmpty();
        java.lang.String str63 = defaultedMap57.toString();
        int i64 = defaultedMap57.size();
        java.lang.Object[] obj_array67 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) obj_array67);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) ' ');
        boolean b72 = defaultedMap69.isEmpty();
        java.lang.Object obj73 = defaultedMap57.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap69);
        java.lang.Object obj74 = defaultedMap47.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap69);
        boolean b75 = defaultedMap29.containsValue((java.lang.Object) defaultedMap69);
        java.util.Collection collection76 = defaultedMap29.values();
        java.lang.Object obj77 = defaultedMap1.remove((java.lang.Object) defaultedMap29);
        boolean b78 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) predicate81);
        java.lang.Object obj84 = defaultedMap82.remove((java.lang.Object) 0);
        boolean b86 = defaultedMap82.equals((java.lang.Object) 1.0d);
        defaultedMap82.clear();
        defaultedMap80.putAll((java.util.Map) defaultedMap82);
        collections.PredicateUtils predicateUtils89 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils89);
        defaultedMap80.putAll((java.util.Map) defaultedMap90);
        java.lang.Object obj92 = defaultedMap29.get((java.lang.Object) defaultedMap80);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(obj92);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        int i9 = defaultedMap8.size();
        boolean b11 = defaultedMap8.equals((java.lang.Object) '#');
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator();
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj16 = defaultedMap8.get((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { 1.0d };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) obj_array8);
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        java.util.Set set14 = defaultedMap13.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap16.keySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (byte) -1);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        int i24 = defaultedMap23.size();
        boolean b26 = defaultedMap23.equals((java.lang.Object) '#');
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator();
        int i28 = fixedOrderComparator27.getUnknownObjectBehavior();
        fixedOrderComparator27.setUnknownObjectBehavior((int) (byte) 1);
        java.lang.Object obj31 = defaultedMap23.get((java.lang.Object) (byte) 1);
        java.lang.Object obj32 = defaultedMap16.get((java.lang.Object) defaultedMap23);
        boolean b33 = defaultedMap13.containsKey((java.lang.Object) defaultedMap16);
        java.lang.Object obj34 = null;
        try {
            boolean b35 = fixedOrderComparator11.addAsEqual((java.lang.Object) defaultedMap16, obj34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (byte) 10, 10.0d, "hi!", predicate7 };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        collections.PredicateUtils predicateUtils10 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils10);
        boolean b12 = fixedOrderComparator9.add((java.lang.Object) predicateUtils10);
        int i13 = fixedOrderComparator9.getUnknownObjectBehavior();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) fixedOrderComparator9);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 'a');
        java.util.Set set20 = defaultedMap17.keySet();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) (byte) -1);
        defaultedMap17.clear();
        java.util.Collection collection24 = defaultedMap17.values();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) true);
        boolean b33 = defaultedMap28.isEmpty();
        java.lang.String str34 = defaultedMap28.toString();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) 0);
        boolean b40 = defaultedMap36.equals((java.lang.Object) 1.0d);
        defaultedMap36.clear();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate42, predicate43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection47 = defaultedMap46.values();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) predicate48);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) 0);
        boolean b53 = defaultedMap49.equals((java.lang.Object) 1.0d);
        defaultedMap49.clear();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) predicate58);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) 0);
        boolean b63 = defaultedMap59.equals((java.lang.Object) 1.0d);
        defaultedMap59.clear();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate55, predicate65);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate43, predicate65);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate25, predicate43);
        try {
            int i71 = fixedOrderComparator9.compare(obj15, (java.lang.Object) map70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.equals((java.lang.Object) 10);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) "");
        boolean b12 = defaultedMap9.isEmpty();
        boolean b13 = defaultedMap5.containsValue((java.lang.Object) defaultedMap9);
        java.util.Set set14 = defaultedMap9.keySet();
        defaultedMap9.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) true);
        boolean b22 = defaultedMap17.isEmpty();
        java.util.Collection collection23 = defaultedMap17.values();
        java.lang.Object obj24 = defaultedMap9.get((java.lang.Object) defaultedMap17);
        try {
            int i25 = fixedOrderComparator0.compare(obj3, (java.lang.Object) defaultedMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) true);
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.entrySet();
        boolean b9 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 0);
        boolean b19 = defaultedMap15.equals((java.lang.Object) 1.0d);
        java.util.Set set20 = defaultedMap15.keySet();
        java.lang.Object obj21 = defaultedMap11.remove((java.lang.Object) set20);
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator();
        boolean b23 = fixedOrderComparator22.isLocked();
        int i24 = fixedOrderComparator22.getUnknownObjectBehavior();
        java.lang.Object obj25 = defaultedMap11.remove((java.lang.Object) i24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 0);
        boolean b33 = defaultedMap29.equals((java.lang.Object) 1.0d);
        defaultedMap29.clear();
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator();
        boolean b37 = fixedOrderComparator36.isLocked();
        boolean b38 = fixedOrderComparator36.isLocked();
        boolean b39 = fixedOrderComparator36.isLocked();
        boolean b40 = defaultedMap27.equals((java.lang.Object) fixedOrderComparator36);
        java.lang.Object obj41 = defaultedMap11.remove((java.lang.Object) defaultedMap27);
        java.lang.Object obj43 = defaultedMap27.get((java.lang.Object) (-1));
        java.lang.Object obj44 = defaultedMap1.get(obj43);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertNotNull(obj44);
    }
}

