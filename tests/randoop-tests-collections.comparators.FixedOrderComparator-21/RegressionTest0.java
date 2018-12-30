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
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        try {
            int i11 = fixedOrderComparator4.compare((java.lang.Object) obj_array8, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(obj_array8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        try {
            boolean b13 = fixedOrderComparator10.addAsEqual((java.lang.Object) "hi!", (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
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
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        try {
            boolean b13 = fixedOrderComparator10.addAsEqual((java.lang.Object) "", (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        java.lang.Object obj12 = null;
        try {
            boolean b14 = fixedOrderComparator10.addAsEqual(obj12, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
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
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        try {
            boolean b14 = fixedOrderComparator10.addAsEqual((java.lang.Object) 0.0f, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        try {
            fixedOrderComparator0.setUnknownObjectBehavior(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { (-1.0f), 100.0d, (byte) 1, obj_array6, 1, obj9 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object obj12 = null;
        try {
            int i14 = fixedOrderComparator11.compare(obj12, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int i0 = collections.comparators.FixedOrderComparator.UNKNOWN_AFTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { (-1.0f), 100.0d, (byte) 1, obj_array6, 1, obj9 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 10, fixedOrderComparator18, (byte) -1, obj20, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        int i24 = fixedOrderComparator23.getUnknownObjectBehavior();
        try {
            boolean b25 = fixedOrderComparator11.addAsEqual((java.lang.Object) (-1), (java.lang.Object) i24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(i24 == 2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        java.lang.Object obj33 = defaultedMap18.get((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap1.get(obj33);
        java.lang.String str35 = defaultedMap1.toString();
        java.util.Set set36 = defaultedMap1.keySet();
        collections.Factory factory37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "hi!" + "'", obj5.equals("hi!"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.add((java.lang.Object) (short) 1);
        boolean b14 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b18 = defaultedMap17.isEmpty();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        try {
            int i22 = fixedOrderComparator10.compare((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        java.util.Collection collection21 = defaultedMap1.values();
        boolean b22 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i7 = fixedOrderComparator6.getUnknownObjectBehavior();
        boolean b8 = fixedOrderComparator6.isLocked();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        int i21 = defaultedMap18.size();
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj44 = defaultedMap7.get((java.lang.Object) (-1.0d));
        boolean b45 = defaultedMap7.isEmpty();
        boolean b46 = defaultedMap7.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior(2);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array20 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 10, fixedOrderComparator21, (byte) -1, obj23, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        int i27 = fixedOrderComparator26.getUnknownObjectBehavior();
        fixedOrderComparator26.setUnknownObjectBehavior(0);
        java.lang.Object obj30 = defaultedMap15.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj34 = defaultedMap15.put((java.lang.Object) defaultedMap32, (java.lang.Object) (-1.0d));
        java.util.Set set35 = defaultedMap15.keySet();
        java.lang.Object[] obj_array39 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        try {
            int i41 = fixedOrderComparator10.compare((java.lang.Object) defaultedMap15, (java.lang.Object) obj_array39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "hi!" + "'", obj30.equals("hi!"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(obj_array39);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b3 = defaultedMap2.isEmpty();
        java.lang.Object obj6 = defaultedMap2.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array13 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 10, fixedOrderComparator14, (byte) -1, obj16, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        int i20 = fixedOrderComparator19.getUnknownObjectBehavior();
        fixedOrderComparator19.setUnknownObjectBehavior(0);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array30 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Object[] obj_array35 = new java.lang.Object[] { 10, fixedOrderComparator31, (byte) -1, obj33, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        int i37 = fixedOrderComparator36.getUnknownObjectBehavior();
        fixedOrderComparator36.setUnknownObjectBehavior(0);
        java.lang.Object obj40 = defaultedMap25.get((java.lang.Object) 0);
        java.lang.Object obj41 = defaultedMap8.get(obj40);
        java.lang.String str42 = defaultedMap8.toString();
        boolean b43 = defaultedMap2.containsValue((java.lang.Object) defaultedMap8);
        java.lang.Object obj45 = defaultedMap2.get((java.lang.Object) "hi!");
        java.lang.Object[] obj_array50 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 10, fixedOrderComparator51, (byte) -1, obj53, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        boolean b58 = fixedOrderComparator56.add((java.lang.Object) (-1.0d));
        try {
            int i59 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap2, (java.lang.Object) b58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "hi!" + "'", obj23.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "hi!" + "'", obj41.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "hi!" + "'", obj45.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(b58 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj44 = defaultedMap7.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap46.remove(obj47);
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) (byte) 1);
        boolean b51 = defaultedMap7.containsKey((java.lang.Object) b50);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b12 = fixedOrderComparator10.isLocked();
        boolean b13 = fixedOrderComparator10.isLocked();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.String str19 = defaultedMap1.toString();
        boolean b20 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) b20);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i7 = fixedOrderComparator6.getUnknownObjectBehavior();
        try {
            fixedOrderComparator6.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i7 == 2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b7 = defaultedMap6.isEmpty();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array17 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 10, fixedOrderComparator18, (byte) -1, obj20, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        int i24 = fixedOrderComparator23.getUnknownObjectBehavior();
        fixedOrderComparator23.setUnknownObjectBehavior(0);
        java.lang.Object obj27 = defaultedMap12.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array34 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10, fixedOrderComparator35, (byte) -1, obj37, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        int i41 = fixedOrderComparator40.getUnknownObjectBehavior();
        fixedOrderComparator40.setUnknownObjectBehavior(0);
        java.lang.Object obj44 = defaultedMap29.get((java.lang.Object) 0);
        java.lang.Object obj45 = defaultedMap12.get(obj44);
        java.lang.String str46 = defaultedMap12.toString();
        boolean b47 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        java.util.Set set48 = defaultedMap12.entrySet();
        java.lang.Object[] obj_array52 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        boolean b54 = fixedOrderComparator53.isLocked();
        try {
            int i55 = fixedOrderComparator4.compare((java.lang.Object) defaultedMap12, (java.lang.Object) b54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(i41 == 2);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "hi!" + "'", obj45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        try {
            fixedOrderComparator4.setUnknownObjectBehavior((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        java.util.Set set21 = defaultedMap1.keySet();
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        java.util.Set set36 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array28 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 10, fixedOrderComparator29, (byte) -1, obj31, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        java.lang.Object obj38 = defaultedMap23.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj42 = defaultedMap23.put((java.lang.Object) defaultedMap40, (java.lang.Object) (-1.0d));
        java.util.Collection collection43 = defaultedMap23.values();
        boolean b44 = defaultedMap1.containsValue((java.lang.Object) collection43);
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap1.get(obj45);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "hi!" + "'", obj38.equals("hi!"));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "hi!" + "'", obj46.equals("hi!"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicate4);
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator8);
        try {
            fixedOrderComparator8.setUnknownObjectBehavior((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj44 = defaultedMap7.get((java.lang.Object) (-1.0d));
        boolean b45 = defaultedMap7.isEmpty();
        boolean b47 = defaultedMap7.equals((java.lang.Object) (byte) 0);
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Object[] obj_array58 = new java.lang.Object[] { 10, fixedOrderComparator54, (byte) -1, obj56, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        boolean b60 = fixedOrderComparator48.add((java.lang.Object) obj_array58);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array67 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        java.lang.Object obj70 = new java.lang.Object();
        java.lang.Object[] obj_array72 = new java.lang.Object[] { 10, fixedOrderComparator68, (byte) -1, obj70, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        int i74 = fixedOrderComparator73.getUnknownObjectBehavior();
        fixedOrderComparator73.setUnknownObjectBehavior(0);
        java.lang.Object obj77 = defaultedMap62.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj81 = defaultedMap62.put((java.lang.Object) defaultedMap79, (java.lang.Object) (-1.0d));
        boolean b82 = defaultedMap79.isEmpty();
        boolean b83 = fixedOrderComparator48.add((java.lang.Object) defaultedMap79);
        boolean b84 = defaultedMap7.containsKey((java.lang.Object) b83);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(i74 == 2);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + "hi!" + "'", obj77.equals("hi!"));
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.add((java.lang.Object) (short) 1);
        try {
            fixedOrderComparator10.setUnknownObjectBehavior((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.add((java.lang.Object) (short) 1);
        boolean b14 = fixedOrderComparator10.isLocked();
        boolean b15 = fixedOrderComparator10.isLocked();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) b7);
        int i9 = defaultedMap8.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b5 = defaultedMap4.isEmpty();
        java.lang.Object obj8 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = defaultedMap4.put((java.lang.Object) "{}", obj11);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj14 = null;
        java.lang.Object obj16 = defaultedMap4.put(obj14, (java.lang.Object) 0L);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Collection collection6 = defaultedMap4.values();
        java.lang.String str7 = defaultedMap4.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array14 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 10, fixedOrderComparator15, (byte) -1, obj17, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        int i21 = fixedOrderComparator20.getUnknownObjectBehavior();
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        java.lang.Object obj24 = defaultedMap9.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj28 = defaultedMap9.put((java.lang.Object) defaultedMap26, (java.lang.Object) (-1.0d));
        boolean b29 = defaultedMap4.containsValue(obj28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) b29);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) defaultedMap31);
        int i33 = defaultedMap31.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "hi!" + "'", obj24.equals("hi!"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "hi!" + "'", obj32.equals("hi!"));
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10, fixedOrderComparator12, (byte) -1, obj14, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap23, (java.lang.Object) (-1.0d));
        boolean b26 = defaultedMap1.containsValue(obj25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) b26);
        defaultedMap27.clear();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10, fixedOrderComparator34, (byte) -1, obj36, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        fixedOrderComparator39.setUnknownObjectBehavior(2);
        boolean b43 = fixedOrderComparator39.isLocked();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) b43);
        collections.Transformer transformer45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, transformer45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        int i21 = defaultedMap18.size();
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b5 = defaultedMap4.isEmpty();
        java.lang.Object obj8 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = defaultedMap4.put((java.lang.Object) "{}", obj11);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap15.remove(obj16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        boolean b19 = defaultedMap15.containsKey((java.lang.Object) predicate18);
        int i20 = defaultedMap15.size();
        java.util.Set set21 = defaultedMap15.entrySet();
        java.lang.Object obj22 = defaultedMap4.remove((java.lang.Object) set21);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10, fixedOrderComparator20, (byte) -1, obj22, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        int i26 = fixedOrderComparator25.getUnknownObjectBehavior();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        java.lang.Object obj29 = defaultedMap14.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj33 = defaultedMap14.put((java.lang.Object) defaultedMap31, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set36 = defaultedMap35.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b39 = defaultedMap38.isEmpty();
        java.lang.Object obj42 = defaultedMap38.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set43 = defaultedMap38.entrySet();
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object obj46 = defaultedMap38.put((java.lang.Object) "{}", obj45);
        defaultedMap35.putAll((java.util.Map) defaultedMap38);
        java.util.Collection collection48 = defaultedMap35.values();
        try {
            int i49 = fixedOrderComparator10.compare((java.lang.Object) defaultedMap31, (java.lang.Object) defaultedMap35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection48);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) b7);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.isLocked();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj44 = defaultedMap7.get((java.lang.Object) 2);
        java.util.Collection collection45 = defaultedMap7.values();
        int i46 = defaultedMap7.size();
        collections.Transformer transformer47 = null;
        try {
            java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(i46 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj44 = defaultedMap7.get((java.lang.Object) 2);
        boolean b45 = defaultedMap7.isEmpty();
        collections.Transformer transformer46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue(b45 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior(2);
        boolean b14 = fixedOrderComparator10.isLocked();
        int i15 = fixedOrderComparator10.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b18 = defaultedMap17.isEmpty();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array28 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 10, fixedOrderComparator29, (byte) -1, obj31, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        java.lang.Object obj38 = defaultedMap23.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array45 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 10, fixedOrderComparator46, (byte) -1, obj48, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        int i52 = fixedOrderComparator51.getUnknownObjectBehavior();
        fixedOrderComparator51.setUnknownObjectBehavior(0);
        java.lang.Object obj55 = defaultedMap40.get((java.lang.Object) 0);
        java.lang.Object obj56 = defaultedMap23.get(obj55);
        java.lang.String str57 = defaultedMap23.toString();
        boolean b58 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        java.lang.Object obj60 = defaultedMap17.get((java.lang.Object) "hi!");
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array68 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator69 = new collections.comparators.FixedOrderComparator(obj_array68);
        java.lang.Object obj71 = new java.lang.Object();
        java.lang.Object[] obj_array73 = new java.lang.Object[] { 10, fixedOrderComparator69, (byte) -1, obj71, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator74 = new collections.comparators.FixedOrderComparator(obj_array73);
        int i75 = fixedOrderComparator74.getUnknownObjectBehavior();
        fixedOrderComparator74.setUnknownObjectBehavior(0);
        java.lang.Object obj78 = defaultedMap63.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj82 = defaultedMap63.put((java.lang.Object) defaultedMap80, (java.lang.Object) (-1.0d));
        java.lang.String str83 = defaultedMap80.toString();
        try {
            int i84 = fixedOrderComparator10.compare((java.lang.Object) defaultedMap17, (java.lang.Object) str83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "hi!" + "'", obj38.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(i52 == 2);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "hi!" + "'", obj55.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "hi!" + "'", obj56.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "hi!" + "'", obj60.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertNotNull(obj_array73);
        org.junit.Assert.assertTrue(i75 == 2);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + "hi!" + "'", obj78.equals("hi!"));
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "{}" + "'", str83.equals("{}"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i38 = defaultedMap37.size();
        boolean b40 = defaultedMap37.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array47 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Object[] obj_array52 = new java.lang.Object[] { 10, fixedOrderComparator48, (byte) -1, obj50, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        int i54 = fixedOrderComparator53.getUnknownObjectBehavior();
        fixedOrderComparator53.setUnknownObjectBehavior(0);
        java.lang.Object obj57 = defaultedMap42.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj61 = defaultedMap42.put((java.lang.Object) defaultedMap59, (java.lang.Object) (-1.0d));
        int i62 = defaultedMap42.size();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array69 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        java.lang.Object obj72 = new java.lang.Object();
        java.lang.Object[] obj_array74 = new java.lang.Object[] { 10, fixedOrderComparator70, (byte) -1, obj72, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        int i76 = fixedOrderComparator75.getUnknownObjectBehavior();
        fixedOrderComparator75.setUnknownObjectBehavior(0);
        java.lang.Object obj79 = defaultedMap64.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj83 = defaultedMap64.put((java.lang.Object) defaultedMap81, (java.lang.Object) (-1.0d));
        java.util.Collection collection84 = defaultedMap64.values();
        boolean b85 = defaultedMap42.containsValue((java.lang.Object) collection84);
        boolean b86 = defaultedMap37.containsKey((java.lang.Object) collection84);
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate87, predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate87, predicate90);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "hi!" + "'", obj57.equals("hi!"));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(i62 == 1);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertTrue(i76 == 2);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + "hi!" + "'", obj79.equals("hi!"));
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        java.util.Set set21 = defaultedMap1.keySet();
        boolean b22 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b7 = defaultedMap6.isEmpty();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array17 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { 10, fixedOrderComparator18, (byte) -1, obj20, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        int i24 = fixedOrderComparator23.getUnknownObjectBehavior();
        fixedOrderComparator23.setUnknownObjectBehavior(0);
        java.lang.Object obj27 = defaultedMap12.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array34 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 10, fixedOrderComparator35, (byte) -1, obj37, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator40 = new collections.comparators.FixedOrderComparator(obj_array39);
        int i41 = fixedOrderComparator40.getUnknownObjectBehavior();
        fixedOrderComparator40.setUnknownObjectBehavior(0);
        java.lang.Object obj44 = defaultedMap29.get((java.lang.Object) 0);
        java.lang.Object obj45 = defaultedMap12.get(obj44);
        java.lang.String str46 = defaultedMap12.toString();
        boolean b47 = defaultedMap6.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object obj49 = defaultedMap12.get((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b52 = defaultedMap51.isEmpty();
        java.lang.Object obj55 = defaultedMap51.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array62 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Object[] obj_array67 = new java.lang.Object[] { 10, fixedOrderComparator63, (byte) -1, obj65, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        int i69 = fixedOrderComparator68.getUnknownObjectBehavior();
        fixedOrderComparator68.setUnknownObjectBehavior(0);
        java.lang.Object obj72 = defaultedMap57.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array79 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array79);
        java.lang.Object obj82 = new java.lang.Object();
        java.lang.Object[] obj_array84 = new java.lang.Object[] { 10, fixedOrderComparator80, (byte) -1, obj82, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator85 = new collections.comparators.FixedOrderComparator(obj_array84);
        int i86 = fixedOrderComparator85.getUnknownObjectBehavior();
        fixedOrderComparator85.setUnknownObjectBehavior(0);
        java.lang.Object obj89 = defaultedMap74.get((java.lang.Object) 0);
        java.lang.Object obj90 = defaultedMap57.get(obj89);
        java.lang.String str91 = defaultedMap57.toString();
        boolean b92 = defaultedMap51.containsValue((java.lang.Object) defaultedMap57);
        boolean b94 = defaultedMap51.equals((java.lang.Object) "{}");
        java.lang.String str95 = defaultedMap51.toString();
        java.util.Set set96 = defaultedMap51.entrySet();
        java.lang.Object obj97 = defaultedMap12.get((java.lang.Object) defaultedMap51);
        defaultedMap1.putAll((java.util.Map) defaultedMap51);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertTrue(i24 == 2);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue(i41 == 2);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "hi!" + "'", obj45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "hi!" + "'", obj49.equals("hi!"));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(i69 == 2);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + "hi!" + "'", obj72.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array79);
        org.junit.Assert.assertNotNull(obj_array84);
        org.junit.Assert.assertTrue(i86 == 2);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + "hi!" + "'", obj89.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + "hi!" + "'", obj90.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "{}" + "'", str91.equals("{}"));
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "{-1=1}" + "'", str95.equals("{-1=1}"));
        org.junit.Assert.assertNotNull(set96);
        org.junit.Assert.assertTrue("'" + obj97 + "' != '" + "hi!" + "'", obj97.equals("hi!"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap3.remove(obj4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) predicate6);
        int i8 = defaultedMap3.size();
        java.util.Set set9 = defaultedMap3.entrySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "hi!" + "'", obj10.equals("hi!"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b12 = fixedOrderComparator10.isLocked();
        int i13 = fixedOrderComparator10.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b16 = defaultedMap15.isEmpty();
        java.lang.Object obj19 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array26 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 10, fixedOrderComparator27, (byte) -1, obj29, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        fixedOrderComparator32.setUnknownObjectBehavior(0);
        java.lang.Object obj36 = defaultedMap21.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array43 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10, fixedOrderComparator44, (byte) -1, obj46, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        int i50 = fixedOrderComparator49.getUnknownObjectBehavior();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        java.lang.Object obj53 = defaultedMap38.get((java.lang.Object) 0);
        java.lang.Object obj54 = defaultedMap21.get(obj53);
        java.lang.String str55 = defaultedMap21.toString();
        boolean b56 = defaultedMap15.containsValue((java.lang.Object) defaultedMap21);
        java.lang.Object obj58 = defaultedMap21.get((java.lang.Object) 2);
        java.util.Collection collection59 = defaultedMap21.values();
        boolean b60 = fixedOrderComparator10.add((java.lang.Object) collection59);
        int i61 = fixedOrderComparator10.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "hi!" + "'", obj36.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(i50 == 2);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "hi!" + "'", obj53.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "hi!" + "'", obj54.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "hi!" + "'", obj58.equals("hi!"));
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(i61 == 2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap7.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        boolean b40 = fixedOrderComparator35.add((java.lang.Object) '4');
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) fixedOrderComparator35);
        boolean b43 = defaultedMap7.equals((java.lang.Object) 1L);
        java.util.Set set44 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap46.remove(obj47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        boolean b50 = defaultedMap46.containsKey((java.lang.Object) predicate49);
        int i51 = defaultedMap46.size();
        java.util.Set set52 = defaultedMap46.entrySet();
        java.util.Collection collection53 = defaultedMap46.values();
        try {
            boolean b54 = fixedOrderComparator5.addAsEqual((java.lang.Object) defaultedMap7, (java.lang.Object) collection53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "hi!" + "'", obj24.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.add((java.lang.Object) (short) 1);
        fixedOrderComparator10.setUnknownObjectBehavior(2);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Object[] obj_array27 = new java.lang.Object[] { 10, fixedOrderComparator23, (byte) -1, obj25, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        int i29 = fixedOrderComparator28.getUnknownObjectBehavior();
        fixedOrderComparator28.setUnknownObjectBehavior(0);
        java.lang.Object obj32 = defaultedMap17.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj36 = defaultedMap17.put((java.lang.Object) defaultedMap34, (java.lang.Object) (-1.0d));
        java.util.Collection collection37 = defaultedMap17.values();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 10, fixedOrderComparator43, (byte) -1, obj45, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        try {
            boolean b49 = fixedOrderComparator10.addAsEqual((java.lang.Object) collection37, (java.lang.Object) fixedOrderComparator48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj_array22);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue(i29 == 2);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "hi!" + "'", obj32.equals("hi!"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertNotNull(obj_array47);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        boolean b37 = defaultedMap1.equals((java.lang.Object) 1L);
        java.lang.Object obj39 = defaultedMap1.remove((java.lang.Object) 0.0d);
        boolean b41 = defaultedMap1.containsKey((java.lang.Object) (short) 1);
        collections.Transformer transformer42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array28 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 10, fixedOrderComparator29, (byte) -1, obj31, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        java.lang.Object obj38 = defaultedMap23.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj42 = defaultedMap23.put((java.lang.Object) defaultedMap40, (java.lang.Object) (-1.0d));
        java.util.Collection collection43 = defaultedMap23.values();
        boolean b44 = defaultedMap1.containsValue((java.lang.Object) collection43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set47 = defaultedMap46.keySet();
        java.util.Collection collection48 = defaultedMap46.values();
        java.lang.String str49 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array56 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        java.lang.Object obj59 = new java.lang.Object();
        java.lang.Object[] obj_array61 = new java.lang.Object[] { 10, fixedOrderComparator57, (byte) -1, obj59, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        int i63 = fixedOrderComparator62.getUnknownObjectBehavior();
        fixedOrderComparator62.setUnknownObjectBehavior(0);
        java.lang.Object obj66 = defaultedMap51.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj70 = defaultedMap51.put((java.lang.Object) defaultedMap68, (java.lang.Object) (-1.0d));
        boolean b71 = defaultedMap46.containsValue(obj70);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) b71);
        java.util.Set set73 = defaultedMap72.keySet();
        boolean b74 = defaultedMap1.equals((java.lang.Object) set73);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "hi!" + "'", obj38.equals("hi!"));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue(i63 == 2);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + "hi!" + "'", obj66.equals("hi!"));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Collection collection6 = defaultedMap4.values();
        java.lang.String str7 = defaultedMap4.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array14 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 10, fixedOrderComparator15, (byte) -1, obj17, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        int i21 = fixedOrderComparator20.getUnknownObjectBehavior();
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        java.lang.Object obj24 = defaultedMap9.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj28 = defaultedMap9.put((java.lang.Object) defaultedMap26, (java.lang.Object) (-1.0d));
        boolean b29 = defaultedMap4.containsValue(obj28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) b29);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) defaultedMap31);
        boolean b34 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "hi!" + "'", obj24.equals("hi!"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "hi!" + "'", obj32.equals("hi!"));
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) '4', (java.lang.Object) collection5);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b5 = defaultedMap4.isEmpty();
        java.lang.Object obj8 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = defaultedMap4.put((java.lang.Object) "{}", obj11);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set17 = defaultedMap16.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object[] obj_array0 = null;
        try {
            collections.comparators.FixedOrderComparator fixedOrderComparator1 = new collections.comparators.FixedOrderComparator(obj_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap1.get(obj19);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "hi!" + "'", obj20.equals("hi!"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicate4);
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b38 = defaultedMap37.isEmpty();
        java.lang.Object obj41 = defaultedMap37.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array48 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 10, fixedOrderComparator49, (byte) -1, obj51, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        int i55 = fixedOrderComparator54.getUnknownObjectBehavior();
        fixedOrderComparator54.setUnknownObjectBehavior(0);
        java.lang.Object obj58 = defaultedMap43.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array65 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Object[] obj_array70 = new java.lang.Object[] { 10, fixedOrderComparator66, (byte) -1, obj68, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        int i72 = fixedOrderComparator71.getUnknownObjectBehavior();
        fixedOrderComparator71.setUnknownObjectBehavior(0);
        java.lang.Object obj75 = defaultedMap60.get((java.lang.Object) 0);
        java.lang.Object obj76 = defaultedMap43.get(obj75);
        java.lang.String str77 = defaultedMap43.toString();
        boolean b78 = defaultedMap37.containsValue((java.lang.Object) defaultedMap43);
        boolean b80 = defaultedMap37.equals((java.lang.Object) "{}");
        boolean b81 = defaultedMap1.equals((java.lang.Object) defaultedMap37);
        defaultedMap37.clear();
        java.lang.String str83 = defaultedMap37.toString();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(i55 == 2);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "hi!" + "'", obj58.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + "hi!" + "'", obj75.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + "hi!" + "'", obj76.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "{}" + "'", str83.equals("{}"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10, fixedOrderComparator12, (byte) -1, obj14, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap23, (java.lang.Object) (-1.0d));
        int i26 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array33 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10, fixedOrderComparator34, (byte) -1, obj36, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        java.lang.Object obj43 = defaultedMap28.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj47 = defaultedMap28.put((java.lang.Object) defaultedMap45, (java.lang.Object) (-1.0d));
        java.util.Collection collection48 = defaultedMap28.values();
        boolean b49 = defaultedMap6.containsValue((java.lang.Object) collection48);
        boolean b50 = defaultedMap1.containsKey((java.lang.Object) collection48);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate51, predicate52);
        java.util.Set set54 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "hi!" + "'", obj43.equals("hi!"));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set54);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b5 = defaultedMap4.isEmpty();
        java.lang.Object obj8 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = defaultedMap4.put((java.lang.Object) "{}", obj11);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Set set14 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i17 = defaultedMap16.size();
        java.util.Collection collection18 = defaultedMap16.values();
        boolean b19 = defaultedMap1.equals((java.lang.Object) collection18);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        boolean b1 = fixedOrderComparator0.isLocked();
        int i2 = fixedOrderComparator0.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(i2 == 2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.get(obj4);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "hi!" + "'", obj5.equals("hi!"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10, fixedOrderComparator12, (byte) -1, obj14, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap23, (java.lang.Object) (-1.0d));
        int i26 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array33 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10, fixedOrderComparator34, (byte) -1, obj36, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        java.lang.Object obj43 = defaultedMap28.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj47 = defaultedMap28.put((java.lang.Object) defaultedMap45, (java.lang.Object) (-1.0d));
        java.util.Collection collection48 = defaultedMap28.values();
        boolean b49 = defaultedMap6.containsValue((java.lang.Object) collection48);
        boolean b50 = defaultedMap1.containsKey((java.lang.Object) collection48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Object[] obj_array62 = new java.lang.Object[] { 10, fixedOrderComparator58, (byte) -1, obj60, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        int i64 = fixedOrderComparator63.getUnknownObjectBehavior();
        fixedOrderComparator63.setUnknownObjectBehavior(0);
        java.lang.Object obj67 = defaultedMap52.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj71 = defaultedMap52.put((java.lang.Object) defaultedMap69, (java.lang.Object) (-1.0d));
        int i72 = defaultedMap52.size();
        java.util.Set set73 = defaultedMap52.entrySet();
        boolean b74 = defaultedMap1.containsValue((java.lang.Object) set73);
        java.util.Set set75 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "hi!" + "'", obj43.equals("hi!"));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + "hi!" + "'", obj67.equals("hi!"));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(i72 == 1);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(set75);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.add((java.lang.Object) (short) 1);
        fixedOrderComparator10.setUnknownObjectBehavior(2);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b18 = defaultedMap17.isEmpty();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array28 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 10, fixedOrderComparator29, (byte) -1, obj31, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        java.lang.Object obj38 = defaultedMap23.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array45 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 10, fixedOrderComparator46, (byte) -1, obj48, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        int i52 = fixedOrderComparator51.getUnknownObjectBehavior();
        fixedOrderComparator51.setUnknownObjectBehavior(0);
        java.lang.Object obj55 = defaultedMap40.get((java.lang.Object) 0);
        java.lang.Object obj56 = defaultedMap23.get(obj55);
        java.lang.String str57 = defaultedMap23.toString();
        boolean b58 = defaultedMap17.containsValue((java.lang.Object) defaultedMap23);
        java.lang.Object obj60 = defaultedMap23.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i63 = defaultedMap62.size();
        java.util.Collection collection64 = defaultedMap62.values();
        try {
            boolean b65 = fixedOrderComparator10.addAsEqual((java.lang.Object) 2, (java.lang.Object) defaultedMap62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "hi!" + "'", obj38.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(i52 == 2);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "hi!" + "'", obj55.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "hi!" + "'", obj56.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "hi!" + "'", obj60.equals("hi!"));
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(collection64);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array27 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 10, fixedOrderComparator28, (byte) -1, obj30, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        int i34 = fixedOrderComparator33.getUnknownObjectBehavior();
        fixedOrderComparator33.setUnknownObjectBehavior(0);
        java.lang.Object obj37 = defaultedMap22.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj41 = defaultedMap22.put((java.lang.Object) defaultedMap39, (java.lang.Object) (-1.0d));
        int i42 = defaultedMap22.size();
        java.util.Set set43 = defaultedMap22.entrySet();
        boolean b44 = defaultedMap22.isEmpty();
        boolean b45 = defaultedMap1.containsValue((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "hi!" + "'", obj37.equals("hi!"));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        int i36 = fixedOrderComparator29.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b39 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array46 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 10, fixedOrderComparator47, (byte) -1, obj49, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        int i53 = fixedOrderComparator52.getUnknownObjectBehavior();
        fixedOrderComparator52.setUnknownObjectBehavior(0);
        java.lang.Object obj56 = defaultedMap41.get((java.lang.Object) 0);
        java.lang.Object obj58 = defaultedMap41.get((java.lang.Object) (byte) 100);
        try {
            boolean b59 = fixedOrderComparator29.addAsEqual((java.lang.Object) defaultedMap38, (java.lang.Object) defaultedMap41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "hi!" + "'", obj56.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "hi!" + "'", obj58.equals("hi!"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        boolean b44 = defaultedMap1.equals((java.lang.Object) "{}");
        collections.Factory factory45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10, fixedOrderComparator12, (byte) -1, obj14, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap23, (java.lang.Object) (-1.0d));
        boolean b26 = defaultedMap23.isEmpty();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap29.remove(obj30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        boolean b33 = defaultedMap29.containsKey((java.lang.Object) predicate32);
        collections.Predicate predicate34 = null;
        java.util.Map map35 = collections.map.PredicatedMap.decorate(map27, predicate32, predicate34);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.add((java.lang.Object) (short) 1);
        boolean b14 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        java.util.Collection collection16 = defaultedMap15.values();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.add((java.lang.Object) (short) 1);
        fixedOrderComparator10.setUnknownObjectBehavior(2);
        try {
            fixedOrderComparator10.setUnknownObjectBehavior((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        boolean b37 = defaultedMap1.equals((java.lang.Object) 1L);
        java.util.Set set38 = defaultedMap1.entrySet();
        java.util.Set set39 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b38 = defaultedMap37.isEmpty();
        java.lang.Object obj41 = defaultedMap37.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array48 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 10, fixedOrderComparator49, (byte) -1, obj51, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        int i55 = fixedOrderComparator54.getUnknownObjectBehavior();
        fixedOrderComparator54.setUnknownObjectBehavior(0);
        java.lang.Object obj58 = defaultedMap43.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array65 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Object[] obj_array70 = new java.lang.Object[] { 10, fixedOrderComparator66, (byte) -1, obj68, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        int i72 = fixedOrderComparator71.getUnknownObjectBehavior();
        fixedOrderComparator71.setUnknownObjectBehavior(0);
        java.lang.Object obj75 = defaultedMap60.get((java.lang.Object) 0);
        java.lang.Object obj76 = defaultedMap43.get(obj75);
        java.lang.String str77 = defaultedMap43.toString();
        boolean b78 = defaultedMap37.containsValue((java.lang.Object) defaultedMap43);
        boolean b80 = defaultedMap37.equals((java.lang.Object) "{}");
        boolean b81 = defaultedMap1.equals((java.lang.Object) defaultedMap37);
        collections.Factory factory82 = null;
        try {
            java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, factory82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(i55 == 2);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "hi!" + "'", obj58.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + "hi!" + "'", obj75.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + "hi!" + "'", obj76.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b4 = defaultedMap1.isEmpty();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b8 = defaultedMap7.isEmpty();
        java.lang.Object obj11 = defaultedMap7.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array18 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10, fixedOrderComparator19, (byte) -1, obj21, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        int i25 = fixedOrderComparator24.getUnknownObjectBehavior();
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        java.lang.Object obj28 = defaultedMap13.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array35 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 10, fixedOrderComparator36, (byte) -1, obj38, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        int i42 = fixedOrderComparator41.getUnknownObjectBehavior();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        java.lang.Object obj45 = defaultedMap30.get((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap13.get(obj45);
        java.lang.String str47 = defaultedMap13.toString();
        boolean b48 = defaultedMap7.containsValue((java.lang.Object) defaultedMap13);
        java.lang.Object obj50 = defaultedMap13.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Object[] obj_array62 = new java.lang.Object[] { 10, fixedOrderComparator58, (byte) -1, obj60, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        int i64 = fixedOrderComparator63.getUnknownObjectBehavior();
        fixedOrderComparator63.setUnknownObjectBehavior(0);
        java.lang.Object obj67 = defaultedMap52.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj71 = defaultedMap52.put((java.lang.Object) defaultedMap69, (java.lang.Object) (-1.0d));
        defaultedMap13.putAll((java.util.Map) defaultedMap69);
        boolean b73 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        java.lang.String str74 = defaultedMap13.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "hi!" + "'", obj28.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(i42 == 2);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "hi!" + "'", obj45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "hi!" + "'", obj46.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + "hi!" + "'", obj50.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + "hi!" + "'", obj67.equals("hi!"));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10, fixedOrderComparator12, (byte) -1, obj14, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap23, (java.lang.Object) (-1.0d));
        int i26 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array33 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10, fixedOrderComparator34, (byte) -1, obj36, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        java.lang.Object obj43 = defaultedMap28.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj47 = defaultedMap28.put((java.lang.Object) defaultedMap45, (java.lang.Object) (-1.0d));
        java.util.Collection collection48 = defaultedMap28.values();
        boolean b49 = defaultedMap6.containsValue((java.lang.Object) collection48);
        boolean b50 = defaultedMap1.containsKey((java.lang.Object) collection48);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate51, predicate52);
        collections.Transformer transformer54 = null;
        try {
            java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "hi!" + "'", obj43.equals("hi!"));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        java.lang.String str36 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        java.lang.Object obj33 = defaultedMap18.get((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap1.get(obj33);
        java.lang.String str35 = defaultedMap1.toString();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap1.get(obj36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Collection collection40 = defaultedMap39.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        java.lang.Object obj42 = defaultedMap1.remove((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set45 = defaultedMap44.keySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b48 = defaultedMap47.isEmpty();
        java.lang.Object obj51 = defaultedMap47.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set52 = defaultedMap47.entrySet();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Object obj55 = defaultedMap47.put((java.lang.Object) "{}", obj54);
        defaultedMap44.putAll((java.util.Map) defaultedMap47);
        java.util.Collection collection57 = defaultedMap44.values();
        defaultedMap44.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array65 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Object[] obj_array70 = new java.lang.Object[] { 10, fixedOrderComparator66, (byte) -1, obj68, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        int i72 = fixedOrderComparator71.getUnknownObjectBehavior();
        fixedOrderComparator71.setUnknownObjectBehavior(0);
        java.lang.Object obj75 = defaultedMap60.get((java.lang.Object) 0);
        java.lang.Object obj77 = defaultedMap60.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array82 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator83 = new collections.comparators.FixedOrderComparator(obj_array82);
        java.lang.Object obj85 = new java.lang.Object();
        java.lang.Object[] obj_array87 = new java.lang.Object[] { 10, fixedOrderComparator83, (byte) -1, obj85, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator88 = new collections.comparators.FixedOrderComparator(obj_array87);
        int i89 = fixedOrderComparator88.getUnknownObjectBehavior();
        fixedOrderComparator88.setUnknownObjectBehavior(0);
        boolean b93 = fixedOrderComparator88.add((java.lang.Object) '4');
        java.util.Map map94 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) fixedOrderComparator88);
        java.lang.Object obj95 = defaultedMap1.put((java.lang.Object) defaultedMap44, (java.lang.Object) fixedOrderComparator88);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "hi!" + "'", obj37.equals("hi!"));
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + "hi!" + "'", obj75.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + "hi!" + "'", obj77.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array82);
        org.junit.Assert.assertNotNull(obj_array87);
        org.junit.Assert.assertTrue(i89 == 2);
        org.junit.Assert.assertTrue(b93 == true);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior(2);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b16 = defaultedMap15.isEmpty();
        java.lang.Object obj19 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array26 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 10, fixedOrderComparator27, (byte) -1, obj29, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        fixedOrderComparator32.setUnknownObjectBehavior(0);
        java.lang.Object obj36 = defaultedMap21.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array43 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10, fixedOrderComparator44, (byte) -1, obj46, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        int i50 = fixedOrderComparator49.getUnknownObjectBehavior();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        java.lang.Object obj53 = defaultedMap38.get((java.lang.Object) 0);
        java.lang.Object obj54 = defaultedMap21.get(obj53);
        java.lang.String str55 = defaultedMap21.toString();
        boolean b56 = defaultedMap15.containsValue((java.lang.Object) defaultedMap21);
        java.lang.Object[] obj_array61 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Object[] obj_array66 = new java.lang.Object[] { 10, fixedOrderComparator62, (byte) -1, obj64, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        int i68 = fixedOrderComparator67.getUnknownObjectBehavior();
        boolean b70 = fixedOrderComparator67.add((java.lang.Object) (short) 1);
        boolean b71 = fixedOrderComparator67.isLocked();
        try {
            int i72 = fixedOrderComparator10.compare((java.lang.Object) b56, (java.lang.Object) b71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "hi!" + "'", obj36.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(i50 == 2);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "hi!" + "'", obj53.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "hi!" + "'", obj54.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(i68 == 2);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj44 = defaultedMap7.get((java.lang.Object) (-1.0d));
        boolean b45 = defaultedMap7.isEmpty();
        boolean b47 = defaultedMap7.equals((java.lang.Object) (byte) 0);
        java.lang.Object[] obj_array52 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Object[] obj_array57 = new java.lang.Object[] { 10, fixedOrderComparator53, (byte) -1, obj55, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        int i59 = fixedOrderComparator58.getUnknownObjectBehavior();
        java.lang.Object[] obj_array64 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator65 = new collections.comparators.FixedOrderComparator(obj_array64);
        java.lang.Object obj67 = new java.lang.Object();
        java.lang.Object[] obj_array69 = new java.lang.Object[] { 10, fixedOrderComparator65, (byte) -1, obj67, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator70 = new collections.comparators.FixedOrderComparator(obj_array69);
        int i71 = fixedOrderComparator70.getUnknownObjectBehavior();
        boolean b72 = fixedOrderComparator58.add((java.lang.Object) fixedOrderComparator70);
        java.lang.Object obj73 = defaultedMap7.remove((java.lang.Object) b72);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(i59 == 2);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertNotNull(obj_array69);
        org.junit.Assert.assertTrue(i71 == 2);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.entrySet();
        java.lang.Object[] obj_array15 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array15);
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) set11, (java.lang.Object) obj_array15);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10, fixedOrderComparator12, (byte) -1, obj14, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap23, (java.lang.Object) (-1.0d));
        boolean b26 = defaultedMap1.containsValue(obj25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) b26);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        boolean b37 = defaultedMap1.equals((java.lang.Object) 1L);
        java.lang.Object obj39 = defaultedMap1.remove((java.lang.Object) 0.0d);
        java.util.Collection collection40 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array47 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Object[] obj_array52 = new java.lang.Object[] { 10, fixedOrderComparator48, (byte) -1, obj50, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        int i54 = fixedOrderComparator53.getUnknownObjectBehavior();
        fixedOrderComparator53.setUnknownObjectBehavior(0);
        java.lang.Object obj57 = defaultedMap42.get((java.lang.Object) 0);
        java.lang.Object obj59 = defaultedMap42.get((java.lang.Object) (byte) 100);
        java.lang.Object obj61 = defaultedMap42.remove((java.lang.Object) 10.0f);
        java.lang.Object obj62 = defaultedMap1.get((java.lang.Object) defaultedMap42);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "hi!" + "'", obj57.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "hi!" + "'", obj59.equals("hi!"));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + "hi!" + "'", obj62.equals("hi!"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 10, fixedOrderComparator6, (byte) -1, obj8, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b12 = fixedOrderComparator0.add((java.lang.Object) obj_array10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10, fixedOrderComparator20, (byte) -1, obj22, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        int i26 = fixedOrderComparator25.getUnknownObjectBehavior();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        java.lang.Object obj29 = defaultedMap14.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj33 = defaultedMap14.put((java.lang.Object) defaultedMap31, (java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap31.isEmpty();
        boolean b35 = fixedOrderComparator0.add((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b38 = defaultedMap37.isEmpty();
        boolean b39 = fixedOrderComparator0.add((java.lang.Object) b38);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        int i1 = fixedOrderComparator0.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap3.keySet();
        java.util.Collection collection5 = defaultedMap3.values();
        java.lang.String str6 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array13 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 10, fixedOrderComparator14, (byte) -1, obj16, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        int i20 = fixedOrderComparator19.getUnknownObjectBehavior();
        fixedOrderComparator19.setUnknownObjectBehavior(0);
        java.lang.Object obj23 = defaultedMap8.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj27 = defaultedMap8.put((java.lang.Object) defaultedMap25, (java.lang.Object) (-1.0d));
        boolean b28 = defaultedMap3.containsValue(obj27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) b28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b28);
        java.lang.Object[] obj_array35 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 10, fixedOrderComparator36, (byte) -1, obj38, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        int i42 = fixedOrderComparator41.getUnknownObjectBehavior();
        fixedOrderComparator41.setUnknownObjectBehavior(2);
        int i45 = fixedOrderComparator41.getUnknownObjectBehavior();
        try {
            int i46 = fixedOrderComparator0.compare((java.lang.Object) defaultedMap30, (java.lang.Object) i45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i1 == 2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "hi!" + "'", obj23.equals("hi!"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(i42 == 2);
        org.junit.Assert.assertTrue(i45 == 2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        int i6 = fixedOrderComparator5.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        boolean b11 = defaultedMap8.isEmpty();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Object[] obj_array22 = new java.lang.Object[] { (-1.0f), 100.0d, (byte) 1, obj_array18, 1, obj21 };
        collections.comparators.FixedOrderComparator fixedOrderComparator23 = new collections.comparators.FixedOrderComparator(obj_array22);
        try {
            boolean b24 = fixedOrderComparator5.addAsEqual((java.lang.Object) defaultedMap8, (java.lang.Object) obj_array22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj_array22);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i12 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i13 = fixedOrderComparator10.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(i13 == 2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior(2);
        boolean b14 = fixedOrderComparator10.isLocked();
        int i15 = fixedOrderComparator10.getUnknownObjectBehavior();
        int i16 = fixedOrderComparator10.getUnknownObjectBehavior();
        try {
            fixedOrderComparator10.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i16 == 2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        boolean b21 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        boolean b14 = fixedOrderComparator10.isLocked();
        try {
            fixedOrderComparator10.setUnknownObjectBehavior((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b5 = defaultedMap4.isEmpty();
        java.lang.Object obj8 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = defaultedMap4.put((java.lang.Object) "{}", obj11);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj44 = defaultedMap7.get((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b47 = defaultedMap46.isEmpty();
        java.lang.Object obj50 = defaultedMap46.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b52 = defaultedMap46.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i55 = defaultedMap54.size();
        java.util.Set set56 = defaultedMap54.entrySet();
        java.lang.Object[] obj_array60 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array60);
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array60);
        java.lang.Object obj65 = defaultedMap46.put((java.lang.Object) set56, (java.lang.Object) obj_array60);
        boolean b66 = defaultedMap7.containsKey(obj65);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        boolean b44 = defaultedMap1.equals((java.lang.Object) "{}");
        java.lang.String str45 = defaultedMap1.toString();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 10, fixedOrderComparator51, (byte) -1, obj53, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        int i57 = fixedOrderComparator56.getUnknownObjectBehavior();
        boolean b59 = fixedOrderComparator56.add((java.lang.Object) (short) 1);
        boolean b60 = fixedOrderComparator56.isLocked();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator56);
        boolean b62 = defaultedMap1.containsValue((java.lang.Object) defaultedMap61);
        collections.Transformer transformer63 = null;
        try {
            java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, transformer63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{-1=1}" + "'", str45.equals("{-1=1}"));
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.add((java.lang.Object) (short) 1);
        fixedOrderComparator10.setUnknownObjectBehavior(2);
        boolean b16 = fixedOrderComparator10.isLocked();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicate4);
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap9.remove(obj10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        boolean b13 = defaultedMap9.containsKey((java.lang.Object) predicate12);
        int i14 = defaultedMap9.size();
        java.util.Set set15 = defaultedMap9.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator();
        boolean b17 = defaultedMap9.containsValue((java.lang.Object) fixedOrderComparator16);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) b17);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        java.lang.Object obj33 = defaultedMap18.get((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap1.get(obj33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) 0.0f);
        defaultedMap35.clear();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "hi!" + "'", obj37.equals("hi!"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b7 = defaultedMap6.isEmpty();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) b12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b18 = defaultedMap17.isEmpty();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap13.put((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10, fixedOrderComparator12, (byte) -1, obj14, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap23, (java.lang.Object) (-1.0d));
        boolean b26 = defaultedMap1.containsValue(obj25);
        defaultedMap1.clear();
        java.lang.String str28 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10, fixedOrderComparator12, (byte) -1, obj14, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap23, (java.lang.Object) (-1.0d));
        boolean b26 = defaultedMap1.containsValue(obj25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) b26);
        defaultedMap27.clear();
        java.util.Set set29 = defaultedMap27.keySet();
        boolean b30 = defaultedMap27.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        java.lang.Object obj33 = defaultedMap18.get((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap1.get(obj33);
        java.lang.String str35 = defaultedMap1.toString();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap1.get(obj36);
        boolean b39 = defaultedMap1.containsValue((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "hi!" + "'", obj37.equals("hi!"));
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10, fixedOrderComparator12, (byte) -1, obj14, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap23, (java.lang.Object) (-1.0d));
        boolean b26 = defaultedMap23.isEmpty();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array42 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 10, fixedOrderComparator43, (byte) -1, obj45, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        int i49 = fixedOrderComparator48.getUnknownObjectBehavior();
        fixedOrderComparator48.setUnknownObjectBehavior(0);
        java.lang.Object obj52 = defaultedMap37.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj56 = defaultedMap37.put((java.lang.Object) defaultedMap54, (java.lang.Object) (-1.0d));
        java.util.Set set57 = defaultedMap37.keySet();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set60 = defaultedMap59.keySet();
        java.util.Collection collection61 = defaultedMap59.values();
        java.lang.String str62 = defaultedMap59.toString();
        try {
            boolean b63 = fixedOrderComparator29.addAsEqual((java.lang.Object) defaultedMap37, (java.lang.Object) defaultedMap59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(i49 == 2);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "hi!" + "'", obj52.equals("hi!"));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 10, fixedOrderComparator6, (byte) -1, obj8, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b12 = fixedOrderComparator0.add((java.lang.Object) obj_array10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10, fixedOrderComparator20, (byte) -1, obj22, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        int i26 = fixedOrderComparator25.getUnknownObjectBehavior();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        java.lang.Object obj29 = defaultedMap14.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj33 = defaultedMap14.put((java.lang.Object) defaultedMap31, (java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap31.isEmpty();
        boolean b35 = fixedOrderComparator0.add((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) b35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array43 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Object[] obj_array48 = new java.lang.Object[] { 10, fixedOrderComparator44, (byte) -1, obj46, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        int i50 = fixedOrderComparator49.getUnknownObjectBehavior();
        fixedOrderComparator49.setUnknownObjectBehavior(0);
        java.lang.Object obj53 = defaultedMap38.get((java.lang.Object) 0);
        java.lang.Object obj55 = defaultedMap38.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array60 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator61 = new collections.comparators.FixedOrderComparator(obj_array60);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Object[] obj_array65 = new java.lang.Object[] { 10, fixedOrderComparator61, (byte) -1, obj63, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        int i67 = fixedOrderComparator66.getUnknownObjectBehavior();
        fixedOrderComparator66.setUnknownObjectBehavior(0);
        boolean b71 = fixedOrderComparator66.add((java.lang.Object) '4');
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) fixedOrderComparator66);
        boolean b74 = defaultedMap38.equals((java.lang.Object) 1L);
        java.util.Set set75 = defaultedMap38.entrySet();
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) set75);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertTrue(i50 == 2);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "hi!" + "'", obj53.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "hi!" + "'", obj55.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertTrue(i67 == 2);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(map76);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b38 = defaultedMap37.isEmpty();
        java.lang.Object obj41 = defaultedMap37.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array48 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 10, fixedOrderComparator49, (byte) -1, obj51, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        int i55 = fixedOrderComparator54.getUnknownObjectBehavior();
        fixedOrderComparator54.setUnknownObjectBehavior(0);
        java.lang.Object obj58 = defaultedMap43.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array65 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Object[] obj_array70 = new java.lang.Object[] { 10, fixedOrderComparator66, (byte) -1, obj68, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        int i72 = fixedOrderComparator71.getUnknownObjectBehavior();
        fixedOrderComparator71.setUnknownObjectBehavior(0);
        java.lang.Object obj75 = defaultedMap60.get((java.lang.Object) 0);
        java.lang.Object obj76 = defaultedMap43.get(obj75);
        java.lang.String str77 = defaultedMap43.toString();
        boolean b78 = defaultedMap37.containsValue((java.lang.Object) defaultedMap43);
        boolean b80 = defaultedMap37.equals((java.lang.Object) "{}");
        boolean b81 = defaultedMap1.equals((java.lang.Object) defaultedMap37);
        java.lang.String str82 = defaultedMap37.toString();
        java.util.Collection collection83 = defaultedMap37.values();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        boolean b85 = defaultedMap37.containsValue((java.lang.Object) predicate84);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(i55 == 2);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "hi!" + "'", obj58.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + "hi!" + "'", obj75.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + "hi!" + "'", obj76.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{-1=1}" + "'", str82.equals("{-1=1}"));
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b5 = defaultedMap4.isEmpty();
        java.lang.Object obj8 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = defaultedMap4.put((java.lang.Object) "{}", obj11);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj14 = null;
        java.lang.Object obj16 = defaultedMap4.put(obj14, (java.lang.Object) 0L);
        boolean b17 = defaultedMap4.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b5 = defaultedMap4.isEmpty();
        java.lang.Object obj8 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set9 = defaultedMap4.entrySet();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = defaultedMap4.put((java.lang.Object) "{}", obj11);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        int i14 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i14 == 2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap4.remove(obj5);
        boolean b7 = defaultedMap4.isEmpty();
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array15 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator16 = new collections.comparators.FixedOrderComparator(obj_array15);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Object[] obj_array20 = new java.lang.Object[] { 10, fixedOrderComparator16, (byte) -1, obj18, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        int i22 = fixedOrderComparator21.getUnknownObjectBehavior();
        fixedOrderComparator21.setUnknownObjectBehavior(0);
        java.lang.Object obj25 = defaultedMap10.get((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap10.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10, fixedOrderComparator33, (byte) -1, obj35, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        int i39 = fixedOrderComparator38.getUnknownObjectBehavior();
        fixedOrderComparator38.setUnknownObjectBehavior(0);
        boolean b43 = fixedOrderComparator38.add((java.lang.Object) '4');
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) fixedOrderComparator38);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b47 = defaultedMap46.isEmpty();
        java.lang.Object obj50 = defaultedMap46.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Object[] obj_array62 = new java.lang.Object[] { 10, fixedOrderComparator58, (byte) -1, obj60, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        int i64 = fixedOrderComparator63.getUnknownObjectBehavior();
        fixedOrderComparator63.setUnknownObjectBehavior(0);
        java.lang.Object obj67 = defaultedMap52.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array74 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        java.lang.Object obj77 = new java.lang.Object();
        java.lang.Object[] obj_array79 = new java.lang.Object[] { 10, fixedOrderComparator75, (byte) -1, obj77, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array79);
        int i81 = fixedOrderComparator80.getUnknownObjectBehavior();
        fixedOrderComparator80.setUnknownObjectBehavior(0);
        java.lang.Object obj84 = defaultedMap69.get((java.lang.Object) 0);
        java.lang.Object obj85 = defaultedMap52.get(obj84);
        java.lang.String str86 = defaultedMap52.toString();
        boolean b87 = defaultedMap46.containsValue((java.lang.Object) defaultedMap52);
        boolean b89 = defaultedMap46.equals((java.lang.Object) "{}");
        boolean b90 = defaultedMap10.equals((java.lang.Object) defaultedMap46);
        java.lang.String str91 = defaultedMap46.toString();
        java.util.Collection collection92 = defaultedMap46.values();
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i95 = defaultedMap94.size();
        java.util.Set set96 = defaultedMap94.entrySet();
        java.lang.Object obj97 = defaultedMap46.get((java.lang.Object) defaultedMap94);
        java.lang.Object obj98 = defaultedMap4.get(obj97);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertTrue(i22 == 2);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!" + "'", obj25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + "hi!" + "'", obj67.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertNotNull(obj_array79);
        org.junit.Assert.assertTrue(i81 == 2);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + "hi!" + "'", obj84.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + "hi!" + "'", obj85.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "{}" + "'", str86.equals("{}"));
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "{-1=1}" + "'", str91.equals("{-1=1}"));
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertTrue(i95 == 0);
        org.junit.Assert.assertNotNull(set96);
        org.junit.Assert.assertTrue("'" + obj97 + "' != '" + "hi!" + "'", obj97.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj98 + "' != '" + "hi!" + "'", obj98.equals("hi!"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i7 = defaultedMap6.size();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array16 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 10, fixedOrderComparator17, (byte) -1, obj19, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        java.lang.Object obj26 = defaultedMap11.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj30 = defaultedMap11.put((java.lang.Object) defaultedMap28, (java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap28.isEmpty();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap28);
        boolean b33 = defaultedMap1.containsValue((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set36 = defaultedMap35.keySet();
        java.util.Collection collection37 = defaultedMap35.values();
        boolean b38 = defaultedMap35.isEmpty();
        int i39 = defaultedMap35.size();
        java.lang.Object obj41 = defaultedMap1.put((java.lang.Object) defaultedMap35, (java.lang.Object) 100);
        java.lang.String str42 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "hi!" + "'", obj26.equals("hi!"));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{{}=100}" + "'", str42.equals("{{}=100}"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 10, fixedOrderComparator6, (byte) -1, obj8, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b12 = fixedOrderComparator0.add((java.lang.Object) obj_array10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10, fixedOrderComparator20, (byte) -1, obj22, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        int i26 = fixedOrderComparator25.getUnknownObjectBehavior();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        java.lang.Object obj29 = defaultedMap14.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj33 = defaultedMap14.put((java.lang.Object) defaultedMap31, (java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap31.isEmpty();
        boolean b35 = fixedOrderComparator0.add((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) b35);
        java.lang.String str37 = defaultedMap36.toString();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        fixedOrderComparator5.setUnknownObjectBehavior(1);
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) b7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array16 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 10, fixedOrderComparator17, (byte) -1, obj19, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        java.lang.Object obj26 = defaultedMap11.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj30 = defaultedMap11.put((java.lang.Object) defaultedMap28, (java.lang.Object) (-1.0d));
        int i31 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array38 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { 10, fixedOrderComparator39, (byte) -1, obj41, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator44 = new collections.comparators.FixedOrderComparator(obj_array43);
        int i45 = fixedOrderComparator44.getUnknownObjectBehavior();
        fixedOrderComparator44.setUnknownObjectBehavior(0);
        java.lang.Object obj48 = defaultedMap33.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj52 = defaultedMap33.put((java.lang.Object) defaultedMap50, (java.lang.Object) (-1.0d));
        java.util.Collection collection53 = defaultedMap33.values();
        boolean b54 = defaultedMap11.containsValue((java.lang.Object) collection53);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "hi!" + "'", obj26.equals("hi!"));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue(i45 == 2);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "hi!" + "'", obj48.equals("hi!"));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.add((java.lang.Object) (short) 1);
        boolean b14 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        boolean b44 = defaultedMap1.equals((java.lang.Object) "{}");
        java.lang.String str45 = defaultedMap1.toString();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 10, fixedOrderComparator51, (byte) -1, obj53, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        int i57 = fixedOrderComparator56.getUnknownObjectBehavior();
        boolean b59 = fixedOrderComparator56.add((java.lang.Object) (short) 1);
        boolean b60 = fixedOrderComparator56.isLocked();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator56);
        boolean b62 = defaultedMap1.containsValue((java.lang.Object) defaultedMap61);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        java.lang.Object obj70 = new java.lang.Object();
        java.lang.Object[] obj_array72 = new java.lang.Object[] { 10, fixedOrderComparator68, (byte) -1, obj70, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator73 = new collections.comparators.FixedOrderComparator(obj_array72);
        int i74 = fixedOrderComparator73.getUnknownObjectBehavior();
        fixedOrderComparator73.setUnknownObjectBehavior(0);
        boolean b77 = fixedOrderComparator73.isLocked();
        boolean b78 = defaultedMap1.equals((java.lang.Object) fixedOrderComparator73);
        int i79 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{-1=1}" + "'", str45.equals("{-1=1}"));
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertNotNull(obj_array72);
        org.junit.Assert.assertTrue(i74 == 2);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(i79 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Collection collection9 = defaultedMap8.values();
        try {
            boolean b10 = fixedOrderComparator5.addAsEqual((java.lang.Object) 2, (java.lang.Object) defaultedMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        boolean b18 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj44 = defaultedMap7.get((java.lang.Object) (-1.0d));
        java.lang.String str45 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array52 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Object[] obj_array57 = new java.lang.Object[] { 10, fixedOrderComparator53, (byte) -1, obj55, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        int i59 = fixedOrderComparator58.getUnknownObjectBehavior();
        fixedOrderComparator58.setUnknownObjectBehavior(0);
        java.lang.Object obj62 = defaultedMap47.get((java.lang.Object) 0);
        java.util.Collection collection63 = defaultedMap47.values();
        defaultedMap7.putAll((java.util.Map) defaultedMap47);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(i59 == 2);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + "hi!" + "'", obj62.equals("hi!"));
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10, fixedOrderComparator12, (byte) -1, obj14, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap23, (java.lang.Object) (-1.0d));
        int i26 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array33 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10, fixedOrderComparator34, (byte) -1, obj36, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        java.lang.Object obj43 = defaultedMap28.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj47 = defaultedMap28.put((java.lang.Object) defaultedMap45, (java.lang.Object) (-1.0d));
        java.util.Collection collection48 = defaultedMap28.values();
        boolean b49 = defaultedMap6.containsValue((java.lang.Object) collection48);
        boolean b50 = defaultedMap1.containsKey((java.lang.Object) collection48);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate51, predicate52);
        boolean b55 = defaultedMap1.containsKey((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "hi!" + "'", obj43.equals("hi!"));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        boolean b14 = fixedOrderComparator10.isLocked();
        boolean b15 = fixedOrderComparator10.isLocked();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        java.util.Set set21 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) 10.0f);
        java.util.Set set21 = defaultedMap1.entrySet();
        java.util.Collection collection22 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap5.remove(obj6);
        java.util.Set set8 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i11 = defaultedMap10.size();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array20 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 10, fixedOrderComparator21, (byte) -1, obj23, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        int i27 = fixedOrderComparator26.getUnknownObjectBehavior();
        fixedOrderComparator26.setUnknownObjectBehavior(0);
        java.lang.Object obj30 = defaultedMap15.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj34 = defaultedMap15.put((java.lang.Object) defaultedMap32, (java.lang.Object) (-1.0d));
        boolean b35 = defaultedMap32.isEmpty();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap32);
        boolean b37 = defaultedMap5.containsValue((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set40 = defaultedMap39.keySet();
        java.util.Collection collection41 = defaultedMap39.values();
        boolean b42 = defaultedMap39.isEmpty();
        int i43 = defaultedMap39.size();
        java.lang.Object obj45 = defaultedMap5.put((java.lang.Object) defaultedMap39, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i48 = defaultedMap47.size();
        boolean b50 = defaultedMap47.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Object[] obj_array62 = new java.lang.Object[] { 10, fixedOrderComparator58, (byte) -1, obj60, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        int i64 = fixedOrderComparator63.getUnknownObjectBehavior();
        fixedOrderComparator63.setUnknownObjectBehavior(0);
        java.lang.Object obj67 = defaultedMap52.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj71 = defaultedMap52.put((java.lang.Object) defaultedMap69, (java.lang.Object) (-1.0d));
        boolean b72 = defaultedMap69.isEmpty();
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) defaultedMap69);
        java.lang.Object obj74 = defaultedMap1.put((java.lang.Object) defaultedMap39, (java.lang.Object) defaultedMap69);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "hi!" + "'", obj30.equals("hi!"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + "hi!" + "'", obj67.equals("hi!"));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10, fixedOrderComparator12, (byte) -1, obj14, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap23, (java.lang.Object) (-1.0d));
        int i26 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array33 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10, fixedOrderComparator34, (byte) -1, obj36, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        java.lang.Object obj43 = defaultedMap28.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj47 = defaultedMap28.put((java.lang.Object) defaultedMap45, (java.lang.Object) (-1.0d));
        java.util.Collection collection48 = defaultedMap28.values();
        boolean b49 = defaultedMap6.containsValue((java.lang.Object) collection48);
        boolean b50 = defaultedMap1.equals((java.lang.Object) b49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Object[] obj_array62 = new java.lang.Object[] { 10, fixedOrderComparator58, (byte) -1, obj60, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        int i64 = fixedOrderComparator63.getUnknownObjectBehavior();
        fixedOrderComparator63.setUnknownObjectBehavior(0);
        java.lang.Object obj67 = defaultedMap52.get((java.lang.Object) 0);
        java.lang.Object obj69 = defaultedMap52.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array74 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator75 = new collections.comparators.FixedOrderComparator(obj_array74);
        java.lang.Object obj77 = new java.lang.Object();
        java.lang.Object[] obj_array79 = new java.lang.Object[] { 10, fixedOrderComparator75, (byte) -1, obj77, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator80 = new collections.comparators.FixedOrderComparator(obj_array79);
        int i81 = fixedOrderComparator80.getUnknownObjectBehavior();
        fixedOrderComparator80.setUnknownObjectBehavior(0);
        boolean b85 = fixedOrderComparator80.add((java.lang.Object) '4');
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) fixedOrderComparator80);
        boolean b88 = defaultedMap52.equals((java.lang.Object) 1L);
        java.lang.Object obj90 = defaultedMap52.remove((java.lang.Object) 0.0d);
        boolean b92 = defaultedMap52.containsKey((java.lang.Object) (short) 1);
        boolean b93 = defaultedMap1.containsValue((java.lang.Object) b92);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "hi!" + "'", obj43.equals("hi!"));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + "hi!" + "'", obj67.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + "hi!" + "'", obj69.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertNotNull(obj_array79);
        org.junit.Assert.assertTrue(i81 == 2);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b38 = defaultedMap37.isEmpty();
        java.lang.Object obj41 = defaultedMap37.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array48 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 10, fixedOrderComparator49, (byte) -1, obj51, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        int i55 = fixedOrderComparator54.getUnknownObjectBehavior();
        fixedOrderComparator54.setUnknownObjectBehavior(0);
        java.lang.Object obj58 = defaultedMap43.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array65 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Object[] obj_array70 = new java.lang.Object[] { 10, fixedOrderComparator66, (byte) -1, obj68, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        int i72 = fixedOrderComparator71.getUnknownObjectBehavior();
        fixedOrderComparator71.setUnknownObjectBehavior(0);
        java.lang.Object obj75 = defaultedMap60.get((java.lang.Object) 0);
        java.lang.Object obj76 = defaultedMap43.get(obj75);
        java.lang.String str77 = defaultedMap43.toString();
        boolean b78 = defaultedMap37.containsValue((java.lang.Object) defaultedMap43);
        boolean b80 = defaultedMap37.equals((java.lang.Object) "{}");
        boolean b81 = defaultedMap1.equals((java.lang.Object) defaultedMap37);
        java.lang.String str82 = defaultedMap37.toString();
        java.util.Collection collection83 = defaultedMap37.values();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i86 = defaultedMap85.size();
        java.util.Set set87 = defaultedMap85.entrySet();
        java.lang.Object obj88 = defaultedMap37.get((java.lang.Object) defaultedMap85);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(i55 == 2);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "hi!" + "'", obj58.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + "hi!" + "'", obj75.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + "hi!" + "'", obj76.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{-1=1}" + "'", str82.equals("{-1=1}"));
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + "hi!" + "'", obj88.equals("hi!"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array28 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { 10, fixedOrderComparator29, (byte) -1, obj31, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        int i35 = fixedOrderComparator34.getUnknownObjectBehavior();
        fixedOrderComparator34.setUnknownObjectBehavior(0);
        java.lang.Object obj38 = defaultedMap23.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj42 = defaultedMap23.put((java.lang.Object) defaultedMap40, (java.lang.Object) (-1.0d));
        java.util.Collection collection43 = defaultedMap23.values();
        boolean b44 = defaultedMap1.containsValue((java.lang.Object) collection43);
        java.util.Set set45 = defaultedMap1.keySet();
        java.lang.String str46 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "hi!" + "'", obj38.equals("hi!"));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{{}=-1.0}" + "'", str46.equals("{{}=-1.0}"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Object[] obj_array52 = new java.lang.Object[] { 10, fixedOrderComparator48, (byte) -1, obj50, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        int i54 = fixedOrderComparator53.getUnknownObjectBehavior();
        java.lang.Object obj55 = defaultedMap7.get((java.lang.Object) fixedOrderComparator53);
        boolean b57 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        boolean b58 = defaultedMap7.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "hi!" + "'", obj55.equals("hi!"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b7 = defaultedMap6.isEmpty();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) b12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b18 = defaultedMap17.isEmpty();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap13.put((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap25.remove(obj26);
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) set28);
        boolean b30 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        boolean b21 = defaultedMap18.isEmpty();
        java.lang.Object[] obj_array26 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator27 = new collections.comparators.FixedOrderComparator(obj_array26);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object[] obj_array31 = new java.lang.Object[] { 10, fixedOrderComparator27, (byte) -1, obj29, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        int i33 = fixedOrderComparator32.getUnknownObjectBehavior();
        fixedOrderComparator32.setUnknownObjectBehavior(0);
        java.lang.Object obj36 = defaultedMap18.get((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(obj_array26);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "hi!" + "'", obj36.equals("hi!"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set8 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b11 = defaultedMap10.isEmpty();
        java.lang.Object obj14 = defaultedMap10.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set15 = defaultedMap10.entrySet();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = defaultedMap10.put((java.lang.Object) "{}", obj17);
        defaultedMap7.putAll((java.util.Map) defaultedMap10);
        defaultedMap7.clear();
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicate4);
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) fixedOrderComparator8);
        java.lang.String str10 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object[] obj_array9 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i14 = defaultedMap13.size();
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        java.lang.Object obj33 = defaultedMap18.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj37 = defaultedMap18.put((java.lang.Object) defaultedMap35, (java.lang.Object) (-1.0d));
        boolean b38 = defaultedMap35.isEmpty();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap35);
        boolean b40 = fixedOrderComparator10.add((java.lang.Object) defaultedMap13);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator10);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Object[] obj_array52 = new java.lang.Object[] { 10, fixedOrderComparator48, (byte) -1, obj50, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        int i54 = fixedOrderComparator53.getUnknownObjectBehavior();
        java.lang.Object obj55 = defaultedMap7.get((java.lang.Object) fixedOrderComparator53);
        int i56 = fixedOrderComparator53.getUnknownObjectBehavior();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "hi!" + "'", obj55.equals("hi!"));
        org.junit.Assert.assertTrue(i56 == 2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i7 = defaultedMap6.size();
        boolean b9 = defaultedMap6.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array16 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 10, fixedOrderComparator17, (byte) -1, obj19, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        java.lang.Object obj26 = defaultedMap11.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj30 = defaultedMap11.put((java.lang.Object) defaultedMap28, (java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap28.isEmpty();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap28);
        boolean b33 = defaultedMap1.containsValue((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set36 = defaultedMap35.keySet();
        java.util.Collection collection37 = defaultedMap35.values();
        boolean b38 = defaultedMap35.isEmpty();
        int i39 = defaultedMap35.size();
        java.lang.Object obj41 = defaultedMap1.put((java.lang.Object) defaultedMap35, (java.lang.Object) 100);
        java.lang.String str42 = defaultedMap1.toString();
        java.lang.String str43 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "hi!" + "'", obj26.equals("hi!"));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{{}=100}" + "'", str42.equals("{{}=100}"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{{}=100}" + "'", str43.equals("{{}=100}"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.lang.Object[] obj_array8 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator9 = new collections.comparators.FixedOrderComparator(obj_array8);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { 10, fixedOrderComparator9, (byte) -1, obj11, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        int i15 = fixedOrderComparator14.getUnknownObjectBehavior();
        fixedOrderComparator14.setUnknownObjectBehavior(0);
        boolean b19 = fixedOrderComparator14.add((java.lang.Object) '4');
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) b19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap22.remove(obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array31 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 10, fixedOrderComparator32, (byte) -1, obj34, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        int i38 = fixedOrderComparator37.getUnknownObjectBehavior();
        fixedOrderComparator37.setUnknownObjectBehavior(0);
        java.lang.Object obj41 = defaultedMap26.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array48 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 10, fixedOrderComparator49, (byte) -1, obj51, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        int i55 = fixedOrderComparator54.getUnknownObjectBehavior();
        fixedOrderComparator54.setUnknownObjectBehavior(0);
        java.lang.Object obj58 = defaultedMap43.get((java.lang.Object) 0);
        java.lang.Object obj59 = defaultedMap26.get(obj58);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj58);
        boolean b61 = defaultedMap22.containsValue((java.lang.Object) defaultedMap60);
        boolean b62 = defaultedMap1.equals((java.lang.Object) b61);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj_array8);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "hi!" + "'", obj41.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(i55 == 2);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "hi!" + "'", obj58.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "hi!" + "'", obj59.equals("hi!"));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.add((java.lang.Object) (short) 1);
        fixedOrderComparator10.setUnknownObjectBehavior(2);
        int i16 = fixedOrderComparator10.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i16 == 2);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array3);
        boolean b7 = fixedOrderComparator6.isLocked();
        try {
            fixedOrderComparator6.setUnknownObjectBehavior((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10, fixedOrderComparator12, (byte) -1, obj14, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap23, (java.lang.Object) (-1.0d));
        boolean b26 = defaultedMap23.isEmpty();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set6 = defaultedMap5.keySet();
        java.util.Collection collection7 = defaultedMap5.values();
        boolean b8 = defaultedMap5.isEmpty();
        int i9 = defaultedMap5.size();
        int i10 = defaultedMap5.size();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "hi!" + "'", obj11.equals("hi!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Collection collection6 = defaultedMap4.values();
        java.lang.String str7 = defaultedMap4.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array14 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator15 = new collections.comparators.FixedOrderComparator(obj_array14);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object[] obj_array19 = new java.lang.Object[] { 10, fixedOrderComparator15, (byte) -1, obj17, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        int i21 = fixedOrderComparator20.getUnknownObjectBehavior();
        fixedOrderComparator20.setUnknownObjectBehavior(0);
        java.lang.Object obj24 = defaultedMap9.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj28 = defaultedMap9.put((java.lang.Object) defaultedMap26, (java.lang.Object) (-1.0d));
        boolean b29 = defaultedMap4.containsValue(obj28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) b29);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b35 = defaultedMap34.isEmpty();
        java.lang.Object obj38 = defaultedMap34.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array45 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { 10, fixedOrderComparator46, (byte) -1, obj48, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        int i52 = fixedOrderComparator51.getUnknownObjectBehavior();
        fixedOrderComparator51.setUnknownObjectBehavior(0);
        java.lang.Object obj55 = defaultedMap40.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array62 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Object[] obj_array67 = new java.lang.Object[] { 10, fixedOrderComparator63, (byte) -1, obj65, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        int i69 = fixedOrderComparator68.getUnknownObjectBehavior();
        fixedOrderComparator68.setUnknownObjectBehavior(0);
        java.lang.Object obj72 = defaultedMap57.get((java.lang.Object) 0);
        java.lang.Object obj73 = defaultedMap40.get(obj72);
        java.lang.String str74 = defaultedMap40.toString();
        boolean b75 = defaultedMap34.containsValue((java.lang.Object) defaultedMap40);
        java.lang.Object obj77 = defaultedMap40.get((java.lang.Object) 2);
        boolean b78 = defaultedMap40.isEmpty();
        boolean b79 = defaultedMap31.containsValue((java.lang.Object) b78);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array14);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "hi!" + "'", obj24.equals("hi!"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "hi!" + "'", obj32.equals("hi!"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertTrue(i52 == 2);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "hi!" + "'", obj55.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(i69 == 2);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + "hi!" + "'", obj72.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + "hi!" + "'", obj73.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + "hi!" + "'", obj77.equals("hi!"));
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.add((java.lang.Object) (short) 1);
        boolean b14 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b19 = defaultedMap18.isEmpty();
        java.lang.Object obj22 = defaultedMap18.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array46 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Object[] obj_array51 = new java.lang.Object[] { 10, fixedOrderComparator47, (byte) -1, obj49, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        int i53 = fixedOrderComparator52.getUnknownObjectBehavior();
        fixedOrderComparator52.setUnknownObjectBehavior(0);
        java.lang.Object obj56 = defaultedMap41.get((java.lang.Object) 0);
        java.lang.Object obj57 = defaultedMap24.get(obj56);
        java.lang.String str58 = defaultedMap24.toString();
        boolean b59 = defaultedMap18.containsValue((java.lang.Object) defaultedMap24);
        java.util.Set set60 = defaultedMap24.entrySet();
        boolean b61 = defaultedMap16.containsKey((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertTrue(i53 == 2);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "hi!" + "'", obj56.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "hi!" + "'", obj57.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        java.lang.Object obj33 = defaultedMap18.get((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap1.get(obj33);
        java.lang.String str35 = defaultedMap1.toString();
        java.util.Set set36 = defaultedMap1.keySet();
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap1.equals(obj37);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.util.Set set43 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) 10.0f);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        boolean b44 = defaultedMap1.equals((java.lang.Object) "{}");
        java.lang.String str45 = defaultedMap1.toString();
        java.lang.Object[] obj_array50 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 10, fixedOrderComparator51, (byte) -1, obj53, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        int i57 = fixedOrderComparator56.getUnknownObjectBehavior();
        boolean b59 = fixedOrderComparator56.add((java.lang.Object) (short) 1);
        boolean b60 = fixedOrderComparator56.isLocked();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator56);
        boolean b62 = defaultedMap1.containsValue((java.lang.Object) defaultedMap61);
        int i63 = defaultedMap61.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{-1=1}" + "'", str45.equals("{-1=1}"));
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.remove(obj11);
        java.util.Set set13 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i16 = defaultedMap15.size();
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array25 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Object[] obj_array30 = new java.lang.Object[] { 10, fixedOrderComparator26, (byte) -1, obj28, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator31 = new collections.comparators.FixedOrderComparator(obj_array30);
        int i32 = fixedOrderComparator31.getUnknownObjectBehavior();
        fixedOrderComparator31.setUnknownObjectBehavior(0);
        java.lang.Object obj35 = defaultedMap20.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj39 = defaultedMap20.put((java.lang.Object) defaultedMap37, (java.lang.Object) (-1.0d));
        boolean b40 = defaultedMap37.isEmpty();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap37);
        boolean b42 = defaultedMap10.containsValue((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set45 = defaultedMap44.keySet();
        java.util.Collection collection46 = defaultedMap44.values();
        boolean b47 = defaultedMap44.isEmpty();
        int i48 = defaultedMap44.size();
        java.lang.Object obj50 = defaultedMap10.put((java.lang.Object) defaultedMap44, (java.lang.Object) 100);
        java.lang.String str51 = defaultedMap10.toString();
        java.lang.Object obj52 = defaultedMap1.put((java.lang.Object) obj_array5, (java.lang.Object) str51);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertTrue(i32 == 2);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "hi!" + "'", obj35.equals("hi!"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{{}=100}" + "'", str51.equals("{{}=100}"));
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj44 = defaultedMap7.get((java.lang.Object) 2);
        boolean b45 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap47.remove(obj48);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        boolean b51 = defaultedMap47.containsKey((java.lang.Object) predicate50);
        boolean b52 = defaultedMap7.containsKey((java.lang.Object) defaultedMap47);
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap47.remove(obj53);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        int i21 = defaultedMap1.size();
        java.util.Set set22 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj43 = defaultedMap24.put((java.lang.Object) defaultedMap41, (java.lang.Object) (-1.0d));
        int i44 = defaultedMap24.size();
        java.util.Set set45 = defaultedMap24.entrySet();
        java.lang.Object obj46 = defaultedMap1.remove((java.lang.Object) set45);
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap1.put((java.lang.Object) 0, obj48);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 10, fixedOrderComparator6, (byte) -1, obj8, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b12 = fixedOrderComparator0.add((java.lang.Object) obj_array10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10, fixedOrderComparator20, (byte) -1, obj22, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        int i26 = fixedOrderComparator25.getUnknownObjectBehavior();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        java.lang.Object obj29 = defaultedMap14.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj33 = defaultedMap14.put((java.lang.Object) defaultedMap31, (java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap31.isEmpty();
        boolean b35 = fixedOrderComparator0.add((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap37.remove(obj38);
        java.util.Set set40 = defaultedMap37.keySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i43 = defaultedMap42.size();
        boolean b45 = defaultedMap42.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array52 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Object[] obj_array57 = new java.lang.Object[] { 10, fixedOrderComparator53, (byte) -1, obj55, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        int i59 = fixedOrderComparator58.getUnknownObjectBehavior();
        fixedOrderComparator58.setUnknownObjectBehavior(0);
        java.lang.Object obj62 = defaultedMap47.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj66 = defaultedMap47.put((java.lang.Object) defaultedMap64, (java.lang.Object) (-1.0d));
        boolean b67 = defaultedMap64.isEmpty();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) defaultedMap64);
        boolean b69 = defaultedMap37.containsValue((java.lang.Object) defaultedMap64);
        boolean b70 = defaultedMap31.containsValue((java.lang.Object) defaultedMap64);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b73 = defaultedMap72.isEmpty();
        java.lang.Object obj76 = defaultedMap72.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b78 = defaultedMap72.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) b78);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap79);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b84 = defaultedMap83.isEmpty();
        java.lang.Object obj87 = defaultedMap83.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.lang.Object obj88 = defaultedMap79.put((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
        java.util.Collection collection89 = defaultedMap79.values();
        defaultedMap79.clear();
        defaultedMap31.putAll((java.util.Map) defaultedMap79);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertTrue(i59 == 2);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + "hi!" + "'", obj62.equals("hi!"));
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(collection89);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicate4);
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b11 = defaultedMap10.isEmpty();
        java.lang.Object obj14 = defaultedMap10.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b16 = defaultedMap10.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) b16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b22 = defaultedMap21.isEmpty();
        java.lang.Object obj25 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.lang.Object obj26 = defaultedMap17.put((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
        java.util.Collection collection27 = defaultedMap17.values();
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) collection27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b31 = defaultedMap30.isEmpty();
        java.lang.Object obj34 = defaultedMap30.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 10, fixedOrderComparator42, (byte) -1, obj44, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        int i48 = fixedOrderComparator47.getUnknownObjectBehavior();
        fixedOrderComparator47.setUnknownObjectBehavior(0);
        java.lang.Object obj51 = defaultedMap36.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array58 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Object[] obj_array63 = new java.lang.Object[] { 10, fixedOrderComparator59, (byte) -1, obj61, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator64 = new collections.comparators.FixedOrderComparator(obj_array63);
        int i65 = fixedOrderComparator64.getUnknownObjectBehavior();
        fixedOrderComparator64.setUnknownObjectBehavior(0);
        java.lang.Object obj68 = defaultedMap53.get((java.lang.Object) 0);
        java.lang.Object obj69 = defaultedMap36.get(obj68);
        java.lang.String str70 = defaultedMap36.toString();
        boolean b71 = defaultedMap30.containsValue((java.lang.Object) defaultedMap36);
        java.lang.Object obj73 = defaultedMap36.get((java.lang.Object) (-1.0d));
        boolean b74 = defaultedMap36.isEmpty();
        java.util.Set set75 = defaultedMap36.keySet();
        java.lang.Object obj76 = defaultedMap1.get((java.lang.Object) defaultedMap36);
        collections.Transformer transformer77 = null;
        try {
            java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(i48 == 2);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + "hi!" + "'", obj51.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue(i65 == 2);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + "hi!" + "'", obj68.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + "hi!" + "'", obj69.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + "hi!" + "'", obj73.equals("hi!"));
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + "hi!" + "'", obj76.equals("hi!"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 10, fixedOrderComparator6, (byte) -1, obj8, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b12 = fixedOrderComparator0.add((java.lang.Object) obj_array10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10, fixedOrderComparator20, (byte) -1, obj22, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        int i26 = fixedOrderComparator25.getUnknownObjectBehavior();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        java.lang.Object obj29 = defaultedMap14.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj33 = defaultedMap14.put((java.lang.Object) defaultedMap31, (java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap31.isEmpty();
        boolean b35 = fixedOrderComparator0.add((java.lang.Object) defaultedMap31);
        boolean b36 = fixedOrderComparator0.isLocked();
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj44 = defaultedMap7.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array51 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator52 = new collections.comparators.FixedOrderComparator(obj_array51);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Object[] obj_array56 = new java.lang.Object[] { 10, fixedOrderComparator52, (byte) -1, obj54, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator57 = new collections.comparators.FixedOrderComparator(obj_array56);
        int i58 = fixedOrderComparator57.getUnknownObjectBehavior();
        fixedOrderComparator57.setUnknownObjectBehavior(0);
        java.lang.Object obj61 = defaultedMap46.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj65 = defaultedMap46.put((java.lang.Object) defaultedMap63, (java.lang.Object) (-1.0d));
        defaultedMap7.putAll((java.util.Map) defaultedMap63);
        boolean b67 = defaultedMap63.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array51);
        org.junit.Assert.assertNotNull(obj_array56);
        org.junit.Assert.assertTrue(i58 == 2);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + "hi!" + "'", obj61.equals("hi!"));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.comparators.FixedOrderComparator fixedOrderComparator0 = new collections.comparators.FixedOrderComparator();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array5);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { 10, fixedOrderComparator6, (byte) -1, obj8, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        boolean b12 = fixedOrderComparator0.add((java.lang.Object) obj_array10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array19 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator20 = new collections.comparators.FixedOrderComparator(obj_array19);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 10, fixedOrderComparator20, (byte) -1, obj22, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        int i26 = fixedOrderComparator25.getUnknownObjectBehavior();
        fixedOrderComparator25.setUnknownObjectBehavior(0);
        java.lang.Object obj29 = defaultedMap14.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj33 = defaultedMap14.put((java.lang.Object) defaultedMap31, (java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap31.isEmpty();
        boolean b35 = fixedOrderComparator0.add((java.lang.Object) defaultedMap31);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Object[] obj_array45 = new java.lang.Object[] { 10, fixedOrderComparator41, (byte) -1, obj43, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator46 = new collections.comparators.FixedOrderComparator(obj_array45);
        int i47 = fixedOrderComparator46.getUnknownObjectBehavior();
        java.lang.Object obj48 = null;
        boolean b49 = fixedOrderComparator46.add(obj48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set52 = defaultedMap51.keySet();
        java.util.Collection collection53 = defaultedMap51.values();
        java.lang.String str54 = defaultedMap51.toString();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array61 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator62 = new collections.comparators.FixedOrderComparator(obj_array61);
        java.lang.Object obj64 = new java.lang.Object();
        java.lang.Object[] obj_array66 = new java.lang.Object[] { 10, fixedOrderComparator62, (byte) -1, obj64, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator67 = new collections.comparators.FixedOrderComparator(obj_array66);
        int i68 = fixedOrderComparator67.getUnknownObjectBehavior();
        fixedOrderComparator67.setUnknownObjectBehavior(0);
        java.lang.Object obj71 = defaultedMap56.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj75 = defaultedMap56.put((java.lang.Object) defaultedMap73, (java.lang.Object) (-1.0d));
        boolean b76 = defaultedMap51.containsValue(obj75);
        defaultedMap51.clear();
        try {
            int i78 = fixedOrderComparator0.compare((java.lang.Object) b49, (java.lang.Object) defaultedMap51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue(i26 == 2);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertNotNull(obj_array45);
        org.junit.Assert.assertTrue(i47 == 2);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertNotNull(obj_array66);
        org.junit.Assert.assertTrue(i68 == 2);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + "hi!" + "'", obj71.equals("hi!"));
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array3);
        fixedOrderComparator7.setUnknownObjectBehavior((int) (short) 0);
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        boolean b37 = defaultedMap1.equals((java.lang.Object) 1L);
        java.lang.Object obj39 = defaultedMap1.remove((java.lang.Object) 0.0d);
        boolean b41 = defaultedMap1.containsKey((java.lang.Object) (short) 1);
        java.lang.String str42 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.String str19 = defaultedMap1.toString();
        boolean b20 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b23 = defaultedMap22.isEmpty();
        java.lang.Object obj26 = defaultedMap22.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array33 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10, fixedOrderComparator34, (byte) -1, obj36, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        java.lang.Object obj43 = defaultedMap28.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array50 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator51 = new collections.comparators.FixedOrderComparator(obj_array50);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Object[] obj_array55 = new java.lang.Object[] { 10, fixedOrderComparator51, (byte) -1, obj53, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator56 = new collections.comparators.FixedOrderComparator(obj_array55);
        int i57 = fixedOrderComparator56.getUnknownObjectBehavior();
        fixedOrderComparator56.setUnknownObjectBehavior(0);
        java.lang.Object obj60 = defaultedMap45.get((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap28.get(obj60);
        java.lang.String str62 = defaultedMap28.toString();
        boolean b63 = defaultedMap22.containsValue((java.lang.Object) defaultedMap28);
        boolean b65 = defaultedMap22.equals((java.lang.Object) "{}");
        java.lang.String str66 = defaultedMap22.toString();
        java.util.Set set67 = defaultedMap22.entrySet();
        java.util.Set set68 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) set68);
        boolean b70 = defaultedMap1.equals((java.lang.Object) set68);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "hi!" + "'", obj43.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array50);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "hi!" + "'", obj60.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + "hi!" + "'", obj61.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{-1=1}" + "'", str66.equals("{-1=1}"));
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator8 = new collections.comparators.FixedOrderComparator(obj_array3);
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b4 = defaultedMap1.isEmpty();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b8 = defaultedMap7.isEmpty();
        java.lang.Object obj11 = defaultedMap7.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array18 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { 10, fixedOrderComparator19, (byte) -1, obj21, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        int i25 = fixedOrderComparator24.getUnknownObjectBehavior();
        fixedOrderComparator24.setUnknownObjectBehavior(0);
        java.lang.Object obj28 = defaultedMap13.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array35 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator36 = new collections.comparators.FixedOrderComparator(obj_array35);
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Object[] obj_array40 = new java.lang.Object[] { 10, fixedOrderComparator36, (byte) -1, obj38, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator41 = new collections.comparators.FixedOrderComparator(obj_array40);
        int i42 = fixedOrderComparator41.getUnknownObjectBehavior();
        fixedOrderComparator41.setUnknownObjectBehavior(0);
        java.lang.Object obj45 = defaultedMap30.get((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap13.get(obj45);
        java.lang.String str47 = defaultedMap13.toString();
        boolean b48 = defaultedMap7.containsValue((java.lang.Object) defaultedMap13);
        java.lang.Object obj50 = defaultedMap13.get((java.lang.Object) 2);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array57 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator58 = new collections.comparators.FixedOrderComparator(obj_array57);
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Object[] obj_array62 = new java.lang.Object[] { 10, fixedOrderComparator58, (byte) -1, obj60, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        int i64 = fixedOrderComparator63.getUnknownObjectBehavior();
        fixedOrderComparator63.setUnknownObjectBehavior(0);
        java.lang.Object obj67 = defaultedMap52.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj71 = defaultedMap52.put((java.lang.Object) defaultedMap69, (java.lang.Object) (-1.0d));
        defaultedMap13.putAll((java.util.Map) defaultedMap69);
        boolean b73 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        java.util.Set set74 = defaultedMap13.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue(i25 == 2);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "hi!" + "'", obj28.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertTrue(i42 == 2);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "hi!" + "'", obj45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "hi!" + "'", obj46.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + "hi!" + "'", obj50.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array57);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertTrue(i64 == 2);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + "hi!" + "'", obj67.equals("hi!"));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(set74);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i11 = defaultedMap10.size();
        boolean b13 = defaultedMap10.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array20 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator21 = new collections.comparators.FixedOrderComparator(obj_array20);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { 10, fixedOrderComparator21, (byte) -1, obj23, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator26 = new collections.comparators.FixedOrderComparator(obj_array25);
        int i27 = fixedOrderComparator26.getUnknownObjectBehavior();
        fixedOrderComparator26.setUnknownObjectBehavior(0);
        java.lang.Object obj30 = defaultedMap15.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj34 = defaultedMap15.put((java.lang.Object) defaultedMap32, (java.lang.Object) (-1.0d));
        int i35 = defaultedMap15.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array42 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 10, fixedOrderComparator43, (byte) -1, obj45, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        int i49 = fixedOrderComparator48.getUnknownObjectBehavior();
        fixedOrderComparator48.setUnknownObjectBehavior(0);
        java.lang.Object obj52 = defaultedMap37.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj56 = defaultedMap37.put((java.lang.Object) defaultedMap54, (java.lang.Object) (-1.0d));
        java.util.Collection collection57 = defaultedMap37.values();
        boolean b58 = defaultedMap15.containsValue((java.lang.Object) collection57);
        boolean b59 = defaultedMap10.containsKey((java.lang.Object) collection57);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate60, predicate61);
        boolean b63 = defaultedMap1.containsKey((java.lang.Object) map62);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj_array20);
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "hi!" + "'", obj30.equals("hi!"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(i49 == 2);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "hi!" + "'", obj52.equals("hi!"));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b7 = defaultedMap6.isEmpty();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) b12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b18 = defaultedMap17.isEmpty();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap13.put((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap25.remove(obj26);
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) set28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap30.put(obj31, obj32);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) b7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b13 = defaultedMap12.isEmpty();
        java.lang.Object obj16 = defaultedMap12.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
        java.util.Collection collection18 = defaultedMap8.values();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b22 = defaultedMap21.isEmpty();
        java.lang.Object obj25 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array32 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Object[] obj_array37 = new java.lang.Object[] { 10, fixedOrderComparator33, (byte) -1, obj35, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator38 = new collections.comparators.FixedOrderComparator(obj_array37);
        int i39 = fixedOrderComparator38.getUnknownObjectBehavior();
        fixedOrderComparator38.setUnknownObjectBehavior(0);
        java.lang.Object obj42 = defaultedMap27.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array49 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator50 = new collections.comparators.FixedOrderComparator(obj_array49);
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Object[] obj_array54 = new java.lang.Object[] { 10, fixedOrderComparator50, (byte) -1, obj52, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator55 = new collections.comparators.FixedOrderComparator(obj_array54);
        int i56 = fixedOrderComparator55.getUnknownObjectBehavior();
        fixedOrderComparator55.setUnknownObjectBehavior(0);
        java.lang.Object obj59 = defaultedMap44.get((java.lang.Object) 0);
        java.lang.Object obj60 = defaultedMap27.get(obj59);
        java.lang.String str61 = defaultedMap27.toString();
        boolean b62 = defaultedMap21.containsValue((java.lang.Object) defaultedMap27);
        java.lang.Object obj64 = defaultedMap27.get((java.lang.Object) 2);
        boolean b65 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap67.remove(obj68);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        boolean b71 = defaultedMap67.containsKey((java.lang.Object) predicate70);
        boolean b72 = defaultedMap27.containsKey((java.lang.Object) defaultedMap67);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set75 = defaultedMap74.keySet();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b78 = defaultedMap77.isEmpty();
        java.lang.Object obj81 = defaultedMap77.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set82 = defaultedMap77.entrySet();
        java.lang.Object obj84 = new java.lang.Object();
        java.lang.Object obj85 = defaultedMap77.put((java.lang.Object) "{}", obj84);
        defaultedMap74.putAll((java.util.Map) defaultedMap77);
        java.util.Collection collection87 = defaultedMap74.values();
        java.lang.Object obj88 = defaultedMap8.put((java.lang.Object) defaultedMap27, (java.lang.Object) defaultedMap74);
        java.util.Collection collection89 = defaultedMap27.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNotNull(obj_array37);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "hi!" + "'", obj42.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array49);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertTrue(i56 == 2);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "hi!" + "'", obj59.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "hi!" + "'", obj60.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + "hi!" + "'", obj64.equals("hi!"));
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(collection89);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.util.Collection collection43 = defaultedMap7.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.util.Set set43 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj44 = defaultedMap7.get((java.lang.Object) 2);
        java.util.Collection collection45 = defaultedMap7.values();
        boolean b46 = defaultedMap7.isEmpty();
        defaultedMap7.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator6 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array3);
        try {
            int i10 = fixedOrderComparator7.compare((java.lang.Object) (byte) -1, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b38 = defaultedMap37.isEmpty();
        java.lang.Object obj41 = defaultedMap37.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array48 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 10, fixedOrderComparator49, (byte) -1, obj51, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        int i55 = fixedOrderComparator54.getUnknownObjectBehavior();
        fixedOrderComparator54.setUnknownObjectBehavior(0);
        java.lang.Object obj58 = defaultedMap43.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array65 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Object[] obj_array70 = new java.lang.Object[] { 10, fixedOrderComparator66, (byte) -1, obj68, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        int i72 = fixedOrderComparator71.getUnknownObjectBehavior();
        fixedOrderComparator71.setUnknownObjectBehavior(0);
        java.lang.Object obj75 = defaultedMap60.get((java.lang.Object) 0);
        java.lang.Object obj76 = defaultedMap43.get(obj75);
        java.lang.String str77 = defaultedMap43.toString();
        boolean b78 = defaultedMap37.containsValue((java.lang.Object) defaultedMap43);
        boolean b80 = defaultedMap37.equals((java.lang.Object) "{}");
        boolean b81 = defaultedMap1.equals((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set84 = defaultedMap83.keySet();
        defaultedMap83.clear();
        boolean b86 = defaultedMap37.containsKey((java.lang.Object) defaultedMap83);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(i55 == 2);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "hi!" + "'", obj58.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + "hi!" + "'", obj75.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + "hi!" + "'", obj76.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array23 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator24 = new collections.comparators.FixedOrderComparator(obj_array23);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object[] obj_array28 = new java.lang.Object[] { 10, fixedOrderComparator24, (byte) -1, obj26, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator29 = new collections.comparators.FixedOrderComparator(obj_array28);
        int i30 = fixedOrderComparator29.getUnknownObjectBehavior();
        fixedOrderComparator29.setUnknownObjectBehavior(0);
        boolean b34 = fixedOrderComparator29.add((java.lang.Object) '4');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) fixedOrderComparator29);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b38 = defaultedMap37.isEmpty();
        java.lang.Object obj41 = defaultedMap37.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array48 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator49 = new collections.comparators.FixedOrderComparator(obj_array48);
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Object[] obj_array53 = new java.lang.Object[] { 10, fixedOrderComparator49, (byte) -1, obj51, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        int i55 = fixedOrderComparator54.getUnknownObjectBehavior();
        fixedOrderComparator54.setUnknownObjectBehavior(0);
        java.lang.Object obj58 = defaultedMap43.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array65 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator66 = new collections.comparators.FixedOrderComparator(obj_array65);
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Object[] obj_array70 = new java.lang.Object[] { 10, fixedOrderComparator66, (byte) -1, obj68, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator71 = new collections.comparators.FixedOrderComparator(obj_array70);
        int i72 = fixedOrderComparator71.getUnknownObjectBehavior();
        fixedOrderComparator71.setUnknownObjectBehavior(0);
        java.lang.Object obj75 = defaultedMap60.get((java.lang.Object) 0);
        java.lang.Object obj76 = defaultedMap43.get(obj75);
        java.lang.String str77 = defaultedMap43.toString();
        boolean b78 = defaultedMap37.containsValue((java.lang.Object) defaultedMap43);
        boolean b80 = defaultedMap37.equals((java.lang.Object) "{}");
        boolean b81 = defaultedMap1.equals((java.lang.Object) defaultedMap37);
        defaultedMap37.clear();
        boolean b83 = defaultedMap37.isEmpty();
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertNotNull(obj_array28);
        org.junit.Assert.assertTrue(i30 == 2);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj_array48);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertTrue(i55 == 2);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "hi!" + "'", obj58.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array65);
        org.junit.Assert.assertNotNull(obj_array70);
        org.junit.Assert.assertTrue(i72 == 2);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + "hi!" + "'", obj75.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + "hi!" + "'", obj76.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b83 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator4 = new collections.comparators.FixedOrderComparator(obj_array3);
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array3);
        fixedOrderComparator5.setUnknownObjectBehavior(0);
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) b7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array16 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 10, fixedOrderComparator17, (byte) -1, obj19, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        java.lang.Object obj26 = defaultedMap11.get((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap11.get((java.lang.Object) (byte) 100);
        java.lang.Object[] obj_array33 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10, fixedOrderComparator34, (byte) -1, obj36, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        fixedOrderComparator39.setUnknownObjectBehavior(0);
        boolean b44 = fixedOrderComparator39.add((java.lang.Object) '4');
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) fixedOrderComparator39);
        boolean b47 = defaultedMap11.equals((java.lang.Object) 1L);
        java.util.Set set48 = defaultedMap11.entrySet();
        boolean b49 = defaultedMap8.equals((java.lang.Object) defaultedMap11);
        boolean b50 = defaultedMap11.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "hi!" + "'", obj26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "hi!" + "'", obj28.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set3 = defaultedMap2.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b6 = defaultedMap5.isEmpty();
        java.lang.Object obj9 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set10 = defaultedMap5.entrySet();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object obj13 = defaultedMap5.put((java.lang.Object) "{}", obj12);
        defaultedMap2.putAll((java.util.Map) defaultedMap5);
        defaultedMap2.clear();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap2.remove(obj16);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap2);
        boolean b19 = defaultedMap18.isEmpty();
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.String str19 = defaultedMap1.toString();
        boolean b20 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array27 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator28 = new collections.comparators.FixedOrderComparator(obj_array27);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Object[] obj_array32 = new java.lang.Object[] { 10, fixedOrderComparator28, (byte) -1, obj30, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator33 = new collections.comparators.FixedOrderComparator(obj_array32);
        int i34 = fixedOrderComparator33.getUnknownObjectBehavior();
        fixedOrderComparator33.setUnknownObjectBehavior(0);
        java.lang.Object obj37 = defaultedMap22.get((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap22.get((java.lang.Object) (byte) 100);
        boolean b40 = defaultedMap1.equals((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertTrue(i34 == 2);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "hi!" + "'", obj37.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        boolean b13 = fixedOrderComparator10.add((java.lang.Object) (short) 1);
        boolean b14 = fixedOrderComparator10.isLocked();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator10);
        int i16 = fixedOrderComparator10.getUnknownObjectBehavior();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i16 == 2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b7 = defaultedMap6.isEmpty();
        java.lang.Object obj10 = defaultedMap6.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) b12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i17 = defaultedMap16.size();
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b22 = defaultedMap21.isEmpty();
        java.lang.Object obj25 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b27 = defaultedMap21.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b33 = defaultedMap32.isEmpty();
        java.lang.Object obj36 = defaultedMap32.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.lang.Object obj37 = defaultedMap28.put((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
        boolean b38 = defaultedMap16.containsValue((java.lang.Object) (byte) 1);
        defaultedMap13.putAll((java.util.Map) defaultedMap16);
        boolean b40 = defaultedMap1.containsKey((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { (-1.0f), 100.0d, (byte) 1, obj_array6, 1, obj9 };
        collections.comparators.FixedOrderComparator fixedOrderComparator11 = new collections.comparators.FixedOrderComparator(obj_array10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b14 = defaultedMap13.isEmpty();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array24 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator25 = new collections.comparators.FixedOrderComparator(obj_array24);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Object[] obj_array29 = new java.lang.Object[] { 10, fixedOrderComparator25, (byte) -1, obj27, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        int i31 = fixedOrderComparator30.getUnknownObjectBehavior();
        fixedOrderComparator30.setUnknownObjectBehavior(0);
        java.lang.Object obj34 = defaultedMap19.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array41 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator42 = new collections.comparators.FixedOrderComparator(obj_array41);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Object[] obj_array46 = new java.lang.Object[] { 10, fixedOrderComparator42, (byte) -1, obj44, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator47 = new collections.comparators.FixedOrderComparator(obj_array46);
        int i48 = fixedOrderComparator47.getUnknownObjectBehavior();
        fixedOrderComparator47.setUnknownObjectBehavior(0);
        java.lang.Object obj51 = defaultedMap36.get((java.lang.Object) 0);
        java.lang.Object obj52 = defaultedMap19.get(obj51);
        java.lang.String str53 = defaultedMap19.toString();
        boolean b54 = defaultedMap13.containsValue((java.lang.Object) defaultedMap19);
        java.lang.Object obj56 = defaultedMap19.get((java.lang.Object) 2);
        boolean b57 = defaultedMap19.isEmpty();
        java.lang.Object[] obj_array62 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator63 = new collections.comparators.FixedOrderComparator(obj_array62);
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Object[] obj_array67 = new java.lang.Object[] { 10, fixedOrderComparator63, (byte) -1, obj65, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator68 = new collections.comparators.FixedOrderComparator(obj_array67);
        int i69 = fixedOrderComparator68.getUnknownObjectBehavior();
        boolean b71 = fixedOrderComparator68.add((java.lang.Object) (short) 1);
        boolean b72 = fixedOrderComparator68.isLocked();
        try {
            int i73 = fixedOrderComparator11.compare((java.lang.Object) defaultedMap19, (java.lang.Object) b72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertTrue(i31 == 2);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertTrue(i48 == 2);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + "hi!" + "'", obj51.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "hi!" + "'", obj52.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "hi!" + "'", obj56.equals("hi!"));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(obj_array62);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue(i69 == 2);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        boolean b11 = fixedOrderComparator10.isLocked();
        boolean b12 = fixedOrderComparator10.isLocked();
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.String str19 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        int i22 = defaultedMap21.size();
        boolean b24 = defaultedMap21.containsKey((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array31 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator32 = new collections.comparators.FixedOrderComparator(obj_array31);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 10, fixedOrderComparator32, (byte) -1, obj34, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator37 = new collections.comparators.FixedOrderComparator(obj_array36);
        int i38 = fixedOrderComparator37.getUnknownObjectBehavior();
        fixedOrderComparator37.setUnknownObjectBehavior(0);
        java.lang.Object obj41 = defaultedMap26.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj45 = defaultedMap26.put((java.lang.Object) defaultedMap43, (java.lang.Object) (-1.0d));
        int i46 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array53 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator54 = new collections.comparators.FixedOrderComparator(obj_array53);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Object[] obj_array58 = new java.lang.Object[] { 10, fixedOrderComparator54, (byte) -1, obj56, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator59 = new collections.comparators.FixedOrderComparator(obj_array58);
        int i60 = fixedOrderComparator59.getUnknownObjectBehavior();
        fixedOrderComparator59.setUnknownObjectBehavior(0);
        java.lang.Object obj63 = defaultedMap48.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj67 = defaultedMap48.put((java.lang.Object) defaultedMap65, (java.lang.Object) (-1.0d));
        java.util.Collection collection68 = defaultedMap48.values();
        boolean b69 = defaultedMap26.containsValue((java.lang.Object) collection68);
        boolean b70 = defaultedMap21.containsKey((java.lang.Object) collection68);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate71, predicate72);
        boolean b74 = defaultedMap1.equals((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj_array31);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertTrue(i38 == 2);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "hi!" + "'", obj41.equals("hi!"));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 1);
        org.junit.Assert.assertNotNull(obj_array53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue(i60 == 2);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + "hi!" + "'", obj63.equals("hi!"));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b74 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap44.remove(obj45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        boolean b48 = defaultedMap44.containsKey((java.lang.Object) predicate47);
        defaultedMap1.putAll((java.util.Map) defaultedMap44);
        collections.Transformer transformer50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set4 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set7 = defaultedMap6.keySet();
        java.util.Collection collection8 = defaultedMap6.values();
        java.lang.String str9 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array16 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 10, fixedOrderComparator17, (byte) -1, obj19, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator22 = new collections.comparators.FixedOrderComparator(obj_array21);
        int i23 = fixedOrderComparator22.getUnknownObjectBehavior();
        fixedOrderComparator22.setUnknownObjectBehavior(0);
        java.lang.Object obj26 = defaultedMap11.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj30 = defaultedMap11.put((java.lang.Object) defaultedMap28, (java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap6.containsValue(obj30);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) b31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) b31);
        java.lang.Object obj34 = defaultedMap3.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array42 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator43 = new collections.comparators.FixedOrderComparator(obj_array42);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object[] obj_array47 = new java.lang.Object[] { 10, fixedOrderComparator43, (byte) -1, obj45, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        int i49 = fixedOrderComparator48.getUnknownObjectBehavior();
        fixedOrderComparator48.setUnknownObjectBehavior(0);
        java.lang.Object obj52 = defaultedMap37.get((java.lang.Object) 0);
        java.lang.Object obj54 = defaultedMap37.get((java.lang.Object) (byte) 100);
        java.lang.Object obj56 = defaultedMap37.remove((java.lang.Object) 10.0f);
        boolean b57 = defaultedMap1.equals(obj56);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue(i23 == 2);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "hi!" + "'", obj26.equals("hi!"));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 10L + "'", obj35.equals(10L));
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue(i49 == 2);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "hi!" + "'", obj52.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "hi!" + "'", obj54.equals("hi!"));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b4 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set7 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b10 = defaultedMap9.isEmpty();
        java.lang.Object obj13 = defaultedMap9.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set14 = defaultedMap9.entrySet();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object obj17 = defaultedMap9.put((java.lang.Object) "{}", obj16);
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        defaultedMap6.clear();
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap6.remove(obj20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        java.util.Set set23 = defaultedMap22.keySet();
        java.lang.String str24 = defaultedMap22.toString();
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!" + "'", obj25.equals("hi!"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] obj_array16 = new java.lang.Object[] { 10, fixedOrderComparator12, (byte) -1, obj14, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator17 = new collections.comparators.FixedOrderComparator(obj_array16);
        int i18 = fixedOrderComparator17.getUnknownObjectBehavior();
        fixedOrderComparator17.setUnknownObjectBehavior(0);
        java.lang.Object obj21 = defaultedMap6.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap23, (java.lang.Object) (-1.0d));
        boolean b26 = defaultedMap1.containsValue(obj25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) b26);
        defaultedMap27.clear();
        java.lang.Object[] obj_array33 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator34 = new collections.comparators.FixedOrderComparator(obj_array33);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object[] obj_array38 = new java.lang.Object[] { 10, fixedOrderComparator34, (byte) -1, obj36, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator39 = new collections.comparators.FixedOrderComparator(obj_array38);
        int i40 = fixedOrderComparator39.getUnknownObjectBehavior();
        fixedOrderComparator39.setUnknownObjectBehavior(2);
        boolean b43 = fixedOrderComparator39.isLocked();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) b43);
        java.util.Set set45 = defaultedMap27.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertNotNull(obj_array16);
        org.junit.Assert.assertTrue(i18 == 2);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "hi!" + "'", obj21.equals("hi!"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array33);
        org.junit.Assert.assertNotNull(obj_array38);
        org.junit.Assert.assertTrue(i40 == 2);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator7 = new collections.comparators.FixedOrderComparator(obj_array6);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, fixedOrderComparator7, (byte) -1, obj9, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator12 = new collections.comparators.FixedOrderComparator(obj_array11);
        int i13 = fixedOrderComparator12.getUnknownObjectBehavior();
        fixedOrderComparator12.setUnknownObjectBehavior(0);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Set set23 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b26 = defaultedMap25.isEmpty();
        java.lang.Object obj29 = defaultedMap25.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        java.util.Set set30 = defaultedMap25.entrySet();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object obj33 = defaultedMap25.put((java.lang.Object) "{}", obj32);
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        defaultedMap22.clear();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap22.remove(obj36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        java.util.Set set39 = defaultedMap22.keySet();
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) set39);
        org.junit.Assert.assertNotNull(obj_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator13 = new collections.comparators.FixedOrderComparator(obj_array12);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { 10, fixedOrderComparator13, (byte) -1, obj15, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator18 = new collections.comparators.FixedOrderComparator(obj_array17);
        int i19 = fixedOrderComparator18.getUnknownObjectBehavior();
        fixedOrderComparator18.setUnknownObjectBehavior(0);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object[] obj_array29 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator30 = new collections.comparators.FixedOrderComparator(obj_array29);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object[] obj_array34 = new java.lang.Object[] { 10, fixedOrderComparator30, (byte) -1, obj32, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator35 = new collections.comparators.FixedOrderComparator(obj_array34);
        int i36 = fixedOrderComparator35.getUnknownObjectBehavior();
        fixedOrderComparator35.setUnknownObjectBehavior(0);
        java.lang.Object obj39 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap7.get(obj39);
        java.lang.String str41 = defaultedMap7.toString();
        boolean b42 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object[] obj_array47 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator48 = new collections.comparators.FixedOrderComparator(obj_array47);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Object[] obj_array52 = new java.lang.Object[] { 10, fixedOrderComparator48, (byte) -1, obj50, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator53 = new collections.comparators.FixedOrderComparator(obj_array52);
        int i54 = fixedOrderComparator53.getUnknownObjectBehavior();
        java.lang.Object obj55 = defaultedMap7.get((java.lang.Object) fixedOrderComparator53);
        boolean b57 = fixedOrderComparator53.add((java.lang.Object) 2);
        boolean b58 = fixedOrderComparator53.isLocked();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(obj_array29);
        org.junit.Assert.assertNotNull(obj_array34);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertNotNull(obj_array52);
        org.junit.Assert.assertTrue(i54 == 2);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "hi!" + "'", obj55.equals("hi!"));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator5 = new collections.comparators.FixedOrderComparator(obj_array4);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, fixedOrderComparator5, (byte) -1, obj7, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator10 = new collections.comparators.FixedOrderComparator(obj_array9);
        int i11 = fixedOrderComparator10.getUnknownObjectBehavior();
        fixedOrderComparator10.setUnknownObjectBehavior(0);
        try {
            fixedOrderComparator10.setUnknownObjectBehavior(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicate4);
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object[] obj_array13 = new java.lang.Object[] { (byte) -1, 10.0f, 1L };
        collections.comparators.FixedOrderComparator fixedOrderComparator14 = new collections.comparators.FixedOrderComparator(obj_array13);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { 10, fixedOrderComparator14, (byte) -1, obj16, 10L };
        collections.comparators.FixedOrderComparator fixedOrderComparator19 = new collections.comparators.FixedOrderComparator(obj_array18);
        int i20 = fixedOrderComparator19.getUnknownObjectBehavior();
        boolean b22 = fixedOrderComparator19.add((java.lang.Object) (short) 1);
        boolean b23 = fixedOrderComparator19.isLocked();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) fixedOrderComparator19);
        boolean b25 = defaultedMap1.equals((java.lang.Object) defaultedMap24);
        boolean b26 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(obj_array13);
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
    }
}

